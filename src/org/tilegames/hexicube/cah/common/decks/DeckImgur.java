package org.tilegames.hexicube.cah.common.decks;

import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.Card;

public class DeckImgur extends Deck
{
	private static final Card[] callCards = new Card[]{
		new Card("I always ____ ass - razor1000.", true),
		new Card("____ for temperature. ", true),
		new Card("Not asking for upvotes but ____.", true),
		new Card("I got ____ to the frontpage ", true),
		new Card("I know this is going to get downvoted to hell but ____.", true),
		new Card("I know this is a selfie but ____.", true),
		new Card("Imgur: where the points don’t matter and the ____ is made up.", true),
		new Card("If you could stop ____, that’d be greeeeattt. ", true),
		new Card("ERMAGERD! ____.", true),
		new Card("Not sure if Imgur reference or ____.", true),
		new Card("Having a bit of fun with the new ____.", true),
		new Card("Press 0 twice for ____.", true),
		new Card("No, no, you leave ____. We no like you.", true),
		new Card("FOR ____!!!!", true),
		new Card("If ____ happens because of ____, I will eat my socks.", true),
		new Card("Put that ____ back where it came from or so help me.", true),
		new Card("Yer a wizard ____", true),
		new Card("Am I the only one around here who ____?", true),
		new Card("Confession Bear: When I was 6, I ____ on my ____.", true),
		new Card("Actual Advice Mallard: Always ____.", true),
		new Card("For every upvote I will ____.", true),
		new Card("____. Awkward boner. ", true),
		new Card("____. Forever Alone.", true),
		new Card("____. TOO SAD AND TOO TINY!", true),
		new Card("I’ve never seen anyone so ____ while ____.", true),
		new Card("OH MY GOD ____. ARE YOU FUCKING KIDDING ME!?", true),
		new Card("You know nothing ____.", true),
		new Card("Most of the time you can only fit one____ in there.", true),
		new Card("That ____ tasted so bad, I needed a Jolly Rancher. ", true),
		new Card("I don’t always ____. But when I do____..", true),
		new Card("+1 for ____.", true),
		new Card("SAY GOODBYE TO____.", true),
		new Card("When I found ____ in usersubmitted, I was flabbergasted. ", true),
		new Card("France is ____", true),
		new Card("The ____ for this ____ is TOO DAMN HIGH. ", true),
		new Card("Any love for ____?", true),
		new Card("In Japan, ____ is the new sexual trend.", true),
		new Card("I love bacon as much as ____ loves ____.", true),
		new Card("A hipster needs a ____ as much as a fish needs a ____.", true),
		new Card("Justin Bieber is a ____.", true),
		new Card("Are you my ____?", true),
		new Card("Weasley is our ____.", true),
		new Card("I have a bad feeling about ____.", true),
		new Card("I am a leaf on the ____.", true),
		new Card("That was more awkward than ____.", true),
		new Card("Boardgame Online is more fun than ____.", true),
		new Card("I hate My Little Pony more than ____ hates ____.", true),
		new Card("I love My Little Pony more than ____ loves ____.", true),
		new Card("Cat gifs are cuter than ____. ", true),
		new Card("If it fits, I ____. ", true),
		new Card("____. My moon and my stars. ", true),
		new Card("A ____ always pays his debts. ", true),
		new Card("My ovaries just exploded because of ____. ", true),
		new Card("Chewie, ____ it!", true),
		new Card("Steven Moffat has no ____. ", true),
		new Card("Dobby is ____!!", true),
	}, responseCards = new Card[]{
		new Card("Ewoks.", false),
		new Card("OP Delivers.", false),
		new Card("#SOCKS.", false),
		new Card("Oh look! A cat!", false),
		new Card("I am not a clever man.", false),
		new Card("Banana.", false),
		new Card("Read me 10 for all coffee.", false),
		new Card("Juan.", false),
		new Card("Sir Patrick Stewart.", false),
		new Card("Troy and Abed.", false),
		new Card("MOON MOON.", false),
		new Card("Nathan Fillion.", false),
		new Card("Felica Day.", false),
		new Card("9.", false),
		new Card("10.", false),
		new Card("11.", false),
		new Card("BOOM! Pregnant.", false),
		new Card("Tesla.", false),
		new Card("Jon Snow.", false),
		new Card("Ass.", false),
		new Card("Theon Greyjoy’s dismembered member.", false),
		new Card("Not since the accident.", false),
		new Card("Lechuga.", false),
		new Card("Edward Macaroni Fork.", false),
		new Card("Imgurgiraffe.", false),
		new Card("ANUSTART.", false),
		new Card("This was a grave mistake.", false),
		new Card("BAZINGA!", false),
		new Card("Cousin Maeby.", false),
		new Card("STEVE HOLT.", false),
		new Card("Nevernudes.", false),
		new Card("Tard.", false),
		new Card("Potato. ", false),
		new Card("Bacon.", false),
		new Card("Erotic fiction featuring Snape and Hermione.", false),
		new Card("Sonic Screwdriver. ", false),
		new Card("Chak´s homemade maple bacon jam.", false),
		new Card("Moisturize me.", false),
		new Card("Mummy.", false),
		new Card("Expelliarmus!", false),
		new Card("Hagrid.", false),
		new Card("Buckbeak.", false),
		new Card("Luke Skywalker making out with his sister, Leia.", false),
		new Card("NobodySaysThis.", false),
		new Card("Nargles.", false),
		new Card("Annie´s boobs.", false),
		new Card("An overpriced cup of coffee.", false),
		new Card("Demonstrating how to properly put on a condom using a cucumber as substitute for a penis.", false),
		new Card("Katie the Cock Cozy.", false),
	};
	
	@Override
	public String getDeckName()
	{
		return "[C] Imgur";
	}
	
	@Override
	public String getShortDeckName()
	{
		return "Imgur";
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