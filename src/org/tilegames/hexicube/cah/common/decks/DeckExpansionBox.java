package org.tilegames.hexicube.cah.common.decks;

import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.Card;

public class DeckExpansionBox extends Deck
{
	private static final Card[] callCards = new Card[]{
		new Card("Why can't I sleep at night?", true),
	}, responseCards = new Card[]{
		new Card("The biggest, blackest dick.", false),
		new Card("An outbreak of smallbox.", false),
		new Card("The Boxcar Children.", false),
		new Card("A world without boxes.", false),
		new Card("Boxing up my feelings.", false),
		new Card("Something that looks like a box but turns out to be a crate.", false),
		new Card("The J15 Patriot Assault Box.", false),
		new Card("A box without hinges, key, or lid, yet golden treasure inside is hid.", false),
		new Card("Former President George W. Box.", false),
		new Card("Pandora's vagina.", false),
		new Card("A box.", false),
		new Card("A box within a box.", false),
		new Card("A boxing match with a giant box.", false),
		new Card("A box that is conscious and wishes it weren't a box.", false),
		new Card("A box of biscuits, a box of mixed biscuits, and a biscuit mixer.", false),
		new Card("A box-shaped man.", false),
		new Card("A man-shaped box.", false),
		new Card("An alternate universe in which boxes store things inside of people.", false),
		new Card("Two midgets shitting into a box.", false),
		new Card("A falcon with a box on its head.", false),
		new Card("Being a motherfucking box.", false),
	};
	
	@Override
	public String getDeckName()
	{
		return "Box Expansion";
	}
	
	@Override
	public String getShortDeckName()
	{
		return "Box";
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