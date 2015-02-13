package org.tilegames.hexicube.cah.common.decks;

import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.Card;

public class DeckExpansion4 extends Deck
{
	private static final Card[] callCards = new Card[]{
		new Card("What's fun until it gets weird?"),
		new Card("Wes Anderson's new film tells the story of a precocious child coming to terms with _."),
		new Card("I'm sorry, sir, but we don't allow _ at the country club."),
		new Card("How am I compensating for my tiny penis?"),
		new Card("You've seen the bearded lady!<br/>You've seen the ring of fire!<br/>Now, ladies and gentlemen, feast your eyes upon _!"),
		new Card("She's up all night for good fun.<br/>I'm up all night for _."),
		new Card("Dear Leader Kim Jong-un,<br/>our village praises your infinite wisdom with a humble offering of _."),
		new Card("Man, this is bullshit. Fuck _."),
		new Card("You guys, I saw this crazy movie last night. It opens on _, and then there's some stuff about _, and then it ends with _."),
		new Card("In return for my soul, the Devil promised me _, but all I got was _."),
		new Card("The Japanese have developed a smaller, more efficient version of _."),
		new Card("Alright, bros. Our frat house is condemned, and all the hot slampieces are over at Gamma Phi. The time has come to commence Operation _."),
		new Card("This is the prime of my life. I'm young, hot, and full of _."),
		new Card("I'm pretty sure I'm high right now, because I'm absolutely mesmerized by _."),
		new Card("It lurks in the night. It hungers for flesh. This summer, no one is safe from _."),
		new Card("If you can't handle _, you'd better stay away from _."),
		new Card("Forget everything you know about _, because now we've supercharged it with _!"),
		new Card("Honey, I have a new role-play I want to try tonight! You can be _, and I'll be _."),
		new Card("This year's hottest album is "),
		new Card("Every step towards _ gets me a little closer to _."),
		new Card("Do <i>not</i> fuck with me! I am literally _ right now."),
		new Card("2 AM in the city that never sleeps. The door swings open and <i>she</i> walks in, legs up to here. Something in her eyes tells me she's looking for _."),
		new Card("As king, how will I keep the peasants in line?"),
		new Card("I am become _, destroyer of _!"),
		new Card("In the beginning, there was _.<br/>And the Lord said, 'Let there be _.'"),
		new Card("_ will never be the same after _."),
		new Card("We never did find _, but along the way we sure learned a lot about _."),
		new Card("_ may pass, but _ will last forever."),
		new Card("Adventure.<br/>Romance.<br/>_.<br/><br/>From Paramount Pictures, '_.'"),
		new Card("Oprah's book of the month is '_ For _: A Story of Hope.'")
	}, responseCards = new Card[]{
		new Card("A bunch of idiots playing a card game instead of interacting like normal humans."),
		new Card("A sex goblin with a carnival penis."),
		new Card("Lots and lots of abortions."),
		new Card("Injecting speed into one arm and horse tranquilizer into the other."),
		new Card("Sharks with legs."),
		new Card("A sex comet from Neptune that plunges the Earth into eternal sexiness."),
		new Card("How awesome I am."),
		new Card("Smoking crack, for instance."),
		new Card("A dance move that's just sex."),
		new Card("A hopeless amount of spiders."),
		new Card("Drinking responsibly."),
		new Card("Angelheaded hipsters burning for the ancient heavenly connection to the starry dynamo in the machinery of night."),
		new Card("Bouncing up and down."),
		new Card("A shiny rock that proves I love you."),
		new Card("Crazy opium eyes."),
		new Card("Moderate-to-severe joint pain."),
		new Card("Finally finishing off the Indians."),
		new Card("Actual mutants with medical conditions and no superpowers."),
		new Card("The complex geopolitical quagmire that is the Middle East."),
		new Card("Neil Diamond's Greatest Hits."),
		new Card("No clothes on, penis in vagina."),
		new Card("Whispering all sexy."),
		new Card("A horse with no legs."),
		new Card("Depression."),
		new Card("Almost giving money to a homeless person."),
		new Card("Interspecies marriage."),
		new Card("Blackula."),
		new Card("What Jesus would do."),
		new Card("A manhole."),
		new Card("My dad's dumb fucking face."),
		new Card("A Ugandan warlord."),
		new Card("My worthless son."),
		new Card("A Native American who solves crimes by going into the spirit world."),
		new Card("A kiss on the lips."),
		new Card("A fart."),
		new Card("The peaceful and nonthreatening rise of China."),
		new Card("The size of my penis."),
		new Card("Jizz."),
		new Card("10 Incredible Facts About the Anus."),
		new Card("The secret formula for ultimate female satisfaction."),
		new Card("Sugar madness."),
		new Card("Calculating every mannerism so as not to suggest homosexuality."),
		new Card("Fucking a corpse back to life."),
		new Card("The euphoric rush of strangling a drifter."),
		new Card("Snorting coke off a clown's boner."),
		new Card("Three consecutive seconds of happiness."),
		new Card("Falling into the toilet."),
		new Card("Ass to mouth."),
		new Card("Some sort of Asian."),
		new Card("The safe word."),
		new Card("Party Mexicans."),
		new Card("Ambiguous sarcasm."),
		new Card("Prince Ali,<br/>fabulous he,<br/>Ali Ababwa."),
		new Card("My sex dungeon."),
		new Card("Child Protective Services."),
		new Card("An interracial handshake."),
		new Card("All the single ladies."),
		new Card("Whatever a McRib&reg; is made of."),
		new Card("Africa."),
		new Card("Khakis."),
		new Card("A gender identity that can only be conveyed through slam poetry."),
		new Card("Stuff a child's face with Fun Dip&reg; until he starts having fun."),
		new Card("A for-real lizard that spits blood from its eyes."),
		new Card("The tiniest shred of evidence that God is real."),
		new Card("Dem titties."),
		new Card("Exploding pigeons."),
		new Card("Doo-doo."),
		new Card("Sports."),
		new Card("Unquestioning obedience."),
		new Card("Grammar nazis who are also regular Nazis.")
	};
	
	@Override
	public String getDeckName()
	{
		return "The Fourth Expansion";
	}
	
	@Override
	public String getShortDeckName()
	{
		return "Exp4";
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