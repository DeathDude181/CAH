package org.tilegames.hexicube.cah.common.decks;

import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.Card;

public class DeckPaxPrime2013 extends Deck
{
	private static final Card[] callCards = new Card[]{
		new Card("The most controversial game at PAX this year is an 8-bit indie platformer about _.<span class="),
		new Card("What made Spock cry?<span class="),
		new Card("_: Achievement unlocked.<span class="),
		new Card("What's the latest bullshit that's troubling this quaint fantasy town?<span class="),
		new Card("There was a riot at the Gearbox panel when they gave the attendees _.<span class="),
		new Card("In the new DLC for Mass Effect, Shepard must save the galaxy from _.<span class="),
		new Card("No Enforcer wants to manage the panel on _.<span class="),
	}, responseCards = new Card[]{
		new Card("Reading the comments.<span class="),
		new Card("The collective wail of every Magic player suddenly realizing that they've spent hundreds of dollars on pieces of cardboard.<span class="),
		new Card("Being an attractive elf trapped in an unattractive human's body.<span class="),
		new Card("Temporary invincibility.<span class="),
		new Card("Mario Kart rage.<span class="),
		new Card("A homemade, cum-stained Star Trek uniform.<span class="),
		new Card("Never watching, discussing, or thinking about My Little Pony.<span class="),
		new Card("Turn-of-the-century sky racists.<span class="),
		new Card("A fully-dressed female videogame character.<span class="),
		new Card("Buying virtual clothes for a Sim family instead of real clothes for a real family.<span class="),
		new Card("Google Glass + e-cigarette: Ultimate Combo!<span class="),
		new Card("Full HD.<span class="),
		new Card("Allowing nacho cheese to curdle in your beard while you creep in League of Legends.<span class="),
		new Card("The Sarlacc.<span class="),
		new Card("Nude-modding Super Mario World.<span class="),
		new Card("An angry stone head that stomps on the floor every three seconds.<span class="),
		new Card("Yoshi's huge egg-laying cloaca.<span class="),
		new Card("The Cock Ring of Alacrity.<span class="),
		new Card("Offering sexual favors for an ore and a sheep.<span class="),
		new Card("Unlocking a new sex position.<span class="),
		new Card("The boner hatch in the Iron Man suit.<span class="),
		new Card("The decade of legal inquests following a single hour of Grand Theft Auto.<span class="),
		new Card("Legendary Creature &ndash; Robert Khoo.<span class="),
		new Card("Winning the approval of Cooking Mama that you never got from actual mama.<span class="),
		new Card("Tapping Sara Angel.<span class="),
		new Card("Charles Barkley Shut Up and Jam!<span class="),
		new Card("Getting into a situation with an owlbear.<span class="),
		new Card("Grand Theft Auto: Fort Lauderdale.<span class="),
		new Card("A madman who lives in a policebox and kidnaps women.<span class="),
		new Card("SNES cartridge cleaning fluid.<span class="),
		new Card("Eating a pizza that's lying on the street to gain health.<span class="),
		new Card("The gravity gun.<span class="),
		new Card("Achieving the manual dexterity and tactical brilliance of a 12-year-old Korean boy.<span class="),
		new Card("Rolling a D20 to save a failing marriage.<span class="),
		new Card("Bowser's aching heart.<span class="),
		new Card("Filling every pouch of a UtiliKilt&trade; with pizza.<span class="),
		new Card("70,000 gamers sweating and farting inside an airtight steel dome.<span class=")
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