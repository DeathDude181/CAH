package org.tilegames.hexicube.cah.common.decks;

import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.Card;

public class DeckCanadian extends Deck
{
	private static final Card[] callCards = new Card[]{
		new Card("O Canada, we stand on guard for _."),
		new Card("Air Canada guidelines now prohibit _ on airplanes."),
		new Card("In an attempt to reach a wider audience, the Royal Ontario Museum has opened an interactive exhibit on _."),
		new Card("CTV presents _, the story of _."),
		new Card("What's the Canadian government using to inspire rural students to succeed?")
	}, responseCards = new Card[]{
		new Card("Mr. Dressup."),
		new Card("Being Canadian."),
		new Card("The Famous Five."),
		new Card("Stephen Harper."),
		new Card("The Royal Canadian Mounted Police."),
		new Card("An icy handjob from an Edmonton hooker."),
		new Card("Poutine."),
		new Card("Newfies."),
		new Card("The Official Languages Act. La Loi sur les langues officielles."),
		new Card("Terry Fox's prosthetic leg."),
		new Card("The FLQ."),
		new Card("Canada: America's Hat."),
		new Card("Don Cherry's wardrobe."),
		new Card("Burning down the White House."),
		new Card("Heritage minutes."),
		new Card("Homo milk."),
		new Card("Naked News."),
		new Card("Syrupy sex with a maple tree."),
		new Card("Snotsicles."),
		new Card("Schmirler the Curler."),
		new Card("A Molson muscle.")
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