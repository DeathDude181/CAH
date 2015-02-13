package org.tilegames.hexicube.cah.common.decks;

import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.Card;

public class DeckPaxEast2013C extends Deck
{
	private static final Card[] callCards = new Card[]{
		new Card("Press <span class=", true),
		new Card("I don't know exactly how I got the PAX plague, but I suspect it had something to do with ____.", true),
	}, responseCards = new Card[]{
		new Card("Achieving 500 actions per minute.", false),
		new Card("Forgetting to eat, and consequently dying.", false),
		new Card("Wil Wheaton crashing an actual spaceship.", false),
		new Card("The Klobb.", false),
		new Card("Charging up all the way.", false),
		new Card("Vespene gas.", false),
		new Card("Judging elves by the color of their skin and not by the content of their character.", false),
		new Card("Smashing all the pottery in a Pottery Barn in search of rupees.", false),
	};
	
	@Override
	public String getDeckName()
	{
		return "PAX East 2013 Pack C";
	}
	
	@Override
	public String getShortDeckName()
	{
		return "PAX-C";
	}
	
	@Override
	public boolean officialDeck()
	{
		return true;
	}
	
	@Override
	public int numCallCards()
	{
		return callCards.length;
	}
	
	@Override
	public int numResponseCards()
	{
		return responseCards.length;
	}
	
	@Override
	public Card[] getCallCards()
	{
		return callCards;
	}
	
	@Override
	public Card[] getResponseCards()
	{
		return responseCards;
	}
}