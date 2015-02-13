package org.tilegames.hexicube.cah.common.decks;

import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.Card;

public class DeckMrManCollection extends Deck
{
	private static final Card[] callCards = new Card[]{
		new Card("Scientists have reverse engineered alien technology that unlocks the secrets of ____.", true),
		new Card("It is often argued that our ancestors would have never evolved without the aid of ____.", true),
		new Card("The 1930's is often regarded as the golden age of ____.", true),
		new Card("____ a day keeps ____ away.", true),
		new Card("There is a time for peace, a time for war, and a time for ____.", true),
		new Card("If a pot of gold is at one end of the rainbow, what is at the other?", true),
		new Card("A fortune teller told me I will live a life filled with ____.", true),
		new Card("I work out so I can look good when I'm ____.", true),
		new Card("Genius is 10% inspiration and 90% ____.", true),
		new Card("I will not eat them Sam-I-Am. I will not eat ____.", true),
		new Card("What's the time? ____ time!", true),
		new Card("Disney presents ____, on ice!", true),
		new Card("Though Thomas Edison invented the lightbulb, he is also known for giving us ____.", true),
		new Card("Little Miss. Muffet sat on her tuffet, eating her ____ and ____.", true),
		new Card("I qualify for this job because I have several years experience in the field of ____.", true),
		new Card("We just adopted ____ from the pound.", true),
		new Card("It was the happiest day of my life when I became the proud parent of ____.", true),
		new Card("With a million times the destructive force of all our nuclear weapons combined, no one was able to survive ____.", true),
		new Card("You have been found guilty of 5 counts of ____, and 13 counts of ____.", true),
		new Card("Pay no attention to ____ behind the curtain!", true),
		new Card("Mama always said life was like ____.", true),
		new Card("Who could have guessed that the alien invasion would be easily thwarted by ____.", true),
		new Card("With the Democrats and Republicans in a dead heat, the election was snatched by the ____ party.", true),
	}, responseCards = new Card[]{
		new Card("Pooping in the bathtub.", false),
		new Card("Bathing the homeless.", false),
		new Card("An awkward sponge bath.", false),
		new Card("Enemas.", false),
		new Card("Putting the fucking lotion in the basket.", false),
		new Card("The tears of a clown.", false),
		new Card("Gangrene.", false),
		new Card("Gingivitis.", false),
		new Card("Two dogs humping.", false),
		new Card("Suppositories.", false),
		new Card("Face painting.", false),
		new Card("A prolapse.", false),
		new Card("Digital piracy.", false),
		new Card("A poop sandwich.", false),
		new Card("Executive parking.", false),
		new Card("A chatroom predator.", false),
		new Card("A loud mouth-breather.", false),
		new Card("Anorexia.", false),
		new Card("Gobots.", false),
		new Card("A Motown group.", false),
		new Card("a classy smoking jacket.", false),
		new Card("Giant areolas.", false),
		new Card("A sexy senior citizen.", false),
		new Card("A stuttering auctioneer.", false),
		new Card("Farting into a fancy handkerchief.", false),
		new Card("Lot lizards.", false),
		new Card("A LARPing sleeper cell.", false),
		new Card("A cockblocker.", false),
		new Card("Public schooling.", false),
		new Card("Dickjitsu.", false),
		new Card("A mushy tushy.", false),
		new Card("Geriatric diaper rash.", false),
		new Card("Bigfoot.", false),
		new Card("A limp wrist.", false),
		new Card("An angry leprechaun.", false),
		new Card("The Tin Man.", false),
		new Card("Giving yourself a stranger.", false),
		new Card("Shitting into someone's hat for revenge.", false),
		new Card("Learning hypnosis to get laid.", false),
		new Card("The War of Northern Aggression.", false),
		new Card("A snot rocket.", false),
		new Card("Sailor Moon.", false),
		new Card("Mass graves.", false),
		new Card("A victim.", false),
		new Card("Soiling ones self.", false),
		new Card("A clone army.", false),
		new Card("Raw sewage.", false),
		new Card("War crimes.", false),
		new Card("A collapsed lung.", false),
		new Card("The face of pure evil.", false),
		new Card("Spontaneous pie fights.", false),
		new Card("Being screamed at in German.", false),
		new Card("A lesson in pain.", false),
		new Card("Sausage.", false),
		new Card("A compound fracture.", false),
		new Card("The magical land of Oz.", false),
		new Card("Pow-Pow-PowerWheeels&reg;!", false),
		new Card("Cheating death.", false),
		new Card("Clown Shoes.", false),
		new Card("Clown college.", false),
		new Card("A lousy comb-over.", false),
		new Card("Chaz Bono.", false),
		new Card("Hoarders.", false),
		new Card("A closed casket funeral.", false),
		new Card("A really ugly baby.", false),
		new Card("Elder abuse.", false),
		new Card("Drunkenly texting an ex.", false),
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