package org.tilegames.hexicube.cah.common.decks;

import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.Card;

public class DeckExpansion1 extends Deck
{
	private static final Card[] callCards = new Card[]{
		new Card("He who controls ____ controls the world.", true),
		new Card("The CIA now interrogates enemy agents by repeatedly subjecting them to ____.", true),
		new Card("Dear Sir or Madam, We regret to inform you that the Office of ____ has denied your request for ____.", true),
		new Card("In Rome, there are whisperings that the Vatican has a secret room devoted to ____.", true),
		new Card("Science will never explain the origin of ____.", true),
		new Card("When all else fails, I can always masturbate to ____.", true),
		new Card("I learned the hard way that you can't cheer up a grieving friend with ____.", true),
		new Card("In its new tourism campaign, Detroit proudly proclaims that it has finally eliminated ____.", true),
		new Card("An international tribunal has found ____ guilty of ____.", true),
		new Card("The socialist governments of Scandinavia have declared that access to ____ is a basic human right.", true),
		new Card("In his new self-produced album, Kanye West raps over the sounds of ____.", true),
		new Card("What's the gift that keeps on giving?", true),
		new Card("This season on Man vs. Wild, Bear Grylls must survive in the depths of the Amazon with only ____ and his wits.", true),
		new Card("When I pooped, what came out of my butt?", true),
		new Card("In the distant future, historians will agree that ____ marked the beginning of America's decline.", true),
		new Card("In a pinch, ____ can be a suitable substitute for ____.", true),
		new Card("What has been making life difficult at the nudist colony?", true),
		new Card("Michael Bay's new three-hour action epic pits ____ against ____.", true),
		new Card("And I would have gotten away with it, too, if it hadn't been for ____!", true),
		new Card("What brought the orgy to a grinding halt?", true),
	}, responseCards = new Card[]{
		new Card("Leveling up.", false),
		new Card("Literally eating shit.", false),
		new Card("Making the penises kiss.", false),
		new Card("Media coverage.", false),
		new Card("Moral ambiguity.", false),
		new Card("My machete.", false),
		new Card("One thousand Slim Jims.", false),
		new Card("Ominous background music.", false),
		new Card("Overpowering your father.", false),
		new Card("Pistol-whipping a hostage.", false),
		new Card("Quiche.", false),
		new Card("Quivering jowls.", false),
		new Card("Revenge fucking.", false),
		new Card("Ripping into a man's chest and pulling out his still-beating heart.", false),
		new Card("Ryan Gosling riding in on a white horse.", false),
		new Card("Santa Claus.", false),
		new Card("Scrotum tickling.", false),
		new Card("Sexual humiliation.", false),
		new Card("Sexy Siamese twins.", false),
		new Card("Slow motion.", false),
		new Card("Space muffins.", false),
		new Card("Statistically validated stereotypes.", false),
		new Card("Sudden Poop Explosion Disease.", false),
		new Card("The boners of the elderly.", false),
		new Card("The economy.", false),
		new Card("The Gulags.", false),
		new Card("The harsh light of day.", false),
		new Card("The hiccups.", false),
		new Card("The shambling corpse of Larry King.", false),
		new Card("The four arms of Vishnu.", false),
		new Card("Being a busy adult with many important things to do.", false),
		new Card("Tripping balls.", false),
		new Card("Words, words, words.", false),
		new Card("Zeus's sexual appetites.", false),
		new Card("A big black dick.", false),
		new Card("A beached whale.", false),
		new Card("A bloody pacifier.", false),
		new Card("A crappy little hand.", false),
		new Card("A low standard of living.", false),
		new Card("A nuanced critique.", false),
		new Card("Panty raids.", false),
		new Card("A passionate Latino lover.", false),
		new Card("A rival dojo.", false),
		new Card("A web of lies.", false),
		new Card("A woman scorned.", false),
		new Card("Apologizing.", false),
		new Card("Appreciative snapping.", false),
		new Card("Neil Patrick Harris.", false),
		new Card("Beating your wives.", false),
		new Card("Being a dinosaur.", false),
		new Card("Shaft.", false),
		new Card("Clams.", false),
		new Card("Bosnian chicken farmers.", false),
		new Card("Nubile slave boys.", false),
		new Card("Carnies.", false),
		new Card("Coughing into a vagina.", false),
		new Card("Suicidal thoughts.", false),
		new Card("Dancing with a broom.", false),
		new Card("Deflowering the princess.", false),
		new Card("Dorito breath.", false),
		new Card("Eating an albino.", false),
		new Card("Enormous Scandinavian women.", false),
		new Card("Fabricating statistics.", false),
		new Card("Finding a skeleton.", false),
		new Card("Gandalf.", false),
		new Card("Genetically engineered super-soldiers.", false),
		new Card("George Clooney's musk.", false),
		new Card("Getting abducted by Peter Pan.", false),
		new Card("Getting in her pants, politely.", false),
		new Card("Gladiatorial combat.", false),
		new Card("Good grammar.", false),
		new Card("Hipsters.", false),
		new Card("Historical revisionism.", false),
		new Card("Insatiable bloodlust.", false),
		new Card("Jafar.", false),
		new Card("Jean-Claude Van Damme.", false),
		new Card("Just the tip.", false),
		new Card("Mad hacky-sack skills.", false),
		new Card("Medieval Times&reg; Dinner &amp; Tournament.", false),
		new Card("The Fanta&reg; girls.", false),
	};
	
	@Override
	public String getDeckName()
	{
		return "The First Expansion";
	}
	
	@Override
	public String getShortDeckName()
	{
		return "Exp1";
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