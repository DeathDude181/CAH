package org.tilegames.hexicube.cah.common.decks;

import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.Card;

public class DeckXKCD extends Deck
{
	private static final Card[] callCards = new Card[]{
		new Card("____.tumblr.com", true),
		new Card("____ would be a good name for a band.", true),
		new Card("____ wouldn't be funny if not for the irony.", true),
		new Card("Help, I'm trapped in a ____ factory!", true),
		new Card("None of the places I floated to had ____.", true),
		new Card("____. My normal method is useless here.", true),
		new Card("We had a ____ party, but it turned out not to be very much fun.", true),
		new Card("My hobby: ____.", true),
		new Card("____ makes terrible pillow talk.", true),
		new Card("What is the best way to protect yourself from Velociraptors?", true),
		new Card("I'm pretty sure you can't send ____ through the mail.", true),
		new Card("I'm like ____, except with love.", true),
		new Card("Spoiler Alert! ____ kills ____ with ____!", true),
		new Card("I didn't actually want you to be ____; I just wanted you to be ____.", true),
		new Card("Do you really expect ____? No, Mister Bond. I expect you to die!", true),
		new Card("What do we miss most from the internet in 1998?", true),
		new Card("All of my algorithms were really just disguised ____.", true),
		new Card("Waking up would be a lot easier if ____ didn't look so much like you.", true),
		new Card("____? No, I'm not really into Pokémon.", true),
		new Card("I got a lot more interested in ____ when I made the connection to ____.", true),
		new Card("Dreaming about ____ in Cirque du Soleil.", true),
		new Card("When I eat ____, I like to pretend I'm a Turing machine.", true),
		new Card("Freestyle rapping is really just ____.", true),
		new Card("It turns out God created the universe using ____.", true),
		new Card("Human intelligence decreases with increasing proximity to ____.", true),
		new Card("If I could rearrange the alphabet, I'd put ____ and ____ together.", true),
		new Card("The #1 Programmer's excuse for legitimately slacking off: ____.", true),
		new Card("I like alter songs by replacing ____ with ____.", true),
		new Card("Ebay review: Instead of ____, package contained ____. Would not buy again.", true),
		new Card("Social rule 99.1: If friends spend more than 60 minutes deciding what to do, they must default to ____.", true),
		new Card("____ linked to Acne! 95% confidence.", true),
		new Card("How many Google results are there for 'Died in a ____ accident?'", true),
		new Card("Real Programmers use ____.", true),
		new Card("After finding Higgs-Boson, I can always use the LHC for ____.", true),
		new Card("My health declined when I realized I could eat ____ whenever I wanted.", true),
		new Card("____ is just applied ____.", true),
		new Card("What's my favorite unit of measurement?", true),
		new Card("In the extended base metaphor, shortstop is ____.", true),
		new Card("I don't actually care about ____, I just like ____.", true),
		new Card("Why do you have a crossbow in your desk?", true),
		new Card("I set up script to buy things on ebay for $1, but then it bought ____, ____, and ____.", true),
		new Card("I can extrude ____, but I can't retract it.", true),
		new Card("____'s fetish: ____.", true),
		new Card("Now I have to live my whole life pretending ____ never happened. It's going to be a fun 70 years.", true),
		new Card("My new favorite game is Strip ____.", true),
		new Card("Did you know you can just buy ____?", true),
		new Card("Take me down to the ____, where the ____ is green and the ____ are pretty.", true),
		new Card("____. That's right. Shit just got REAL.", true),
		new Card("Just because I have ____ doesn't mean you could milk me now. I'd have to be lactating.", true),
		new Card("2009 called? Did you warn them about ____?", true),
		new Card("I'm going to name my child ____.", true),
		new Card("3D printers sound great until you receive spam containing actual ____.", true),
		new Card("Until I see more data, I'm going to assume ____ causes ____.", true),
		new Card("Did you know November is ____ Awareness Month?", true),
		new Card("University Researchers create life in lab! ____ blamed!", true),
		new Card("It's fun to mentally replace the word ____ with ____.", true),
		new Card("If you really hate someone, teach them to recognize ____.", true),
		new Card("____. So it has come to this.", true),
		new Card("Hey baby, wanna come back to my sex ____?", true),
		new Card("The past is a foreign country... with ____ and ____!", true),
		new Card("What role has social media played in ____? Well, it's certainly made ____ stupider.", true),
		new Card("____. It works in Kerbal Space Program.", true),
		new Card("____ is too big for small talk.", true),
		new Card("What did I suggest to the IAU for a new planet name?", true),
		new Card("By 2019, ____ will be outnumbered by ____.", true),
		new Card("New movie this summer: ____ beats up everyone.", true),
		new Card("I filled my apartment with ____.", true),
	}, responseCards = new Card[]{
		new Card("A poisson distribution", false),
		new Card("An apple infused with tin", false),
		new Card("A ferret with wings strapped on", false),
		new Card("Taking a fourier transform of your cat", false),
		new Card("The red spiders", false),
		new Card("A malaria party", false),
		new Card("The square root of lov", false),
		new Card("Orion's penis", false),
		new Card("The Bellman-Ford algorithm", false),
		new Card("Only knowing music from Guitar Hero", false),
		new Card("Feeding rocks to children", false),
		new Card("Poking small holes in noodle cups", false),
		new Card("Zeppelins", false),
		new Card("Mixing curse levels", false),
		new Card("Going out in a blaze of Dadaist glory", false),
		new Card("Answering casual questions in Iambic Pentameter", false),
		new Card("An inexorably advancing wall of ice", false),
		new Card("Raptor attacks", false),
		new Card("Getting Jeremy Irons to do your dialogue", false),
		new Card("Sending strange things through the mail", false),
		new Card("The RJX-21 Laser Scope", false),
		new Card("Moral Relativity", false),
		new Card("Snakes on Every Plane!", false),
		new Card("A girl whose only mode of transportation is the M.C. Hammer slide", false),
		new Card("Clark Gable's Tourette's", false),
		new Card("Vanilla Ice", false),
		new Card("Computational Linguists", false),
		new Card("Cunnilingus", false),
		new Card("A Pong machine that's self-aware", false),
		new Card("Centrifugal force", false),
		new Card("The elimination of all culture you don't control", false),
		new Card("Embedded music on MySpace", false),
		new Card("The math of Velociraptors", false),
		new Card("The mathematics of cunnilungus", false),
		new Card("Electric Skateboards", false),
		new Card("Using 'They' as a third-person singular gender-free pronoun", false),
		new Card("Pronouncing 'Blog' as 'Blag'", false),
		new Card("Casual use of 'sudo'", false),
		new Card("A human-sized hamster ball", false),
		new Card("An embarrassing search history", false),
		new Card("Commenting out what other people say", false),
	};
	
	@Override
	public String getDeckName()
	{
		return "[C] xkcd";
	}
	
	@Override
	public String getShortDeckName()
	{
		return "xkcd";
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