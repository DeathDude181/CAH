package org.tilegames.hexicube.cah.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import org.tilegames.hexicube.cah.common.Player;

public class ServerPlayer extends Player implements Runnable
{
	private String username;
	
	private Socket socket;
	private BufferedReader in;
	private PrintWriter out;
	
	public ServerPlayer(Socket socket) throws IOException
	{
		this.socket = socket;
		in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		out = new PrintWriter(socket.getOutputStream(), true);
	}
	
	@Override
	public void run()
	{
		
	}
	
	@Override
	public String getUsername()
	{
		return username;
	}
}