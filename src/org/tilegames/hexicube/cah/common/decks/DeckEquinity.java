package org.tilegames.hexicube.cah.common.decks;

import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.Card;

public class DeckEquinity extends Deck
{
	private static final Card[] callCards = new Card[]{
		new Card("And that's how Equestria was made!"),
		new Card("Big Mac sleeps soundly whenever _ is with him."),
		new Card("_ has won the national Equestrian award for _."),
		new Card("_ is best pony."),
		new Card("_ should _ _."),
		new Card("_? That's future Spike's problem."),
		new Card("After a wild night of crusading, Applebloom learned that _ was her super special talent."),
		new Card("After a wild night of partying, Fluttershy awakens to find _ in her bed."),
		new Card("After living for thousands of years Celestia can only find pleasure in _."),
		new Card("Aloe and Lotus have been experimenting with a radical treatment that utilizes the therapeutic properties of _."),
		new Card("BUY SOME _!"),
		new Card("CUTIE MARK CRUSADERS; _! YAY!"),
		new Card("Daring Do and the quest for _."),
		new Card("Dear Princess Celestia, Today I learned about _. "),
		new Card("Despite everypony's expectations, Sweetie Belle's cutie mark ended up being _."),
		new Card("Equestrian researchers have discovered that _ is The 7th Element of Harmony."),
		new Card("Every Morning, Princess Celestia Rises _."),
		new Card("In a stroke of unparalleled evil, Discord turned _ into _."),
		new Card("In a world without humans, saddles are actually made for _."),
		new Card("Inexplicably, the only thing the parasprites wouldn't eat was _."),
		new Card("It turns out Hitler's favorite pony was _."),
		new Card("It's not a boulder! It's _!"),
		new Card("Lauren Faust was shocked to find _ in her mailbox."),
		new Card("Luna didn't help in the fight against Chrysalis because she was too busy with _."),
		new Card("My cutie mark would be _."),
		new Card("Not many people know that Tara Strong is also the voice of _."),
		new Card("Nothing makes Pinkie smile more than _."),
		new Card("Everypony was shocked to discover that Scootaloo's cutie mark was _."),
		new Card("Giggle at _!"),
		new Card("I never knew what _ could be, until you all shared its _ with me."),
		new Card("I'd like to be _."),
		new Card("In a fit of rage, Princess Celestia sent _ to the _ for _."),
		new Card("Once upon a time, the land of Equestria was ruled by _ and _."),
		new Card("Ponyville is widely known for _."),
		new Card("Ponyville was shocked to discover _ in Fluttershy's shed."),
		new Card("Prince Blueblood's cutie mark represents _."),
		new Card("Rainbow Dash has always wanted _."),
		new Card("Rainbow Dash is the only pony in all of Equestria who can _."),
		new Card("Rainbow Dash received a concussion after flying into _."),
		new Card("Rarity has a long forgotten line of clothing inspired by _."),
		new Card("Rarity was supposed to have a song about _, but it was cut."),
		new Card("Rarity's latest dress design was inspired by _."),
		new Card("Should the Elements of Harmony fail, _ is to be used as a last resort."),
		new Card("Super Speedy _ Squeezy 5000."),
		new Card("Surprisingly, Canterlot has a museum of _."),
		new Card("The Elements of Harmony were originally the Elements of _."),
		new Card("The Everfree forest is full of _."),
		new Card("The national anthem of Equestria is _."),
		new Card("The only way to get Opal in the bath is with _."),
		new Card("The worst mishap caused by Princess Cadance was when she made _ and _ fall in love."),
		new Card("To much controversy, Princess Celestia made _ illegal."),
		new Card("Today, Mayor Mare announced her official campaign position on _ and _. No pony was the least bit surprised."),
		new Card("Twilight got bored with the magic of friendship, and now studies the magic of _."),
		new Card("Twilight Sparkle owns far more books on _ than she'd like to admit."),
		new Card("When Luna got to the moon, she was greeted with _."),
		new Card("When Spike is asleep, Twilight likes to read books about _."),
		new Card("Without any warning, Pinkie Pie burst into a song about _."),
		new Card("You're a human transported to Equestria! The first thing you'd look for is _."),
		new Card("Zecora is a well known supplier of _ and _.")
	}, responseCards = new Card[]{
		new Card("Da Magicks."),
		new Card("A daisy sandwich."),
		new Card("A decorative toaster cozy."),
		new Card("A hoof in the ass."),
		new Card("A horny stallion."),
		new Card("A human fetish."),
		new Card("A juice box fetish."),
		new Card("A mare in heat."),
		new Card("A racially pure Cloudsdale."),
		new Card("A sexy saddle."),
		new Card("A sock fetish."),
		new Card("A Sonic Raingasm."),
		new Card("A tactical sonic rainnuke."),
		new Card("Actually cumming inside Rainbow Dash."),
		new Card("An epic pony war in the distant future."),
		new Card("An extremely horny Granny Smith."),
		new Card("Another doughnut! With extra sprinkles!"),
		new Card("Applebucking."),
		new Card("Applejack."),
		new Card("Avasting Fluttershy's Ass."),
		new Card("Baked Bads."),
		new Card("Banned From Equestria (Daily)."),
		new Card("Being trapped on the Moon for 1000 years."),
		new Card("Best Pony."),
		new Card("Big Macintosh."),
		new Card("BonBon."),
		new Card("Books."),
		new Card("Celestia's Hoof."),
		new Card("Celestia's massive harem of foals."),
		new Card("Cider."),
		new Card("Clopfics."),
		new Card("Clopping."),
		new Card("Crippled foals."),
		new Card("Cupcakes."),
		new Card("Daring Do fanfiction."),
		new Card("Dark Magicks."),
		new Card("Derpy Hooves."),
		new Card("Diamond Dog roleplay."),
		new Card("Discord."),
		new Card("Equestria."),
		new Card("Facehoofing."),
		new Card("Fillidelphia."),
		new Card("Filly fiddling."),
		new Card("Fluffy Pony."),
		new Card("Fluttershy."),
		new Card("Fluttershy's secret stash."),
		new Card("Fluttershy's Shed."),
		new Card("Fluttertree."),
		new Card("Foal abuse."),
		new Card("Foodmanes."),
		new Card("Friendship."),
		new Card("Futaloo."),
		new Card("Gabby Gums."),
		new Card("Gently stroking the horn."),
		new Card("Getting 20% cooler!"),
		new Card("Gypsies."),
		new Card("Having hot pony sex with Bloomberg."),
		new Card("Horn Necrosis."),
		new Card("Hugging a pony non-sexually."),
		new Card("Jappleack."),
		new Card("Joe's Donut Hole."),
		new Card("John Joseco."),
		new Card("Zecora's meth lab."),
		new Card("Lyra Heartstrings."),
		new Card("Worst pony."),
		new Card("Magic."),
		new Card("Wolfieshy."),
		new Card("Winter Wrap Up."),
		new Card("Making Magic."),
		new Card("Wincest."),
		new Card("Whipping the Earth Pony slaves."),
		new Card("Vinyl Scratch / DJ Pon-3."),
		new Card("Unicorn Privilege."),
		new Card("Man Spike."),
		new Card("Two fillies shitting into a bucket."),
		new Card("Manehatten."),
		new Card("Twist."),
		new Card("Mare Supremacy."),
		new Card("Twilight's secret clop stash."),
		new Card("Molestia's sex dungeon."),
		new Card("Twilight Sparkle."),
		new Card("THE ROYAL CANTERLOT VOICE."),
		new Card("My OC."),
		new Card("The Rainbow Factory."),
		new Card("Nightmare Moon."),
		new Card("The Pegasus Master Race."),
		new Card("A cutie mark."),
		new Card("Octavia."),
		new Card("The Moon."),
		new Card("Orphaned foals."),
		new Card("Pants."),
		new Card("The Great and Powerful Trixie Lulamoon."),
		new Card("The Grand Galloping Gala."),
		new Card("Pegasus wing deformities."),
		new Card("The Friendship Express."),
		new Card("Pinkamena Diane Pie."),
		new Card("The Chocolate Mousse Moose."),
		new Card("The Cakes."),
		new Card("Pinkamena's hacksaw."),
		new Card("That squee noise."),
		new Card("That Lyra plushie."),
		new Card("Sweetie Bot."),
		new Card("Sweetie Belle's virgin marshmallow pussy."),
		new Card("Sweetie Belle."),
		new Card("Pinkie Pie in full latex."),
		new Card("Surprise."),
		new Card("Stretching those glutes."),
		new Card("Pinkie Pie."),
		new Card("Steven Magnets."),
		new Card("Plot."),
		new Card("Spike's understanding of biology."),
		new Card("Speaking Fancy."),
		new Card("Poison Joke."),
		new Card("Ponies wearing clothes."),
		new Card("Sloppy clop."),
		new Card("Shipping."),
		new Card("Shaking Dat Plot."),
		new Card("Secretly being a changeling all along."),
		new Card("Ponies."),
		new Card("Scootabuse."),
		new Card("Pony racism."),
		new Card("Scoot, Scoot-A-Loo."),
		new Card("Pony-Griffon marriage."),
		new Card("Rarity."),
		new Card("Rainbow Dash."),
		new Card("Rainbow Crash."),
		new Card("Ponychan."),
		new Card("Raging wingboners."),
		new Card("Queen Chrysalis."),
		new Card("Princess Molestia."),
		new Card("Princess Celestia."),
		new Card("Princess Mi Amore Cadenza."),
		new Card("Princess Luna."),
		new Card("Ponies with fricken' laser beams attached to their heads!")
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