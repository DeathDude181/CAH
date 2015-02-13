package org.tilegames.hexicube.cah.common.decks;

import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.Card;

public class DeckPaxPrime2013 extends Deck
{
	private static final Card[] callCards = new Card[]{
		new Card("The most controversial game at PAX this year is an 8-bit indie platformer about ____.<span class=", true),
		new Card("What made Spock cry?<span class=", true),
		new Card("____: Achievement unlocked.<span class=", true),
		new Card("What's the latest bullshit that's troubling this quaint fantasy town?<span class=", true),
		new Card("There was a riot at the Gearbox panel when they gave the attendees ____.<span class=", true),
		new Card("In the new DLC for Mass Effect, Shepard must save the galaxy from ____.<span class=", true),
		new Card("No Enforcer wants to manage the panel on ____.<span class=", true),
	}, responseCards = new Card[]{
		new Card("Reading the comments.<span class=", false),
		new Card("The collective wail of every Magic player suddenly realizing that they've spent hundreds of dollars on pieces of cardboard.<span class=", false),
		new Card("Being an attractive elf trapped in an unattractive human's body.<span class=", false),
		new Card("Temporary invincibility.<span class=", false),
		new Card("Mario Kart rage.<span class=", false),
		new Card("A homemade, cum-stained Star Trek uniform.<span class=", false),
		new Card("Never watching, discussing, or thinking about My Little Pony.<span class=", false),
		new Card("Turn-of-the-century sky racists.<span class=", false),
		new Card("A fully-dressed female videogame character.<span class=", false),
		new Card("Buying virtual clothes for a Sim family instead of real clothes for a real family.<span class=", false),
		new Card("Google Glass + e-cigarette: Ultimate Combo!<span class=", false),
		new Card("Full HD.<span class=", false),
		new Card("Allowing nacho cheese to curdle in your beard while you creep in League of Legends.<span class=", false),
		new Card("The Sarlacc.<span class=", false),
		new Card("Nude-modding Super Mario World.<span class=", false),
		new Card("An angry stone head that stomps on the floor every three seconds.<span class=", false),
		new Card("Yoshi's huge egg-laying cloaca.<span class=", false),
		new Card("The Cock Ring of Alacrity.<span class=", false),
		new Card("Offering sexual favors for an ore and a sheep.<span class=", false),
		new Card("Unlocking a new sex position.<span class=", false),
		new Card("The boner hatch in the Iron Man suit.<span class=", false),
		new Card("The decade of legal inquests following a single hour of Grand Theft Auto.<span class=", false),
		new Card("Legendary Creature &ndash; Robert Khoo.<span class=", false),
		new Card("Winning the approval of Cooking Mama that you never got from actual mama.<span class=", false),
		new Card("Tapping Sara Angel.<span class=", false),
		new Card("Charles Barkley Shut Up and Jam!<span class=", false),
		new Card("Getting into a situation with an owlbear.<span class=", false),
		new Card("Grand Theft Auto: Fort Lauderdale.<span class=", false),
		new Card("A madman who lives in a policebox and kidnaps women.<span class=", false),
		new Card("SNES cartridge cleaning fluid.<span class=", false),
		new Card("Eating a pizza that's lying on the street to gain health.<span class=", false),
		new Card("The gravity gun.<span class=", false),
		new Card("Achieving the manual dexterity and tactical brilliance of a 12-year-old Korean boy.<span class=", false),
		new Card("Rolling a D20 to save a failing marriage.<span class=", false),
		new Card("Bowser's aching heart.<span class=", false),
		new Card("Filling every pouch of a UtiliKilt&trade; with pizza.<span class=", false),
		new Card("70,000 gamers sweating and farting inside an airtight steel dome.<span class=", false),
	};
	
	@Override
	public String getDeckName()
	{
		return "PAX Prime 2013";
	}
	
	@Override
	public String getShortDeckName()
	{
		return "PAX-P";
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