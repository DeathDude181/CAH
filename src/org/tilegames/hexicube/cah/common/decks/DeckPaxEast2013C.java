package org.tilegames.hexicube.cah.common.decks;

import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.Card;

public class DeckPaxEast2013C extends Deck
{
	private static final Card[] callCards = new Card[]{
		new Card("Press <span class="),
		new Card("I don't know exactly how I got the PAX plague, but I suspect it had something to do with _.")
	}, responseCards = new Card[]{
		new Card("Achieving 500 actions per minute."),
		new Card("Forgetting to eat, and consequently dying."),
		new Card("Wil Wheaton crashing an actual spaceship."),
		new Card("The Klobb."),
		new Card("Charging up all the way."),
		new Card("Vespene gas."),
		new Card("Judging elves by the color of their skin and not by the content of their character."),
		new Card("Smashing all the pottery in a Pottery Barn in search of rupees.")
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