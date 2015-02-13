package org.tilegames.hexicube.cah.common.decks;

import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.Card;

public class DeckGolby extends Deck
{
	private static final Card[] callCards = new Card[]{
		new Card("Every weekend, Golby likes to ____ then ____ before finally ____.", true),
		new Card("Every weekend, Golby enjoys drinking ____ before getting into a fight with ____ and having sex with ____.", true),
		new Card("Connie the Condor often doesn't talk on skype because of ____.", true),
		new Card("Jorgi the Corgi most definitely enjoys ____.", true),
		new Card("Tom is good, but he's not ____ good.", true),
		new Card("It's DJ Manny in the hizouse, playing ____ all night long!", true),
		new Card("BENCH ALL THE ____.", true),
		new Card("____ + ____ = Golby.", true),
		new Card("On a night out, Golby will traditionally get into a fight with a ____ then have sex with a ____ before complaining about a hangover from too much ____.", true),
		new Card("You're so _____ I'll have to delete you.", true),
		new Card("Cindi suddenly turned into Steven after ____.", true),
		new Card("When Barta isn't talking he's ____.", true),
		new Card("I got a new tattoo, it looks a bit like ____.", true),
		new Card("What strange Korean delicacy will Mark enjoy today?", true),
		new Card("The OGN was fun, but there was far too much ____ cosplay.", true),
		new Card("What are you thinking?", true),
	}, responseCards = new Card[]{
		new Card("Golby.", false),
		new Card("Benchpressing.", false),
		new Card("Mother's debit card.", false),
		new Card("Kevin Golby.", false),
		new Card("That Kevin Golby.", false),
		new Card("The Golbies: like the jitters but with a concern towards stabbings.", false),
		new Card("Norwegian Oil.", false),
		new Card("Grandiosa.", false),
		new Card("Drilling.", false),
		new Card("Barta's glorious hair.", false),
		new Card("BENCH ALL THE MOTHERS.", false),
		new Card("Taking the second and third blue buff.", false),
		new Card("Invisible stabwounds.", false),
		new Card("Lulu's double E.", false),
		new Card("A blurry picture.", false),
		new Card("The Merchant Navy.", false),
		new Card("Extensive research by Trygve.", false),
		new Card("The Trygvipedia.", false),
		new Card("Chak looking like Ross Kemp on a good day.", false),
		new Card("Manny's epic laugh.", false),
		new Card("Clearly jealous.", false),
		new Card("A very tight vest from Primark.", false),
		new Card("Fisting a nun.", false),
		new Card("Teabagging a siamese midget while benchpressing a cybernetically enhanced bear.", false),
		new Card("From Primark.", false),
		new Card("smoochy moochy.", false),
		new Card("A Superman tattoo.", false),
		new Card("Gary Glitter.", false),
		new Card("Blanda Upp!.", false),
		new Card("Hestkuk.", false),
		new Card("A nice guy.", false),
		new Card("My 6.3 KDA ratio.", false),
		new Card("bronze scrub.", false),
		new Card("Get on my level.", false),
		new Card("Fucking tryhard.", false),
		new Card("Those moments when you're bored and pucker your anus to a good beat.", false),
		new Card("An undetermined but significant quantity of penis.", false),
		new Card("The Shawk.", false),
		new Card("They're taking the hobbits to Isengard!", false),
		new Card("Confounding jerry at every turn.", false),
		new Card("Build an Aegis!", false),
		new Card("Wildturtle's vast range of emotions.", false),
		new Card("joseph gordon-Levitt wearing nothing but a kitten.", false),
		new Card("Barta not being sarcastic.", false),
		new Card("Golby's itchy testicles.", false),
		new Card("Surgery to move the male g-spot to the naval.", false),
		new Card("The Kirk vs Spock fight scene music.", false),
		new Card("Golby not jungling.", false),
		new Card("Feeling a fart pushing against your prostate.", false),
		new Card("I'm Batman. WHERE ARE THEY?!?", false),
		new Card("Band Camp.", false),
		new Card("A corgi wearing a hat.", false),
		new Card("A corgi wearing a sailor moon outfit.", false),
		new Card("a corgi dressed as a viking.", false),
		new Card("A corgi.", false),
		new Card("Chak's bald spot.", false),
		new Card("THE HAWK!", false),
		new Card("When Aunt Erma visits.", false),
		new Card("Jamiroquai.", false),
		new Card("BAWNJOURNO.", false),
		new Card("Black people's nostrils.", false),
		new Card("LOOK AT MY HORSE.", false),
		new Card("MY HORSE IS AMAZING.", false),
		new Card("XPEKE!", false),
		new Card("Because Froggen did it.", false),
		new Card("Meowing Ride of the Valkyries during intercourse.", false),
		new Card("CACAW!", false),
		new Card("Dryhumping.", false),
		new Card("Gilbert Gotfried.", false),
		new Card("50 Shades of Gay.", false),
		new Card("Maple Bourbon Bacon Jam.", false),
		new Card("Chak making a sandwich.", false),
		new Card("Jealous.", false),
		new Card("Frozen Heart Ashe.", false),
		new Card("Yorick Ult on Anivia Egg.", false),
		new Card("David.", false),
		new Card("A healthy dose of Vitamin Cock and Vitamin Dick.", false),
		new Card("Questioning my sexuality.", false),
		new Card("Tons of Damage.", false),
		new Card("Deman making a racist pun.", false),
		new Card("Phreak staring at you and never blinking.", false),
		new Card("PENTAFAIL!", false),
		new Card("I Can't Believe It's Not Butter.", false),
		new Card("A Wanksock.", false),
		new Card("An arsehole like a wellington top.", false),
		new Card("Emma Watson dressed as a crab dancing to K-Pop.", false),
		new Card("BORK.", false),
		new Card("Handicapped people on Takeshi's Castle.", false),
		new Card("The Chuckle Brothers at their mother's funeral.", false),
		new Card("A cardboard cutout of Jennifer Lawrence.", false),
		new Card("Robert Pattinson with Freddy Mercury's moustache and Gilbert.", false),
		new Card("Gotfried's voice.", false),
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