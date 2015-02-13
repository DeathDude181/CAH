package org.tilegames.hexicube.cah.common.decks;

import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.Card;

public class DeckFiMFiction extends Deck
{
	private static final Card[] callCards = new Card[]{
		new Card("That fucking idiot ____ ragequit the fandom over ____.", true),
		new Card("____ ____ Divided By ____.", true),
		new Card("____ <br>~Skeeter The Lurker", true),
		new Card("____ adds a thread in the Anti-____ group, and everybody loses their fucking minds.", true),
		new Card("____ is Best Pony.", true),
		new Card("____ is the least autistic ____ on Fimfiction.", true),
		new Card("____ posted that they're not working on fics for a while, because ____.", true),
		new Card("____ signalled the end of the ____ Age of FiMfiction.net.", true),
		new Card("____ signalled the end of the Golden Age of FiMfiction.net.", true),
		new Card("____ was a strong stallion.", true),
		new Card("____, ____, and ____ in a sexy circlejerk.", true),
		new Card("A clopfic about ____ with ____, and ____ is a sexy orphan.", true),
		new Card("An alternate universe where ____ is instead ____.", true),
		new Card("Fallout Equestria is ____ and tends to overdramaticize its ____.", true),
		new Card("Hey, let's cross over ____ and MLP! Why the fuck not?", true),
		new Card("I commissioned a picture of ____ violating ____ with ____'s dick.", true),
		new Card("I hope someone writes a fic about ____ because I am too fucking lazy to do it myself.", true),
		new Card("I just read a fic where ____ was fucking ____.", true),
		new Card("I just started the ____verse.", true),
		new Card("I swear I'm going to quit the fandom if ____ happens.", true),
		new Card("If only people bothered to read Ezn's ____ Guide!", true),
		new Card("knighty's new blogpost is about ____", true),
		new Card("My ____ Pony", true),
		new Card("My Little Dashie? How about My Little ____?", true),
		new Card("My OTP is ____ and ____.", true),
		new Card("Oh, fuck, someone made a group about ____.", true),
		new Card("Oh, look, ____ made a fan group for themselves.", true),
		new Card("RainbowBob's newest clopfic: ____ X ____", true),
		new Card("Remember when ____ was on every page?", true),
		new Card("Short Skirts and ____.", true),
		new Card("Someone should write a clopfic of ____ fucking ____, using ____ as lubricant.", true),
		new Card("The ____ Bureau.", true),
		new Card("The ____ Group of ____ Excellence.", true),
		new Card("The cardinal sin of FiMFic noobs: _____ without ______", true),
		new Card("The Incredible ____ Of A Winning ____.", true),
		new Card("There's a crossover fic about ____ and ____ in the FB.", true),
	}, responseCards = new Card[]{
		new Card("Alicorn OCs.", false),
		new Card("An End of Ponies update.", false),
		new Card("Another ball-greasing 502 error, for fuck's sake! Goddamnit!", false),
		new Card("Assholes who hate foalcon.", false),
		new Card("Big Macintosh's gaping, sloppy-wet boycunt.", false),
		new Card("Blackjack.", false),
		new Card("Bronies.", false),
		new Card("Chuckward, before he was banned.", false),
		new Card("Cola's ass.", false),
		new Card("Columbine. Dear fucking Celestia, Columbine.", false),
		new Card("Crotchtits.", false),
		new Card("darf.", false),
		new Card("darf's corpse, Faust rest his soul.", false),
		new Card("Dollhouse.", false),
		new Card("Eakin.", false),
		new Card("Equestria Daily.", false),
		new Card("Fallout: Equestria: Project Horizons.", false),
		new Card("Fallout: Equestria.", false),
		new Card("FelixDawn.", false),
		new Card("Fillyfooler.", false),
		new Card("Foalcon.", false),
		new Card("Fucking 502 errors.", false),
		new Card("Fucking Anthro.", false),
		new Card("Goddamned crossover fics.", false),
		new Card("Goddamned unnecessary futa.", false),
		new Card("Horsedick.", false),
		new Card("Humancunt.", false),
		new Card("Humanized.", false),
		new Card("IJAB.", false),
		new Card("Kaidan.", false),
		new Card("knighty.", false),
		new Card("knighty's dribbling dick.", false),
		new Card("Lacinias.", false),
		new Card("Littlepip.", false),
		new Card("Mares with dicks.", false),
		new Card("Meeester", false),
		new Card("Mods.", false),
		new Card("More 502 errors, christ.", false),
		new Card("My Little Dashie, even though it's a piece of shit.", false),
		new Card("NSFW blogposts filled with guro and incest.", false),
		new Card("Nyx, the ultimate Mary Sue.", false),
		new Card("Obselescence.", false),
		new Card("On A Cross And An Arrow.", false),
		new Card("para's sweaty nutsack.", false),
		new Card("parasprite.", false),
		new Card("Ponycunt.", false),
		new Card("RainbowBob.", false),
		new Card("RBDash47's latest blog post.", false),
		new Card("Regidar, again, the little shit.", false),
		new Card("Regidar.", false),
		new Card("Riffing.", false),
		new Card("Sethisto.", false),
		new Card("Short Skirts and Explosions.", false),
		new Card("Sick freaks who love foalcon.", false),
		new Card("Skeeter The Lurker.", false),
		new Card("Stallions with cunts.", false),
		new Card("That jackass Aegis Shield.", false),
		new Card("That jackass Silent Bob.", false),
		new Card("The Conversion Bureau.", false),
		new Card("The Featured Box.", false),
		new Card("The Great NSFW Purge Of 2013.", false),
		new Card("The Mature Featured Box.", false),
		new Card("The Noble Jury.", false),
		new Card("The Pony Fiction Vault, before it fucked off into the sunset.", false),
		new Card("The Train Wreck Explorers.", false),
		new Card("The Writer's Group.", false),
		new Card("Those doucheslurping Adsense assholes.", false),
		new Card("Twilacorn Autism.", false),
		new Card("Twilacorn.", false),
		new Card("Twilight Sparkle, the ultimate Mary Sue.", false),
		new Card("Twilight Sparkle's massive, throbbing princesshood.", false),
		new Card("Twilight's Library", false),
		new Card("Wanderer D.", false),
		new Card("Xenophilia.", false),
		new Card("Your bullshit OTP.", false),
		new Card("Your shitty OC.", false),
	};
	
	@Override
	public String getDeckName()
	{
		return "[C] FiMFiction.net";
	}
	
	@Override
	public String getShortDeckName()
	{
		return "FiM";
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