package org.tilegames.hexicube.cah.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;

import org.tilegames.hexicube.cah.common.CardCastDeck;
import org.tilegames.hexicube.cah.common.Deck;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;

public class ServerPlayer implements Runnable
{
	private Server server;
	
	public String username;
	public int userID;
	public PlayerDeck deck;
	
	private long lastPingSent, lastPingReceived;
	
	private Socket socket;
	private BufferedReader in;
	private PrintWriter out;
	public ArrayList<String> packets;
	
	private JsonParser parser;
	
	public ServerPlayer(Socket socket, Server server) throws IOException
	{
		this.socket = socket;
		in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		out = new PrintWriter(socket.getOutputStream(), true);
		socket.setSoTimeout(1500);
		parser = new JsonParser();
		JsonObject obj = new JsonObject();
		obj.add("command", new JsonPrimitive("SERVER_INFO"));
		obj.add("info", new JsonPrimitive("CAH Server"));
		out.println(obj.toString());
		obj = parser.parse(in.readLine()).getAsJsonObject();
		String command = obj.get("command").getAsString();
		if(!command.equals("CLIENT_INFO")) throw new IOException("Bad client.");
		username = obj.get("username").getAsString();
		if(obj.has("deck"))
		{
			int deckCode = obj.get("deck").getAsInt();
			for(PlayerDeck d : server.openDecks)
			{
				if(d.deckID == deckCode && d.owner.equals(username))
				{
					deck = d;
					server.openDecks.remove(d);
					userID = d.id;
					break;
				}
			}
		}
		if(deck == null)
		{
			boolean canJoin = true;
			if(server.lobby.players.size() >= server.lobby.maxPlayers) canJoin = false;
			else if(!server.lobby.allowJoinsInProgress && server.lobby.state != Lobby.GameState.LOBBY) canJoin = false;
			if(!canJoin)
			{
				obj = new JsonObject();
				obj.add("command", new JsonPrimitive("SERVER_JOIN_PREVENTED"));
				out.println(obj.toString());
				return;
			}
		}
		obj = new JsonObject();
		obj.add("command", new JsonPrimitive("SERVER_ASSIGN_ID"));
		if(userID == 0) userID = server.getNextID();
		obj.add("id", new JsonPrimitive(userID));
		out.println(obj.toString());
		socket.setSoTimeout(0);
		lastPingSent = System.nanoTime();
		lastPingReceived = lastPingSent;
		if(deck == null) deck = new PlayerDeck(server.rand.nextInt(), username, userID);
		this.server = server;
		packets = new ArrayList<String>();
		server.lobby.players.add(this);
	}
	
	@Override
	public void run()
	{
		try
		{
			while(true)
			{
				while(packets.size() > 0)
				{
					out.println(packets.remove(0));
					lastPingSent = System.nanoTime();
				}
				while(in.ready())
				{
					JsonObject obj = parser.parse(in.readLine()).getAsJsonObject();
					String command = obj.get("command").getAsString();
					if(command.equals("CLIENT_PING"))
					{
						obj = new JsonObject();
						obj.add("command", new JsonPrimitive("SERVER_PONG"));
						out.println(obj.toString());
						lastPingSent = System.nanoTime();
					}
					else if(command.equals("CLIENT_PONG")) {}
					else if(command.equals("CLIENT_UPDATE_LOBBY"))
					{
						//TODO: only host can edit?
						//TODO: only allow in lobby state
						String type = obj.get("type").getAsString();
						if(type.equals("TOGGLE_DECK"))
						{
							String deckName = obj.get("deck").getAsString();
							for(Deck d : server.lobby.allDecks)
							{
								if(d.getDeckName().equals(deckName))
								{
									d.toggleEnabled();
									obj = new JsonObject();
									obj.add("command", new JsonPrimitive("SERVER_UPDATE_LOBBY"));
									obj.add("type", new JsonPrimitive("SET_DECK"));
									obj.add("deck", new JsonPrimitive(d.getDeckName()));
									obj.add("active", new JsonPrimitive(d.isEnabled()));
									server.lobby.tellAllClients(obj.toString());
									break;
								}
							}
						}
						else if(type.equals("ADD_CARDCAST"))
						{
							String code = obj.get("code").getAsString();
							boolean exists = false, valid = false, wasValid = false;
							CardCastDeck cd = null;
							for(Deck d : server.lobby.allDecks)
							{
								if(d instanceof CardCastDeck && d.getShortDeckName().equals(code))
								{
									cd = (CardCastDeck)d;
									wasValid = cd.deckLoaded && cd.deckValid;
									if(cd.deckLoaded && !cd.deckValid) cd.downloadDeck();
									exists = true;
									valid = cd.deckValid;
									break;
								}
							}
							obj = new JsonObject();
							if(exists)
							{
								if(valid)
								{
									if(!wasValid)
									{
										obj.add("command", new JsonPrimitive("SERVER_UPDATE_LOBBY"));
										obj.add("type", new JsonPrimitive("ADD_DECK"));
										obj.add("deck", new JsonPrimitive(cd.getDeckName()));
										obj.add("short", new JsonPrimitive(cd.getShortDeckName()));
										obj.add("active", new JsonPrimitive(cd.isEnabled()));
										obj.add("calls", new JsonPrimitive(cd.numCallCards()));
										obj.add("responses", new JsonPrimitive(cd.numResponseCards()));
										server.lobby.tellAllClients(obj.toString());
									}
									else
									{
										obj.add("command", new JsonPrimitive("SERVER_CARDCAST_DECK_EXISTS"));
										out.println(obj.toString());
									}
								}
								else
								{
									obj.add("command", new JsonPrimitive("SERVER_CARDCAST_INVALID"));
									out.println(obj.toString());
								}
							}
							else
							{
								new CardCastDeck(code, false);
								obj.add("command", new JsonPrimitive("SERVER_REQUESTED_CARDCAST"));
								out.println(obj.toString());
							}
							lastPingSent = System.nanoTime();
						}
						else System.out.println("Unknown lobby update type: "+type);
					}
					else if(command.equals("CLIENT_PLAY_CARDS"))
					{
						System.out.println("Client is playing cards."); //TODO
					}
					else if(command.equals("CLIENT_REPICK_CARDS"))
					{
						System.out.println("Client wants to repick cards."); //TODO
					}
					else if(command.equals("CLIENT_CHOOSE_WINNER"))
					{
						System.out.println("Client is choosing a winner."); //TODO
					}
					else if(command.equals("CLIENT_REQUEST_FULL_INFO"))
					{
						System.out.println("Client wants full info, providing.");
						obj = new JsonObject();
						obj.add("command", new JsonPrimitive("SERVER_PROVIDE_FULL_INFO"));
						obj.add("state", new JsonPrimitive(server.lobby.state.toString()));
						//BEGIN GENERIC DATA
						obj.add("maxplayers", new JsonPrimitive(server.lobby.maxPlayers));
						obj.add("allowjoins", new JsonPrimitive(server.lobby.allowJoinsInProgress));
						obj.add("czarmode", new JsonPrimitive(server.lobby.czarSelectionType.toString()));
						obj.add("winmode", new JsonPrimitive(server.lobby.winnerSelectionType.toString()));
						obj.add("winval", new JsonPrimitive(server.lobby.winnerValue));
						JsonArray activeDecks = new JsonArray();
						for(Deck d : server.lobby.allDecks)
						{
							JsonObject obj2 = new JsonObject();
							obj2.add("name", new JsonPrimitive(d.getDeckName()));
							obj2.add("short", new JsonPrimitive(d.getShortDeckName()));
							obj2.add("active", new JsonPrimitive(d.isEnabled()));
							obj2.add("calls", new JsonPrimitive(d.numCallCards()));
							obj2.add("responses", new JsonPrimitive(d.numResponseCards()));
							activeDecks.add(obj2);
						}
						obj.add("decks", activeDecks);
						JsonArray players = new JsonArray();
						for(ServerPlayer sp : server.lobby.players)
						{
							JsonObject obj2 = new JsonObject();
							obj2.add("name", new JsonPrimitive(sp.username));
							obj2.add("id", new JsonPrimitive(sp.userID));
							if(server.lobby.state != Lobby.GameState.LOBBY) obj2.add("score", new JsonPrimitive(sp.deck.points));
						}
						obj.add("players", players);
						//BEGIN SPECIFIC DATA
						//TODO
						out.println(obj.toString());
						lastPingSent = System.nanoTime();
					}
					else if(command.equals("CLIENT_INVALID_COMMAND"))
					{
						System.out.println("Client reports invalid command: "+command);
					}
					else
					{
						System.out.println("Client sent invalid command: "+command);
						obj = new JsonObject();
						obj.add("command", new JsonPrimitive("SERVER_INVALID_COMMAND"));
						obj.add("value", new JsonPrimitive(command));
						out.println(obj.toString());
						lastPingSent = System.nanoTime();
					}
					lastPingReceived = System.nanoTime();
				}
				long timeSincePing = System.nanoTime() - lastPingReceived;
				if(timeSincePing > 10000000000L) throw new IOException("Client timed out.");
				timeSincePing = System.nanoTime() - lastPingSent;
				if(timeSincePing > 3000000000L)
				{
					JsonObject obj = new JsonObject();
					obj.add("command", new JsonPrimitive("SERVER_PING"));
					out.println(obj);
					lastPingSent = System.nanoTime();
				}
				try{Thread.sleep(100);}catch(InterruptedException e){}
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
			try
			{
				socket.close();
			}
			catch(IOException e1) {}
		}
	}
	
	public String getUsername()
	{
		return username;
	}
	
	public int getID()
	{
		return userID;
	}
	
	public int getNumCards()
	{
		return deck.deck.size();
	}
	
	public boolean hasPlayedCards()
	{
		return deck.playedCards != null;
	}
}