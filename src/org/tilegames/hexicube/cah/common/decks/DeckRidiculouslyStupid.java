package org.tilegames.hexicube.cah.common.decks;

import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.Card;

public class DeckRidiculouslyStupid extends Deck
{
	private static final Card[] callCards = new Card[]{
		new Card("____ 2012.", true),
		new Card("What is Curious George so curious about?", true),
		new Card("What is the next big sideshow attraction?", true),
		new Card("Keith Richards enjoys ____ on his food.", true),
		new Card("The victim was found with ____.", true),
		new Card("What is love without ____?", true),
		new Card("Lady Gaga has revealed her new dress will be made of ____.", true),
		new Card("Justin Beiber's new song is all about ____.", true),
		new Card("The new fad diet is all about making people do ____ and eat ____.", true),
		new Card("Grand Theft Auto&trade;: ____.", true),
		new Card("I whip my ____ back and forth.", true),
		new Card("What is literally worse than Hitler?", true),
		new Card("____ ruined many people's childhood.", true),
		new Card("Who needs college when you have ____.", true),
		new Card("When short on money, you can always ____.", true),
		new Card("The next pokemon will combine ____ and ____.", true),
		new Card("Who is GLaDOS's next test subject?", true),
		new Card("Instead of playing Cards Against Humanity, you could be ____.", true),
		new Card("The next Assassin's Creed game will take place in ____.", true),
		new Card("I wouldn't fuck ____ with ____'s dick.", true),
		new Card("One does not simply walk into ____.", true),
		new Card("In the next Punch Out!!, ____ will be the secret final boss.", true),
		new Card("What is the answer to life's question?", true),
		new Card("I've got the whole world in my ____.", true),
		new Card("I never thought ____ would be so enjoyable.", true),
		new Card("In his second term, Obama will rid America of ____.", true),
		new Card("What is Japan's national pastime?", true),
		new Card("In the future, ____ will fuel our cars.", true),
		new Card("The lion, the witch, and ____.", true),
		new Card("In the next episode, SpongeBob gets introduced to ____. ", true),
		new Card("____ Game of the Year Edition.", true),
		new Card("What was going through Osama Bin Laden's head before he died?", true),
		new Card("In a news conference, Obama pulled out ____, to everyone's surprise.", true),
		new Card("Nights filled with ____.", true),
	}, responseCards = new Card[]{
		new Card("Canadian Kindness.", false),
		new Card("The shitty remains of Taco Bell&reg;.", false),
		new Card("Master Chief.", false),
		new Card("Walt Disney's frozen head.", false),
		new Card("Sponge baths.", false),
		new Card("Getting high on bath salts.", false),
		new Card("Snorting Pixie Stix.", false),
		new Card("Poorly written Star Wars&reg; fan fiction.", false),
		new Card("The final circle of Hell.", false),
		new Card("Borat's one piece.", false),
		new Card("LOOK AT THIS PHOTOGRAPH!", false),
		new Card("A 1971 Ford Pinto.", false),
		new Card("Shitting on the White House lawn.", false),
		new Card("Mountain Dew&reg; Baja Blast.", false),
		new Card("Nessie.", false),
		new Card("Princess Peach's Cake.", false),
		new Card("Apples to Apples&reg;.", false),
		new Card("The tears of a college student.", false),
		new Card("Shag carpeting.", false),
		new Card("The Eiffel Tower.", false),
		new Card("Chicken and Waffles.", false),
		new Card("The Oculus Rift.", false),
		new Card("Banana Hammocks.", false),
		new Card("Dirty hippies.", false),
		new Card("Hey Arnold!", false),
		new Card("Air Bud.", false),
		new Card("Yankee Stadium.", false),
		new Card("Hump Day.", false),
		new Card("Sheepskin Condoms.", false),
		new Card("Cranky Kong.", false),
		new Card("The DK Rap.", false),
		new Card("Donkey Shows.", false),
		new Card("Hordes of zombies.", false),
		new Card("Monkeys throwing shit.", false),
		new Card("Rainbows and magic.", false),
		new Card("Tits.", false),
		new Card("The brown note.", false),
		new Card("ALL the things!", false),
		new Card("Hitler's mustache.", false),
		new Card("Gerudo Valley.", false),
		new Card("Song of Storms.", false),
		new Card("Bill Gates pissing on Steve Jobs's grave.", false),
		new Card("A giant purple dildo sword.", false),
		new Card("Hipsters on their iPhones at Starbucks.", false),
		new Card("Catdog.", false),
		new Card("A boat load of cocaine.", false),
		new Card("Lemon grenades.", false),
		new Card("Blue Waffles.", false),
		new Card("360 no scopes.", false),
		new Card("The Mushroom Kingdom.", false),
		new Card("Outsourcing jobs to India.", false),
		new Card("Hooters.", false),
		new Card("The Hokey Pokey.", false),
		new Card("Kaizo Mario.", false),
		new Card("FrankerZ.", false),
		new Card("Spontaneous Combustion.", false),
		new Card("Kappa.", false),
		new Card("Insane Clown Posse.", false),
		new Card("Nu Metal.", false),
		new Card("The Wiggles.", false),
		new Card("Blue's Clues.", false),
		new Card("Mating season.", false),
		new Card("The Ouya.", false),
		new Card("Jew-Fros.", false),
		new Card("Blowing your hand off with a firework.", false),
		new Card("Duke Nukem Forever.", false),
		new Card("Made-for-TV movies.", false),
		new Card("Spanish soap operas.", false),
		new Card("Teh Urn.", false),
		new Card("Viking Metal.", false),
		new Card("Tickle Me Elmo.", false),
		new Card("Barney's rape dungeon.", false),
		new Card("Nurse Joy.", false),
		new Card("Canadian tuxedo.", false),
		new Card("Hungry Hungry Hippos.", false),
		new Card("Abusive fathers.", false),
		new Card("Rich, chocolatey Ovaltine&reg;.", false),
		new Card("Ringworm.", false),
		new Card("The hero of time.", false),
		new Card("Terabytes of horse porn.", false),
		new Card("Blowing the President.", false),
		new Card("Demi Moore's bush.", false),
		new Card("Eating 120 White Castle burgers&reg;.", false),
		new Card("A walrus with a beret.", false),
		new Card("Speedrunning life.", false),
		new Card("The truffle shuffle.", false),
		new Card("Quiznos&reg;.", false),
		new Card("Bong hits for Jesus.", false),
		new Card("Indentured servants.", false),
		new Card("Sex in your mouth.", false),
		new Card("Hoola hoops.", false),
		new Card("Scotsmen marrying their sheep.", false),
	};
	
	@Override
	public String getDeckName()
	{
		return "[C] Ridiculously Stupid";
	}
	
	@Override
	public String getShortDeckName()
	{
		return "RS";
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