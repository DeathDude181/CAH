package org.tilegames.hexicube.cah.common.decks;

import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.Card;

public class DeckCanadian extends Deck
{
	private static final Card[] callCards = new Card[]{
		new Card("O Canada, we stand on guard for ____.", true),
		new Card("Air Canada guidelines now prohibit ____ on airplanes.", true),
		new Card("In an attempt to reach a wider audience, the Royal Ontario Museum has opened an interactive exhibit on ____.", true),
		new Card("CTV presents ____, the story of ____.", true),
		new Card("What's the Canadian government using to inspire rural students to succeed?", true),
	}, responseCards = new Card[]{
		new Card("Mr. Dressup.", false),
		new Card("Being Canadian.", false),
		new Card("The Famous Five.", false),
		new Card("Stephen Harper.", false),
		new Card("The Royal Canadian Mounted Police.", false),
		new Card("An icy handjob from an Edmonton hooker.", false),
		new Card("Poutine.", false),
		new Card("Newfies.", false),
		new Card("The Official Languages Act. La Loi sur les langues officielles.", false),
		new Card("Terry Fox's prosthetic leg.", false),
		new Card("The FLQ.", false),
		new Card("Canada: America's Hat.", false),
		new Card("Don Cherry's wardrobe.", false),
		new Card("Burning down the White House.", false),
		new Card("Heritage minutes.", false),
		new Card("Homo milk.", false),
		new Card("Naked News.", false),
		new Card("Syrupy sex with a maple tree.", false),
		new Card("Snotsicles.", false),
		new Card("Schmirler the Curler.", false),
		new Card("A Molson muscle.", false),
	};
	
	@Override
	public String getDeckName()
	{
		return "Canadian";
	}
	
	@Override
	public String getShortDeckName()
	{
		return "CAN";
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