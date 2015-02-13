package org.tilegames.hexicube.cah.common.decks;

import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.Card;

public class Deck2013HolidayBS extends Deck
{
	private static final Card[] callCards = new Card[]{
		new Card("But wait, there's more! If you order ____ in the next 15 minutes, we'll throw in ____ absolutely free!", true),
		new Card("Blessed are you, Lord our God, creator of the universe, who has granted us ____.", true),
		new Card("Because they are forbidden from masturbating, Mormons channel their repressed sexual energy into ____.", true),
		new Card("I really hope my grandmother doesn't ask me to explain ____ again.", true),
		new Card("What's the one thing that makes an elf instantly ejaculate?", true),
		new Card("GREETINGS HUMANS<br><br>I AM ____ BOT<br><br>EXECUTING PROGRAM", true),
		new Card("Kids these days with their iPods and their Internet. In my day, all we needed to pass the time was ____.", true),
		new Card("Revealed:<br>Why He Really Resigned!<br>Pope Benedict's Secret Struggle with ____!", true),
		new Card("Here's what you can expect for the new year.<br>Out: ____.<br>In: ____.", true),
	}, responseCards = new Card[]{
		new Card("Giving money and personal information to strangers on the Internet.", false),
		new Card("A magical tablet containing a world of unlimited pornography.", false),
		new Card("These low, low prices!", false),
		new Card("Piece of shit Christmas cards with no money in them.", false),
		new Card("Moses gargling Jesus's balls while Shiva and the Buddha penetrate his divine hand holes.", false),
		new Card("The Hawaiian goddess Kapo and her flying detachable vagina.", false),
		new Card("The shittier, Jewish version of Christmas.", false),
		new Card("Making up for 10 years of shitty parenting with a PlayStation.", false),
		new Card("Swapping bodies with mom for a day.", false),
		new Card("Slicing a ham in icy silence.", false),
		new Card("Finding out that Santa isn't real.", false),
		new Card("Rudolph's bright red balls.", false),
		new Card("The Grinch's musty, cum-stained pelt.", false),
		new Card("Breeding elves for their priceless semen.", false),
		new Card("Jizzing into Santa's beard.", false),
		new Card("A simultaneous nightmare and wet dream starring Sigourney Weaver.", false),
		new Card("Being blind and deaf and having no limbs.", false),
		new Card("People with cake in their mouths talking about how good cake is.", false),
		new Card("Congress's flaccid penises withering away beneath their suit pants.", false),
		new Card("The royal afterbirth.", false),
		new Card("Having a strong opinion about Obamacare.", false),
	};
	
	@Override
	public String getDeckName()
	{
		return "2013 Holiday Bullshit";
	}
	
	@Override
	public String getShortDeckName()
	{
		return "HolBS";
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