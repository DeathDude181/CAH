package org.tilegames.hexicube.cah.common.decks;

import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.Card;

public class DeckPaxEast2013A extends Deck
{
	private static final Card[] callCards = new Card[]{
		new Card("I have an idea even better than Kickstarter, and it's called ____starter.", true),
		new Card("You have been waylaid by ____ and must defend yourself.", true),
	}, responseCards = new Card[]{
		new Card("An immediately regrettable $9 hot dog from the Boston Convention Center.", false),
		new Card("Running out of stamina.", false),
		new Card("Casting Magic Missile at a bully.", false),
		new Card("Getting bitch slapped by Dhalsim.", false),
		new Card("Firefly: Season 2.", false),
		new Card("Rotating shapes in mid-air so that they fit into other shapes when they fall.", false),
		new Card("Jiggle physics.", false),
		new Card("Paying the iron price.", false),
	};
	
	@Override
	public String getDeckName()
	{
		return "PAX East 2013 Pack A";
	}
	
	@Override
	public String getShortDeckName()
	{
		return "PAX-A";
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