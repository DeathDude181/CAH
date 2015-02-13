package org.tilegames.hexicube.cah.common.decks;

import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.Card;

public class DeckGolby extends Deck
{
	private static final Card[] callCards = new Card[]{
		new Card("Every weekend, Golby likes to _ then _ before finally _."),
		new Card("Every weekend, Golby enjoys drinking _ before getting into a fight with _ and having sex with _."),
		new Card("Connie the Condor often doesn't talk on skype because of _."),
		new Card("Jorgi the Corgi most definitely enjoys _."),
		new Card("Tom is good, but he's not _ good."),
		new Card("It's DJ Manny in the hizouse, playing _ all night long!"),
		new Card("BENCH ALL THE _."),
		new Card("_ + _ = Golby."),
		new Card("On a night out, Golby will traditionally get into a fight with a _ then have sex with a _ before complaining about a hangover from too much _."),
		new Card("You're so _____ I'll have to delete you."),
		new Card("Cindi suddenly turned into Steven after _."),
		new Card("When Barta isn't talking he's _."),
		new Card("I got a new tattoo, it looks a bit like _."),
		new Card("What strange Korean delicacy will Mark enjoy today?"),
		new Card("The OGN was fun, but there was far too much _ cosplay."),
		new Card("What are you thinking?")
	}, responseCards = new Card[]{
		new Card("Golby."),
		new Card("Benchpressing."),
		new Card("Mother's debit card."),
		new Card("Kevin Golby."),
		new Card("That Kevin Golby."),
		new Card("The Golbies: like the jitters but with a concern towards stabbings."),
		new Card("Norwegian Oil."),
		new Card("Grandiosa."),
		new Card("Drilling."),
		new Card("Barta's glorious hair."),
		new Card("BENCH ALL THE MOTHERS."),
		new Card("Taking the second and third blue buff."),
		new Card("Invisible stabwounds."),
		new Card("Lulu's double E."),
		new Card("A blurry picture."),
		new Card("The Merchant Navy."),
		new Card("Extensive research by Trygve."),
		new Card("The Trygvipedia."),
		new Card("Chak looking like Ross Kemp on a good day."),
		new Card("Manny's epic laugh."),
		new Card("Clearly jealous."),
		new Card("A very tight vest from Primark."),
		new Card("Fisting a nun."),
		new Card("Teabagging a siamese midget while benchpressing a cybernetically enhanced bear."),
		new Card("From Primark."),
		new Card("smoochy moochy."),
		new Card("A Superman tattoo."),
		new Card("Gary Glitter."),
		new Card("Blanda Upp!."),
		new Card("Hestkuk."),
		new Card("A nice guy."),
		new Card("My 6.3 KDA ratio."),
		new Card("bronze scrub."),
		new Card("Get on my level."),
		new Card("Fucking tryhard."),
		new Card("Those moments when you're bored and pucker your anus to a good beat."),
		new Card("An undetermined but significant quantity of penis."),
		new Card("The Shawk."),
		new Card("They're taking the hobbits to Isengard!"),
		new Card("Confounding jerry at every turn."),
		new Card("Build an Aegis!"),
		new Card("Wildturtle's vast range of emotions."),
		new Card("joseph gordon-Levitt wearing nothing but a kitten."),
		new Card("Barta not being sarcastic."),
		new Card("Golby's itchy testicles."),
		new Card("Surgery to move the male g-spot to the naval."),
		new Card("The Kirk vs Spock fight scene music."),
		new Card("Golby not jungling."),
		new Card("Feeling a fart pushing against your prostate."),
		new Card("I'm Batman. WHERE ARE THEY?!?"),
		new Card("Band Camp."),
		new Card("A corgi wearing a hat."),
		new Card("A corgi wearing a sailor moon outfit."),
		new Card("a corgi dressed as a viking."),
		new Card("A corgi."),
		new Card("Chak's bald spot."),
		new Card("THE HAWK!"),
		new Card("When Aunt Erma visits."),
		new Card("Jamiroquai."),
		new Card("BAWNJOURNO."),
		new Card("Black people's nostrils."),
		new Card("LOOK AT MY HORSE."),
		new Card("MY HORSE IS AMAZING."),
		new Card("XPEKE!"),
		new Card("Because Froggen did it."),
		new Card("Meowing Ride of the Valkyries during intercourse."),
		new Card("CACAW!"),
		new Card("Dryhumping."),
		new Card("Gilbert Gotfried."),
		new Card("50 Shades of Gay."),
		new Card("Maple Bourbon Bacon Jam."),
		new Card("Chak making a sandwich."),
		new Card("Jealous."),
		new Card("Frozen Heart Ashe."),
		new Card("Yorick Ult on Anivia Egg."),
		new Card("David."),
		new Card("A healthy dose of Vitamin Cock and Vitamin Dick."),
		new Card("Questioning my sexuality."),
		new Card("Tons of Damage."),
		new Card("Deman making a racist pun."),
		new Card("Phreak staring at you and never blinking."),
		new Card("PENTAFAIL!"),
		new Card("I Can't Believe It's Not Butter."),
		new Card("A Wanksock."),
		new Card("An arsehole like a wellington top."),
		new Card("Emma Watson dressed as a crab dancing to K-Pop."),
		new Card("BORK."),
		new Card("Handicapped people on Takeshi's Castle."),
		new Card("The Chuckle Brothers at their mother's funeral."),
		new Card("A cardboard cutout of Jennifer Lawrence."),
		new Card("Robert Pattinson with Freddy Mercury's moustache and Gilbert."),
		new Card("Gotfried's voice.")
	};
	
	@Override
	public String getDeckName()
	{
		return "[C] Golby Fan Club";
	}
	
	@Override
	public String getShortDeckName()
	{
		return "Golby";
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