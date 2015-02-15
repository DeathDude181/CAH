package org.tilegames.hexicube.cah.server;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Random;

import org.bitlet.weupnp.GatewayDevice;
import org.bitlet.weupnp.GatewayDiscover;
import org.bitlet.weupnp.PortMappingEntry;
import org.tilegames.hexicube.cah.common.Player;

public class Server implements Runnable
{
	public ServerSocket ss;
	
	public ArrayList<PlayerDeck> openDecks;
	
	public Lobby lobby;
	public Random rand;
	
	private GatewayDevice gd;
	private int port;
	
	public Server(int port) throws IOException
	{
		lobby = new Lobby();
		ss = new ServerSocket(port);
		rand = new Random();
		
		try
		{
			System.out.println("Opening port via UPnP");
			GatewayDiscover discover = new GatewayDiscover();
			discover.discover();
			gd = discover.getValidGateway();
			if(gd == null)
			{
				System.out.println("\tCouldn't find gateway for UPnP");
				return;
			}
			InetAddress localIP = gd.getLocalAddress();
			String externalIP = gd.getExternalIPAddress();
			System.out.println("\t"+externalIP+" => "+localIP.toString());
			
			PortMappingEntry mapping = new PortMappingEntry();
			
			if(gd.getSpecificPortMappingEntry(port, "TCP", mapping))
			{
				System.out.println("\tPort is already open");
				this.port = port;
				return;
			}
			System.out.println("\tRequesting port mapping");
			if(!gd.addPortMapping(port, port, localIP.getHostAddress(), "TCP", "CAH Server"))
			{
				System.out.println("\tPort mapping declined");
				return;
			}
			System.out.println("\tPort mapped!");
			this.port = port;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
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
				lobby.players.add(c);
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
			for(Player sr : lobby.players)
			{
				if(sr.getID() == first)
				{
					found = true;
					first++;
				}
			}
			if(!found) break;
		}
		return first;
	}
	
	public void closeUPNP()
	{
		if(port != 0)
		{
			System.out.println("Removing UPnP port mapping...");
			try
			{
				gd.deletePortMapping(port, "TCP");
				System.out.println("\tPort mapping removed");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}