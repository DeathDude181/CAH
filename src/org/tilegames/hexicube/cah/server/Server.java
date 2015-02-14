package org.tilegames.hexicube.cah.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import org.tilegames.hexicube.cah.common.Lobby;

public class Server implements Runnable
{
	public ServerSocket ss;
	
	public ArrayList<ServerPlayer> clients;
	
	private Lobby lobby;
	
	public Server(int port) throws IOException
	{
		lobby = new Lobby();
		ss = new ServerSocket(port);
	}
	
	@Override
	public void run()
	{
		while(true)
		{
			try
			{
				Socket s = ss.accept();
				ServerPlayer c = new ServerPlayer(s);
				clients.add(c);
				new Thread(c).start();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}