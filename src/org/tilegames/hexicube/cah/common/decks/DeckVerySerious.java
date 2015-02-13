package org.tilegames.hexicube.cah.common.decks;

import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.Card;

public class DeckVerySerious extends Deck
{
	private static final Card[] callCards = new Card[]{
		new Card("_ Jesus is the Jesus of _."),
		new Card("_ ALL THE _."),
		new Card("There were ALOT of _ doing _."),
		new Card("Dogimo would give up _ to type a six sentence paragraph in a thread."),
		new Card("Simple dog ate and vomited _."),
		new Card("When I was 25, I won an award for _."),
		new Card("I'm more awesome than a T-rex because of _."),
		new Card("_ in my pants."),
		new Card("We need to talk about your whole gallon of _."),
		new Card("Clean ALL the _."),
		new Card("The first rule of Jade Club is _."),
		new Card("The forum nearly broke when _ posted _ in The Dead Thread."),
		new Card("A mod war about _ occurred during _."),
		new Card("No one likes me after I posted _ in the TMI thread."),
		new Card("_ was banned from tinychat because of _."),
		new Card("I did _, like a fucking adult."),
		new Card("Domo travelled across _ to win the prize of _."),
		new Card("Roses and her hammer collection defeated an entire squadron of _."),
		new Card("After Blue posted _ in chat, I never trusted his links again."),
		new Card("Fuck you, I'm a _."),
		new Card("I CAN _ ACROSS THE _."),
		new Card("I want _ in my mouflon RIGHT MEOW."),
		new Card("Yaar's mother is _."),
		new Card("You have my bow. AND MY _."),
		new Card("VS: Where the _ happens!"),
		new Card("_? FRY. EYES."),
		new Card("I thought being a _ was the best thing ever, until I became a _."),
		new Card("Live long and _."),
		new Card("I'm under the _."),
		new Card("The hills are alive with _ of _.")
	}, responseCards = new Card[]{
		new Card("Dickcheese."),
		new Card("Poopcake."),
		new Card("A WHOLE GALLON."),
		new Card("Lewhora."),
		new Card("Very Serious Island."),
		new Card("COLLIN."),
		new Card("Ferngully."),
		new Card("Velociraptor."),
		new Card("Thundercunting."),
		new Card("Werewolf."),
		new Card("Cultist."),
		new Card("Vejazzled vagina."),
		new Card("HODOR."),
		new Card("Simple dog."),
		new Card("Butt oranges."),
		new Card("Sweater kittens."),
		new Card("Baby batter."),
		new Card("Meat curtains."),
		new Card("Strawberry Shortcake sexing up a Carebear and giving birth to NyanCat."),
		new Card("Blowjob Jesus."),
		new Card("GOATS."),
		new Card("Welcome Taco."),
		new Card("Centaur Therapist Jesus."),
		new Card("LOUD NOISES."),
		new Card("WIIINES."),
		new Card("A Wende head tilt."),
		new Card("Chris Gaines."),
		new Card("Landshark."),
		new Card("The Great Dildo, Thor."),
		new Card("Daddy foam."),
		new Card("PooooooP!"),
		new Card("Buttpirate Pokemon."),
		new Card("A really good booby weight."),
		new Card("Tubemonster."),
		new Card("Bevis."),
		new Card("A WHOLE GALLON OF BOOBS."),
		new Card("Barfstab."),
		new Card("LYNCH LUPUS."),
		new Card("Shooting heroin into my eyeballs."),
		new Card("Skittering ovaries."),
		new Card("Ricardo."),
		new Card("The revolution."),
		new Card("The establishment."),
		new Card("Queer Lesbian Jesus."),
		new Card("Readying my torch for burnination."),
		new Card("In a sneaky hate spiral."),
		new Card("Certified Breast Maintenance Engineer."),
		new Card("A test tube baby."),
		new Card("Dancing naked."),
		new Card("Moist and Juicy."),
		new Card("Orgy."),
		new Card("Lotion."),
		new Card("Rapey dolphin."),
		new Card("Werepoo."),
		new Card("Handbra."),
		new Card("A moose giving birth in Maggly's yard."),
		new Card("More bandaids."),
		new Card("Fuckweasel."),
		new Card("Curious hands."),
		new Card("Spagbag."),
		new Card("Tears of manly pain."),
		new Card("Cthulu."),
		new Card("Surprise penis."),
		new Card("SEX."),
		new Card("Mr. Tinycheeks."),
		new Card("An Olive Ewe."),
		new Card("Dropbears."),
		new Card("Making a random guess in Werewolf that gets you killed later."),
		new Card("INTERNET FOREVER!"),
		new Card("The jitters you get before a meetup."),
		new Card("Shenaniganty."),
		new Card("I AM HOW BABIES ARE MADE."),
		new Card("Noble whore."),
		new Card("Kangaroo stripper."),
		new Card("Droopums."),
		new Card("Nonni's mantis."),
		new Card("Ginger baby."),
		new Card("Drunk foruming."),
		new Card("Thundercunt.")
	};
	
	@Override
	public String getDeckName()
	{
		return "[C] Very Serious";
	}
	
	@Override
	public String getShortDeckName()
	{
		return "SRS";
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