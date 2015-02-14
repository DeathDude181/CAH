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
		new Card("Santa's heavy sack"),
		new Card("clearing a bloody path through Walmart with a scimitar"),
		new Card("another shitty year"),
		new Card("whatever Kwanzaa is supposed to be about"),
		new Card("a Christmas stocking full of coleslaw"),
		new Card("elf cum"),
		new Card("the tiny, calloused hands of the Chinese children that made this card"),
		new Card("taking down Santa with a surface-to-air missle"),
		new Card("socks"),
		new Card("pretending to be happy"),
		new Card("Krampus, the Austrian Christmas monster"),
		new Card("the Star Wars Holiday Special"),
		new Card("Mall Santa"),
		new Card("several intertwining love stories featuring Hugh Grant"),
		new Card("gift-wrapping a live hamster"),
		new Card("Space Jam on VHS"),
		new Card("immaculate conception"),
		new Card("fucking up"),
		new Card("a visually arresting turtleneck"),
		new Card("a toxic family environment"),
		new Card("eating an entire snowman"),
		new Card("my hot cousin"),
		new Card("a Hungry-Man™ Frozen Christmas Dinner for one")
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