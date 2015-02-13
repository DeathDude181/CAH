package org.tilegames.hexicube.cah.common.decks;

import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.Card;

public class DeckVersion2 extends Deck
{
	private static final Card[] callCards = new Card[]{
		new Card("What don't you want to find in your Chinese food?"),
		new Card("What's the crustiest?"),
		new Card("During Picasso's often-overlooked Brown Period, he produced hundreds of paintings of _."),
		new Card("Anthropologists have recently discovered a primitive tribe that worships _."),
		new Card("In 1,000 years, when paper money is but a distant memory, _ will be our currency."),
		new Card("In an attempt to reach a wider audience, the Smithsonian Museum of Natural History has opened an interactive exhibit on _."),
		new Card("_? There's an app for that."),
	}, responseCards = new Card[]{
		new Card("Stifling a giggle at the mention of Hutus and Tutsis."),
		new Card("Charisma."),
		new Card("Chutzpah."),
		new Card("Tweeting.', "),
		new Card("Customer service representatives."),
		new Card("Jibber-jabber."),
		new Card("Consultants."),
		new Card("Party poopers."),
		new Card("Flash flooding."),
		new Card("Chivalry."),
		new Card("Jew-fros."),
		new Card("Glenn Beck convulsively vomiting as a brood of crab spiders hatches in his brain and erupts from his tear ducts."),
		new Card("A Gypsy curse."),
		new Card("Waterboarding."),
		new Card("A clandestine butt scratch."),
		new Card("An honest cop with nothing left to lose."),
		new Card("Friends who eat all the snacks."),
		new Card("A drive-by shooting."),
		new Card("Intelligent design."),
		new Card("Nocturnal emissions."),
		new Card("Uppercuts."),
		new Card("Oversized lollipops."),
		new Card("Keg stands."),
		new Card("A moment of silence."),
		new Card("Global warming."),
		new Card("College."),
		new Card("Child abuse."),
		new Card("Menstruation."),
		new Card("Re-gifting."),
		new Card("Soiling oneself."),
		new Card("Seduction."),
		new Card("Pterodactyl eggs."),
		new Card("Crumpets with the Queen."),
		new Card("Exchanging pleasantries."),
		new Card("Glenn Beck being harried by a swarm of buzzards."),
		new Card("A look-see."),
		new Card("Team-building exercises."),
		new Card("Date rape."),
		new Card("Too much hair gel."),
		new Card("Raping and pillaging."),
		new Card("American Gladiators."),
		new Card("Loose lips."),
		new Card("Forgetting the Alamo."),
		new Card("Booby-trapping the house to foil burglars."),
		new Card("Her Royal Highness, Queen Elizabeth II."),
		new Card("Cockfights."),
		new Card("Glenn Beck catching his scrotum on a curtain hook."),
		new Card("The forbidden fruit."),
		new Card("Goats eating coins."),
		new Card("A big hoopla about nothing."),
		new Card("Mathletes."),
		new Card("Dwarf tossing."),
		new Card("Euphoria&trade; by Calvin Klein."),
		new Card("The Donald Trump Seal of Approval&trade;.")
	};
	
	@Override
	public String getDeckName()
	{
		return "Second Version";
	}
	
	@Override
	public String getShortDeckName()
	{
		return "2.0";
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