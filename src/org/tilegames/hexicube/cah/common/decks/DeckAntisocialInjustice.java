package org.tilegames.hexicube.cah.common.decks;

import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.Card;

public class DeckAntisocialInjustice extends Deck
{
	private static final Card[] callCards = new Card[]{
		new Card("Eating ____ gave me ____.", true),
		new Card("The reason I go to church is to learn about ____.", true),
		new Card("Show me on ____, where he ____.", true),
		new Card("I wouldn't ____ you with ____.", true),
		new Card("All attempts at ____, have met with failure and crippling economic sanctions.", true),
		new Card("Despite our Administration's best efforts, we are still incapable of ____.", true),
		new Card("Technology improves every day. One day soon, surfing the web will be replaced by ____.", true),
		new Card("Choosy Moms Choose ____.", true),
		new Card("At camp, we'd scare each other by telling stories about ____ around the fire.", true),
	}, responseCards = new Card[]{
		new Card("An ingrown toenail on the tip of a penis.", false),
		new Card("Feline Leukemia.", false),
		new Card("Marky Mark's foam rubber penis from Boogie Nights.", false),
		new Card("My Spankerchief.", false),
		new Card("Pumping a chemical toilet.", false),
		new Card("The fine line between kinky and perverted.", false),
		new Card("A Rotisserie Chicken.", false),
		new Card("Vultures circling a birthday party.", false),
		new Card("An All White Jury.", false),
		new Card("Frottage.", false),
		new Card("Michael J. Fox trying to use a rotary phone.", false),
		new Card("The Five Knuckle Truffle Punch.", false),
		new Card("Flipper Babies.", false),
		new Card("Ejaculating into an insulin pump.", false),
		new Card("Rocky Dennis and John Merrick's lovechild.", false),
		new Card("The syrupy goop inside a Stretch Armstrong doll.", false),
		new Card("Finding an adhesive bandage at the bottom of your ice cream.", false),
		new Card("Life after Parole.", false),
		new Card("A cat's sand papery tongue bath.", false),
		new Card("A Pit Bull named Genghis.", false),
		new Card("Sphincter Bleaching.", false),
		new Card("Bringing the Hamburglar to Justice.", false),
		new Card("Toilet Wine.", false),
		new Card("An Amputee's chapped limb nub.", false),
		new Card("Febreezing your Taint.", false),
		new Card("Leftist Propaganda.", false),
		new Card("Cookie Monster's substance abuse issues.", false),
	};
	
	@Override
	public String getDeckName()
	{
		return "[C] Antisocial Injustice";
	}
	
	@Override
	public String getShortDeckName()
	{
		return "AntiS";
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