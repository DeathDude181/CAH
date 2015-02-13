package org.tilegames.hexicube.cah.common.decks;

import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.Card;

public class DeckEurovision extends Deck
{
	private static final Card[] callCards = new Card[]{
		new Card("Azerbaijan, Land of _."),
		new Card("There's rumours of a country buying votes with _."),
		new Card("Your ideal interval act."),
		new Card("This performance contains flashing images, _ and _."),
		new Card("Serbia entered magical girls. How horribly will their contract end?"),
		new Card("HELLO EUROPE, _ CALLING! 12 POINTS GO TO _!"),
		new Card("_. As guaranteed as Cyprus giving Greece 12 points."),
		new Card("Women kissing each other on stage, men kissing each other on stage, what next?"),
		new Card("Lena goes from Eurovision winner, to participant, to score reader. Her next job is _."),
		new Card("The correct procedure for listening to Fairytale is:"),
		new Card("Nothing can bring down Ruslana's chippy mood,, not even _."),
		new Card("Krista Siegfrids' chronic marrying spree added _ to her victims list."),
		new Card("The BBC have decided to dig up another old relic and send _ to represent the UK."),
		new Card("A (few) word(s) synonymous with Eurovision fans: _"),
		new Card("Johnny Logan is a man of many talents; he wins Eurovisions and _."),
		new Card("Misheard lyrics of Verjamem resulted in people thinking Eva Boto screeched _."),
		new Card("This country has declined to participate due to _."),
		new Card("I'm in loooooooove with a fairytaaaale, even thouuugh it _."),
		new Card("In an attempt to foster friendly attitudes between ESC entrants, the host country made them _ and _."),
		new Card("The winning act had _ and _ as the singer belted out lyrics about _.")
	}, responseCards = new Card[]{
		new Card("Verka Serduchka."),
		new Card("Cezar Ouatu, his opera falsetto voice, his lifting dress and his naked dancers."),
		new Card("EUUUUUUPHOOOORIAAAA."),
		new Card("Loreen's hammertime dance."),
		new Card("Ruslana's vast array of animals she may or may not have slain with her bare hands."),
		new Card("Alexander Rybak."),
		new Card("Eldar Gasimov's stone cold,, dead eyes."),
		new Card("The Eurovision Song Contest."),
		new Card("Loreen Talhaoui."),
		new Card("Epic Sax Guy."),
		new Card("Not being Jedward."),
		new Card("Lena Meyer-Landrut."),
		new Card("Helena Paparizou breathing a sigh of relief that she didn't win during the economic crisis."),
		new Card("Emmelie de Forest's big doe-eyed look."),
		new Card("ZELJKO YOU CHEAAAAAT."),
		new Card("Lordi's entire army of makeup artists."),
		new Card("Malena Ernman's massive arms."),
		new Card("The shock and anger you feel when your neighbour doesn't give you 12 points."),
		new Card("Showing you the Maiden Tower 15 times."),
		new Card("The ABBApocalypse.")
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