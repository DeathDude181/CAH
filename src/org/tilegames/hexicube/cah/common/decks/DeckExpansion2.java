package org.tilegames.hexicube.cah.common.decks;

import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.Card;

public class DeckExpansion2 extends Deck
{
	private static final Card[] callCards = new Card[]{
		new Card("During his midlife crisis, my dad got really into _."),
		new Card("_ would be woefully incomplete without _."),
		new Card("My new favorite porn star is Joey "),
		new Card("Before I run for president, I must destroy all evidence of my involvement with _."),
		new Card("This is your captain speaking. Fasten your seatbelts and prepare for _."),
		new Card("In his newest and most difficult stunt, David Blaine must escape from _."),
		new Card("The Five Stages of Grief: denial, anger, bargaining, _, acceptance."),
		new Card("My mom freaked out when she looked at my browser history and found _.com/_."),
		new Card("I went from _ to _, all thanks to _."),
		new Card("Members of New York's social elite are paying thousands of dollars just to experience _."),
		new Card("This month's Cosmo: 'Spice up your sex life by bringing _ into the bedroom.'"),
		new Card("Little Miss Muffet Sat on a tuffet, Eating her curds and _."),
		new Card("If God didn't want us to enjoy _, he wouldn't have given us _."),
		new Card("My country, 'tis of thee, sweet land of _."),
		new Card("After months of debate, the Occupy Wall Street General Assembly could only agree on 'More _!'"),
		new Card("I spent my whole life working toward _, only to have it ruined by _."),
		new Card("Next time on Dr. Phil: How to talk to your child about _."),
		new Card("Only two things in life are certain: death and _."),
		new Card("Everyone down on the ground! We don't want to hurt anyone. We're just here for _."),
		new Card("The healing process began when I joined a support group for victims of _."),
		new Card("The votes are in, and the new high school mascot is _."),
		new Card("Charades was ruined for me forever when my mom had to act out _."),
		new Card("Before _, all we had was _."),
		new Card("Tonight on 20/20: What you don't know about _ could kill you."),
		new Card("You haven't truly lived until you've experienced _ and _ at the same time.")
	}, responseCards = new Card[]{
		new Card("A soulful rendition of "),
		new Card("Intimacy problems."),
		new Card("A sweaty, panting leather daddy."),
		new Card("Spring break!"),
		new Card("Being awesome at sex."),
		new Card("Dining with cardboard cutouts of the cast of 'Friends.'"),
		new Card("Another shot of morphine."),
		new Card("Bullshit."),
		new Card("The Google."),
		new Card("The new Radiohead album."),
		new Card("An army of skeletons."),
		new Card("A man in yoga pants with a ponytail and feather earrings."),
		new Card("Mild autism."),
		new Card("Nunchuck moves."),
		new Card("Whipping a disobedient slave."),
		new Card("An ether-soaked rag."),
		new Card("A sweet spaceship."),
		new Card("A 55-gallon drum of lube."),
		new Card("Special musical guest, Cher."),
		new Card("The human body."),
		new Card("Boris the Soviet Love Hammer."),
		new Card("The grey nutrient broth that sustains Mitt Romney."),
		new Card("Tiny nipples."),
		new Card("Power."),
		new Card("Oncoming traffic."),
		new Card("A dollop of sour cream."),
		new Card("A slightly shittier parallel universe."),
		new Card("My first kill."),
		new Card("Graphic violence, adult language, and some sexual content."),
		new Card("Fetal alcohol syndrome."),
		new Card("The day the birds attacked."),
		new Card("One Ring to rule them all."),
		new Card("Grandpa's ashes."),
		new Card("Basic human decency."),
		new Card("A Burmese tiger pit."),
		new Card("Death by Steven Seagal."),
		new Card("A bigger, blacker dick."),
		new Card("A sad fat dragon with no friends."),
		new Card("Catastrophic urethral trauma."),
		new Card("Hillary Clinton's death stare."),
		new Card("Existing."),
		new Card("Mooing."),
		new Card("Swiftly achieving orgasm."),
		new Card("Daddy's belt."),
		new Card("Double penetration."),
		new Card("Weapons-grade plutonium."),
		new Card("Some really fucked-up shit."),
		new Card("Subduing a grizzly bear and making her your wife."),
		new Card("Rising from the grave."),
		new Card("The mixing of the races."),
		new Card("Taking a man's eyes and balls out and putting his eyes where his balls go and then his balls in the eye holes."),
		new Card("Scrotal frostbite."),
		new Card("All of this blood."),
		new Card("Loki, the trickster god."),
		new Card("Whining like a little bitch."),
		new Card("Pumping out a baby every nine months."),
		new Card("Tongue."),
		new Card("Finding Waldo."),
		new Card("Upgrading homeless people to mobile hotspots."),
		new Card("Wearing an octopus for a hat."),
		new Card("An unhinged ferris wheel rolling toward the sea."),
		new Card("Living in a trashcan."),
		new Card("The corporations."),
		new Card("A magic hippie love cloud."),
		new Card("Fuck Mountain."),
		new Card("Survivor's guilt."),
		new Card("Me."),
		new Card("Getting hilariously gang-banged by the Blue Man Group."),
		new Card("Jeff Goldblum."),
		new Card("Making a friend."),
		new Card("Beefin' over turf."),
		new Card("A squadron of moles wearing aviator goggles."),
		new Card("The mere concept of Applebee's&reg;."),
		new Card("A pi&ntilde;ata full of scorpions."),
		new Card("Pretty Pretty Princess Dress-Up Board Game&reg;.")
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