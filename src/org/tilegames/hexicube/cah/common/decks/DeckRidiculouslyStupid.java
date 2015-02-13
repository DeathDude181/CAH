package org.tilegames.hexicube.cah.common.decks;

import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.Card;

public class DeckRidiculouslyStupid extends Deck
{
	private static final Card[] callCards = new Card[]{
		new Card("_ 2012."),
		new Card("What is Curious George so curious about?"),
		new Card("What is the next big sideshow attraction?"),
		new Card("Keith Richards enjoys _ on his food."),
		new Card("The victim was found with _."),
		new Card("What is love without _?"),
		new Card("Lady Gaga has revealed her new dress will be made of _."),
		new Card("Justin Beiber's new song is all about _."),
		new Card("The new fad diet is all about making people do _ and eat _."),
		new Card("Grand Theft Auto&trade;: _."),
		new Card("I whip my _ back and forth."),
		new Card("What is literally worse than Hitler?"),
		new Card("_ ruined many people's childhood."),
		new Card("Who needs college when you have _."),
		new Card("When short on money, you can always _."),
		new Card("The next pokemon will combine _ and _."),
		new Card("Who is GLaDOS's next test subject?"),
		new Card("Instead of playing Cards Against Humanity, you could be _."),
		new Card("The next Assassin's Creed game will take place in _."),
		new Card("I wouldn't fuck _ with _'s dick."),
		new Card("One does not simply walk into _."),
		new Card("In the next Punch Out!!, _ will be the secret final boss."),
		new Card("What is the answer to life's question?"),
		new Card("I've got the whole world in my _."),
		new Card("I never thought _ would be so enjoyable."),
		new Card("In his second term, Obama will rid America of _."),
		new Card("What is Japan's national pastime?"),
		new Card("In the future, _ will fuel our cars."),
		new Card("The lion, the witch, and _."),
		new Card("In the next episode, SpongeBob gets introduced to _. "),
		new Card("_ Game of the Year Edition."),
		new Card("What was going through Osama Bin Laden's head before he died?"),
		new Card("In a news conference, Obama pulled out _, to everyone's surprise."),
		new Card("Nights filled with _.")
	}, responseCards = new Card[]{
		new Card("Canadian Kindness."),
		new Card("The shitty remains of Taco Bell&reg;."),
		new Card("Master Chief."),
		new Card("Walt Disney's frozen head."),
		new Card("Sponge baths."),
		new Card("Getting high on bath salts."),
		new Card("Snorting Pixie Stix."),
		new Card("Poorly written Star Wars&reg; fan fiction."),
		new Card("The final circle of Hell."),
		new Card("Borat's one piece."),
		new Card("LOOK AT THIS PHOTOGRAPH!"),
		new Card("A 1971 Ford Pinto."),
		new Card("Shitting on the White House lawn."),
		new Card("Mountain Dew&reg; Baja Blast."),
		new Card("Nessie."),
		new Card("Princess Peach's Cake."),
		new Card("Apples to Apples&reg;."),
		new Card("The tears of a college student."),
		new Card("Shag carpeting."),
		new Card("The Eiffel Tower."),
		new Card("Chicken and Waffles."),
		new Card("The Oculus Rift."),
		new Card("Banana Hammocks."),
		new Card("Dirty hippies."),
		new Card("Hey Arnold!"),
		new Card("Air Bud."),
		new Card("Yankee Stadium."),
		new Card("Hump Day."),
		new Card("Sheepskin Condoms."),
		new Card("Cranky Kong."),
		new Card("The DK Rap."),
		new Card("Donkey Shows."),
		new Card("Hordes of zombies."),
		new Card("Monkeys throwing shit."),
		new Card("Rainbows and magic."),
		new Card("Tits."),
		new Card("The brown note."),
		new Card("ALL the things!"),
		new Card("Hitler's mustache."),
		new Card("Gerudo Valley."),
		new Card("Song of Storms."),
		new Card("Bill Gates pissing on Steve Jobs's grave."),
		new Card("A giant purple dildo sword."),
		new Card("Hipsters on their iPhones at Starbucks."),
		new Card("Catdog."),
		new Card("A boat load of cocaine."),
		new Card("Lemon grenades."),
		new Card("Blue Waffles."),
		new Card("360 no scopes."),
		new Card("The Mushroom Kingdom."),
		new Card("Outsourcing jobs to India."),
		new Card("Hooters."),
		new Card("The Hokey Pokey."),
		new Card("Kaizo Mario."),
		new Card("FrankerZ."),
		new Card("Spontaneous Combustion."),
		new Card("Kappa."),
		new Card("Insane Clown Posse."),
		new Card("Nu Metal."),
		new Card("The Wiggles."),
		new Card("Blue's Clues."),
		new Card("Mating season."),
		new Card("The Ouya."),
		new Card("Jew-Fros."),
		new Card("Blowing your hand off with a firework."),
		new Card("Duke Nukem Forever."),
		new Card("Made-for-TV movies."),
		new Card("Spanish soap operas."),
		new Card("Teh Urn."),
		new Card("Viking Metal."),
		new Card("Tickle Me Elmo."),
		new Card("Barney's rape dungeon."),
		new Card("Nurse Joy."),
		new Card("Canadian tuxedo."),
		new Card("Hungry Hungry Hippos."),
		new Card("Abusive fathers."),
		new Card("Rich, chocolatey Ovaltine&reg;."),
		new Card("Ringworm."),
		new Card("The hero of time."),
		new Card("Terabytes of horse porn."),
		new Card("Blowing the President."),
		new Card("Demi Moore's bush."),
		new Card("Eating 120 White Castle burgers&reg;."),
		new Card("A walrus with a beret."),
		new Card("Speedrunning life."),
		new Card("The truffle shuffle."),
		new Card("Quiznos&reg;."),
		new Card("Bong hits for Jesus."),
		new Card("Indentured servants."),
		new Card("Sex in your mouth."),
		new Card("Hoola hoops."),
		new Card("Scotsmen marrying their sheep.")
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