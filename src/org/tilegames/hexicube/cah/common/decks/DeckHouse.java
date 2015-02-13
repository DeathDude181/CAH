package org.tilegames.hexicube.cah.common.decks;

import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.Card;

public class DeckHouse extends Deck
{
	private static final Card[] callCards = new Card[]{
		new Card("I can't believe Netflix is using ____ to promote House of Cards.", true),
		new Card("I'm not going to lie. I despise ____. There, I said it.", true),
		new Card("A wise man said, 'Everything is about sex. Except sex. Sex is about ____.'", true),
		new Card("Our relationship is strictly professional. Let's not complicate things with ____.", true),
		new Card("Because you enjoyed ____, we thought you'd like ____.", true),
		new Card("We're not like other news organizations. Here at Slugline, we welcome ____ in the office. ", true),
		new Card("Cancel all my meetings. We've got a situation with ____ that requires my immediate attention.", true),
		new Card("If you need him to, Remy Danton can pull some strings and get you ____, but it'll cost you.", true),
		new Card("Corruption. Betrayal. ____. Coming soon to Netflix, 'House of ____.'", true),
	}, responseCards = new Card[]{
		new Card("25 shitty jokes about House of Cards.", false),
		new Card("An origami swan thatâs some kind of symbol?", false),
		new Card("The sensitive European photographer whoâs fucking my wife.", false),
		new Card("A much younger woman.", false),
		new Card("A homoerotic subplot.", false),
		new Card("Forcing a handjob on a dying man. ", false),
		new Card("Ribs so good they transcend race and class.", false),
		new Card("Carbon monoxide poisoning. ", false),
		new Card("Punching a congressman in the face.", false),
		new Card("Discharging a firearm in a residential area.", false),
		new Card("Strangling a dog to make a point to the audience.", false),
		new Card("A childless marriage.", false),
		new Card("Getting eaten out while on the phone with Dad.", false),
		new Card("Making it look like a suicide.", false),
		new Card("An older man.", false),
		new Card("My constituents.", false),
	};
	
	@Override
	public String getDeckName()
	{
		return "House of Cards Against Humanity";
	}
	
	@Override
	public String getShortDeckName()
	{
		return "House";
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