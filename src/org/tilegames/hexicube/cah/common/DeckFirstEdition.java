package org.tilegames.hexicube.cah.common;

public class DeckFirstEdition extends Deck
{
	private static final Card[] callCards = new Card[]{
		
	}, responseCards = new Card[]{
		
	};
	
	@Override
	public String getDeckName()
	{
		return "First Edition";
	}
	
	@Override
	public String getShortDeckName()
	{
		return "CAH1";
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