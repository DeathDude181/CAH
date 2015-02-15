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
	
	private JsonParser parser;
	
	public ConnectedServer(String ip) throws IOException
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
		socket.setSoTimeout(0);
	}
	
	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		
	}
}