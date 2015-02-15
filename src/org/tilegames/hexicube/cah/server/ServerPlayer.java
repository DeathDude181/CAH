package org.tilegames.hexicube.cah.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import org.tilegames.hexicube.cah.client.Client;
import org.tilegames.hexicube.cah.common.Player;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;

public class ServerPlayer extends Player implements Runnable
{
	public String username, deckCode;
	public int userID;
	
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
		userID = server.getNextID();
		obj.add("id", new JsonPrimitive(userID));
		out.println(obj.toString());
		socket.setSoTimeout(0);
	}
	
	@Override
	public void run()
	{
		//TODO: packet handling
	}
	
	@Override
	public String getUsername()
	{
		return username;
	}
}