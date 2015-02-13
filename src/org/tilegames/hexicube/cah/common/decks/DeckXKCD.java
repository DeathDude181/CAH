package org.tilegames.hexicube.cah.common.decks;

import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.Card;

public class DeckXKCD extends Deck
{
	private static final Card[] callCards = new Card[]{
		new Card("_.tumblr.com"),
		new Card("_ would be a good name for a band."),
		new Card("_ wouldn't be funny if not for the irony."),
		new Card("Help, I'm trapped in a _ factory!"),
		new Card("None of the places I floated to had _."),
		new Card("_. My normal method is useless here."),
		new Card("We had a _ party, but it turned out not to be very much fun."),
		new Card("My hobby: _."),
		new Card("_ makes terrible pillow talk."),
		new Card("What is the best way to protect yourself from Velociraptors?"),
		new Card("I'm pretty sure you can't send _ through the mail."),
		new Card("I'm like _, except with love."),
		new Card("Spoiler Alert! _ kills _ with _!"),
		new Card("I didn't actually want you to be _; I just wanted you to be _."),
		new Card("Do you really expect _? No, Mister Bond. I expect you to die!"),
		new Card("What do we miss most from the internet in 1998?"),
		new Card("All of my algorithms were really just disguised _."),
		new Card("Waking up would be a lot easier if _ didn't look so much like you."),
		new Card("_? No, I'm not really into Pokémon."),
		new Card("I got a lot more interested in _ when I made the connection to _."),
		new Card("Dreaming about _ in Cirque du Soleil."),
		new Card("When I eat _, I like to pretend I'm a Turing machine."),
		new Card("Freestyle rapping is really just _."),
		new Card("It turns out God created the universe using _."),
		new Card("Human intelligence decreases with increasing proximity to _."),
		new Card("If I could rearrange the alphabet, I'd put _ and _ together."),
		new Card("The #1 Programmer's excuse for legitimately slacking off: _."),
		new Card("I like alter songs by replacing _ with _."),
		new Card("Ebay review: Instead of _, package contained _. Would not buy again."),
		new Card("Social rule 99.1: If friends spend more than 60 minutes deciding what to do, they must default to _."),
		new Card("_ linked to Acne! 95% confidence."),
		new Card("How many Google results are there for 'Died in a _ accident?'"),
		new Card("Real Programmers use _."),
		new Card("After finding Higgs-Boson, I can always use the LHC for _."),
		new Card("My health declined when I realized I could eat _ whenever I wanted."),
		new Card("_ is just applied _."),
		new Card("What's my favorite unit of measurement?"),
		new Card("In the extended base metaphor, shortstop is _."),
		new Card("I don't actually care about _, I just like _."),
		new Card("Why do you have a crossbow in your desk?"),
		new Card("I set up script to buy things on ebay for $1, but then it bought _, _, and _."),
		new Card("I can extrude _, but I can't retract it."),
		new Card("_'s fetish: _."),
		new Card("Now I have to live my whole life pretending _ never happened. It's going to be a fun 70 years."),
		new Card("My new favorite game is Strip _."),
		new Card("Did you know you can just buy _?"),
		new Card("Take me down to the _, where the _ is green and the _ are pretty."),
		new Card("_. That's right. Shit just got REAL."),
		new Card("Just because I have _ doesn't mean you could milk me now. I'd have to be lactating."),
		new Card("2009 called? Did you warn them about _?"),
		new Card("I'm going to name my child _."),
		new Card("3D printers sound great until you receive spam containing actual _."),
		new Card("Until I see more data, I'm going to assume _ causes _."),
		new Card("Did you know November is _ Awareness Month?"),
		new Card("University Researchers create life in lab! _ blamed!"),
		new Card("It's fun to mentally replace the word _ with _."),
		new Card("If you really hate someone, teach them to recognize _."),
		new Card("_. So it has come to this."),
		new Card("Hey baby, wanna come back to my sex _?"),
		new Card("The past is a foreign country... with _ and _!"),
		new Card("What role has social media played in _? Well, it's certainly made _ stupider."),
		new Card("_. It works in Kerbal Space Program."),
		new Card("_ is too big for small talk."),
		new Card("What did I suggest to the IAU for a new planet name?"),
		new Card("By 2019, _ will be outnumbered by _."),
		new Card("New movie this summer: _ beats up everyone."),
		new Card("I filled my apartment with _.")
	}, responseCards = new Card[]{
		new Card("A poisson distribution"),
		new Card("An apple infused with tin"),
		new Card("A ferret with wings strapped on"),
		new Card("Taking a fourier transform of your cat"),
		new Card("The red spiders"),
		new Card("A malaria party"),
		new Card("The square root of lov"),
		new Card("Orion's penis"),
		new Card("The Bellman-Ford algorithm"),
		new Card("Only knowing music from Guitar Hero"),
		new Card("Feeding rocks to children"),
		new Card("Poking small holes in noodle cups"),
		new Card("Zeppelins"),
		new Card("Mixing curse levels"),
		new Card("Going out in a blaze of Dadaist glory"),
		new Card("Answering casual questions in Iambic Pentameter"),
		new Card("An inexorably advancing wall of ice"),
		new Card("Raptor attacks"),
		new Card("Getting Jeremy Irons to do your dialogue"),
		new Card("Sending strange things through the mail"),
		new Card("The RJX-21 Laser Scope"),
		new Card("Moral Relativity"),
		new Card("Snakes on Every Plane!"),
		new Card("A girl whose only mode of transportation is the M.C. Hammer slide"),
		new Card("Clark Gable's Tourette's"),
		new Card("Vanilla Ice"),
		new Card("Computational Linguists"),
		new Card("Cunnilingus"),
		new Card("A Pong machine that's self-aware"),
		new Card("Centrifugal force"),
		new Card("The elimination of all culture you don't control"),
		new Card("Embedded music on MySpace"),
		new Card("The math of Velociraptors"),
		new Card("The mathematics of cunnilungus"),
		new Card("Electric Skateboards"),
		new Card("Using 'They' as a third-person singular gender-free pronoun"),
		new Card("Pronouncing 'Blog' as 'Blag'"),
		new Card("Casual use of 'sudo'"),
		new Card("A human-sized hamster ball"),
		new Card("An embarrassing search history"),
		new Card("Commenting out what other people say")
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