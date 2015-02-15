package org.tilegames.hexicube.cah.client;

import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;

import javax.swing.*;

import org.tilegames.hexicube.cah.server.Server;

public class Client
{
	public static Insets insets;
	public static Font font;
	
	public static String username;
	public static int playerID;
	public static boolean usernameConfirmed;
	
	public static PlayType playType;
	enum PlayType
	{
		HOST, JOIN;
	}
	
	public static ClientState state = ClientState.INIT;
	enum ClientState
	{
		INIT, CHOOSING_PORT, JOINING_SERVER, IDLE, IN_LOBBY;
	}
	
	public static ConnectedServer server;
	
	public static void main(String[] args)
	{
		font = new Font("Tahoma", Font.BOLD, 24);
		
		JFrame frame = new JFrame("Cards Against Humanity");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setVisible(true);
		while(true)
		{
			insets = frame.getInsets();
			if(insets.top > 0) break;
			try{Thread.sleep(10);}catch(InterruptedException e){}
		}
		frame.setVisible(false);
		frame.setSize(300+insets.left+insets.right, 90+insets.top+insets.bottom);
		JLabel label = new JLabel("Username");
		label.setFont(font);
		label.setBounds(2, 2, 296, 26);
		frame.add(label);
		JTextField usernameEntry = new JTextField();
		usernameEntry.setFont(font);
		usernameEntry.setBounds(0, 30, 300, 30);
		frame.add(usernameEntry);
		JButton okButton = new JButton("OK");
		okButton.setFont(font);
		okButton.setBounds(0, 60, 300, 30);
		frame.add(okButton);
		okButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e)
			{
				usernameConfirmed = true;
			}
		});
		frame.setVisible(true);
		while(true)
		{
			while(!usernameConfirmed) try{Thread.sleep(100);}catch(InterruptedException e){}
			username = usernameEntry.getText();
			if(username.length() < 5 || username.length() > 16)
			{
				usernameConfirmed = false;
				JOptionPane.showMessageDialog(frame, "Usernames must be between 5 and 16 characters long!", "Bad username!", JOptionPane.ERROR_MESSAGE);
			}
			else break;
		}
		frame.setVisible(false);
		int oldX = frame.getX(), oldY = frame.getY();
		frame.dispose();
		
		frame = new JFrame("Cards Against Humanity");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setSize(300+insets.left+insets.right, 65+insets.top+insets.bottom);
		frame.setLocation(oldX, oldY);
		JButton hostButton = new JButton("Host a game");
		hostButton.setFont(font);
		hostButton.setBounds(0, 0, 300, 30);
		frame.add(hostButton);
		hostButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e)
			{
				playType = PlayType.HOST;
			}
		});
		JButton joinButton = new JButton("Join a game");
		joinButton.setFont(font);
		joinButton.setBounds(0, 35, 300, 30);
		frame.add(joinButton);
		joinButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e)
			{
				playType = PlayType.JOIN;
			}
		});
		frame.setVisible(true);
		while(playType == null) try{Thread.sleep(100);}catch(InterruptedException e){}
		frame.setVisible(false);
		oldX = frame.getX();
		oldY = frame.getY();
		frame.dispose();
		if(playType == PlayType.HOST)
		{
			state = ClientState.CHOOSING_PORT;
			frame = new JFrame("Cards Against Humanity");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setResizable(false);
			frame.setLayout(null);
			frame.setSize(300+insets.left+insets.right, 60+insets.top+insets.bottom);
			frame.setLocation(oldX, oldY);
			label = new JLabel("Server port");
			label.setFont(font);
			label.setBounds(2, 2, 146, 26);
			frame.add(label);
			JTextField serverPort = new JTextField("8181");
			serverPort.setFont(font);
			serverPort.setBounds(150, 0, 150, 30);
			frame.add(serverPort);
			final JButton hostServer = new JButton("Host Server");
			hostServer.setFont(font);
			hostServer.setBounds(0, 30, 300, 30);
			frame.add(hostServer);
			hostServer.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e)
				{
					Client.state = Client.ClientState.IDLE;
					hostServer.setEnabled(false);
				}
			});
			frame.setVisible(true);
			while(state != ClientState.IN_LOBBY)
			{
				while(state == ClientState.CHOOSING_PORT) try{Thread.sleep(100);}catch(InterruptedException e){}
				try
				{
					final Server serv = new Server(Integer.parseInt(serverPort.getText()));
					new Thread(serv).start();
					server = new ConnectedServer("localhost:"+serverPort.getText());
					state = ClientState.IN_LOBBY;
					frame.addWindowListener(new WindowListener(){
						private Server s = serv;
						@Override
						public void windowOpened(WindowEvent e) {}
						@Override
						public void windowClosing(WindowEvent e)
						{
							serv.closeUPNP();
						}
						@Override
						public void windowClosed(WindowEvent e) {}
						@Override
						public void windowIconified(WindowEvent e) {}
						@Override
						public void windowDeiconified(WindowEvent e) {}
						@Override
						public void windowActivated(WindowEvent e) {}
						@Override
						public void windowDeactivated(WindowEvent e) {}
					});
				}
				catch(Exception e)
				{
					e.printStackTrace();
					state = ClientState.CHOOSING_PORT;
					hostServer.setEnabled(true);
					JOptionPane.showMessageDialog(frame, e.getMessage(), "Unable to start server!", JOptionPane.ERROR_MESSAGE);
				}
			}
			//TODO: UPnP support?
		}
		else
		{
			state = ClientState.JOINING_SERVER;
			frame = new JFrame("Cards Against Humanity");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setResizable(false);
			frame.setLayout(null);
			frame.setSize(300+insets.left+insets.right, 60+insets.top+insets.bottom);
			frame.setLocation(oldX, oldY);
			label = new JLabel("Server IP");
			label.setFont(font);
			label.setBounds(2, 2, 146, 26);
			frame.add(label);
			JTextField serverIP = new JTextField();
			serverIP.setFont(font);
			serverIP.setBounds(150, 0, 150, 30);
			frame.add(serverIP);
			final JButton joinServer = new JButton("Join Server");
			joinServer.setFont(font);
			joinServer.setBounds(0, 30, 300, 30);
			frame.add(joinServer);
			joinServer.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e)
				{
					Client.state = Client.ClientState.IDLE;
					joinServer.setEnabled(false);
				}
			});
			frame.setVisible(true);
			while(state != ClientState.IN_LOBBY)
			{
				while(state == ClientState.JOINING_SERVER) try{Thread.sleep(100);}catch(InterruptedException e){}
				try
				{
					server = new ConnectedServer(serverIP.getText());
					state = ClientState.IN_LOBBY;
				}
				catch(Exception e)
				{
					e.printStackTrace();
					joinServer.setEnabled(true);
					state = ClientState.JOINING_SERVER;
					JOptionPane.showMessageDialog(frame, e.getMessage(), "Unable to join server!", JOptionPane.ERROR_MESSAGE);
				}
			}
		}
		new Thread(server).start();
		frame.setVisible(false);
		frame.dispose();
		//TODO: lobby screen
		//TODO: game screen
	}
}