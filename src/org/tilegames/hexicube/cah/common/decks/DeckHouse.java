package org.tilegames.hexicube.cah.common.decks;

import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.Card;

public class DeckHouse extends Deck
{
	private static final Card[] callCards = new Card[]{
		new Card("I can't believe Netflix is using _ to promote House of Cards."),
		new Card("I'm not going to lie. I despise _. There, I said it."),
		new Card("A wise man said, 'Everything is about sex. Except sex. Sex is about _.'"),
		new Card("Our relationship is strictly professional. Let's not complicate things with _."),
		new Card("Because you enjoyed _, we thought you'd like _."),
		new Card("We're not like other news organizations. Here at Slugline, we welcome _ in the office. "),
		new Card("Cancel all my meetings. We've got a situation with _ that requires my immediate attention."),
		new Card("If you need him to, Remy Danton can pull some strings and get you _, but it'll cost you."),
		new Card("Corruption. Betrayal. _. Coming soon to Netflix, 'House of _.'")
	}, responseCards = new Card[]{
		new Card("25 shitty jokes about House of Cards."),
		new Card("An origami swan thatâs some kind of symbol?"),
		new Card("The sensitive European photographer whoâs fucking my wife."),
		new Card("A much younger woman."),
		new Card("A homoerotic subplot."),
		new Card("Forcing a handjob on a dying man. "),
		new Card("Ribs so good they transcend race and class."),
		new Card("Carbon monoxide poisoning. "),
		new Card("Punching a congressman in the face."),
		new Card("Discharging a firearm in a residential area."),
		new Card("Strangling a dog to make a point to the audience."),
		new Card("A childless marriage."),
		new Card("Getting eaten out while on the phone with Dad."),
		new Card("Making it look like a suicide."),
		new Card("An older man."),
		new Card("My constituents.")
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