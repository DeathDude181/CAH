package org.tilegames.hexicube.cah.common.decks;

import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.Card;

public class DeckSocialGamer extends Deck
{
	private static final Card[] callCards = new Card[]{
		new Card("Don't slow down in East Cleveland or ____.", true),
		new Card("At the last PAX, Paul and Storm had ____ thrown at them during ", true),
		new Card("____ has the ", true),
		new Card("Drunken games of Pretend You're Xyzzy lead to ____ and ____.", true),
		new Card("Who dunnit? ____ with ____ in ____.", true),
	}, responseCards = new Card[]{
		new Card("The Chilled Knife.", false),
		new Card("Paul and Storm.", false),
		new Card("Jonathan Coulton.", false),
		new Card("MC Frontalot.", false),
		new Card("Pretending you're Xyzzy.", false),
		new Card("Cleveland (it's not Detroit!).", false),
		new Card("The best card in my hand.", false),
		new Card("Suddenly realizing you're retarded.", false),
		new Card("A Canadian penny.", false),
		new Card("dho's penis.", false),
		new Card("Griffy's tits.", false),
		new Card("The Hollaad Tonnel.", false),
	};
	
	@Override
	public String getDeckName()
	{
		return "[C] SocialGamer";
	}
	
	@Override
	public String getShortDeckName()
	{
		return "Gamer";
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