package org.tilegames.hexicube.cah.common.decks;

import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.Card;

public class DeckShenanigans extends Deck
{
	private static final Card[] callCards = new Card[]{
		new Card("My most shameful orgasm was the time I masturbated to _."),
		new Card("I got an STD from _."),
		new Card("_ is serious business."),
		new Card("If you don't pay your Comcast cable bill, they will send _ after you."),
		new Card("Mewtwo achieved a utopian society when he eliminated _ once and for all."),
		new Card("The only thing that caused more of a shitfit than Mewtwo's new form is _."),
		new Card("The idiots in that one room at the Westin finally got kicked out of Anthrocon for _."),
		new Card("Furaffinity went down for 48 hours because of _."),
		new Card("Anthrocon was ruined by _."),
		new Card("I unwatched his FurAffinity page because he kept posting _."),
		new Card("You don't want to find _ in your Furnando's Lasagna Wrap."),
		new Card("_ ruined the _ fandom for all eternity."),
		new Card("I was fapping to _, but _ walked in on me."),
		new Card("In recent tech news, computers are now being ruined by _."),
		new Card("Yu-Gi-Oh players were shocked when the win condition of holding 5 Exodia pieces was replaced by _, _, and _. "),
		new Card("What are the worst 3 cards in your hand right now?")
	}, responseCards = new Card[]{
		new Card("Mewtwo."),
		new Card("Anthrocon."),
		new Card("Uncle Kage."),
		new Card("The furries."),
		new Card("Furries on the Tyra Banks show."),
		new Card("Midna and Wolf Link."),
		new Card("Paying $3,500 for an oversized novelty fursuiter badge."),
		new Card("2, the Ranting Gryphon."),
		new Card("Going on a diet for the sole reason of being able to fit in a fursuit."),
		new Card("Waiting over a year for someone to finish your art commission."),
		new Card("A used sock collection."),
		new Card("A small creature being stuffed in a smelly boot."),
		new Card("Being facesat by someone who is holding in a fart."),
		new Card("Licking Cinnabon icing off of your partner's dick."),
		new Card("Being tied up and having a musky foot stuffed in your mouth."),
		new Card("A Bad Dragon dildo."),
		new Card("Being pinned to the wall and fucked in a shower."),
		new Card("Trees made out of living tentacles."),
		new Card("Tickling someone until they almost piss themself."),
		new Card("Using a save state in a video game so you can fap to it later."),
		new Card("Having every embarrassing kink of yours indulged at one time for a 'shamegasm.'"),
		new Card("Getting fucked by the Red Robin."),
		new Card("Horny, stupid livestock."),
		new Card("A fat Russian Blue that pees on the carpet."),
		new Card("Poking cats."),
		new Card("Bending a Lucario over and using its dreadlocks as fuckhandles."),
		new Card("Role reversal."),
		new Card("Ray Sipe singing about how /v/ doesn't like video games."),
		new Card("A stripper so ugly people throw nickels at her."),
		new Card("Lesbrarians."),
		new Card("Umbreon."),
		new Card("Masturbating at work."),
		new Card("Rick Astley."),
		new Card("Poor quality ParkerSteel."),
		new Card("Vodka spiked with GHB."),
		new Card("Chopping up someone's parents and putting them into chili."),
		new Card("Getting banned from Dave & Buster's."),
		new Card("Finding out your internet stalker's doing 10-30 in federal prison."),
		new Card("Gambling on a fart and losing."),
		new Card("A woman with a double-wide stroller about to mow you down."),
		new Card("A cat trying to stick its nose up your asshole."),
		new Card("A Fleshlight full of thumb tacks."),
		new Card("Stayin' Alive."),
		new Card("The Sexflesh Venereal Vinnie Suction Cup Diseased Dildo."),
		new Card("That barrel in Carnival Night Zone at the supposed "),
		new Card("Whitney's Miltank."),
		new Card("Tourneyfags who turn off all items when playing Super Smash Bros."),
		new Card("Being stalked by a paranoid schizophrenic on Reddit."),
		new Card("Looking up where someone lives because they posted something you didn't like on the internet."),
		new Card("Chance Time."),
		new Card("CryptoLocker."),
		new Card("Colby 2012."),
		new Card("Petty people."),
		new Card("Paying $1,475 for a bath sponge."),
		new Card("Giovanni's head being suplexed through a floor."),
		new Card("Plush animals that come to life long enough to drink all your rum."),
		new Card("BLORF."),
		new Card("Mewtwo's reveal as a playable character in the next Super Smash Bros. title."),
		new Card("The Baconator."),
		new Card("A chinese buffet where everything is wrapped in bacon."),
		new Card("A lifetime supply of Olive Garden breadsticks."),
		new Card("The 52 oz. ")
	};
	
	@Override
	public String getDeckName()
	{
		return "[C] RagingPsyfag's Pack of Shenanigans";
	}
	
	@Override
	public String getShortDeckName()
	{
		return "Shen";
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