package org.tilegames.hexicube.cah.common.decks;

import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.Card;

public class DeckFiMFiction extends Deck
{
	private static final Card[] callCards = new Card[]{
		new Card("That fucking idiot _ ragequit the fandom over _."),
		new Card("_ _ Divided By _."),
		new Card("_ <br>~Skeeter The Lurker"),
		new Card("_ adds a thread in the Anti-_ group, and everybody loses their fucking minds."),
		new Card("_ is Best Pony."),
		new Card("_ is the least autistic _ on Fimfiction."),
		new Card("_ posted that they're not working on fics for a while, because _."),
		new Card("_ signalled the end of the _ Age of FiMfiction.net."),
		new Card("_ signalled the end of the Golden Age of FiMfiction.net."),
		new Card("_ was a strong stallion."),
		new Card("_, _, and _ in a sexy circlejerk."),
		new Card("A clopfic about _ with _, and _ is a sexy orphan."),
		new Card("An alternate universe where _ is instead _."),
		new Card("Fallout Equestria is _ and tends to overdramaticize its _."),
		new Card("Hey, let's cross over _ and MLP! Why the fuck not?"),
		new Card("I commissioned a picture of _ violating _ with _'s dick."),
		new Card("I hope someone writes a fic about _ because I am too fucking lazy to do it myself."),
		new Card("I just read a fic where _ was fucking _."),
		new Card("I just started the ____verse."),
		new Card("I swear I'm going to quit the fandom if _ happens."),
		new Card("If only people bothered to read Ezn's _ Guide!"),
		new Card("knighty's new blogpost is about _"),
		new Card("My _ Pony"),
		new Card("My Little Dashie? How about My Little _?"),
		new Card("My OTP is _ and _."),
		new Card("Oh, fuck, someone made a group about _."),
		new Card("Oh, look, _ made a fan group for themselves."),
		new Card("RainbowBob's newest clopfic: _ X _"),
		new Card("Remember when _ was on every page?"),
		new Card("Short Skirts and _."),
		new Card("Someone should write a clopfic of _ fucking _, using _ as lubricant."),
		new Card("The _ Bureau."),
		new Card("The _ Group of _ Excellence."),
		new Card("The cardinal sin of FiMFic noobs: _____ without ______"),
		new Card("The Incredible _ Of A Winning _."),
		new Card("There's a crossover fic about _ and _ in the FB.")
	}, responseCards = new Card[]{
		new Card("Alicorn OCs."),
		new Card("An End of Ponies update."),
		new Card("Another ball-greasing 502 error, for fuck's sake! Goddamnit!"),
		new Card("Assholes who hate foalcon."),
		new Card("Big Macintosh's gaping, sloppy-wet boycunt."),
		new Card("Blackjack."),
		new Card("Bronies."),
		new Card("Chuckward, before he was banned."),
		new Card("Cola's ass."),
		new Card("Columbine. Dear fucking Celestia, Columbine."),
		new Card("Crotchtits."),
		new Card("darf."),
		new Card("darf's corpse, Faust rest his soul."),
		new Card("Dollhouse."),
		new Card("Eakin."),
		new Card("Equestria Daily."),
		new Card("Fallout: Equestria: Project Horizons."),
		new Card("Fallout: Equestria."),
		new Card("FelixDawn."),
		new Card("Fillyfooler."),
		new Card("Foalcon."),
		new Card("Fucking 502 errors."),
		new Card("Fucking Anthro."),
		new Card("Goddamned crossover fics."),
		new Card("Goddamned unnecessary futa."),
		new Card("Horsedick."),
		new Card("Humancunt."),
		new Card("Humanized."),
		new Card("IJAB."),
		new Card("Kaidan."),
		new Card("knighty."),
		new Card("knighty's dribbling dick."),
		new Card("Lacinias."),
		new Card("Littlepip."),
		new Card("Mares with dicks."),
		new Card("Meeester"),
		new Card("Mods."),
		new Card("More 502 errors, christ."),
		new Card("My Little Dashie, even though it's a piece of shit."),
		new Card("NSFW blogposts filled with guro and incest."),
		new Card("Nyx, the ultimate Mary Sue."),
		new Card("Obselescence."),
		new Card("On A Cross And An Arrow."),
		new Card("para's sweaty nutsack."),
		new Card("parasprite."),
		new Card("Ponycunt."),
		new Card("RainbowBob."),
		new Card("RBDash47's latest blog post."),
		new Card("Regidar, again, the little shit."),
		new Card("Regidar."),
		new Card("Riffing."),
		new Card("Sethisto."),
		new Card("Short Skirts and Explosions."),
		new Card("Sick freaks who love foalcon."),
		new Card("Skeeter The Lurker."),
		new Card("Stallions with cunts."),
		new Card("That jackass Aegis Shield."),
		new Card("That jackass Silent Bob."),
		new Card("The Conversion Bureau."),
		new Card("The Featured Box."),
		new Card("The Great NSFW Purge Of 2013."),
		new Card("The Mature Featured Box."),
		new Card("The Noble Jury."),
		new Card("The Pony Fiction Vault, before it fucked off into the sunset."),
		new Card("The Train Wreck Explorers."),
		new Card("The Writer's Group."),
		new Card("Those doucheslurping Adsense assholes."),
		new Card("Twilacorn Autism."),
		new Card("Twilacorn."),
		new Card("Twilight Sparkle, the ultimate Mary Sue."),
		new Card("Twilight Sparkle's massive, throbbing princesshood."),
		new Card("Twilight's Library"),
		new Card("Wanderer D."),
		new Card("Xenophilia."),
		new Card("Your bullshit OTP."),
		new Card("Your shitty OC.")
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