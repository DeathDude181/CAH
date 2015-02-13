package org.tilegames.hexicube.cah.common.decks;

import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.Card;

public class DeckVerySerious extends Deck
{
	private static final Card[] callCards = new Card[]{
		new Card("____ Jesus is the Jesus of ____.", true),
		new Card("____ ALL THE ____.", true),
		new Card("There were ALOT of ____ doing ____.", true),
		new Card("Dogimo would give up ____ to type a six sentence paragraph in a thread.", true),
		new Card("Simple dog ate and vomited ____.", true),
		new Card("When I was 25, I won an award for ____.", true),
		new Card("I'm more awesome than a T-rex because of ____.", true),
		new Card("____ in my pants.", true),
		new Card("We need to talk about your whole gallon of ____.", true),
		new Card("Clean ALL the ____.", true),
		new Card("The first rule of Jade Club is ____.", true),
		new Card("The forum nearly broke when ____ posted ____ in The Dead Thread.", true),
		new Card("A mod war about ____ occurred during ____.", true),
		new Card("No one likes me after I posted ____ in the TMI thread.", true),
		new Card("____ was banned from tinychat because of ____.", true),
		new Card("I did ____, like a fucking adult.", true),
		new Card("Domo travelled across ____ to win the prize of ____.", true),
		new Card("Roses and her hammer collection defeated an entire squadron of ____.", true),
		new Card("After Blue posted ____ in chat, I never trusted his links again.", true),
		new Card("Fuck you, I'm a ____.", true),
		new Card("I CAN ____ ACROSS THE ____.", true),
		new Card("I want ____ in my mouflon RIGHT MEOW.", true),
		new Card("Yaar's mother is ____.", true),
		new Card("You have my bow. AND MY ____.", true),
		new Card("VS: Where the ____ happens!", true),
		new Card("____? FRY. EYES.", true),
		new Card("I thought being a ____ was the best thing ever, until I became a ____.", true),
		new Card("Live long and ____.", true),
		new Card("I'm under the ____.", true),
		new Card("The hills are alive with ____ of ____.", true),
	}, responseCards = new Card[]{
		new Card("Dickcheese.", false),
		new Card("Poopcake.", false),
		new Card("A WHOLE GALLON.", false),
		new Card("Lewhora.", false),
		new Card("Very Serious Island.", false),
		new Card("COLLIN.", false),
		new Card("Ferngully.", false),
		new Card("Velociraptor.", false),
		new Card("Thundercunting.", false),
		new Card("Werewolf.", false),
		new Card("Cultist.", false),
		new Card("Vejazzled vagina.", false),
		new Card("HODOR.", false),
		new Card("Simple dog.", false),
		new Card("Butt oranges.", false),
		new Card("Sweater kittens.", false),
		new Card("Baby batter.", false),
		new Card("Meat curtains.", false),
		new Card("Strawberry Shortcake sexing up a Carebear and giving birth to NyanCat.", false),
		new Card("Blowjob Jesus.", false),
		new Card("GOATS.", false),
		new Card("Welcome Taco.", false),
		new Card("Centaur Therapist Jesus.", false),
		new Card("LOUD NOISES.", false),
		new Card("WIIINES.", false),
		new Card("A Wende head tilt.", false),
		new Card("Chris Gaines.", false),
		new Card("Landshark.", false),
		new Card("The Great Dildo, Thor.", false),
		new Card("Daddy foam.", false),
		new Card("PooooooP!", false),
		new Card("Buttpirate Pokemon.", false),
		new Card("A really good booby weight.", false),
		new Card("Tubemonster.", false),
		new Card("Bevis.", false),
		new Card("A WHOLE GALLON OF BOOBS.", false),
		new Card("Barfstab.", false),
		new Card("LYNCH LUPUS.", false),
		new Card("Shooting heroin into my eyeballs.", false),
		new Card("Skittering ovaries.", false),
		new Card("Ricardo.", false),
		new Card("The revolution.", false),
		new Card("The establishment.", false),
		new Card("Queer Lesbian Jesus.", false),
		new Card("Readying my torch for burnination.", false),
		new Card("In a sneaky hate spiral.", false),
		new Card("Certified Breast Maintenance Engineer.", false),
		new Card("A test tube baby.", false),
		new Card("Dancing naked.", false),
		new Card("Moist and Juicy.", false),
		new Card("Orgy.", false),
		new Card("Lotion.", false),
		new Card("Rapey dolphin.", false),
		new Card("Werepoo.", false),
		new Card("Handbra.", false),
		new Card("A moose giving birth in Maggly's yard.", false),
		new Card("More bandaids.", false),
		new Card("Fuckweasel.", false),
		new Card("Curious hands.", false),
		new Card("Spagbag.", false),
		new Card("Tears of manly pain.", false),
		new Card("Cthulu.", false),
		new Card("Surprise penis.", false),
		new Card("SEX.", false),
		new Card("Mr. Tinycheeks.", false),
		new Card("An Olive Ewe.", false),
		new Card("Dropbears.", false),
		new Card("Making a random guess in Werewolf that gets you killed later.", false),
		new Card("INTERNET FOREVER!", false),
		new Card("The jitters you get before a meetup.", false),
		new Card("Shenaniganty.", false),
		new Card("I AM HOW BABIES ARE MADE.", false),
		new Card("Noble whore.", false),
		new Card("Kangaroo stripper.", false),
		new Card("Droopums.", false),
		new Card("Nonni's mantis.", false),
		new Card("Ginger baby.", false),
		new Card("Drunk foruming.", false),
		new Card("Thundercunt.", false),
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