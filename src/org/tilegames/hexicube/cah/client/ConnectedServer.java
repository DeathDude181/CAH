package org.tilegames.hexicube.cah.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import com.google.gson.*;

public class ConnectedServer implements Runnable
{
	private Socket socket;
	private BufferedReader in;
	private PrintWriter out;
	
	private long lastPingSent, lastPingReceived;
	
	private JsonParser parser;
	
	public ConnectedServer(String ip) throws IOException
	{
		try
		{
			String[] data = ip.split(":");
			if(data.length == 1)
			{
				socket = new Socket(ip, 8181);
			}
			else if(data.length == 2)
			{
				socket = new Socket(data[0], Integer.parseInt(data[1]));
			}
			else throw new IOException("Bad IP.");
			socket.setSoTimeout(1500);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream(), true);
			parser = new JsonParser();
			JsonObject obj = parser.parse(in.readLine()).getAsJsonObject();
			String command = obj.get("command").getAsString();
			if(!command.equals("SERVER_INFO"))
			{
				if(command.equals("SERVER_JOIN_PREVENTED")) throw new IOException("Server is full.");
				throw new IOException("Bad server.");
			}
			if(!obj.get("info").getAsString().equals("CAH Server")) throw new IOException("Bad server.");
			obj = new JsonObject();
			obj.add("command", new JsonPrimitive("CLIENT_INFO"));
			obj.add("username", new JsonPrimitive(Client.username));
			out.println(obj.toString());
			obj = parser.parse(in.readLine()).getAsJsonObject();
			command = obj.get("command").getAsString();
			if(!command.equals("SERVER_ASSIGN_ID"))
			{
				if(command.equals("SERVER_JOIN_PREVENTED")) throw new IOException("Server isn't allowing joining games in progress.");
				throw new IOException("Bad server.");
			}
			Client.playerID = obj.get("id").getAsInt();
			obj = new JsonObject();
			obj.add("command", new JsonPrimitive("CLIENT_REQUEST_FULL_INFO"));
			out.println(obj.toString());
			socket.setSoTimeout(0);
			lastPingSent = System.nanoTime();
			lastPingReceived = lastPingSent;
		}
		catch(IOException e)
		{
			if(socket != null)
			{
				try
				{
					socket.close();
				}
				catch(IOException e2){}
			}
			throw e;
		}
	}
	
	@Override
	public void run()
	{
		try
		{
			while(true)
			{
				while(in.ready())
				{
					JsonObject obj = parser.parse(in.readLine()).getAsJsonObject();
					String command = obj.get("command").getAsString();
					if(command.equals("SERVER_PING"))
					{
						System.out.println("Server pinged, responding.");
						obj = new JsonObject();
						obj.add("command", new JsonPrimitive("CLIENT_PONG"));
						out.println(obj.toString());
						lastPingSent = System.nanoTime();
					}
					else if(command.equals("SERVER_PONG"))
					{
						System.out.println("Server ponged.");
					}
					else if(command.equals("SERVER_LOBBY_INFO_CHANGE"))
					{
						System.out.println("Server reported lobby changes.");
					}
					else if(command.equals("SERVER_DEAL_CARDS"))
					{
						System.out.println("Server dealt cards.");
					}
					else if(command.equals("SERVER_SET_CARD_CZAR"))
					{
						System.out.println("Server set Czar.");
					}
					else if(command.equals("SERVER_BEGIN_TURN"))
					{
						System.out.println("Server reported call card and started turn.");
					}
					else if(command.equals("SERVER_CARD_INVALID"))
					{
						System.out.println("Server rejected chosen card, requesting full info.");
						obj = new JsonObject();
						obj.add("command", new JsonPrimitive("CLIENT_REQUEST_FULL_INFO"));
						out.println(obj.toString());
					}
					else if(command.equals("SERVER_PLAYER_GAVE_CARDS"))
					{
						System.out.println("Server reported a player has submitted cards.");
					}
					else if(command.equals("SERVER_SHOW_CARDS"))
					{
						System.out.println("Server is showing answers.");
					}
					else if(command.equals("SERVER_END_TURN"))
					{
						System.out.println("Server reported winner and ended turn.");
					}
					else if(command.equals("SERVER_END_GAME"))
					{
						System.out.println("Server ended game.");
					}
					else if(command.equals("SERVER_INVALID_COMMAND"))
					{
						System.out.println("Server reports invalid command: "+command);
					}
					else
					{
						System.out.println("Server sent invalid command: "+command);
						obj = new JsonObject();
						obj.add("command", new JsonPrimitive("CLIENT_INVALID_COMMAND"));
						obj.add("value", new JsonPrimitive(command));
						out.println(obj.toString());
						lastPingSent = System.nanoTime();
					}
					lastPingReceived = System.nanoTime();
				}
				long timeSincePing = System.nanoTime() - lastPingReceived;
				if(timeSincePing > 10000000000L) throw new IOException("Server timed out.");
				timeSincePing = System.nanoTime() - lastPingSent;
				if(timeSincePing > 5000000000L)
				{
					JsonObject obj = new JsonObject();
					obj.add("command", new JsonPrimitive("CLIENT_PING"));
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
}