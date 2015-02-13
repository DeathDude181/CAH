package org.tilegames.hexicube.cah.common.decks;

import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.Card;

public class DeckExpansion3 extends Deck
{
	private static final Card[] callCards = new Card[]{
		new Card("____: Hours of fun. Easy to use. Perfect for ____!", true),
		new Card("Turns out that ____-Man was neither the hero we needed nor wanted.", true),
		new Card("What left this stain on my couch?", true),
		new Card("Call the law offices of Goldstein &amp; Goldstein, because no one should have to tolerate ____ in the workplace.", true),
		new Card("A successful job interview begins with a firm handshake and ends with ____.", true),
		new Card("Lovin' you is easy 'cause you're ____.", true),
		new Card("Money can't buy me love, but it can buy me ____.", true),
		new Card("Listen, son. If you want to get involved with ____, I won't stop you. Just steer clear of ____.", true),
		new Card("During high school, I never really fit in until I found ____ club.", true),
		new Card("Hey baby, come back to my place and I'll show you ____.", true),
		new Card("To prepare for his upcoming role, Daniel Day-Lewis immersed himself in the world of ____.", true),
		new Card("Finally! A service that delivers ____ right to your door.", true),
		new Card("My gym teacher got fired for adding ____ to the obstacle course.", true),
		new Card("When you get right down to it, ____ is just ____.", true),
		new Card("As part of his daily regimen, Anderson Cooper sets aside 15 minutes for ____.", true),
		new Card("In the seventh circle of Hell, sinners must endure ____ for all eternity.", true),
		new Card("After months of practice with ____, I think I'm finally ready for ____.", true),
		new Card("The blind date was going horribly until we discovered our shared interest in ____.", true),
		new Card("____. Awesome in theory, kind of a mess in practice.", true),
		new Card("With enough time and pressure, ____ will turn into ____.", true),
		new Card("I'm not like the rest of you. I'm too rich and busy for ____.", true),
		new Card("And what did <i>you</i> bring for show and tell?", true),
		new Card("Having problems with ____? Try ____!", true),
		new Card("As part of his contract, Prince won't perform without ____ in his dressing room.", true),
		new Card("My life is ruled by a vicious cycle of ____ and ____.", true),
	}, responseCards = new Card[]{
		new Card("The primal, ball-slapping sex your parents are having right now.", false),
		new Card("A cat video so cute that your eyes roll back and your spine slides out of your anus.", false),
		new Card("Cock.", false),
		new Card("A cop who is also a dog.", false),
		new Card("Dying alone and in pain.", false),
		new Card("Gay aliens.", false),
		new Card("The way white people is.", false),
		new Card("Reverse cowgirl.", false),
		new Card("The Quesadilla Explosion Salad&trade; from Chili's&reg;.", false),
		new Card("Actually getting shot, for real.", false),
		new Card("Not having sex.", false),
		new Card("Vietnam flashbacks.", false),
		new Card("Running naked through a mall, pissing and shitting everywhere.", false),
		new Card("Nothing.", false),
		new Card("Warm, velvety muppet sex.", false),
		new Card("Self-flagellation.", false),
		new Card("The systematic destruction of an entire people and their way of life.", false),
		new Card("Samuel L. Jackson.", false),
		new Card("A boo-boo.", false),
		new Card("Going around punching people.", false),
		new Card("The entire Internet.", false),
		new Card("Some kind of bird-man.", false),
		new Card("Chugging a lava lamp.", false),
		new Card("Having sex on top of a pizza.", false),
		new Card("Indescribable loneliness.", false),
		new Card("An ass disaster.", false),
		new Card("Shutting the fuck up.", false),
		new Card("All my friends dying.", false),
		new Card("Putting an entire peanut butter and jelly sandwich into the VCR.", false),
		new Card("Spending lots of money.", false),
		new Card("Some douche with an acoustic guitar.", false),
		new Card("Flying robots that kill people.", false),
		new Card("A greased-up Matthew McConaughey.", false),
		new Card("An unstoppable wave of fire ants.", false),
		new Card("Not contributing to society in any meaningful way.", false),
		new Card("An all-midget production of Shakespeare's <i>Richard III</i>.", false),
		new Card("Screaming like a maniac.", false),
		new Card("The moist, demanding chasm of his mouth.", false),
		new Card("Filling every orifice with butterscotch pudding.", false),
		new Card("Unlimited soup, salad, and breadsticks.", false),
		new Card("Crying into the pages of Sylvia Plath.", false),
		new Card("A PowerPoint presentation.", false),
		new Card("A surprising amount of hair.", false),
		new Card("Eating Tom Selleck's mustache to gain his powers.", false),
		new Card("Roland the Farter, flatulist to the king.", false),
		new Card("That ass.", false),
		new Card("A pile of squirming bodies.", false),
		new Card("Buying the right pants to be cool.", false),
		new Card("Blood farts.", false),
		new Card("Three months in the hole.", false),
		new Card("A botched circumcision.", false),
		new Card("The Land of Chocolate.", false),
		new Card("Slapping a racist old lady.", false),
		new Card("A lamprey swimming up the toilet and latching onto your taint.", false),
		new Card("Jumping out at people.", false),
		new Card("A black male in his early 20s, last seen wearing a hoodie.", false),
		new Card("Mufasa's death scene.", false),
		new Card("Bill Clinton, naked on a bearskin rug with a saxophone.", false),
		new Card("Demonic possession.", false),
		new Card("The Harlem Globetrotters.", false),
		new Card("Vomiting mid-blowjob.", false),
		new Card("My manservant, Claude.", false),
		new Card("Having shotguns for legs.", false),
		new Card("Letting everyone down.", false),
		new Card("A spontaneous conga line.", false),
		new Card("A vagina that leads to another dimension.", false),
		new Card("Disco fever.", false),
		new Card("Getting your dick stuck in a Chinese finger trap with another dick.", false),
		new Card("Fisting.", false),
		new Card("The thin veneer of situational causality that underlies porn.", false),
		new Card("Girls that always be textin'.", false),
		new Card("Blowing some dudes in an alley.", false),
		new Card("Sneezing, farting, and coming at the same time.", false),
		new Card("Drinking ten 5-hour ENERGYs&reg; to get fifty continuous hours of energy.", false),
		new Card("Velcro&trade;.", false),
	};
	
	@Override
	public String getDeckName()
	{
		return "The Third Expansion";
	}
	
	@Override
	public String getShortDeckName()
	{
		return "Exp3";
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