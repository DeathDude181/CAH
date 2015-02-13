package org.tilegames.hexicube.cah.common.decks;

import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.Card;

public class DeckDerps extends Deck
{
	private static final Card[] callCards = new Card[]{
		new Card("The comment section was nothing but ____ arguing about ____.", true),
		new Card("It took hours to edit ____ into the video.", true),
		new Card("What's a paladin?", true),
		new Card("One of these days i'm just gonna shit my ____.", true),
		new Card("You need to ____ your asshole, it's vital to this operation.", true),
		new Card("I'm sorry Timmy, but I must ____ you.", true),
		new Card("In this week's gauntlet, Tehsmarty challenges ChilledChaos to ____.", true),
		new Card("In this week's gauntlet, ChilledChaos challenges Tehsmarty to ____.", true),
		new Card("I AM THE ____ CZAR!!!", true),
		new Card("ZeRoyalViking's up and coming game company, ", true),
		new Card("Tehsmarty loves the smell of ____ in the morning.", true),
		new Card("The Creatures' next member is ____.", true),
		new Card("Come on and slam, and welcome to the ____.", true),
		new Card("____, the one you want to get DDoS'd", true),
		new Card("GaLmHD is so pro at almost every game he plays yet he can`t play____!", true),
		new Card("Smarty's darkest fear is ____.", true),
		new Card("Pewdiepie's going to play ____!?", true),
		new Card("And here we have ____. Strike it's weakness for MASSIVE damage!", true),
		new Card("But Beardman! Why do you think that ____?", true),
		new Card("In the next episode of Press Heart to Continue: Dodger talks about ____.", true),
		new Card("What did Criken do this time to break ARMA III? ", true),
		new Card("What was the big prize this time around at the Thrown Controllers panel?", true),
		new Card("What did Mitch or Bajan Canadian find in the fridge today?", true),
		new Card("In ____ We Trust.", true),
		new Card("When Sp00n finally removed his horsemask on the livestream, we saw ____.", true),
		new Card("I give this game a rating of ____.", true),
		new Card("What did Pewdiepie overreact to on his channel today?", true),
		new Card("This time on Brutalmoose's Top 10, his guest was ____.", true),
		new Card("Only Totalbiscuit would spend an hour long video discussing ____.", true),
		new Card("Last Thursday, Riorach was identified in public and she proceeded to ____.", true),
		new Card("On this episode of PKA Woody and Wings talk about ____.", true),
		new Card("Bro's Angels. We ____ hard.", true),
		new Card("GTA shenanigans would not be GTA shenanigans without Seananners dropping ____ on ____.", true),
		new Card("Knowing Chilled's knowledge with Minecraft, he'll probably use ____ on ____ in his next video.", true),
		new Card("Oh great, ____ is doing another ____ game LP.", true),
		new Card("In his new Co-op work SSoHPKC will be playing ____ with ____.", true),
		new Card("My name is-a ____ and i likea da ____.", true),
		new Card("In today's Driftor in-depth episode we shall look at ____.", true),
		new Card("Two Best Friends Play ____.", true),
	}, responseCards = new Card[]{
		new Card("The league of being a big faggot.", false),
		new Card("GaLm's sunglasses.", false),
		new Card("Inside Shrek's asshole.", false),
		new Card("Solving a rubiks cube with your bare nipples.", false),
		new Card("A canoe with enough room for Phil.", false),
		new Card("The Black Seed.", false),
		new Card("That video of EatMyDiction1 twerking.", false),
		new Card("The Sips Co. Dirt Factory.", false),
		new Card("DarkSydePhil playing Dark Souls.", false),
		new Card("Hitler's Train!", false),
		new Card("That time when Machinima played actual machinima videos.", false),
		new Card("Bajan Canadian's fridge.", false),
		new Card("Seananners' dolphin laugh.", false),
		new Card("Chilledchaos' homosexual tendencies.", false),
		new Card("Bolshevik the wolf.", false),
		new Card("Diction watching a burly outdoorsman skin a bear while eating honey and crying.", false),
		new Card("The Tom Shark.", false),
		new Card("#TysLeftFoot", false),
		new Card("Seananners joyously dropping ", false),
		new Card("Jah be dwarfin' it up!", false),
		new Card("Tom drunk off his ass.", false),
		new Card("Getting anally violated by a silverback gorilla.", false),
		new Card("A Big 'Ol Bowl of Fruit!", false),
		new Card("An LP Smarty finished.", false),
		new Card("BEARS!", false),
		new Card("The Blue Yeti microphone.", false),
		new Card("A Machinima contract.", false),
		new Card("Criken's Fun House.", false),
		new Card("A smart joke.", false),
		new Card("One of Chuggaconroy's awful puns.", false),
		new Card("The Great Youtube Unsubbing of 2012.", false),
		new Card("A robot bird.", false),
		new Card("Time to cancel Smash Fighter.", false),
		new Card("Smash Fighter.", false),
		new Card("Totalbiscuit and Angry Joe frolicking in a meadow.", false),
		new Card("Chilled and Smarty's wedding.", false),
	};
	
	@Override
	public String getDeckName()
	{
		return "[C] Derps Against Humanity";
	}
	
	@Override
	public String getShortDeckName()
	{
		return "Derp";
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