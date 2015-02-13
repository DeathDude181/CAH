package org.tilegames.hexicube.cah.common.decks;

import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.Card;

public class DeckVersion2 extends Deck
{
	private static final Card[] callCards = new Card[]{
		new Card("What don't you want to find in your Chinese food?", true),
		new Card("What's the crustiest?", true),
		new Card("During Picasso's often-overlooked Brown Period, he produced hundreds of paintings of ____.", true),
		new Card("Anthropologists have recently discovered a primitive tribe that worships ____.", true),
		new Card("In 1,000 years, when paper money is but a distant memory, ____ will be our currency.", true),
		new Card("In an attempt to reach a wider audience, the Smithsonian Museum of Natural History has opened an interactive exhibit on ____.", true),
		new Card("____? There's an app for that.", true),
	}, responseCards = new Card[]{
		new Card("Stifling a giggle at the mention of Hutus and Tutsis.", false),
		new Card("Charisma.", false),
		new Card("Chutzpah.", false),
		new Card("Tweeting.', ", false),
		new Card("Customer service representatives.", false),
		new Card("Jibber-jabber.", false),
		new Card("Consultants.", false),
		new Card("Party poopers.", false),
		new Card("Flash flooding.", false),
		new Card("Chivalry.", false),
		new Card("Jew-fros.", false),
		new Card("Glenn Beck convulsively vomiting as a brood of crab spiders hatches in his brain and erupts from his tear ducts.", false),
		new Card("A Gypsy curse.", false),
		new Card("Waterboarding.", false),
		new Card("A clandestine butt scratch.", false),
		new Card("An honest cop with nothing left to lose.", false),
		new Card("Friends who eat all the snacks.", false),
		new Card("A drive-by shooting.", false),
		new Card("Intelligent design.", false),
		new Card("Nocturnal emissions.", false),
		new Card("Uppercuts.", false),
		new Card("Oversized lollipops.", false),
		new Card("Keg stands.", false),
		new Card("A moment of silence.", false),
		new Card("Global warming.", false),
		new Card("College.", false),
		new Card("Child abuse.", false),
		new Card("Menstruation.", false),
		new Card("Re-gifting.", false),
		new Card("Soiling oneself.", false),
		new Card("Seduction.", false),
		new Card("Pterodactyl eggs.", false),
		new Card("Crumpets with the Queen.", false),
		new Card("Exchanging pleasantries.", false),
		new Card("Glenn Beck being harried by a swarm of buzzards.", false),
		new Card("A look-see.", false),
		new Card("Team-building exercises.", false),
		new Card("Date rape.", false),
		new Card("Too much hair gel.", false),
		new Card("Raping and pillaging.", false),
		new Card("American Gladiators.", false),
		new Card("Loose lips.", false),
		new Card("Forgetting the Alamo.", false),
		new Card("Booby-trapping the house to foil burglars.", false),
		new Card("Her Royal Highness, Queen Elizabeth II.", false),
		new Card("Cockfights.", false),
		new Card("Glenn Beck catching his scrotum on a curtain hook.", false),
		new Card("The forbidden fruit.", false),
		new Card("Goats eating coins.", false),
		new Card("A big hoopla about nothing.", false),
		new Card("Mathletes.", false),
		new Card("Dwarf tossing.", false),
		new Card("Euphoria&trade; by Calvin Klein.", false),
		new Card("The Donald Trump Seal of Approval&trade;.", false),
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