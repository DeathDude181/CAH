package org.tilegames.hexicube.cah.common.decks;

import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.Card;

public class DeckRoosterTeeth extends Deck
{
	private static final Card[] callCards = new Card[]{
		new Card("_ is probably a Venusaur kind of guy."),
		new Card("_ is the worst on the Podcast."),
		new Card("_. That's top."),
		new Card("After getting wasted at PAX, Burnie announced that 'I am _!'"),
		new Card("Barbara sucks _."),
		new Card("Close up of my _."),
		new Card("Come to Fort _!"),
		new Card("Describe yourself in one word/phrase."),
		new Card("Detective _ is down!"),
		new Card("Does our house say 'We love _'?"),
		new Card("Dude, I got sixteen _!"),
		new Card("Fight, fight, fight, _?"),
		new Card("Fuck it, I mean _, right?"),
		new Card("I'ma smother you in my _!"),
		new Card("If Jack was frog and you kissed him, what would he turn into?"),
		new Card("If you could have any superpower, what would it be?"),
		new Card("If you were allowed to do one illegal thing, what would it be? "),
		new Card("It's a _ out there."),
		new Card("It's not my fault. Somebody put _ in my way."),
		new Card("Joel plays _."),
		new Card("Let's do _ again! This is fun!"),
		new Card("Lindsay could fuck up _."),
		new Card("LLLLLLLLLLLLLET'S _!"),
		new Card("My _ is trying to die."),
		new Card("On tonight's Let's Play, the AH crew plays _."),
		new Card("People like _."),
		new Card("RT Recap, featuring _!"),
		new Card("Shout out to _!"),
		new Card("Shout out to my mom. Called my Teddy Bear _."),
		new Card("So, I was just walking along, until suddenly _ came along and attacked me."),
		new Card("Thanks to _ for this week's theme song."),
		new Card("The next RvB cameo will be voiced by _."),
		new Card("They questioned Ryan's sanity after finding _ in his house."),
		new Card("This week on AHWU, _."),
		new Card("This week on Immersion, we are going to test _."),
		new Card("What are fire hydrants called in England?"),
		new Card("What does Ryan's kid listen to?"),
		new Card("What is Game Night?"),
		new Card("What is your biggest feature?"),
		new Card("What makes Caboose angry?"),
		new Card("What makes Michael the angriest?"),
		new Card("What mysteries lie beyond Jack's beard? "),
		new Card("What would be your chosen catchphrase?"),
		new Card("What's in Gavin's desk?"),
		new Card("Where are we going for lunch?"),
		new Card("Where does Ray belong?"),
		new Card("Who has a fake Internet girlfriend?"),
		new Card("Why are we here?"),
		new Card("Why is Geoff cool?"),
		new Card("Why was Michael screaming at Gavin?"),
		new Card("Would you guys still like me if my name was _?"),
		new Card("You threw it against the wall like a _!"),
		new Card("_ is _ as dicks."),
		new Card("_ is the best _ ever. Of all time."),
		new Card("_ wins! _ is a horse!"),
		new Card("If you got $1,000,000 per week, would you _, but in the next day, you'd have to _?"),
		new Card("My name is _, and I hate _!"),
		new Card("No one in the office expected the bromance between _ and _."),
		new Card("Select two cards to create your team name."),
		new Card("This week on VS, _ challenges _ to a game of _."),
		new Card("The war's over. We're holding a parade in _'s honor. _ drives the float, and _ is in charge of confetti.")
	}, responseCards = new Card[]{
		new Card("Slo Mo Guys."),
		new Card("Man-Gobbler, the turkey bestiality movie."),
		new Card("RoosterTeeth."),
		new Card("Michael Jones."),
		new Card("Gavin Free."),
		new Card("Ray Narvaez, Jr."),
		new Card("Burnie Burns."),
		new Card("Geoff Lazer Ramsey."),
		new Card("Jack Pattillo."),
		new Card("Ryan Haywood."),
		new Card("Gus Sorola."),
		new Card("The cardboard cutout of Gus."),
		new Card("Joel Heyman."),
		new Card("Going cakeless."),
		new Card("Headlight fluid."),
		new Card("Playing Hitler twice."),
		new Card("Sarge."),
		new Card("Lopez la Pesado."),
		new Card("Franklin Delano Donut."),
		new Card("Dexter Grif."),
		new Card("Dick Simmons."),
		new Card("Agent Washington."),
		new Card("Andy the bomb."),
		new Card("Picking up chicks in a tank."),
		new Card("Michael J. Caboose."),
		new Card("Sheila the tank."),
		new Card("Leonard Church."),
		new Card("Lavernius Tucker."),
		new Card("Agent Texas / Allison."),
		new Card("Omega / O'Malley."),
		new Card("Agent Maine / the Meta."),
		new Card("Frank "),
		new Card("Screen looking."),
		new Card("MOGAR!"),
		new Card("X-Ray and Vav."),
		new Card("#DantheMan."),
		new Card("Joe the cat."),
		new Card("Pongo."),
		new Card("Soggy bread."),
		new Card("Rage Quit."),
		new Card("Achievement Hunter."),
		new Card("Team-killing fucktards."),
		new Card("Calling dibs on a spaceship."),
		new Card("Sarge's funeral."),
		new Card("Camping, as a legitimate strategy."),
		new Card("Epsilon's laser face."),
		new Card("MOTHERFUCKING TRIPLE SPIKES!"),
		new Card("Because people like grapes."),
		new Card("Upside-down Kerry."),
		new Card("Ray's sombrero."),
		new Card("Doing a dig-down."),
		new Card("Mark Nutt."),
		new Card("AHWU."),
		new Card("Throwing shit at the AHWU announcer."),
		new Card("Red vs. Blue."),
		new Card("Geoff's cancer-curing laugh."),
		new Card("The Tower of Pimps."),
		new Card("The Frienderman."),
		new Card("Beating a man to death with his own skull."),
		new Card("Fighting to the death on pigback."),
		new Card("RWBY."),
		new Card("RT Shorts."),
		new Card("RT Animated Adventures."),
		new Card("Mega64."),
		new Card("Immersion."),
		new Card("Reaching a billion total views on YouTube."),
		new Card("Doing a double barrel roll and immediately running someone over."),
		new Card("A Ray-Cam masturbation moment."),
		new Card("Tackling Gavin to stop him from winning."),
		new Card("Losing an hour's worth of footage to a brief blackout."),
		new Card("Fails of the Weak."),
		new Card("Achievement HORSE."),
		new Card("Trials PIG."),
		new Card("Slapping the controller out of a competitor's hands."),
		new Card("Cockbites."),
		new Card("Achievement City."),
		new Card("Two bases in the middle of a box canyon. Whoop-dee-fuckin'-doo."),
		new Card("Blood Gulch."),
		new Card("Parkour."),
		new Card("Faffy Waffle."),
		new Card("Something that is top."),
		new Card("A plan that involves Grif dying."),
		new Card("Using CPR to treat a bullet wound to the head."),
		new Card("Front flip for style!"),
		new Card("Trying to eat a five-pound gummy bear in one sitting."),
		new Card("RTX."),
		new Card("Randy Newman."),
		new Card("Slenderman."),
		new Card("The R&R Connection."),
		new Card("The Internet Box."),
		new Card("Performing surgery in space."),
		new Card("Jack's dick."),
		new Card("The Crev."),
		new Card("Team Nice Dynamite."),
		new Card("Team Lads."),
		new Card("Team Gents."),
		new Card("Plan G."),
		new Card("Team Neighborhood Watch."),
		new Card("Ray winning."),
		new Card("Edgar the cow."),
		new Card("Gavin's Trophy Room of Victory."),
		new Card("Jack's beard."),
		new Card("Being trapped in a dog cage."),
		new Card("Geoff's hobo beard."),
		new Card("Killing Gavin."),
		new Card("Discovering your long-lost Creeper parents."),
		new Card("A megalomaniac with a beard."),
		new Card("Ray's douche-cut."),
		new Card("The adventures of Batman and Randy Newman."),
		new Card("Because they'd like it."),
		new Card("Knobs."),
		new Card("Gubbins."),
		new Card("Meatspin."),
		new Card("Flynt Coal."),
		new Card("Tupperware."),
		new Card("A miniature Tower of Pimps."),
		new Card("Giving up and building a house."),
		new Card("Gavin's dick."),
		new Card("Wearing your headphones backwards during a podcast week after week."),
		new Card("Flicking the bean."),
		new Card("Getting minged up your quelch."),
		new Card("Grand Theft Auto IV."),
		new Card("Ray's wet sponge."),
		new Card("Bankrupting your company over a crane game."),
		new Card("ENDERMAN!!!"),
		new Card("Lightish red."),
		new Card("In denial."),
		new Card("Enwrong."),
		new Card("Papa BrownMan."),
		new Card("Caleb's house."),
		new Card("Evil Ryan."),
		new Card("Randy Savage."),
		new Card("RT Confessions."),
		new Card("Two dumb cunts."),
		new Card("Smegpot."),
		new Card("Guffpap."),
		new Card("Launching dump trucks off an unfinished bridge."),
		new Card("Because bitches ain't shit."),
		new Card("Gavino."),
		new Card("Monoray."),
		new Card("Montages no one will watch."),
		new Card("A gay cave. A gayve."),
		new Card("A squid orgy."),
		new Card("Getting boned."),
		new Card("300,000 Gamerscore."),
		new Card("Team Magnum Dong."),
		new Card("Lindsay Tuggey."),
		new Card("Barbara Dunkelman."),
		new Card("Mavin slash fiction."),
		new Card("Caleb Denecour."),
		new Card("Monty Oum.")
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