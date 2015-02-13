package org.tilegames.hexicube.cah.common.decks;

import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.Card;

public class DeckExpansionBox extends Deck
{
	private static final Card[] callCards = new Card[]{
		new Card("Why can't I sleep at night?")
	}, responseCards = new Card[]{
		new Card("The biggest, blackest dick."),
		new Card("An outbreak of smallbox."),
		new Card("The Boxcar Children."),
		new Card("A world without boxes."),
		new Card("Boxing up my feelings."),
		new Card("Something that looks like a box but turns out to be a crate."),
		new Card("The J15 Patriot Assault Box."),
		new Card("A box without hinges, key, or lid, yet golden treasure inside is hid."),
		new Card("Former President George W. Box."),
		new Card("Pandora's vagina."),
		new Card("A box."),
		new Card("A box within a box."),
		new Card("A boxing match with a giant box."),
		new Card("A box that is conscious and wishes it weren't a box."),
		new Card("A box of biscuits, a box of mixed biscuits, and a biscuit mixer."),
		new Card("A box-shaped man."),
		new Card("A man-shaped box."),
		new Card("An alternate universe in which boxes store things inside of people."),
		new Card("Two midgets shitting into a box."),
		new Card("A falcon with a box on its head."),
		new Card("Being a motherfucking box.")
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