package org.tilegames.hexicube.cah.server;

import java.util.ArrayList;

import org.tilegames.hexicube.cah.common.CardWithID;

public class PlayerDeck
{
	public ArrayList<CardWithID> deck, playedCards;
	public int deckID, id;
	public String owner;
	
	public PlayerDeck(int id, String owner, int player)
	{
		deck = new ArrayList<CardWithID>();
		playedCards = new ArrayList<CardWithID>();
		deckID = id;
		this.owner = owner;
		this.id = player;
	}
}