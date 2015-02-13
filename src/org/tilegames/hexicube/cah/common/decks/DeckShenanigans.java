package org.tilegames.hexicube.cah.common.decks;

import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.Card;

public class DeckShenanigans extends Deck
{
	private static final Card[] callCards = new Card[]{
		new Card("My most shameful orgasm was the time I masturbated to ____.", true),
		new Card("I got an STD from ____.", true),
		new Card("____ is serious business.", true),
		new Card("If you don't pay your Comcast cable bill, they will send ____ after you.", true),
		new Card("Mewtwo achieved a utopian society when he eliminated ____ once and for all.", true),
		new Card("The only thing that caused more of a shitfit than Mewtwo's new form is ____.", true),
		new Card("The idiots in that one room at the Westin finally got kicked out of Anthrocon for ____.", true),
		new Card("Furaffinity went down for 48 hours because of ____.", true),
		new Card("Anthrocon was ruined by ____.", true),
		new Card("I unwatched his FurAffinity page because he kept posting ____.", true),
		new Card("You don't want to find ____ in your Furnando's Lasagna Wrap.", true),
		new Card("____ ruined the ____ fandom for all eternity.", true),
		new Card("I was fapping to ____, but ____ walked in on me.", true),
		new Card("In recent tech news, computers are now being ruined by ____.", true),
		new Card("Yu-Gi-Oh players were shocked when the win condition of holding 5 Exodia pieces was replaced by ____, ____, and ____. ", true),
		new Card("What are the worst 3 cards in your hand right now?", true),
	}, responseCards = new Card[]{
		new Card("Mewtwo.", false),
		new Card("Anthrocon.", false),
		new Card("Uncle Kage.", false),
		new Card("The furries.", false),
		new Card("Furries on the Tyra Banks show.", false),
		new Card("Midna and Wolf Link.", false),
		new Card("Paying $3,500 for an oversized novelty fursuiter badge.", false),
		new Card("2, the Ranting Gryphon.", false),
		new Card("Going on a diet for the sole reason of being able to fit in a fursuit.", false),
		new Card("Waiting over a year for someone to finish your art commission.", false),
		new Card("A used sock collection.", false),
		new Card("A small creature being stuffed in a smelly boot.", false),
		new Card("Being facesat by someone who is holding in a fart.", false),
		new Card("Licking Cinnabon icing off of your partner's dick.", false),
		new Card("Being tied up and having a musky foot stuffed in your mouth.", false),
		new Card("A Bad Dragon dildo.", false),
		new Card("Being pinned to the wall and fucked in a shower.", false),
		new Card("Trees made out of living tentacles.", false),
		new Card("Tickling someone until they almost piss themself.", false),
		new Card("Using a save state in a video game so you can fap to it later.", false),
		new Card("Having every embarrassing kink of yours indulged at one time for a 'shamegasm.'", false),
		new Card("Getting fucked by the Red Robin.", false),
		new Card("Horny, stupid livestock.", false),
		new Card("A fat Russian Blue that pees on the carpet.", false),
		new Card("Poking cats.", false),
		new Card("Bending a Lucario over and using its dreadlocks as fuckhandles.", false),
		new Card("Role reversal.", false),
		new Card("Ray Sipe singing about how /v/ doesn't like video games.", false),
		new Card("A stripper so ugly people throw nickels at her.", false),
		new Card("Lesbrarians.", false),
		new Card("Umbreon.", false),
		new Card("Masturbating at work.", false),
		new Card("Rick Astley.", false),
		new Card("Poor quality ParkerSteel.", false),
		new Card("Vodka spiked with GHB.", false),
		new Card("Chopping up someone's parents and putting them into chili.", false),
		new Card("Getting banned from Dave & Buster's.", false),
		new Card("Finding out your internet stalker's doing 10-30 in federal prison.", false),
		new Card("Gambling on a fart and losing.", false),
		new Card("A woman with a double-wide stroller about to mow you down.", false),
		new Card("A cat trying to stick its nose up your asshole.", false),
		new Card("A Fleshlight full of thumb tacks.", false),
		new Card("Stayin' Alive.", false),
		new Card("The Sexflesh Venereal Vinnie Suction Cup Diseased Dildo.", false),
		new Card("That barrel in Carnival Night Zone at the supposed ", false),
		new Card("Whitney's Miltank.", false),
		new Card("Tourneyfags who turn off all items when playing Super Smash Bros.", false),
		new Card("Being stalked by a paranoid schizophrenic on Reddit.", false),
		new Card("Looking up where someone lives because they posted something you didn't like on the internet.", false),
		new Card("Chance Time.", false),
		new Card("CryptoLocker.", false),
		new Card("Colby 2012.", false),
		new Card("Petty people.", false),
		new Card("Paying $1,475 for a bath sponge.", false),
		new Card("Giovanni's head being suplexed through a floor.", false),
		new Card("Plush animals that come to life long enough to drink all your rum.", false),
		new Card("BLORF.", false),
		new Card("Mewtwo's reveal as a playable character in the next Super Smash Bros. title.", false),
		new Card("The Baconator.", false),
		new Card("A chinese buffet where everything is wrapped in bacon.", false),
		new Card("A lifetime supply of Olive Garden breadsticks.", false),
		new Card("The 52 oz. ", false),
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