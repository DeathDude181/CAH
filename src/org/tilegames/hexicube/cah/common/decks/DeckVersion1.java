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
		new Card("Hunting accidents."),
		new Card("A cartoon camel enjoying the smooth, refreshing taste of a cigarette."),
		new Card("Abstinence."),
		new Card("Mountain Dew Code Red."),
		new Card("Tweeting."),
		new Card("Making sex at her."),
		new Card("Stunt doubles."),
		new Card("Flavored condoms."),
		new Card("Heath Ledger."),
		new Card("Muzzy."),
		new Card("Cookie Monster devouring the Eucharist wafers."),
		new Card("Letting yourself go."),
		new Card("A LAN party."),
		new Card("A grande sugar-free iced soy caramel macchiato."),
		new Card("Will Smith."),
		new Card("Marky Mark and the Funky Bunch."),
		new Card("Dave Matthews Band."),
		new Card("Substitute teachers."),
		new Card("Garth Brooks."),
		new Card("Keeping Christ in Christmas."),
		new Card("That one gay Teletubby."),
		new Card("The People's Elbow."),
		new Card("Eastern European Turbo-Folk music."),
		new Card("Douchebags on their iPhones."),
		new Card("The deformed."),
		new Card("Donald Trump."),
		new Card("This answer is postmodern."),
		new Card("Have some more kugel."),
		new Card("Shorties and blunts."),
		new Card("(I am doing Kegels right now.)"),
		new Card("Bestiality."),
		new Card("Drum circles."),
		new Card("Inappropriate yelling."),
		new Card("The Thong Song."),
		new Card("A vajazzled vagina."),
		new Card("Tiger Woods."),
		new Card("PCP."),
		new Card("Mr. Snuffleupagus."),
		new Card("Those times when you get sand in your vagina."),
		new Card("Faith healing."),
		new Card("Impotence."),
		new Card("Bananas in Pajamas."),
		new Card("Twinkies&reg;."),
		new Card("A neglected Tamagotchi&trade;."),
		new Card("Sobbing into a Hungry-Man&reg; Frozen Dinner."),
		new Card("Ring Pops&trade;.")
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