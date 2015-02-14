package org.tilegames.hexicube.cah.common.decks;

import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.Card;

public class DeckVersion1 extends Deck
{
	private static final Card[] callCards = new Card[]{
		new Card("Who stole the cookies from the cookie jar?"),
		new Card("What's the next superhero?"),
		new Card("I wish I hadn't lost the instruction manual for _."),
		new Card("When I'm in prison, I'll have _ smuggled in."),
		new Card("After Hurricane Katrina, Sean Penn brought _ to all the people of New Orleans."),
		new Card("Due to a PR fiasco, Walmart no longer offers _."),
		new Card("Life was difficult for cavemen before _."),
		new Card("In his new summer comedy, Rob Schneider is _ trapped in the body of _.")
	}, responseCards = new Card[]{
		new Card("hunting accidents"),
		new Card("a cartoon camel enjoying the smooth, refreshing taste of a cigarette"),
		new Card("abstinence"),
		new Card("Mountain Dew Code Red"),
		new Card("tweeting"),
		new Card("making sex at her"),
		new Card("stunt doubles"),
		new Card("flavored condoms"),
		new Card("Heath Ledger"),
		new Card("muzzy"),
		new Card("Cookie Monster devouring the Eucharist wafers"),
		new Card("letting yourself go"),
		new Card("a LAN party"),
		new Card("a grande sugar-free iced soy caramel macchiato"),
		new Card("Will Smith"),
		new Card("Marky Mark and the Funky Bunch"),
		new Card("Dave Matthews Band"),
		new Card("substitute teachers"),
		new Card("Garth Brooks"),
		new Card("keeping Christ in Christmas"),
		new Card("that one gay Teletubby"),
		new Card("the People's Elbow"),
		new Card("Eastern European Turbo-Folk music"),
		new Card("douchebags on their iPhones"),
		new Card("the deformed"),
		new Card("Donald Trump"),
		new Card("this answer is postmodern"),
		new Card("have some more kugel"),
		new Card("shorties and blunts"),
		new Card("(I am doing Kegels right now)"),
		new Card("bestiality"),
		new Card("drum circles"),
		new Card("inappropriate yelling"),
		new Card("the Thong Song"),
		new Card("a vajazzled vagina"),
		new Card("Tiger Woods"),
		new Card("PCP"),
		new Card("Mr. Snuffleupagus"),
		new Card("those times when you get sand in your vagina"),
		new Card("faith healing"),
		new Card("impotence"),
		new Card("Bananas in Pajamas"),
		new Card("Twinkies&reg;"),
		new Card("a neglected Tamagotchi&trade;"),
		new Card("sobbing into a Hungry-Man&reg; Frozen Dinner"),
		new Card("Ring Pops&trade;")
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