package org.tilegames.hexicube.cah.common.decks;

import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.Card;

public class DeckRoosterTeeth extends Deck
{
	private static final Card[] callCards = new Card[]{
		new Card("____ is probably a Venusaur kind of guy.", true),
		new Card("____ is the worst on the Podcast.", true),
		new Card("____. That's top.", true),
		new Card("After getting wasted at PAX, Burnie announced that 'I am ____!'", true),
		new Card("Barbara sucks ____.", true),
		new Card("Close up of my ____.", true),
		new Card("Come to Fort ____!", true),
		new Card("Describe yourself in one word/phrase.", true),
		new Card("Detective ____ is down!", true),
		new Card("Does our house say 'We love ____'?", true),
		new Card("Dude, I got sixteen ____!", true),
		new Card("Fight, fight, fight, ____?", true),
		new Card("Fuck it, I mean ____, right?", true),
		new Card("I'ma smother you in my ____!", true),
		new Card("If Jack was frog and you kissed him, what would he turn into?", true),
		new Card("If you could have any superpower, what would it be?", true),
		new Card("If you were allowed to do one illegal thing, what would it be? ", true),
		new Card("It's a ____ out there.", true),
		new Card("It's not my fault. Somebody put ____ in my way.", true),
		new Card("Joel plays ____.", true),
		new Card("Let's do ____ again! This is fun!", true),
		new Card("Lindsay could fuck up ____.", true),
		new Card("LLLLLLLLLLLLLET'S ____!", true),
		new Card("My ____ is trying to die.", true),
		new Card("On tonight's Let's Play, the AH crew plays ____.", true),
		new Card("People like ____.", true),
		new Card("RT Recap, featuring ____!", true),
		new Card("Shout out to ____!", true),
		new Card("Shout out to my mom. Called my Teddy Bear ____.", true),
		new Card("So, I was just walking along, until suddenly ____ came along and attacked me.", true),
		new Card("Thanks to ____ for this week's theme song.", true),
		new Card("The next RvB cameo will be voiced by ____.", true),
		new Card("They questioned Ryan's sanity after finding ____ in his house.", true),
		new Card("This week on AHWU, ____.", true),
		new Card("This week on Immersion, we are going to test ____.", true),
		new Card("What are fire hydrants called in England?", true),
		new Card("What does Ryan's kid listen to?", true),
		new Card("What is Game Night?", true),
		new Card("What is your biggest feature?", true),
		new Card("What makes Caboose angry?", true),
		new Card("What makes Michael the angriest?", true),
		new Card("What mysteries lie beyond Jack's beard? ", true),
		new Card("What would be your chosen catchphrase?", true),
		new Card("What's in Gavin's desk?", true),
		new Card("Where are we going for lunch?", true),
		new Card("Where does Ray belong?", true),
		new Card("Who has a fake Internet girlfriend?", true),
		new Card("Why are we here?", true),
		new Card("Why is Geoff cool?", true),
		new Card("Why was Michael screaming at Gavin?", true),
		new Card("Would you guys still like me if my name was ____?", true),
		new Card("You threw it against the wall like a ____!", true),
		new Card("____ is ____ as dicks.", true),
		new Card("____ is the best ____ ever. Of all time.", true),
		new Card("____ wins! ____ is a horse!", true),
		new Card("If you got $1,000,000 per week, would you ____, but in the next day, you'd have to ____?", true),
		new Card("My name is ____, and I hate ____!", true),
		new Card("No one in the office expected the bromance between ____ and ____.", true),
		new Card("Select two cards to create your team name.", true),
		new Card("This week on VS, ____ challenges ____ to a game of ____.", true),
		new Card("The war's over. We're holding a parade in ____'s honor. ____ drives the float, and ____ is in charge of confetti.", true),
	}, responseCards = new Card[]{
		new Card("Slo Mo Guys.", false),
		new Card("Man-Gobbler, the turkey bestiality movie.", false),
		new Card("RoosterTeeth.", false),
		new Card("Michael Jones.", false),
		new Card("Gavin Free.", false),
		new Card("Ray Narvaez, Jr.", false),
		new Card("Burnie Burns.", false),
		new Card("Geoff Lazer Ramsey.", false),
		new Card("Jack Pattillo.", false),
		new Card("Ryan Haywood.", false),
		new Card("Gus Sorola.", false),
		new Card("The cardboard cutout of Gus.", false),
		new Card("Joel Heyman.", false),
		new Card("Going cakeless.", false),
		new Card("Headlight fluid.", false),
		new Card("Playing Hitler twice.", false),
		new Card("Sarge.", false),
		new Card("Lopez la Pesado.", false),
		new Card("Franklin Delano Donut.", false),
		new Card("Dexter Grif.", false),
		new Card("Dick Simmons.", false),
		new Card("Agent Washington.", false),
		new Card("Andy the bomb.", false),
		new Card("Picking up chicks in a tank.", false),
		new Card("Michael J. Caboose.", false),
		new Card("Sheila the tank.", false),
		new Card("Leonard Church.", false),
		new Card("Lavernius Tucker.", false),
		new Card("Agent Texas / Allison.", false),
		new Card("Omega / O'Malley.", false),
		new Card("Agent Maine / the Meta.", false),
		new Card("Frank ", false),
		new Card("Screen looking.", false),
		new Card("MOGAR!", false),
		new Card("X-Ray and Vav.", false),
		new Card("#DantheMan.", false),
		new Card("Joe the cat.", false),
		new Card("Pongo.", false),
		new Card("Soggy bread.", false),
		new Card("Rage Quit.", false),
		new Card("Achievement Hunter.", false),
		new Card("Team-killing fucktards.", false),
		new Card("Calling dibs on a spaceship.", false),
		new Card("Sarge's funeral.", false),
		new Card("Camping, as a legitimate strategy.", false),
		new Card("Epsilon's laser face.", false),
		new Card("MOTHERFUCKING TRIPLE SPIKES!", false),
		new Card("Because people like grapes.", false),
		new Card("Upside-down Kerry.", false),
		new Card("Ray's sombrero.", false),
		new Card("Doing a dig-down.", false),
		new Card("Mark Nutt.", false),
		new Card("AHWU.", false),
		new Card("Throwing shit at the AHWU announcer.", false),
		new Card("Red vs. Blue.", false),
		new Card("Geoff's cancer-curing laugh.", false),
		new Card("The Tower of Pimps.", false),
		new Card("The Frienderman.", false),
		new Card("Beating a man to death with his own skull.", false),
		new Card("Fighting to the death on pigback.", false),
		new Card("RWBY.", false),
		new Card("RT Shorts.", false),
		new Card("RT Animated Adventures.", false),
		new Card("Mega64.", false),
		new Card("Immersion.", false),
		new Card("Reaching a billion total views on YouTube.", false),
		new Card("Doing a double barrel roll and immediately running someone over.", false),
		new Card("A Ray-Cam masturbation moment.", false),
		new Card("Tackling Gavin to stop him from winning.", false),
		new Card("Losing an hour's worth of footage to a brief blackout.", false),
		new Card("Fails of the Weak.", false),
		new Card("Achievement HORSE.", false),
		new Card("Trials PIG.", false),
		new Card("Slapping the controller out of a competitor's hands.", false),
		new Card("Cockbites.", false),
		new Card("Achievement City.", false),
		new Card("Two bases in the middle of a box canyon. Whoop-dee-fuckin'-doo.", false),
		new Card("Blood Gulch.", false),
		new Card("Parkour.", false),
		new Card("Faffy Waffle.", false),
		new Card("Something that is top.", false),
		new Card("A plan that involves Grif dying.", false),
		new Card("Using CPR to treat a bullet wound to the head.", false),
		new Card("Front flip for style!", false),
		new Card("Trying to eat a five-pound gummy bear in one sitting.", false),
		new Card("RTX.", false),
		new Card("Randy Newman.", false),
		new Card("Slenderman.", false),
		new Card("The R&R Connection.", false),
		new Card("The Internet Box.", false),
		new Card("Performing surgery in space.", false),
		new Card("Jack's dick.", false),
		new Card("The Crev.", false),
		new Card("Team Nice Dynamite.", false),
		new Card("Team Lads.", false),
		new Card("Team Gents.", false),
		new Card("Plan G.", false),
		new Card("Team Neighborhood Watch.", false),
		new Card("Ray winning.", false),
		new Card("Edgar the cow.", false),
		new Card("Gavin's Trophy Room of Victory.", false),
		new Card("Jack's beard.", false),
		new Card("Being trapped in a dog cage.", false),
		new Card("Geoff's hobo beard.", false),
		new Card("Killing Gavin.", false),
		new Card("Discovering your long-lost Creeper parents.", false),
		new Card("A megalomaniac with a beard.", false),
		new Card("Ray's douche-cut.", false),
		new Card("The adventures of Batman and Randy Newman.", false),
		new Card("Because they'd like it.", false),
		new Card("Knobs.", false),
		new Card("Gubbins.", false),
		new Card("Meatspin.", false),
		new Card("Flynt Coal.", false),
		new Card("Tupperware.", false),
		new Card("A miniature Tower of Pimps.", false),
		new Card("Giving up and building a house.", false),
		new Card("Gavin's dick.", false),
		new Card("Wearing your headphones backwards during a podcast week after week.", false),
		new Card("Flicking the bean.", false),
		new Card("Getting minged up your quelch.", false),
		new Card("Grand Theft Auto IV.", false),
		new Card("Ray's wet sponge.", false),
		new Card("Bankrupting your company over a crane game.", false),
		new Card("ENDERMAN!!!", false),
		new Card("Lightish red.", false),
		new Card("In denial.", false),
		new Card("Enwrong.", false),
		new Card("Papa BrownMan.", false),
		new Card("Caleb's house.", false),
		new Card("Evil Ryan.", false),
		new Card("Randy Savage.", false),
		new Card("RT Confessions.", false),
		new Card("Two dumb cunts.", false),
		new Card("Smegpot.", false),
		new Card("Guffpap.", false),
		new Card("Launching dump trucks off an unfinished bridge.", false),
		new Card("Because bitches ain't shit.", false),
		new Card("Gavino.", false),
		new Card("Monoray.", false),
		new Card("Montages no one will watch.", false),
		new Card("A gay cave. A gayve.", false),
		new Card("A squid orgy.", false),
		new Card("Getting boned.", false),
		new Card("300,000 Gamerscore.", false),
		new Card("Team Magnum Dong.", false),
		new Card("Lindsay Tuggey.", false),
		new Card("Barbara Dunkelman.", false),
		new Card("Mavin slash fiction.", false),
		new Card("Caleb Denecour.", false),
		new Card("Monty Oum.", false),
	};
	
	@Override
	public String getDeckName()
	{
		return "[C] Rooster Teeth";
	}
	
	@Override
	public String getShortDeckName()
	{
		return "Roost";
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