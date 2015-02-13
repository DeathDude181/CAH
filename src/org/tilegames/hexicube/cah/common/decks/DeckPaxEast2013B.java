package org.tilegames.hexicube.cah.common.decks;

import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.Card;

public class DeckPaxEast2013B extends Deck
{
	private static final Card[] callCards = new Card[]{
		new Card("Action stations! Action stations! Set condition one throughout the fleet and brace for _!"),
		new Card("In the final round of this year's Omegathon, Omeganauts must face off in a game of _.")
	}, responseCards = new Card[]{
		new Card("Loading from a previous save."),
		new Card("Sharpening a foam broadsword on a foam whetstone."),
		new Card("The rocket launcher."),
		new Card("The depression that ensues after catching 'em all."),
		new Card("Violating the First Law of Robotics."),
		new Card("Getting inside the Horadric Cube with a hot babe and pressing the transmute button."),
		new Card("Punching a tree to gather wood."),
		new Card("Spending the year's insulin budget on Warhammer 40k figurines.")
	};
	
	@Override
	public String getDeckName()
	{
		return "PAX East 2013 Pack B";
	}
	
	@Override
	public String getShortDeckName()
	{
		return "PAX-B";
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