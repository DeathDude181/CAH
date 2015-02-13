package org.tilegames.hexicube.cah.common.decks;

import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.Card;

public class DeckMrManCollection extends Deck
{
	private static final Card[] callCards = new Card[]{
		new Card("Scientists have reverse engineered alien technology that unlocks the secrets of _."),
		new Card("It is often argued that our ancestors would have never evolved without the aid of _."),
		new Card("The 1930's is often regarded as the golden age of _."),
		new Card("_ a day keeps _ away."),
		new Card("There is a time for peace, a time for war, and a time for _."),
		new Card("If a pot of gold is at one end of the rainbow, what is at the other?"),
		new Card("A fortune teller told me I will live a life filled with _."),
		new Card("I work out so I can look good when I'm _."),
		new Card("Genius is 10% inspiration and 90% _."),
		new Card("I will not eat them Sam-I-Am. I will not eat _."),
		new Card("What's the time? _ time!"),
		new Card("Disney presents _, on ice!"),
		new Card("Though Thomas Edison invented the lightbulb, he is also known for giving us _."),
		new Card("Little Miss. Muffet sat on her tuffet, eating her _ and _."),
		new Card("I qualify for this job because I have several years experience in the field of _."),
		new Card("We just adopted _ from the pound."),
		new Card("It was the happiest day of my life when I became the proud parent of _."),
		new Card("With a million times the destructive force of all our nuclear weapons combined, no one was able to survive _."),
		new Card("You have been found guilty of 5 counts of _, and 13 counts of _."),
		new Card("Pay no attention to _ behind the curtain!"),
		new Card("Mama always said life was like _."),
		new Card("Who could have guessed that the alien invasion would be easily thwarted by _."),
		new Card("With the Democrats and Republicans in a dead heat, the election was snatched by the _ party.")
	}, responseCards = new Card[]{
		new Card("Pooping in the bathtub."),
		new Card("Bathing the homeless."),
		new Card("An awkward sponge bath."),
		new Card("Enemas."),
		new Card("Putting the fucking lotion in the basket."),
		new Card("The tears of a clown."),
		new Card("Gangrene."),
		new Card("Gingivitis."),
		new Card("Two dogs humping."),
		new Card("Suppositories."),
		new Card("Face painting."),
		new Card("A prolapse."),
		new Card("Digital piracy."),
		new Card("A poop sandwich."),
		new Card("Executive parking."),
		new Card("A chatroom predator."),
		new Card("A loud mouth-breather."),
		new Card("Anorexia."),
		new Card("Gobots."),
		new Card("A Motown group."),
		new Card("a classy smoking jacket."),
		new Card("Giant areolas."),
		new Card("A sexy senior citizen."),
		new Card("A stuttering auctioneer."),
		new Card("Farting into a fancy handkerchief."),
		new Card("Lot lizards."),
		new Card("A LARPing sleeper cell."),
		new Card("A cockblocker."),
		new Card("Public schooling."),
		new Card("Dickjitsu."),
		new Card("A mushy tushy."),
		new Card("Geriatric diaper rash."),
		new Card("Bigfoot."),
		new Card("A limp wrist."),
		new Card("An angry leprechaun."),
		new Card("The Tin Man."),
		new Card("Giving yourself a stranger."),
		new Card("Shitting into someone's hat for revenge."),
		new Card("Learning hypnosis to get laid."),
		new Card("The War of Northern Aggression."),
		new Card("A snot rocket."),
		new Card("Sailor Moon."),
		new Card("Mass graves."),
		new Card("A victim."),
		new Card("Soiling ones self."),
		new Card("A clone army."),
		new Card("Raw sewage."),
		new Card("War crimes."),
		new Card("A collapsed lung."),
		new Card("The face of pure evil."),
		new Card("Spontaneous pie fights."),
		new Card("Being screamed at in German."),
		new Card("A lesson in pain."),
		new Card("Sausage."),
		new Card("A compound fracture."),
		new Card("The magical land of Oz."),
		new Card("Pow-Pow-PowerWheeels&reg;!"),
		new Card("Cheating death."),
		new Card("Clown Shoes."),
		new Card("Clown college."),
		new Card("A lousy comb-over."),
		new Card("Chaz Bono."),
		new Card("Hoarders."),
		new Card("A closed casket funeral."),
		new Card("A really ugly baby."),
		new Card("Elder abuse."),
		new Card("Drunkenly texting an ex.")
	};
	
	@Override
	public String getDeckName()
	{
		return "[C] Mr. Man Collection";
	}
	
	@Override
	public String getShortDeckName()
	{
		return "MrMan";
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