package org.tilegames.hexicube.cah.common.decks;

import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.Card;

public class DeckPaxEast2013A extends Deck
{
	private static final Card[] callCards = new Card[]{
		new Card("I have an idea even better than Kickstarter, and it's called _-starter."),
		new Card("You have been waylaid by _ and must defend yourself.")
	}, responseCards = new Card[]{
		new Card("An immediately regrettable $9 hot dog from the Boston Convention Center."),
		new Card("Running out of stamina."),
		new Card("Casting Magic Missile at a bully."),
		new Card("Getting bitch slapped by Dhalsim."),
		new Card("Firefly: Season 2."),
		new Card("Rotating shapes in mid-air so that they fit into other shapes when they fall."),
		new Card("Jiggle physics."),
		new Card("Paying the iron price.")
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