package org.tilegames.hexicube.cah.common;

import java.util.ArrayList;

public class Lobby
{
	public int maxPlayers;
	public ArrayList<Player> players;
	public int currentCzar;
	public boolean allowJoinsInProgress;
	
	public CzarMode czarSelectionType;
	enum CzarMode
	{
		CYCLIC, WINNER, RANDOM;
	}
	
	public GameState state;
	enum GameState
	{
		LOBBY, PICKING_RESPONSES, VIEWING_RESPONSES, ROUND_OVER, GAME_OVER;
	}
	
	public ArrayList<Card> drawPile, discardPile;
	public ArrayList<Deck> decks;
}