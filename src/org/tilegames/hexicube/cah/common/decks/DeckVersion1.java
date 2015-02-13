package org.tilegames.hexicube.cah.common.decks;

import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.Card;

public class DeckVersion1 extends Deck
{
	private static final Card[] callCards = new Card[]{
		new Card("Who stole the cookies from the cookie jar?", true),
		new Card("What's the next superhero?", true),
		new Card("I wish I hadn't lost the instruction manual for ____.", true),
		new Card("When I'm in prison, I'll have ____ smuggled in.", true),
		new Card("After Hurricane Katrina, Sean Penn brought ____ to all the people of New Orleans.", true),
		new Card("Due to a PR fiasco, Walmart no longer offers ____.", true),
		new Card("Life was difficult for cavemen before ____.", true),
		new Card("In his new summer comedy, Rob Schneider is ____ trapped in the body of ____.", true),
	}, responseCards = new Card[]{
		new Card("Hunting accidents.", false),
		new Card("A cartoon camel enjoying the smooth, refreshing taste of a cigarette.", false),
		new Card("Abstinence.", false),
		new Card("Mountain Dew Code Red.", false),
		new Card("Tweeting.", false),
		new Card("Making sex at her.", false),
		new Card("Stunt doubles.", false),
		new Card("Flavored condoms.", false),
		new Card("Heath Ledger.", false),
		new Card("Muzzy.", false),
		new Card("Cookie Monster devouring the Eucharist wafers.", false),
		new Card("Letting yourself go.", false),
		new Card("A LAN party.", false),
		new Card("A grande sugar-free iced soy caramel macchiato.", false),
		new Card("Will Smith.", false),
		new Card("Marky Mark and the Funky Bunch.", false),
		new Card("Dave Matthews Band.", false),
		new Card("Substitute teachers.", false),
		new Card("Garth Brooks.", false),
		new Card("Keeping Christ in Christmas.", false),
		new Card("That one gay Teletubby.", false),
		new Card("The People's Elbow.", false),
		new Card("Eastern European Turbo-Folk music.", false),
		new Card("Douchebags on their iPhones.", false),
		new Card("The deformed.", false),
		new Card("Donald Trump.", false),
		new Card("This answer is postmodern.", false),
		new Card("Have some more kugel.", false),
		new Card("Shorties and blunts.", false),
		new Card("(I am doing Kegels right now.)", false),
		new Card("Bestiality.", false),
		new Card("Drum circles.", false),
		new Card("Inappropriate yelling.", false),
		new Card("The Thong Song.", false),
		new Card("A vajazzled vagina.", false),
		new Card("Tiger Woods.", false),
		new Card("PCP.", false),
		new Card("Mr. Snuffleupagus.", false),
		new Card("Those times when you get sand in your vagina.", false),
		new Card("Faith healing.", false),
		new Card("Impotence.", false),
		new Card("Bananas in Pajamas.", false),
		new Card("Twinkies&reg;.", false),
		new Card("A neglected Tamagotchi&trade;.", false),
		new Card("Sobbing into a Hungry-Man&reg; Frozen Dinner.", false),
		new Card("Ring Pops&trade;.", false),
	};
	
	@Override
	public String getDeckName()
	{
		return "First Version";
	}
	
	@Override
	public String getShortDeckName()
	{
		return "1.0";
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