package org.tilegames.hexicube.cah.common.decks;

import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.Card;

public class DeckDoctorWho extends Deck
{
	private static final Card[] callCards = new Card[]{
		new Card("They found some more last episodes! They were found in _."),
		new Card("The Doctor did it! He saved the world again! This time using a _."),
		new Card("I'd give up _ to travel with The Doctor."),
		new Card("The next Doctor Who spin-off is going to be called _."),
		new Card("Who should be the 13th Doctor?"),
		new Card("The Chameleon circuit is working again...somewhat. Instead of a phone booth, the TARDIS is now a _."),
		new Card("Originally, the 50th special was going to have _ appear, but the BBC decided against it in the end."),
		new Card("After we watch an episode, I've got some _-flavored Jelly Babies to hand out."),
		new Card("Wibbly-wobbly, timey-wimey _."),
		new Card("What's going to be The Doctor's new catchphrase?"),
		new Card("Bowties are _."),
		new Card("Old and busted: EXTERMINATE! New hotness: _."),
		new Card("There's a new dance on Gallifrey. It's called the _."),
		new Card("They announced a new LEGO Doctor Who game! Rumor has it that _ is an unlockable character."),
		new Card("FUN FACT: The Daleks were originally shaped to look like _."),
		new Card("At this new Doctor Who themed restaurant, you can get a free _ if you can eat a plate of bangers and mash in under 3 minutes."),
		new Card("Who is going to be The Doctor's next companion?"),
		new Card("I think the BBC is losing it. They just released a Doctor Who themed _."),
		new Card("It's a little known fact that if you send a _ to the BBC, they will send you a picture of The Doctor."),
		new Card("I was ok with all the BAD WOLF graffiti, until someone wrote it on _."),
		new Card("Jack Harkness, I can't leave you alone for a minute! I turn around and you're trying to seduce _."),
		new Card("In all of space and time you decide that _ is a good choice?!"),
		new Card("Adipose were thought to be made of fat, but are really made of _."),
		new Card("I hear the next thing that will cause The Doctor to regenerate is _."),
		new Card("_ was sent to save _."),
		new Card("According to the Daleks, _ is better at _.")
	}, responseCards = new Card[]{
		new Card("Tom Baker, in nothing but a scarf"),
		new Card("Walking in on Jack Harkness doing your mom. And your dad."),
		new Card("The buzzing noise the Sonic Screwdriver makes"),
		new Card("Sharing a public restroom with a Weeping Angel"),
		new Card("Just now realizing Torchwood is an anagram of Doctor Who"),
		new Card("Fifty years of fanfic."),
		new Card("Wanting to punch that teeny-bopper Whovian that's butthurt the new Doctor isn't in his twenties."),
		new Card("The Doctor going back in time to solve a REAL problem: Twilight."),
		new Card("A Doctor Who body pillow."),
		new Card("The Silence"),
		new Card("Drunkenly drawing tally marks on your face."),
		new Card("A Rusty Cyberman"),
		new Card("A shitty Doctor Who knock-knock joke."),
		new Card("The Doctor having a chance encounter with a couple of 80s metalheads."),
		new Card("Davros getting up on the wrong side of the bed."),
		new Card("The Master, baiting the Doctor into a trap"),
		new Card("A Vashta Nerada that just wants a hug."),
		new Card("Wishing you could regenerate."),
		new Card("Kidnapping a barely-legal woman to time travel with."),
		new Card("The poor costume decisions that were the 1970s."),
		new Card("Sixteen feet of scarf bondage."),
		new Card("Getting so much plastic surgery you have to be framed and moisturized."),
		new Card("Quitting this panel after one round because you are afraid of getting typecast."),
		new Card("The Mary Jane Adventures."),
		new Card("Fondling a Dalek's slippery bits."),
		new Card("Air from my lungs."),
		new Card("Smoking 1,000 cigarettes, just so you can sound like a Dalek when you talk."),
		new Card("Slipping her the ol' plastic Mickey."),
		new Card("Companion Porn."),
		new Card("An acid rain shower on Skaro."),
		new Card("A Sonic Screwdriver stuck on the vibrate setting."),
		new Card("Pouting in a rain storm and having to take a wicked piss."),
		new Card("The poor decision that is having a staring contest with a weeping angel."),
		new Card("Sorry, this answer is only available in the fanfic version of Cards against Con."),
		new Card("Plot holes so wide you could drive a truck through them."),
		new Card("A blinged out TARDIS blasting dubstep when it is traveling."),
		new Card("Rose Tyler's teeth."),
		new Card("The Master singing Bad Case of Loving You."),
		new Card("K-9 humping your leg."),
		new Card("A bigger, bluer TARDIS."),
		new Card("Steven Moffatt taking a big old dump in your Cheerios."),
		new Card("Robot Anne Robinson."),
		new Card("A fez caked with semen."),
		new Card("A GUITARDIS"),
		new Card("The Celestial Toymaker's plaything."),
		new Card("Captain Jack Harkness."),
		new Card("Your dyslexic friend that wants you to come watch a marathon of Doctor How."),
		new Card("Fapping to Billie Piper portraying a callgirl."),
		new Card("A furry writing BAD WOLF everywhere."),
		new Card("Being used as a plot device by Steven Moffat."),
		new Card("A Costco-sized bag of Jelly Babies."),
		new Card("A global simulcast that forces Whovians to see the sunlight for the first time in ages."),
		new Card("THE END OF TIME ITSELF!"),
		new Card("Finding Autons oddly attractive."),
		new Card("The fuck machine dungeon of the Cybermen."),
		new Card("Glenn Beck convulsively puking as a brood of Daleks swarm in on him."),
		new Card("River Song."),
		new Card("Low-budget special effects."),
		new Card("Eggs."),
		new Card("Dalek porn."),
		new Card("Taking a Doctor Poo."),
		new Card("The big banana in your pocket."),
		new Card("Opening the door of the TARDIS and leaving a deuce in the time-space continuum."),
		new Card("David Tennant."),
		new Card("Matt Smith."),
		new Card("Christopher Eccleston."),
		new Card("Siltheen farts."),
		new Card("A kid in a gas mask asking if you are his mummy."),
		new Card("Fish fingering your custard."),
		new Card("The hideousness that is Raxacoricofallapatorious."),
		new Card("An Ood getting a starring role in a hentai.")
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