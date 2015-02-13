package org.tilegames.hexicube.cah.common.decks;

import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.Card;

public class DeckAntisocialInjustice extends Deck
{
	private static final Card[] callCards = new Card[]{
		new Card("Eating _ gave me _."),
		new Card("The reason I go to church is to learn about _."),
		new Card("Show me on _, where he _."),
		new Card("I wouldn't _ you with _."),
		new Card("All attempts at _, have met with failure and crippling economic sanctions."),
		new Card("Despite our Administration's best efforts, we are still incapable of _."),
		new Card("Technology improves every day. One day soon, surfing the web will be replaced by _."),
		new Card("Choosy Moms Choose _."),
		new Card("At camp, we'd scare each other by telling stories about _ around the fire.")
	}, responseCards = new Card[]{
		new Card("An ingrown toenail on the tip of a penis."),
		new Card("Feline Leukemia."),
		new Card("Marky Mark's foam rubber penis from Boogie Nights."),
		new Card("My Spankerchief."),
		new Card("Pumping a chemical toilet."),
		new Card("The fine line between kinky and perverted."),
		new Card("A Rotisserie Chicken."),
		new Card("Vultures circling a birthday party."),
		new Card("An All White Jury."),
		new Card("Frottage."),
		new Card("Michael J. Fox trying to use a rotary phone."),
		new Card("The Five Knuckle Truffle Punch."),
		new Card("Flipper Babies."),
		new Card("Ejaculating into an insulin pump."),
		new Card("Rocky Dennis and John Merrick's lovechild."),
		new Card("The syrupy goop inside a Stretch Armstrong doll."),
		new Card("Finding an adhesive bandage at the bottom of your ice cream."),
		new Card("Life after Parole."),
		new Card("A cat's sand papery tongue bath."),
		new Card("A Pit Bull named Genghis."),
		new Card("Sphincter Bleaching."),
		new Card("Bringing the Hamburglar to Justice."),
		new Card("Toilet Wine."),
		new Card("An Amputee's chapped limb nub."),
		new Card("Febreezing your Taint."),
		new Card("Leftist Propaganda."),
		new Card("Cookie Monster's substance abuse issues.")
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