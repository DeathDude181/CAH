package org.tilegames.hexicube.cah.client;

import java.util.ArrayList;

public class ClientLobby
{
	public int maxPlayers;
	public ArrayList<ClientPlayer> players;
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
	
	public ArrayList<ClientDeck> decks;
}