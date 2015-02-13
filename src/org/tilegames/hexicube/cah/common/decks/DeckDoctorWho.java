package org.tilegames.hexicube.cah.common.decks;

import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.Card;

public class DeckDoctorWho extends Deck
{
	private static final Card[] callCards = new Card[]{
		new Card("They found some more last episodes! They were found in ____.", true),
		new Card("The Doctor did it! He saved the world again! This time using a ____.", true),
		new Card("I'd give up ____ to travel with The Doctor.", true),
		new Card("The next Doctor Who spin-off is going to be called ____.", true),
		new Card("Who should be the 13th Doctor?", true),
		new Card("The Chameleon circuit is working again...somewhat. Instead of a phone booth, the TARDIS is now a ____.", true),
		new Card("Originally, the 50th special was going to have ____ appear, but the BBC decided against it in the end.", true),
		new Card("After we watch an episode, I've got some ____-flavored Jelly Babies to hand out.", true),
		new Card("Wibbly-wobbly, timey-wimey ____.", true),
		new Card("What's going to be The Doctor's new catchphrase?", true),
		new Card("Bowties are ____.", true),
		new Card("Old and busted: EXTERMINATE! New hotness: ____.", true),
		new Card("There's a new dance on Gallifrey. It's called the ____.", true),
		new Card("They announced a new LEGO Doctor Who game! Rumor has it that ____ is an unlockable character.", true),
		new Card("FUN FACT: The Daleks were originally shaped to look like ____.", true),
		new Card("At this new Doctor Who themed restaurant, you can get a free ____ if you can eat a plate of bangers and mash in under 3 minutes.", true),
		new Card("Who is going to be The Doctor's next companion?", true),
		new Card("I think the BBC is losing it. They just released a Doctor Who themed ____.", true),
		new Card("It's a little known fact that if you send a ____ to the BBC, they will send you a picture of The Doctor.", true),
		new Card("I was ok with all the BAD WOLF graffiti, until someone wrote it on ____.", true),
		new Card("Jack Harkness, I can't leave you alone for a minute! I turn around and you're trying to seduce ____.", true),
		new Card("In all of space and time you decide that ____ is a good choice?!", true),
		new Card("Adipose were thought to be made of fat, but are really made of ____.", true),
		new Card("I hear the next thing that will cause The Doctor to regenerate is ____.", true),
		new Card("____ was sent to save ____.", true),
		new Card("According to the Daleks, ____ is better at ____.", true),
	}, responseCards = new Card[]{
		new Card("Tom Baker, in nothing but a scarf", false),
		new Card("Walking in on Jack Harkness doing your mom. And your dad.", false),
		new Card("The buzzing noise the Sonic Screwdriver makes", false),
		new Card("Sharing a public restroom with a Weeping Angel", false),
		new Card("Just now realizing Torchwood is an anagram of Doctor Who", false),
		new Card("Fifty years of fanfic.", false),
		new Card("Wanting to punch that teeny-bopper Whovian that's butthurt the new Doctor isn't in his twenties.", false),
		new Card("The Doctor going back in time to solve a REAL problem: Twilight.", false),
		new Card("A Doctor Who body pillow.", false),
		new Card("The Silence", false),
		new Card("Drunkenly drawing tally marks on your face.", false),
		new Card("A Rusty Cyberman", false),
		new Card("A shitty Doctor Who knock-knock joke.", false),
		new Card("The Doctor having a chance encounter with a couple of 80s metalheads.", false),
		new Card("Davros getting up on the wrong side of the bed.", false),
		new Card("The Master, baiting the Doctor into a trap", false),
		new Card("A Vashta Nerada that just wants a hug.", false),
		new Card("Wishing you could regenerate.", false),
		new Card("Kidnapping a barely-legal woman to time travel with.", false),
		new Card("The poor costume decisions that were the 1970s.", false),
		new Card("Sixteen feet of scarf bondage.", false),
		new Card("Getting so much plastic surgery you have to be framed and moisturized.", false),
		new Card("Quitting this panel after one round because you are afraid of getting typecast.", false),
		new Card("The Mary Jane Adventures.", false),
		new Card("Fondling a Dalek's slippery bits.", false),
		new Card("Air from my lungs.", false),
		new Card("Smoking 1,000 cigarettes, just so you can sound like a Dalek when you talk.", false),
		new Card("Slipping her the ol' plastic Mickey.", false),
		new Card("Companion Porn.", false),
		new Card("An acid rain shower on Skaro.", false),
		new Card("A Sonic Screwdriver stuck on the vibrate setting.", false),
		new Card("Pouting in a rain storm and having to take a wicked piss.", false),
		new Card("The poor decision that is having a staring contest with a weeping angel.", false),
		new Card("Sorry, this answer is only available in the fanfic version of Cards against Con.", false),
		new Card("Plot holes so wide you could drive a truck through them.", false),
		new Card("A blinged out TARDIS blasting dubstep when it is traveling.", false),
		new Card("Rose Tyler's teeth.", false),
		new Card("The Master singing Bad Case of Loving You.", false),
		new Card("K-9 humping your leg.", false),
		new Card("A bigger, bluer TARDIS.", false),
		new Card("Steven Moffatt taking a big old dump in your Cheerios.", false),
		new Card("Robot Anne Robinson.", false),
		new Card("A fez caked with semen.", false),
		new Card("A GUITARDIS", false),
		new Card("The Celestial Toymaker's plaything.", false),
		new Card("Captain Jack Harkness.", false),
		new Card("Your dyslexic friend that wants you to come watch a marathon of Doctor How.", false),
		new Card("Fapping to Billie Piper portraying a callgirl.", false),
		new Card("A furry writing BAD WOLF everywhere.", false),
		new Card("Being used as a plot device by Steven Moffat.", false),
		new Card("A Costco-sized bag of Jelly Babies.", false),
		new Card("A global simulcast that forces Whovians to see the sunlight for the first time in ages.", false),
		new Card("THE END OF TIME ITSELF!", false),
		new Card("Finding Autons oddly attractive.", false),
		new Card("The fuck machine dungeon of the Cybermen.", false),
		new Card("Glenn Beck convulsively puking as a brood of Daleks swarm in on him.", false),
		new Card("River Song.", false),
		new Card("Low-budget special effects.", false),
		new Card("Eggs.", false),
		new Card("Dalek porn.", false),
		new Card("Taking a Doctor Poo.", false),
		new Card("The big banana in your pocket.", false),
		new Card("Opening the door of the TARDIS and leaving a deuce in the time-space continuum.", false),
		new Card("David Tennant.", false),
		new Card("Matt Smith.", false),
		new Card("Christopher Eccleston.", false),
		new Card("Siltheen farts.", false),
		new Card("A kid in a gas mask asking if you are his mummy.", false),
		new Card("Fish fingering your custard.", false),
		new Card("The hideousness that is Raxacoricofallapatorious.", false),
		new Card("An Ood getting a starring role in a hentai.", false),
	};
	
	@Override
	public String getDeckName()
	{
		return "[C] Doctor Who";
	}
	
	@Override
	public String getShortDeckName()
	{
		return "DrWho";
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