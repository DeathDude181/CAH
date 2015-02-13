package org.tilegames.hexicube.cah.common.decks;

import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.Card;

public class DeckExpansion1 extends Deck
{
	private static final Card[] callCards = new Card[]{
		new Card("He who controls _ controls the world."),
		new Card("The CIA now interrogates enemy agents by repeatedly subjecting them to _."),
		new Card("Dear Sir or Madam, We regret to inform you that the Office of _ has denied your request for _."),
		new Card("In Rome, there are whisperings that the Vatican has a secret room devoted to _."),
		new Card("Science will never explain the origin of _."),
		new Card("When all else fails, I can always masturbate to _."),
		new Card("I learned the hard way that you can't cheer up a grieving friend with _."),
		new Card("In its new tourism campaign, Detroit proudly proclaims that it has finally eliminated _."),
		new Card("An international tribunal has found _ guilty of _."),
		new Card("The socialist governments of Scandinavia have declared that access to _ is a basic human right."),
		new Card("In his new self-produced album, Kanye West raps over the sounds of _."),
		new Card("What's the gift that keeps on giving?"),
		new Card("This season on Man vs. Wild, Bear Grylls must survive in the depths of the Amazon with only _ and his wits."),
		new Card("When I pooped, what came out of my butt?"),
		new Card("In the distant future, historians will agree that _ marked the beginning of America's decline."),
		new Card("In a pinch, _ can be a suitable substitute for _."),
		new Card("What has been making life difficult at the nudist colony?"),
		new Card("Michael Bay's new three-hour action epic pits _ against _."),
		new Card("And I would have gotten away with it, too, if it hadn't been for _!"),
		new Card("What brought the orgy to a grinding halt?")
	}, responseCards = new Card[]{
		new Card("Leveling up."),
		new Card("Literally eating shit."),
		new Card("Making the penises kiss."),
		new Card("Media coverage."),
		new Card("Moral ambiguity."),
		new Card("My machete."),
		new Card("One thousand Slim Jims."),
		new Card("Ominous background music."),
		new Card("Overpowering your father."),
		new Card("Pistol-whipping a hostage."),
		new Card("Quiche."),
		new Card("Quivering jowls."),
		new Card("Revenge fucking."),
		new Card("Ripping into a man's chest and pulling out his still-beating heart."),
		new Card("Ryan Gosling riding in on a white horse."),
		new Card("Santa Claus."),
		new Card("Scrotum tickling."),
		new Card("Sexual humiliation."),
		new Card("Sexy Siamese twins."),
		new Card("Slow motion."),
		new Card("Space muffins."),
		new Card("Statistically validated stereotypes."),
		new Card("Sudden Poop Explosion Disease."),
		new Card("The boners of the elderly."),
		new Card("The economy."),
		new Card("The Gulags."),
		new Card("The harsh light of day."),
		new Card("The hiccups."),
		new Card("The shambling corpse of Larry King."),
		new Card("The four arms of Vishnu."),
		new Card("Being a busy adult with many important things to do."),
		new Card("Tripping balls."),
		new Card("Words, words, words."),
		new Card("Zeus's sexual appetites."),
		new Card("A big black dick."),
		new Card("A beached whale."),
		new Card("A bloody pacifier."),
		new Card("A crappy little hand."),
		new Card("A low standard of living."),
		new Card("A nuanced critique."),
		new Card("Panty raids."),
		new Card("A passionate Latino lover."),
		new Card("A rival dojo."),
		new Card("A web of lies."),
		new Card("A woman scorned."),
		new Card("Apologizing."),
		new Card("Appreciative snapping."),
		new Card("Neil Patrick Harris."),
		new Card("Beating your wives."),
		new Card("Being a dinosaur."),
		new Card("Shaft."),
		new Card("Clams."),
		new Card("Bosnian chicken farmers."),
		new Card("Nubile slave boys."),
		new Card("Carnies."),
		new Card("Coughing into a vagina."),
		new Card("Suicidal thoughts."),
		new Card("Dancing with a broom."),
		new Card("Deflowering the princess."),
		new Card("Dorito breath."),
		new Card("Eating an albino."),
		new Card("Enormous Scandinavian women."),
		new Card("Fabricating statistics."),
		new Card("Finding a skeleton."),
		new Card("Gandalf."),
		new Card("Genetically engineered super-soldiers."),
		new Card("George Clooney's musk."),
		new Card("Getting abducted by Peter Pan."),
		new Card("Getting in her pants, politely."),
		new Card("Gladiatorial combat."),
		new Card("Good grammar."),
		new Card("Hipsters."),
		new Card("Historical revisionism."),
		new Card("Insatiable bloodlust."),
		new Card("Jafar."),
		new Card("Jean-Claude Van Damme."),
		new Card("Just the tip."),
		new Card("Mad hacky-sack skills."),
		new Card("Medieval Times&reg; Dinner &amp; Tournament."),
		new Card("The Fanta&reg; girls.")
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