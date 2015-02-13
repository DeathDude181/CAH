package org.tilegames.hexicube.cah.common.decks;

import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.Card;

public class DeckDerps extends Deck
{
	private static final Card[] callCards = new Card[]{
		new Card("The comment section was nothing but _ arguing about _."),
		new Card("It took hours to edit _ into the video."),
		new Card("What's a paladin?"),
		new Card("One of these days i'm just gonna shit my _."),
		new Card("You need to _ your asshole, it's vital to this operation."),
		new Card("I'm sorry Timmy, but I must _ you."),
		new Card("In this week's gauntlet, Tehsmarty challenges ChilledChaos to _."),
		new Card("In this week's gauntlet, ChilledChaos challenges Tehsmarty to _."),
		new Card("I AM THE _ CZAR!!!"),
		new Card("ZeRoyalViking's up and coming game company, "),
		new Card("Tehsmarty loves the smell of _ in the morning."),
		new Card("The Creatures' next member is _."),
		new Card("Come on and slam, and welcome to the _."),
		new Card("_, the one you want to get DDoS'd"),
		new Card("GaLmHD is so pro at almost every game he plays yet he can`t play____!"),
		new Card("Smarty's darkest fear is _."),
		new Card("Pewdiepie's going to play _!?"),
		new Card("And here we have _. Strike it's weakness for MASSIVE damage!"),
		new Card("But Beardman! Why do you think that _?"),
		new Card("In the next episode of Press Heart to Continue: Dodger talks about _."),
		new Card("What did Criken do this time to break ARMA III? "),
		new Card("What was the big prize this time around at the Thrown Controllers panel?"),
		new Card("What did Mitch or Bajan Canadian find in the fridge today?"),
		new Card("In _ We Trust."),
		new Card("When Sp00n finally removed his horsemask on the livestream, we saw _."),
		new Card("I give this game a rating of _."),
		new Card("What did Pewdiepie overreact to on his channel today?"),
		new Card("This time on Brutalmoose's Top 10, his guest was _."),
		new Card("Only Totalbiscuit would spend an hour long video discussing _."),
		new Card("Last Thursday, Riorach was identified in public and she proceeded to _."),
		new Card("On this episode of PKA Woody and Wings talk about _."),
		new Card("Bro's Angels. We _ hard."),
		new Card("GTA shenanigans would not be GTA shenanigans without Seananners dropping _ on _."),
		new Card("Knowing Chilled's knowledge with Minecraft, he'll probably use _ on _ in his next video."),
		new Card("Oh great, _ is doing another _ game LP."),
		new Card("In his new Co-op work SSoHPKC will be playing _ with _."),
		new Card("My name is-a _ and i likea da _."),
		new Card("In today's Driftor in-depth episode we shall look at _."),
		new Card("Two Best Friends Play _.")
	}, responseCards = new Card[]{
		new Card("The league of being a big faggot."),
		new Card("GaLm's sunglasses."),
		new Card("Inside Shrek's asshole."),
		new Card("Solving a rubiks cube with your bare nipples."),
		new Card("A canoe with enough room for Phil."),
		new Card("The Black Seed."),
		new Card("That video of EatMyDiction1 twerking."),
		new Card("The Sips Co. Dirt Factory."),
		new Card("DarkSydePhil playing Dark Souls."),
		new Card("Hitler's Train!"),
		new Card("That time when Machinima played actual machinima videos."),
		new Card("Bajan Canadian's fridge."),
		new Card("Seananners' dolphin laugh."),
		new Card("Chilledchaos' homosexual tendencies."),
		new Card("Bolshevik the wolf."),
		new Card("Diction watching a burly outdoorsman skin a bear while eating honey and crying."),
		new Card("The Tom Shark."),
		new Card("#TysLeftFoot"),
		new Card("Seananners joyously dropping "),
		new Card("Jah be dwarfin' it up!"),
		new Card("Tom drunk off his ass."),
		new Card("Getting anally violated by a silverback gorilla."),
		new Card("A Big 'Ol Bowl of Fruit!"),
		new Card("An LP Smarty finished."),
		new Card("BEARS!"),
		new Card("The Blue Yeti microphone."),
		new Card("A Machinima contract."),
		new Card("Criken's Fun House."),
		new Card("A smart joke."),
		new Card("One of Chuggaconroy's awful puns."),
		new Card("The Great Youtube Unsubbing of 2012."),
		new Card("A robot bird."),
		new Card("Time to cancel Smash Fighter."),
		new Card("Smash Fighter."),
		new Card("Totalbiscuit and Angry Joe frolicking in a meadow."),
		new Card("Chilled and Smarty's wedding.")
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