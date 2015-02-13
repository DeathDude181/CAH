package org.tilegames.hexicube.cah.common.decks;

import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.Card;

public class Deck2012Holiday extends Deck
{
	private static final Card[] callCards = new Card[]{
		new Card("This holiday season, Tim Allen must overcome his fear of ____ to save Christmas.", true),
		new Card("Jesus is ____.", true),
		new Card("On the third day of Christmas, my true love gave to me: three French hens, two turtle doves, and ____.", true),
		new Card("Wake up, America. Christmas is under attack by secular liberals and their ____.", true),
		new Card("Every Christmas, my uncle gets drunk and tells the story about ____.", true),
		new Card("What keeps me warm during the cold, cold winter?", true),
		new Card("After blacking out during New Year's Eve, I was awoken by ____.", true),
	}, responseCards = new Card[]{
		new Card("Santa's heavy sack.", false),
		new Card("Clearing a bloody path through Walmart with a scimitar.", false),
		new Card("Another shitty year.", false),
		new Card("Whatever Kwanzaa is supposed to be about.", false),
		new Card("A Christmas stocking full of coleslaw.", false),
		new Card("Elf cum.", false),
		new Card("The tiny, calloused hands of the Chinese children that made this card.", false),
		new Card("Taking down Santa with a surface-to-air missle.", false),
		new Card("Socks. ", false),
		new Card("Pretending to be happy.", false),
		new Card("Krampus, the Austrian Christmas monster.", false),
		new Card("The Star Wars Holiday Special.", false),
		new Card("Mall Santa.", false),
		new Card("Several intertwining love stories featuring Hugh Grant.", false),
		new Card("Gift-wrapping a live hamster.", false),
		new Card("Space Jam on VHS.", false),
		new Card("Immaculate conception.", false),
		new Card("Fucking up ", false),
		new Card("A visually arresting turtleneck.", false),
		new Card("A toxic family environment.", false),
		new Card("Eating an entire snowman.", false),
		new Card("My hot cousin.", false),
		new Card("A Hungry-Man&trade; Frozen Christmas Dinner for One.", false),
	};
	
	@Override
	public String getDeckName()
	{
		return "2012 Holiday Pack";
	}
	
	@Override
	public String getShortDeckName()
	{
		return "Hol12";
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