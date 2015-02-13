package org.tilegames.hexicube.cah.common.decks;

import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.Card;

public class Deck2013HolidayBS extends Deck
{
	private static final Card[] callCards = new Card[]{
		new Card("But wait, there's more! If you order _ in the next 15 minutes, we'll throw in _ absolutely free!"),
		new Card("Blessed are you, Lord our God, creator of the universe, who has granted us _."),
		new Card("Because they are forbidden from masturbating, Mormons channel their repressed sexual energy into _."),
		new Card("I really hope my grandmother doesn't ask me to explain _ again."),
		new Card("What's the one thing that makes an elf instantly ejaculate?"),
		new Card("GREETINGS HUMANS\n\nI AM _ BOT\n\nEXECUTING PROGRAM"),
		new Card("Kids these days with their iPods and their Internet. In my day, all we needed to pass the time was _."),
		new Card("Revealed:<br>Why He Really Resigned!<br>Pope Benedict's Secret Struggle with _!"),
		new Card("Here's what you can expect for the new year.\nOut: _.\nIn: _.")
	}, responseCards = new Card[]{
		new Card("Giving money and personal information to strangers on the Internet."),
		new Card("A magical tablet containing a world of unlimited pornography."),
		new Card("These low, low prices!"),
		new Card("Piece of shit Christmas cards with no money in them."),
		new Card("Moses gargling Jesus's balls while Shiva and the Buddha penetrate his divine hand holes."),
		new Card("The Hawaiian goddess Kapo and her flying detachable vagina."),
		new Card("The shittier, Jewish version of Christmas."),
		new Card("Making up for 10 years of shitty parenting with a PlayStation."),
		new Card("Swapping bodies with mom for a day."),
		new Card("Slicing a ham in icy silence."),
		new Card("Finding out that Santa isn't real."),
		new Card("Rudolph's bright red balls."),
		new Card("The Grinch's musty, cum-stained pelt."),
		new Card("Breeding elves for their priceless semen."),
		new Card("Jizzing into Santa's beard."),
		new Card("A simultaneous nightmare and wet dream starring Sigourney Weaver."),
		new Card("Being blind and deaf and having no limbs."),
		new Card("People with cake in their mouths talking about how good cake is."),
		new Card("Congress's flaccid penises withering away beneath their suit pants."),
		new Card("The royal afterbirth."),
		new Card("Having a strong opinion about Obamacare.")
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