package org.tilegames.hexicube.cah.client;

import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.*;

public class Client
{
	public static Insets insets;
	public static Font font;
	
	public static String username;
	public static boolean usernameConfirmed;
	
	public static PlayType playType;
	enum PlayType
	{
		HOST, JOIN;
	}
	
	public static void main(String[] args)
	{
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
		font = label.getFont().deriveFont(label.getFont().getSize2D()*2f);
		label.setFont(font);
		label.setBounds(5, 5, 290, 20);
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
		frame.setSize(300+insets.left+insets.right, 65+insets.top+insets.bottom);
		frame.setLocation(oldX, oldY);
		frame.setVisible(true);
		while(playType == null) try{Thread.sleep(100);}catch(InterruptedException e){}
		if(playType == PlayType.HOST)
		{
			//TODO: host a game
			//TODO: UPnP support?
		}
		else
		{
			//TODO: join game screen
		}
	}
}