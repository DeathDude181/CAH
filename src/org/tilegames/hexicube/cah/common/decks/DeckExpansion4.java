package org.tilegames.hexicube.cah.common.decks;

import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.Card;

public class DeckExpansion4 extends Deck
{
	private static final Card[] callCards = new Card[]{
		new Card("What's fun until it gets weird?", true),
		new Card("Wes Anderson's new film tells the story of a precocious child coming to terms with ____.", true),
		new Card("I'm sorry, sir, but we don't allow ____ at the country club.", true),
		new Card("How am I compensating for my tiny penis?", true),
		new Card("You've seen the bearded lady!<br/>You've seen the ring of fire!<br/>Now, ladies and gentlemen, feast your eyes upon ____!", true),
		new Card("She's up all night for good fun.<br/>I'm up all night for ____.", true),
		new Card("Dear Leader Kim Jong-un,<br/>our village praises your infinite wisdom with a humble offering of ____.", true),
		new Card("Man, this is bullshit. Fuck ____.", true),
		new Card("You guys, I saw this crazy movie last night. It opens on ____, and then there's some stuff about ____, and then it ends with ____.", true),
		new Card("In return for my soul, the Devil promised me ____, but all I got was ____.", true),
		new Card("The Japanese have developed a smaller, more efficient version of ____.", true),
		new Card("Alright, bros. Our frat house is condemned, and all the hot slampieces are over at Gamma Phi. The time has come to commence Operation ____.", true),
		new Card("This is the prime of my life. I'm young, hot, and full of ____.", true),
		new Card("I'm pretty sure I'm high right now, because I'm absolutely mesmerized by ____.", true),
		new Card("It lurks in the night. It hungers for flesh. This summer, no one is safe from ____.", true),
		new Card("If you can't handle ____, you'd better stay away from ____.", true),
		new Card("Forget everything you know about ____, because now we've supercharged it with ____!", true),
		new Card("Honey, I have a new role-play I want to try tonight! You can be ____, and I'll be ____.", true),
		new Card("This year's hottest album is ", true),
		new Card("Every step towards ____ gets me a little closer to ____.", true),
		new Card("Do <i>not</i> fuck with me! I am literally ____ right now.", true),
		new Card("2 AM in the city that never sleeps. The door swings open and <i>she</i> walks in, legs up to here. Something in her eyes tells me she's looking for ____.", true),
		new Card("As king, how will I keep the peasants in line?", true),
		new Card("I am become ____, destroyer of ____!", true),
		new Card("In the beginning, there was ____.<br/>And the Lord said, 'Let there be ____.'", true),
		new Card("____ will never be the same after ____.", true),
		new Card("We never did find ____, but along the way we sure learned a lot about ____.", true),
		new Card("____ may pass, but ____ will last forever.", true),
		new Card("Adventure.<br/>Romance.<br/>____.<br/><br/>From Paramount Pictures, '____.'", true),
		new Card("Oprah's book of the month is '____ For ____: A Story of Hope.'", true),
	}, responseCards = new Card[]{
		new Card("A bunch of idiots playing a card game instead of interacting like normal humans.", false),
		new Card("A sex goblin with a carnival penis.", false),
		new Card("Lots and lots of abortions.", false),
		new Card("Injecting speed into one arm and horse tranquilizer into the other.", false),
		new Card("Sharks with legs.", false),
		new Card("A sex comet from Neptune that plunges the Earth into eternal sexiness.", false),
		new Card("How awesome I am.", false),
		new Card("Smoking crack, for instance.", false),
		new Card("A dance move that's just sex.", false),
		new Card("A hopeless amount of spiders.", false),
		new Card("Drinking responsibly.", false),
		new Card("Angelheaded hipsters burning for the ancient heavenly connection to the starry dynamo in the machinery of night.", false),
		new Card("Bouncing up and down.", false),
		new Card("A shiny rock that proves I love you.", false),
		new Card("Crazy opium eyes.", false),
		new Card("Moderate-to-severe joint pain.", false),
		new Card("Finally finishing off the Indians.", false),
		new Card("Actual mutants with medical conditions and no superpowers.", false),
		new Card("The complex geopolitical quagmire that is the Middle East.", false),
		new Card("Neil Diamond's Greatest Hits.", false),
		new Card("No clothes on, penis in vagina.", false),
		new Card("Whispering all sexy.", false),
		new Card("A horse with no legs.", false),
		new Card("Depression.", false),
		new Card("Almost giving money to a homeless person.", false),
		new Card("Interspecies marriage.", false),
		new Card("Blackula.", false),
		new Card("What Jesus would do.", false),
		new Card("A manhole.", false),
		new Card("My dad's dumb fucking face.", false),
		new Card("A Ugandan warlord.", false),
		new Card("My worthless son.", false),
		new Card("A Native American who solves crimes by going into the spirit world.", false),
		new Card("A kiss on the lips.", false),
		new Card("A fart.", false),
		new Card("The peaceful and nonthreatening rise of China.", false),
		new Card("The size of my penis.", false),
		new Card("Jizz.", false),
		new Card("10 Incredible Facts About the Anus.", false),
		new Card("The secret formula for ultimate female satisfaction.", false),
		new Card("Sugar madness.", false),
		new Card("Calculating every mannerism so as not to suggest homosexuality.", false),
		new Card("Fucking a corpse back to life.", false),
		new Card("The euphoric rush of strangling a drifter.", false),
		new Card("Snorting coke off a clown's boner.", false),
		new Card("Three consecutive seconds of happiness.", false),
		new Card("Falling into the toilet.", false),
		new Card("Ass to mouth.", false),
		new Card("Some sort of Asian.", false),
		new Card("The safe word.", false),
		new Card("Party Mexicans.", false),
		new Card("Ambiguous sarcasm.", false),
		new Card("Prince Ali,<br/>fabulous he,<br/>Ali Ababwa.", false),
		new Card("My sex dungeon.", false),
		new Card("Child Protective Services.", false),
		new Card("An interracial handshake.", false),
		new Card("All the single ladies.", false),
		new Card("Whatever a McRib&reg; is made of.", false),
		new Card("Africa.", false),
		new Card("Khakis.", false),
		new Card("A gender identity that can only be conveyed through slam poetry.", false),
		new Card("Stuff a child's face with Fun Dip&reg; until he starts having fun.", false),
		new Card("A for-real lizard that spits blood from its eyes.", false),
		new Card("The tiniest shred of evidence that God is real.", false),
		new Card("Dem titties.", false),
		new Card("Exploding pigeons.", false),
		new Card("Doo-doo.", false),
		new Card("Sports.", false),
		new Card("Unquestioning obedience.", false),
		new Card("Grammar nazis who are also regular Nazis.", false),
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