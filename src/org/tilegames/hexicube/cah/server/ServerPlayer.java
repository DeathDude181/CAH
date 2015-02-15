package org.tilegames.hexicube.cah.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import org.tilegames.hexicube.cah.common.Player;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;

public class ServerPlayer extends Player implements Runnable
{
	public String username, deckCode;
	public int userID;
	
	private long lastPingSent, lastPingReceived;
	
	private Socket socket;
	private BufferedReader in;
	private PrintWriter out;
	
	private JsonParser parser;
	
	public ServerPlayer(Socket socket, Server server) throws IOException
	{
		this.socket = socket;
		in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		out = new PrintWriter(socket.getOutputStream(), true);
		socket.setSoTimeout(1500);
		parser = new JsonParser();
		JsonObject obj = new JsonObject();
		obj.add("command", new JsonPrimitive("SERVER_INFO")); //TODO: decline if full
		obj.add("info", new JsonPrimitive("CAH Server"));
		out.println(obj.toString());
		obj = parser.parse(in.readLine()).getAsJsonObject();
		String command = obj.get("command").getAsString();
		if(!command.equals("CLIENT_INFO")) throw new IOException("Bad client.");
		username = obj.get("username").getAsString();
		if(obj.has("deck")) deckCode = obj.get("deck").getAsString();
		//TODO: decline if in game and lobby prevents joins, unless deck code is valid
		obj = new JsonObject();
		obj.add("command", new JsonPrimitive("SERVER_ASSIGN_ID"));
		//TODO: assign previous ID if deck code valid
		userID = server.getNextID();
		obj.add("id", new JsonPrimitive(userID));
		out.println(obj.toString());
		socket.setSoTimeout(0);
		lastPingSent = System.nanoTime();
		lastPingReceived = lastPingSent;
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
					if(command.equals("CLIENT_PING"))
					{
						System.out.println("Client pinged, responding.");
						obj = new JsonObject();
						obj.add("command", new JsonPrimitive("SERVER_PONG"));
						out.println(obj.toString());
						lastPingSent = System.nanoTime();
					}
					else if(command.equals("CLIENT_PONG"))
					{
						System.out.println("Client ponged.");
					}
					else if(command.equals("CLIENT_UPDATE_LOBBY"))
					{
						System.out.println("Client updating lobby.");
					}
					else if(command.equals("CLIENT_PLAY_CARDS"))
					{
						System.out.println("Client is playing cards.");
					}
					else if(command.equals("CLIENT_REPICK_CARDS"))
					{
						System.out.println("Client wants to repick cards.");
					}
					else if(command.equals("CLIENT_CHOOSE_WINNER"))
					{
						System.out.println("Client is choosing a winner.");
					}
					else if(command.equals("CLIENT_REQUEST_FULL_INFO"))
					{
						System.out.println("Client wants full info.");
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
	
	@Override
	public String getUsername()
	{
		return username;
	}
}