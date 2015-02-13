package org.tilegames.hexicube.cah.common.decks;

import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.Card;

public class DeckImgur extends Deck
{
	private static final Card[] callCards = new Card[]{
		new Card("I always _ ass - razor1000."),
		new Card("_ for temperature. "),
		new Card("Not asking for upvotes but _."),
		new Card("I got _ to the frontpage "),
		new Card("I know this is going to get downvoted to hell but _."),
		new Card("I know this is a selfie but _."),
		new Card("Imgur: where the points don’t matter and the _ is made up."),
		new Card("If you could stop _, that’d be greeeeattt. "),
		new Card("ERMAGERD! _."),
		new Card("Not sure if Imgur reference or _."),
		new Card("Having a bit of fun with the new _."),
		new Card("Press 0 twice for _."),
		new Card("No, no, you leave _. We no like you."),
		new Card("FOR _!!!!"),
		new Card("If _ happens because of _, I will eat my socks."),
		new Card("Put that _ back where it came from or so help me."),
		new Card("Yer a wizard _"),
		new Card("Am I the only one around here who _?"),
		new Card("Confession Bear: When I was 6, I _ on my _."),
		new Card("Actual Advice Mallard: Always _."),
		new Card("For every upvote I will _."),
		new Card("_. Awkward boner. "),
		new Card("_. Forever Alone."),
		new Card("_. TOO SAD AND TOO TINY!"),
		new Card("I’ve never seen anyone so _ while _."),
		new Card("OH MY GOD _. ARE YOU FUCKING KIDDING ME!?"),
		new Card("You know nothing _."),
		new Card("Most of the time you can only fit one____ in there."),
		new Card("That _ tasted so bad, I needed a Jolly Rancher. "),
		new Card("I don’t always _. But when I do____.."),
		new Card("+1 for _."),
		new Card("SAY GOODBYE TO____."),
		new Card("When I found _ in usersubmitted, I was flabbergasted. "),
		new Card("France is _"),
		new Card("The _ for this _ is TOO DAMN HIGH. "),
		new Card("Any love for _?"),
		new Card("In Japan, _ is the new sexual trend."),
		new Card("I love bacon as much as _ loves _."),
		new Card("A hipster needs a _ as much as a fish needs a _."),
		new Card("Justin Bieber is a _."),
		new Card("Are you my _?"),
		new Card("Weasley is our _."),
		new Card("I have a bad feeling about _."),
		new Card("I am a leaf on the _."),
		new Card("That was more awkward than _."),
		new Card("Boardgame Online is more fun than _."),
		new Card("I hate My Little Pony more than _ hates _."),
		new Card("I love My Little Pony more than _ loves _."),
		new Card("Cat gifs are cuter than _. "),
		new Card("If it fits, I _. "),
		new Card("_. My moon and my stars. "),
		new Card("A _ always pays his debts. "),
		new Card("My ovaries just exploded because of _. "),
		new Card("Chewie, _ it!"),
		new Card("Steven Moffat has no _. "),
		new Card("Dobby is _!!")
	}, responseCards = new Card[]{
		new Card("Ewoks."),
		new Card("OP Delivers."),
		new Card("#SOCKS."),
		new Card("Oh look! A cat!"),
		new Card("I am not a clever man."),
		new Card("Banana."),
		new Card("Read me 10 for all coffee."),
		new Card("Juan."),
		new Card("Sir Patrick Stewart."),
		new Card("Troy and Abed."),
		new Card("MOON MOON."),
		new Card("Nathan Fillion."),
		new Card("Felica Day."),
		new Card("9."),
		new Card("10."),
		new Card("11."),
		new Card("BOOM! Pregnant."),
		new Card("Tesla."),
		new Card("Jon Snow."),
		new Card("Ass."),
		new Card("Theon Greyjoy’s dismembered member."),
		new Card("Not since the accident."),
		new Card("Lechuga."),
		new Card("Edward Macaroni Fork."),
		new Card("Imgurgiraffe."),
		new Card("ANUSTART."),
		new Card("This was a grave mistake."),
		new Card("BAZINGA!"),
		new Card("Cousin Maeby."),
		new Card("STEVE HOLT."),
		new Card("Nevernudes."),
		new Card("Tard."),
		new Card("Potato. "),
		new Card("Bacon."),
		new Card("Erotic fiction featuring Snape and Hermione."),
		new Card("Sonic Screwdriver. "),
		new Card("Chak´s homemade maple bacon jam."),
		new Card("Moisturize me."),
		new Card("Mummy."),
		new Card("Expelliarmus!"),
		new Card("Hagrid."),
		new Card("Buckbeak."),
		new Card("Luke Skywalker making out with his sister, Leia."),
		new Card("NobodySaysThis."),
		new Card("Nargles."),
		new Card("Annie´s boobs."),
		new Card("An overpriced cup of coffee."),
		new Card("Demonstrating how to properly put on a condom using a cucumber as substitute for a penis."),
		new Card("Katie the Cock Cozy.")
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