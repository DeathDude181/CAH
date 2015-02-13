package org.tilegames.hexicube.cah.common.decks;

import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.Card;

public class DeckExpansion3 extends Deck
{
	private static final Card[] callCards = new Card[]{
		new Card("_: Hours of fun. Easy to use. Perfect for _!"),
		new Card("Turns out that _-Man was neither the hero we needed nor wanted."),
		new Card("What left this stain on my couch?"),
		new Card("Call the law offices of Goldstein &amp; Goldstein, because no one should have to tolerate _ in the workplace."),
		new Card("A successful job interview begins with a firm handshake and ends with _."),
		new Card("Lovin' you is easy 'cause you're _."),
		new Card("Money can't buy me love, but it can buy me _."),
		new Card("Listen, son. If you want to get involved with _, I won't stop you. Just steer clear of _."),
		new Card("During high school, I never really fit in until I found _ club."),
		new Card("Hey baby, come back to my place and I'll show you _."),
		new Card("To prepare for his upcoming role, Daniel Day-Lewis immersed himself in the world of _."),
		new Card("Finally! A service that delivers _ right to your door."),
		new Card("My gym teacher got fired for adding _ to the obstacle course."),
		new Card("When you get right down to it, _ is just _."),
		new Card("As part of his daily regimen, Anderson Cooper sets aside 15 minutes for _."),
		new Card("In the seventh circle of Hell, sinners must endure _ for all eternity."),
		new Card("After months of practice with _, I think I'm finally ready for _."),
		new Card("The blind date was going horribly until we discovered our shared interest in _."),
		new Card("_. Awesome in theory, kind of a mess in practice."),
		new Card("With enough time and pressure, _ will turn into _."),
		new Card("I'm not like the rest of you. I'm too rich and busy for _."),
		new Card("And what did <i>you</i> bring for show and tell?"),
		new Card("Having problems with _? Try _!"),
		new Card("As part of his contract, Prince won't perform without _ in his dressing room."),
		new Card("My life is ruled by a vicious cycle of _ and _.")
	}, responseCards = new Card[]{
		new Card("The primal, ball-slapping sex your parents are having right now."),
		new Card("A cat video so cute that your eyes roll back and your spine slides out of your anus."),
		new Card("Cock."),
		new Card("A cop who is also a dog."),
		new Card("Dying alone and in pain."),
		new Card("Gay aliens."),
		new Card("The way white people is."),
		new Card("Reverse cowgirl."),
		new Card("The Quesadilla Explosion Salad&trade; from Chili's&reg;."),
		new Card("Actually getting shot, for real."),
		new Card("Not having sex."),
		new Card("Vietnam flashbacks."),
		new Card("Running naked through a mall, pissing and shitting everywhere."),
		new Card("Nothing."),
		new Card("Warm, velvety muppet sex."),
		new Card("Self-flagellation."),
		new Card("The systematic destruction of an entire people and their way of life."),
		new Card("Samuel L. Jackson."),
		new Card("A boo-boo."),
		new Card("Going around punching people."),
		new Card("The entire Internet."),
		new Card("Some kind of bird-man."),
		new Card("Chugging a lava lamp."),
		new Card("Having sex on top of a pizza."),
		new Card("Indescribable loneliness."),
		new Card("An ass disaster."),
		new Card("Shutting the fuck up."),
		new Card("All my friends dying."),
		new Card("Putting an entire peanut butter and jelly sandwich into the VCR."),
		new Card("Spending lots of money."),
		new Card("Some douche with an acoustic guitar."),
		new Card("Flying robots that kill people."),
		new Card("A greased-up Matthew McConaughey."),
		new Card("An unstoppable wave of fire ants."),
		new Card("Not contributing to society in any meaningful way."),
		new Card("An all-midget production of Shakespeare's <i>Richard III</i>."),
		new Card("Screaming like a maniac."),
		new Card("The moist, demanding chasm of his mouth."),
		new Card("Filling every orifice with butterscotch pudding."),
		new Card("Unlimited soup, salad, and breadsticks."),
		new Card("Crying into the pages of Sylvia Plath."),
		new Card("A PowerPoint presentation."),
		new Card("A surprising amount of hair."),
		new Card("Eating Tom Selleck's mustache to gain his powers."),
		new Card("Roland the Farter, flatulist to the king."),
		new Card("That ass."),
		new Card("A pile of squirming bodies."),
		new Card("Buying the right pants to be cool."),
		new Card("Blood farts."),
		new Card("Three months in the hole."),
		new Card("A botched circumcision."),
		new Card("The Land of Chocolate."),
		new Card("Slapping a racist old lady."),
		new Card("A lamprey swimming up the toilet and latching onto your taint."),
		new Card("Jumping out at people."),
		new Card("A black male in his early 20s, last seen wearing a hoodie."),
		new Card("Mufasa's death scene."),
		new Card("Bill Clinton, naked on a bearskin rug with a saxophone."),
		new Card("Demonic possession."),
		new Card("The Harlem Globetrotters."),
		new Card("Vomiting mid-blowjob."),
		new Card("My manservant, Claude."),
		new Card("Having shotguns for legs."),
		new Card("Letting everyone down."),
		new Card("A spontaneous conga line."),
		new Card("A vagina that leads to another dimension."),
		new Card("Disco fever."),
		new Card("Getting your dick stuck in a Chinese finger trap with another dick."),
		new Card("Fisting."),
		new Card("The thin veneer of situational causality that underlies porn."),
		new Card("Girls that always be textin'."),
		new Card("Blowing some dudes in an alley."),
		new Card("Sneezing, farting, and coming at the same time."),
		new Card("Drinking ten 5-hour ENERGYs&reg; to get fifty continuous hours of energy."),
		new Card("Velcro&trade;.")
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