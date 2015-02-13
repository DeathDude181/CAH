package org.tilegames.hexicube.cah.common.decks;

import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.Card;

public class DeckSocialGamer extends Deck
{
	private static final Card[] callCards = new Card[]{
		new Card("Don't slow down in East Cleveland or _."),
		new Card("At the last PAX, Paul and Storm had _ thrown at them during _."),
		new Card("_ has the _."),
		new Card("Drunken games of Pretend You're Xyzzy lead to _ and _."),
		new Card("Who dunnit? _ with _ in _.")
	}, responseCards = new Card[]{
		new Card("The Chilled Knife."),
		new Card("Paul and Storm."),
		new Card("Jonathan Coulton."),
		new Card("MC Frontalot."),
		new Card("Pretending you're Xyzzy."),
		new Card("Cleveland (it's not Detroit!)."),
		new Card("The best card in my hand."),
		new Card("Suddenly realizing you're retarded."),
		new Card("A Canadian penny."),
		new Card("dho's penis."),
		new Card("Griffy's tits."),
		new Card("The Hollaad Tonnel.")
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