package org.tilegames.hexicube.cah.common.decks;

import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.Card;

public class DeckEurovision extends Deck
{
	private static final Card[] callCards = new Card[]{
		new Card("Azerbaijan, Land of ____.", true),
		new Card("There's rumours of a country buying votes with ____.", true),
		new Card("Your ideal interval act.", true),
		new Card("This performance contains flashing images, ____ and ____.", true),
		new Card("Serbia entered magical girls. How horribly will their contract end?", true),
		new Card("HELLO EUROPE, ____ CALLING! 12 POINTS GO TO ____!", true),
		new Card("____. As guaranteed as Cyprus giving Greece 12 points.", true),
		new Card("Women kissing each other on stage, men kissing each other on stage, what next?", true),
		new Card("Lena goes from Eurovision winner, to participant, to score reader. Her next job is ____.", true),
		new Card("The correct procedure for listening to Fairytale is:", true),
		new Card("Nothing can bring down Ruslana's chippy mood,, not even ____.", true),
		new Card("Krista Siegfrids' chronic marrying spree added ____ to her victims list.", true),
		new Card("The BBC have decided to dig up another old relic and send ____ to represent the UK.", true),
		new Card("A (few) word(s) synonymous with Eurovision fans: ____", true),
		new Card("Johnny Logan is a man of many talents; he wins Eurovisions and ____.", true),
		new Card("Misheard lyrics of Verjamem resulted in people thinking Eva Boto screeched ____.", true),
		new Card("This country has declined to participate due to ____.", true),
		new Card("I'm in loooooooove with a fairytaaaale, even thouuugh it ____.", true),
		new Card("In an attempt to foster friendly attitudes between ESC entrants, the host country made them ____ and ____.", true),
		new Card("The winning act had ____ and ____ as the singer belted out lyrics about ____.", true),
	}, responseCards = new Card[]{
		new Card("Verka Serduchka.", false),
		new Card("Cezar Ouatu, his opera falsetto voice, his lifting dress and his naked dancers.", false),
		new Card("EUUUUUUPHOOOORIAAAA.", false),
		new Card("Loreen's hammertime dance.", false),
		new Card("Ruslana's vast array of animals she may or may not have slain with her bare hands.", false),
		new Card("Alexander Rybak.", false),
		new Card("Eldar Gasimov's stone cold,, dead eyes.", false),
		new Card("The Eurovision Song Contest.", false),
		new Card("Loreen Talhaoui.", false),
		new Card("Epic Sax Guy.", false),
		new Card("Not being Jedward.", false),
		new Card("Lena Meyer-Landrut.", false),
		new Card("Helena Paparizou breathing a sigh of relief that she didn't win during the economic crisis.", false),
		new Card("Emmelie de Forest's big doe-eyed look.", false),
		new Card("ZELJKO YOU CHEAAAAAT.", false),
		new Card("Lordi's entire army of makeup artists.", false),
		new Card("Malena Ernman's massive arms.", false),
		new Card("The shock and anger you feel when your neighbour doesn't give you 12 points.", false),
		new Card("Showing you the Maiden Tower 15 times.", false),
		new Card("The ABBApocalypse.", false),
	};
	
	@Override
	public String getDeckName()
	{
		return "[C] Eurovision Song Contest";
	}
	
	@Override
	public String getShortDeckName()
	{
		return "Euro";
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