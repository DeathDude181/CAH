package org.tilegames.hexicube.cah.common.decks;

import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.Card;

public class DeckExpansion2 extends Deck
{
	private static final Card[] callCards = new Card[]{
		new Card("During his midlife crisis, my dad got really into ____.", true),
		new Card("____ would be woefully incomplete without ____.", true),
		new Card("My new favorite porn star is Joey ", true),
		new Card("Before I run for president, I must destroy all evidence of my involvement with ____.", true),
		new Card("This is your captain speaking. Fasten your seatbelts and prepare for ____.", true),
		new Card("In his newest and most difficult stunt, David Blaine must escape from ____.", true),
		new Card("The Five Stages of Grief: denial, anger, bargaining, ____, acceptance.", true),
		new Card("My mom freaked out when she looked at my browser history and found ____.com/____.", true),
		new Card("I went from ____ to ____, all thanks to ____.", true),
		new Card("Members of New York's social elite are paying thousands of dollars just to experience ____.", true),
		new Card("This month's Cosmo: 'Spice up your sex life by bringing ____ into the bedroom.'", true),
		new Card("Little Miss Muffet Sat on a tuffet, Eating her curds and ____.", true),
		new Card("If God didn't want us to enjoy ____, he wouldn't have given us ____.", true),
		new Card("My country, 'tis of thee, sweet land of ____.", true),
		new Card("After months of debate, the Occupy Wall Street General Assembly could only agree on 'More ____!'", true),
		new Card("I spent my whole life working toward ____, only to have it ruined by ____.", true),
		new Card("Next time on Dr. Phil: How to talk to your child about ____.", true),
		new Card("Only two things in life are certain: death and ____.", true),
		new Card("Everyone down on the ground! We don't want to hurt anyone. We're just here for ____.", true),
		new Card("The healing process began when I joined a support group for victims of ____.", true),
		new Card("The votes are in, and the new high school mascot is ____.", true),
		new Card("Charades was ruined for me forever when my mom had to act out ____.", true),
		new Card("Before ____, all we had was ____.", true),
		new Card("Tonight on 20/20: What you don't know about ____ could kill you.", true),
		new Card("You haven't truly lived until you've experienced ____ and ____ at the same time.", true),
	}, responseCards = new Card[]{
		new Card("A soulful rendition of ", false),
		new Card("Intimacy problems.", false),
		new Card("A sweaty, panting leather daddy.", false),
		new Card("Spring break!", false),
		new Card("Being awesome at sex.", false),
		new Card("Dining with cardboard cutouts of the cast of 'Friends.'", false),
		new Card("Another shot of morphine.", false),
		new Card("Bullshit.", false),
		new Card("The Google.", false),
		new Card("The new Radiohead album.", false),
		new Card("An army of skeletons.", false),
		new Card("A man in yoga pants with a ponytail and feather earrings.", false),
		new Card("Mild autism.", false),
		new Card("Nunchuck moves.", false),
		new Card("Whipping a disobedient slave.", false),
		new Card("An ether-soaked rag.", false),
		new Card("A sweet spaceship.", false),
		new Card("A 55-gallon drum of lube.", false),
		new Card("Special musical guest, Cher.", false),
		new Card("The human body.", false),
		new Card("Boris the Soviet Love Hammer.", false),
		new Card("The grey nutrient broth that sustains Mitt Romney.", false),
		new Card("Tiny nipples.", false),
		new Card("Power.", false),
		new Card("Oncoming traffic.", false),
		new Card("A dollop of sour cream.", false),
		new Card("A slightly shittier parallel universe.", false),
		new Card("My first kill.", false),
		new Card("Graphic violence, adult language, and some sexual content.", false),
		new Card("Fetal alcohol syndrome.", false),
		new Card("The day the birds attacked.", false),
		new Card("One Ring to rule them all.", false),
		new Card("Grandpa's ashes.", false),
		new Card("Basic human decency.", false),
		new Card("A Burmese tiger pit.", false),
		new Card("Death by Steven Seagal.", false),
		new Card("A bigger, blacker dick.", false),
		new Card("A sad fat dragon with no friends.", false),
		new Card("Catastrophic urethral trauma.", false),
		new Card("Hillary Clinton's death stare.", false),
		new Card("Existing.", false),
		new Card("Mooing.", false),
		new Card("Swiftly achieving orgasm.", false),
		new Card("Daddy's belt.", false),
		new Card("Double penetration.", false),
		new Card("Weapons-grade plutonium.", false),
		new Card("Some really fucked-up shit.", false),
		new Card("Subduing a grizzly bear and making her your wife.", false),
		new Card("Rising from the grave.", false),
		new Card("The mixing of the races.", false),
		new Card("Taking a man's eyes and balls out and putting his eyes where his balls go and then his balls in the eye holes.", false),
		new Card("Scrotal frostbite.", false),
		new Card("All of this blood.", false),
		new Card("Loki, the trickster god.", false),
		new Card("Whining like a little bitch.", false),
		new Card("Pumping out a baby every nine months.", false),
		new Card("Tongue.", false),
		new Card("Finding Waldo.", false),
		new Card("Upgrading homeless people to mobile hotspots.", false),
		new Card("Wearing an octopus for a hat.", false),
		new Card("An unhinged ferris wheel rolling toward the sea.", false),
		new Card("Living in a trashcan.", false),
		new Card("The corporations.", false),
		new Card("A magic hippie love cloud.", false),
		new Card("Fuck Mountain.", false),
		new Card("Survivor's guilt.", false),
		new Card("Me.", false),
		new Card("Getting hilariously gang-banged by the Blue Man Group.", false),
		new Card("Jeff Goldblum.", false),
		new Card("Making a friend.", false),
		new Card("Beefin' over turf.", false),
		new Card("A squadron of moles wearing aviator goggles.", false),
		new Card("The mere concept of Applebee's&reg;.", false),
		new Card("A pi&ntilde;ata full of scorpions.", false),
		new Card("Pretty Pretty Princess Dress-Up Board Game&reg;.", false),
	};
	
	@Override
	public String getDeckName()
	{
		return "The Second Expansion";
	}
	
	@Override
	public String getShortDeckName()
	{
		return "Exp2";
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