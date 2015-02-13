package org.tilegames.hexicube.cah.common.decks;

import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.Card;

public class Deck2012Holiday extends Deck
{
	private static final Card[] callCards = new Card[]{
		new Card("This holiday season, Tim Allen must overcome his fear of _ to save Christmas."),
		new Card("Jesus is _."),
		new Card("On the third day of Christmas, my true love gave to me: three French hens, two turtle doves, and _."),
		new Card("Wake up, America. Christmas is under attack by secular liberals and their _."),
		new Card("Every Christmas, my uncle gets drunk and tells the story about _."),
		new Card("What keeps me warm during the cold, cold winter?"),
		new Card("After blacking out during New Year's Eve, I was awoken by _.")
	}, responseCards = new Card[]{
		new Card("Santa's heavy sack."),
		new Card("Clearing a bloody path through Walmart with a scimitar."),
		new Card("Another shitty year."),
		new Card("Whatever Kwanzaa is supposed to be about."),
		new Card("A Christmas stocking full of coleslaw."),
		new Card("Elf cum."),
		new Card("The tiny, calloused hands of the Chinese children that made this card."),
		new Card("Taking down Santa with a surface-to-air missle."),
		new Card("Socks. "),
		new Card("Pretending to be happy."),
		new Card("Krampus, the Austrian Christmas monster."),
		new Card("The Star Wars Holiday Special."),
		new Card("Mall Santa."),
		new Card("Several intertwining love stories featuring Hugh Grant."),
		new Card("Gift-wrapping a live hamster."),
		new Card("Space Jam on VHS."),
		new Card("Immaculate conception."),
		new Card("Fucking up "),
		new Card("A visually arresting turtleneck."),
		new Card("A toxic family environment."),
		new Card("Eating an entire snowman."),
		new Card("My hot cousin."),
		new Card("A Hungry-Man&trade; Frozen Christmas Dinner for One.")
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