package org.tilegames.hexicube.cah.common.decks;

import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.Card;

public class DeckEquinity extends Deck
{
	private static final Card[] callCards = new Card[]{
		new Card("And that's how Equestria was made!", true),
		new Card("Big Mac sleeps soundly whenever ____ is with him.", true),
		new Card("____ has won the national Equestrian award for ____.", true),
		new Card("____ is best pony.", true),
		new Card("____ should ____ ____.", true),
		new Card("____? That's future Spike's problem.", true),
		new Card("After a wild night of crusading, Applebloom learned that ____ was her super special talent.", true),
		new Card("After a wild night of partying, Fluttershy awakens to find ____ in her bed.", true),
		new Card("After living for thousands of years Celestia can only find pleasure in ____.", true),
		new Card("Aloe and Lotus have been experimenting with a radical treatment that utilizes the therapeutic properties of ____.", true),
		new Card("BUY SOME ____!", true),
		new Card("CUTIE MARK CRUSADERS; ____! YAY!", true),
		new Card("Daring Do and the quest for ____.", true),
		new Card("Dear Princess Celestia, Today I learned about ____. ", true),
		new Card("Despite everypony's expectations, Sweetie Belle's cutie mark ended up being ____.", true),
		new Card("Equestrian researchers have discovered that ____ is The 7th Element of Harmony.", true),
		new Card("Every Morning, Princess Celestia Rises ____.", true),
		new Card("In a stroke of unparalleled evil, Discord turned ____ into ____.", true),
		new Card("In a world without humans, saddles are actually made for ____.", true),
		new Card("Inexplicably, the only thing the parasprites wouldn't eat was ____.", true),
		new Card("It turns out Hitler's favorite pony was ____.", true),
		new Card("It's not a boulder! It's ____!", true),
		new Card("Lauren Faust was shocked to find ____ in her mailbox.", true),
		new Card("Luna didn't help in the fight against Chrysalis because she was too busy with ____.", true),
		new Card("My cutie mark would be ____.", true),
		new Card("Not many people know that Tara Strong is also the voice of ____.", true),
		new Card("Nothing makes Pinkie smile more than ____.", true),
		new Card("Everypony was shocked to discover that Scootaloo's cutie mark was ____.", true),
		new Card("Giggle at ____!", true),
		new Card("I never knew what ____ could be, until you all shared its ____ with me.", true),
		new Card("I'd like to be ____.", true),
		new Card("In a fit of rage, Princess Celestia sent ____ to the ____ for ____.", true),
		new Card("Once upon a time, the land of Equestria was ruled by ____ and ____.", true),
		new Card("Ponyville is widely known for ____.", true),
		new Card("Ponyville was shocked to discover ____ in Fluttershy's shed.", true),
		new Card("Prince Blueblood's cutie mark represents ____.", true),
		new Card("Rainbow Dash has always wanted ____.", true),
		new Card("Rainbow Dash is the only pony in all of Equestria who can ____.", true),
		new Card("Rainbow Dash received a concussion after flying into ____.", true),
		new Card("Rarity has a long forgotten line of clothing inspired by ____.", true),
		new Card("Rarity was supposed to have a song about ____, but it was cut.", true),
		new Card("Rarity's latest dress design was inspired by ____.", true),
		new Card("Should the Elements of Harmony fail, ____ is to be used as a last resort.", true),
		new Card("Super Speedy ____ Squeezy 5000.", true),
		new Card("Surprisingly, Canterlot has a museum of ____.", true),
		new Card("The Elements of Harmony were originally the Elements of ____.", true),
		new Card("The Everfree forest is full of ____.", true),
		new Card("The national anthem of Equestria is ____.", true),
		new Card("The only way to get Opal in the bath is with ____.", true),
		new Card("The worst mishap caused by Princess Cadance was when she made ____ and ____ fall in love.", true),
		new Card("To much controversy, Princess Celestia made ____ illegal.", true),
		new Card("Today, Mayor Mare announced her official campaign position on ____ and ____. No pony was the least bit surprised.", true),
		new Card("Twilight got bored with the magic of friendship, and now studies the magic of ____.", true),
		new Card("Twilight Sparkle owns far more books on ____ than she'd like to admit.", true),
		new Card("When Luna got to the moon, she was greeted with ____.", true),
		new Card("When Spike is asleep, Twilight likes to read books about ____.", true),
		new Card("Without any warning, Pinkie Pie burst into a song about ____.", true),
		new Card("You're a human transported to Equestria! The first thing you'd look for is ____.", true),
		new Card("Zecora is a well known supplier of ____ and ____.", true),
	}, responseCards = new Card[]{
		new Card("Da Magicks.", false),
		new Card("A daisy sandwich.", false),
		new Card("A decorative toaster cozy.", false),
		new Card("A hoof in the ass.", false),
		new Card("A horny stallion.", false),
		new Card("A human fetish.", false),
		new Card("A juice box fetish.", false),
		new Card("A mare in heat.", false),
		new Card("A racially pure Cloudsdale.", false),
		new Card("A sexy saddle.", false),
		new Card("A sock fetish.", false),
		new Card("A Sonic Raingasm.", false),
		new Card("A tactical sonic rainnuke.", false),
		new Card("Actually cumming inside Rainbow Dash.", false),
		new Card("An epic pony war in the distant future.", false),
		new Card("An extremely horny Granny Smith.", false),
		new Card("Another doughnut! With extra sprinkles!", false),
		new Card("Applebucking.", false),
		new Card("Applejack.", false),
		new Card("Avasting Fluttershy's Ass.", false),
		new Card("Baked Bads.", false),
		new Card("Banned From Equestria (Daily).", false),
		new Card("Being trapped on the Moon for 1000 years.", false),
		new Card("Best Pony.", false),
		new Card("Big Macintosh.", false),
		new Card("BonBon.", false),
		new Card("Books.", false),
		new Card("Celestia's Hoof.", false),
		new Card("Celestia's massive harem of foals.", false),
		new Card("Cider.", false),
		new Card("Clopfics.", false),
		new Card("Clopping.", false),
		new Card("Crippled foals.", false),
		new Card("Cupcakes.", false),
		new Card("Daring Do fanfiction.", false),
		new Card("Dark Magicks.", false),
		new Card("Derpy Hooves.", false),
		new Card("Diamond Dog roleplay.", false),
		new Card("Discord.", false),
		new Card("Equestria.", false),
		new Card("Facehoofing.", false),
		new Card("Fillidelphia.", false),
		new Card("Filly fiddling.", false),
		new Card("Fluffy Pony.", false),
		new Card("Fluttershy.", false),
		new Card("Fluttershy's secret stash.", false),
		new Card("Fluttershy's Shed.", false),
		new Card("Fluttertree.", false),
		new Card("Foal abuse.", false),
		new Card("Foodmanes.", false),
		new Card("Friendship.", false),
		new Card("Futaloo.", false),
		new Card("Gabby Gums.", false),
		new Card("Gently stroking the horn.", false),
		new Card("Getting 20% cooler!", false),
		new Card("Gypsies.", false),
		new Card("Having hot pony sex with Bloomberg.", false),
		new Card("Horn Necrosis.", false),
		new Card("Hugging a pony non-sexually.", false),
		new Card("Jappleack.", false),
		new Card("Joe's Donut Hole.", false),
		new Card("John Joseco.", false),
		new Card("Zecora's meth lab.", false),
		new Card("Lyra Heartstrings.", false),
		new Card("Worst pony.", false),
		new Card("Magic.", false),
		new Card("Wolfieshy.", false),
		new Card("Winter Wrap Up.", false),
		new Card("Making Magic.", false),
		new Card("Wincest.", false),
		new Card("Whipping the Earth Pony slaves.", false),
		new Card("Vinyl Scratch / DJ Pon-3.", false),
		new Card("Unicorn Privilege.", false),
		new Card("Man Spike.", false),
		new Card("Two fillies shitting into a bucket.", false),
		new Card("Manehatten.", false),
		new Card("Twist.", false),
		new Card("Mare Supremacy.", false),
		new Card("Twilight's secret clop stash.", false),
		new Card("Molestia's sex dungeon.", false),
		new Card("Twilight Sparkle.", false),
		new Card("THE ROYAL CANTERLOT VOICE.", false),
		new Card("My OC.", false),
		new Card("The Rainbow Factory.", false),
		new Card("Nightmare Moon.", false),
		new Card("The Pegasus Master Race.", false),
		new Card("A cutie mark.", false),
		new Card("Octavia.", false),
		new Card("The Moon.", false),
		new Card("Orphaned foals.", false),
		new Card("Pants.", false),
		new Card("The Great and Powerful Trixie Lulamoon.", false),
		new Card("The Grand Galloping Gala.", false),
		new Card("Pegasus wing deformities.", false),
		new Card("The Friendship Express.", false),
		new Card("Pinkamena Diane Pie.", false),
		new Card("The Chocolate Mousse Moose.", false),
		new Card("The Cakes.", false),
		new Card("Pinkamena's hacksaw.", false),
		new Card("That squee noise.", false),
		new Card("That Lyra plushie.", false),
		new Card("Sweetie Bot.", false),
		new Card("Sweetie Belle's virgin marshmallow pussy.", false),
		new Card("Sweetie Belle.", false),
		new Card("Pinkie Pie in full latex.", false),
		new Card("Surprise.", false),
		new Card("Stretching those glutes.", false),
		new Card("Pinkie Pie.", false),
		new Card("Steven Magnets.", false),
		new Card("Plot.", false),
		new Card("Spike's understanding of biology.", false),
		new Card("Speaking Fancy.", false),
		new Card("Poison Joke.", false),
		new Card("Ponies wearing clothes.", false),
		new Card("Sloppy clop.", false),
		new Card("Shipping.", false),
		new Card("Shaking Dat Plot.", false),
		new Card("Secretly being a changeling all along.", false),
		new Card("Ponies.", false),
		new Card("Scootabuse.", false),
		new Card("Pony racism.", false),
		new Card("Scoot, Scoot-A-Loo.", false),
		new Card("Pony-Griffon marriage.", false),
		new Card("Rarity.", false),
		new Card("Rainbow Dash.", false),
		new Card("Rainbow Crash.", false),
		new Card("Ponychan.", false),
		new Card("Raging wingboners.", false),
		new Card("Queen Chrysalis.", false),
		new Card("Princess Molestia.", false),
		new Card("Princess Celestia.", false),
		new Card("Princess Mi Amore Cadenza.", false),
		new Card("Princess Luna.", false),
		new Card("Ponies with fricken' laser beams attached to their heads!", false),
	};
	
	@Override
	public String getDeckName()
	{
		return "[C] Cards Against Equinity";
	}
	
	@Override
	public String getShortDeckName()
	{
		return "CAE";
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