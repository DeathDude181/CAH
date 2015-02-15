package org.tilegames.hexicube.cah.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Random;

import org.tilegames.hexicube.cah.common.Lobby;

public class Server implements Runnable
{
	public ServerSocket ss;
	
	public ArrayList<ServerPlayer> clients;
	
	public Lobby lobby;
	public Random rand;
	
	public Server(int port) throws IOException
	{
		lobby = new Lobby();
		clients = new ArrayList<ServerPlayer>();
		ss = new ServerSocket(port);
		rand = new Random();
	}
	
	@Override
	public void run()
	{
		while(true)
		{
			try
			{
				Socket s = ss.accept();
				ServerPlayer c = new ServerPlayer(s, this);
				clients.add(c);
				new Thread(c).start();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public int getNextID()
	{
		int first = 1;
		while(true)
		{
			boolean found = false;
			for(ServerPlayer sr : clients)
			{
				if(sr.userID == first)
				{
					found = true;
					first++;
				}
			}
			if(!found) break;
		}
		return first;
	}
}