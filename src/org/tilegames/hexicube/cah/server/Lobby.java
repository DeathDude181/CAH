package org.tilegames.hexicube.cah.server;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.tilegames.hexicube.cah.common.CardCastDeck;
import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.decks.*;

public class Lobby
{
	public int maxPlayers;
	public ArrayList<ServerPlayer> players;
	public int currentCzar;
	public boolean allowJoinsInProgress;
	
	public CzarMode czarSelectionType;
	public enum CzarMode
	{
		CYCLIC, WINNER, RANDOM;
	}
	
	public WinMode winnerSelectionType;
	public enum WinMode
	{
		POINTS, TIME, CARDS;
	}
	public int winnerValue;
	
	public GameState state;
	public enum GameState
	{
		LOBBY, PICKING_RESPONSES, VIEWING_RESPONSES, ROUND_OVER, GAME_OVER;
	}
	
	public ArrayList<Deck> allDecks;
	public PlayingDeck deck;
	
	public Lobby()
	{
		players = new ArrayList<ServerPlayer>();
		allDecks = new ArrayList<Deck>();
		allDecks.add(new DeckVersion1());
		allDecks.add(new DeckVersion2());
		allDecks.add(new DeckVersion3());
		allDecks.add(new DeckExpansion1());
		allDecks.add(new DeckExpansion2());
		allDecks.add(new DeckExpansion3());
		allDecks.add(new DeckExpansion4());
		allDecks.add(new DeckExpansionBox());
		//TODO: add all decks
		File f = new File("cardcast/");
		File[] otherDecks = f.listFiles();
		if(otherDecks != null)
		{
			for(File file : otherDecks)
			{
				if(file.getName().endsWith(".deck"))
				{
					try
					{
						FileInputStream reader = new FileInputStream(file);
						byte[] data = new byte[(int)file.length()];
						int pos = 0;
						while(pos < data.length)
						{
							int read = reader.read(data, pos, data.length-pos);
							if(read == -1) throw new IOException();
							pos += read;
						}
						reader.close();
						CardCastDeck d = new CardCastDeck(data);
						if(d.deckLoaded && d.deckValid) allDecks.add(d);
					}
					catch(IOException e)
					{
						e.printStackTrace();
					}
				}
			}
		}
		
		maxPlayers = 10;
		state = GameState.LOBBY;
		czarSelectionType = CzarMode.CYCLIC;
		winnerSelectionType = WinMode.POINTS;
		winnerValue = 10;
	}
	
	public void tellAllClients(String data)
	{
		for(ServerPlayer p : players)
		{
			p.packets.add(data);
		}
	}
}