package org.tilegames.hexicube.cah.common.decks;

import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.Card;

public class DeckKhaos extends Deck
{
	private static final Card[] callCards = new Card[]{
		new Card("Honey badger don't give a _!"),
		new Card("My next video turorial covers _."),
		new Card("We found a map Charlie! A map to _ Mountain!"),
		new Card("For the love of GOD, and all that is HOLY, _!!"),
		new Card("The new Operating System will be called _."),
		new Card("I used to be an adventurer like you, then I took a/an _ in the _."),
		new Card("You've got to check out _ Fluxx!"),
		new Card("Call of Duty Modern Warfare 37: War of _!"),
		new Card("In brightest day, in blackest night, no _ shall escape my sight."),
		new Card("Yes, Mr. Death... I'll play you a game! But not chess! My game is _."),
		new Card("I cannot preach hate and warfare when I am a disciple of _."),
		new Card("With great power comes great _."),
		new Card("Don't make me _. You wouldn't like me when I'm _."),
		new Card("Fighting a never-ending battle for truth, justice, and the American _!"),
		new Card("Faster than a speeding _! More powerful than a _!"),
		new Card("Able to leap _ in a single bound! "),
		new Card("Disguised as _, mild-mannered _. "),
		new Card("Patriotism doesn't automatically equal _."),
		new Card("I'm loyal to nothing, General - except the _."),
		new Card("Alright you Primitive Screwheads, listen up! You see this? This... is my _!"),
		new Card("Shop smart. Shop _."),
		new Card("Hail to the _, baby."),
		new Card("Good. Bad. I'm the guy with the _."),
		new Card("How will we stop an army of the dead at our castle walls?"),
		new Card("I seek The Holy _."),
		new Card("I see you have the machine that goes _."),
		new Card("Every sperm is _."),
		new Card("An African or European _?"),
		new Card("Well you can't expect to wield supreme executive power just 'cause some watery tart threw a _ at you!"),
		new Card("'_!' 'It's only a model.'"),
		new Card("Good night. Sleep well. I'll most likely _ you in the morning."),
		new Card("I am The Dread Pirate _."),
		new Card("Do you want me to send you back to where you were, _ in _?"),
		new Card("I see _ people"),
		new Card("_? We don't need no stinking _!"),
		new Card("These aren't the _ you're looking for."),
		new Card("We're gonna need a bigger _."),
		new Card("Beavis and Butthead Do _."),
		new Card("I, for one, welcome our new _ overlords."),
		new Card("You know, there's a million fine looking women in the world, dude. But they don't all bring you _ at work. Most of 'em just _."),
		new Card("Teenage Mutant Ninja _."),
		new Card("Achy Breaky _."),
		new Card("I'm not a _, but I play one on TV"),
		new Card("_'s latest music video features a dozen _ on _."),
		new Card("_. Like a boss!"),
		new Card("In Soviet _, _ ____s you."),
		new Card("_. It's not just for breakfast anymore."),
		new Card("_. It's what's for dinner!"),
		new Card("_. Part of this nutritious breakfast."),
		new Card("_. Breakfast of champions!"),
		new Card("Where's the beef?"),
		new Card("Oh my god! They killed _!"),
		new Card("I am not fat! I'm just _."),
		new Card("Two by two, hands of _."),
		new Card("The anxiously awaited new season of Firefly is rumoured to kick off with an action packed scene, featuring River Tam's amazing feats of _!"),
		new Card("I swear by my pretty floral  _, I will _ you."),
		new Card("Wendy's _ & Juicy."),
		new Card("I HATE it when _(s) crawl(s) up my _!"),
		new Card("At _, where every day is _ day!"),
		new Card("_ at last! _ at last! Thank God almighty, I'm _ at last! "),
		new Card("I have a dream that one day this nation will rise up and live out the true meaning of its creed:"),
		new Card("This year's _ guest of honour is _."),
		new Card("This will be the greatest ____con ever!"),
		new Card("_ is the new _."),
		new Card("Bitches LOVE _!"),
		new Card("The only good _ is a dead _."),
		new Card("A vote for _ is a vote for _."),
		new Card("Thou shalt not____."),
		new Card("I am the King of _!"),
		new Card("Team _!"),
		new Card("We went to a workshop on tantric _."),
		new Card("My safeword is _."),
		new Card("I like _, but _ is a hard limit!"),
		new Card("I _, therefore I _."),
		new Card("Welcome to my secret lair. I call it The Fortress of _."),
		new Card("These are my minions of _!")
	}, responseCards = new Card[]{
		new Card("Godwin's law."),
		new Card("Nope! Chuck Testa."),
		new Card("Pedo-bear."),
		new Card("Honey badger."),
		new Card("Linux."),
		new Card("Unix."),
		new Card("My ANUS is bleeding!"),
		new Card("My spoon is too big."),
		new Card("Badger badger badger badger badger..."),
		new Card("Candy Mountain."),
		new Card("Pewdiepie."),
		new Card("Black Mesa."),
		new Card("The Umbrella Corporation."),
		new Card("Gordon Freeman."),
		new Card("Head Crabs."),
		new Card("GLaDOS's cake recipe."),
		new Card("An arrow to the knee."),
		new Card("All your base."),
		new Card("Wood for sheep."),
		new Card("Wonder Woman's invisible chopper"),
		new Card("The Tick."),
		new Card("SHAZAM!"),
		new Card("Being tied up with Wonder Woman's Magic Lasso."),
		new Card("The Batmobile!"),
		new Card("Outrunning The Flash!"),
		new Card("Getting caught in Spiderman's sticky, sticky... web."),
		new Card("Getting caught between Green Lantern creating an anvil and Sinestro creating a hammer."),
		new Card("Pissing in the suit"),
		new Card("A REALLY cool cape and tights"),
		new Card("Content."),
		new Card("Good Ash"),
		new Card("Evil Ash"),
		new Card("My boomstick"),
		new Card("S-Mart"),
		new Card("The Necronomiconexmortis"),
		new Card("We're coming to get you, Barbara!"),
		new Card("Groovy"),
		new Card("A shrubbery!"),
		new Card("The machine that goes 'Ping!'"),
		new Card("A herring!"),
		new Card("The Holy Grail"),
		new Card("Camelot"),
		new Card("Morgan Freeman"),
		new Card("Inconceivable!!"),
		new Card("To the pain"),
		new Card("Iocane powder"),
		new Card("The Orgazmorator"),
		new Card("Damn dirty ape"),
		new Card("Cowboys from Hell"),
		new Card("Festively plump"),
		new Card("Ants in the Pants"),
		new Card("Mecha-Streisand"),
		new Card("Snookie"),
		new Card("Honey Boo Boo"),
		new Card("Like a boss!"),
		new Card("Mutton Vindaloo Beast"),
		new Card("Queeg 500"),
		new Card("Talkie Toaster"),
		new Card("Droid Rot"),
		new Card("Athlete's Hand"),
		new Card("Anti-Matter Chopsticks"),
		new Card("Groinal Exploder"),
		new Card("Shiny!"),
		new Card("River Tam"),
		new Card("Browncoats"),
		new Card("Getting raped to death by reavers"),
		new Card("I'll be in my bunk!"),
		new Card("The Alliance"),
		new Card("A bigger, blacker deck"),
		new Card("The Necronomicon"),
		new Card("Fruit flies"),
		new Card("Fruit bat"),
		new Card("Traumatic insemination"),
		new Card("Bagpipes"),
		new Card("The Metal!"),
		new Card("All the ass in the world!"),
		new Card("Prehensile nipples"),
		new Card("No pants"),
		new Card("Locusts"),
		new Card("A tantrum"),
		new Card("Fifi the dancing poodle"),
		new Card("Wal-Mart"),
		new Card("Rape culture"),
		new Card("Cultural misappropriation"),
		new Card("Soggy biscuit"),
		new Card("A gang of bikers"),
		new Card("Cake"),
		new Card("Lice"),
		new Card("The walk of shame"),
		new Card("Rough trade")
	};
	
	@Override
	public String getDeckName()
	{
		return "[C] Khaos WolfKat";
	}
	
	@Override
	public String getShortDeckName()
	{
		return "Khaos";
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