package org.tilegames.hexicube.cah.common.decks;

import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.Card;

public class DeckKhaos extends Deck
{
	private static final Card[] callCards = new Card[]{
		new Card("Honey badger don't give a ____!", true),
		new Card("My next video turorial covers ____.", true),
		new Card("We found a map Charlie! A map to ____ Mountain!", true),
		new Card("For the love of GOD, and all that is HOLY, ____!!", true),
		new Card("The new Operating System will be called ____.", true),
		new Card("I used to be an adventurer like you, then I took a/an ____ in the ____.", true),
		new Card("You've got to check out ____ Fluxx!", true),
		new Card("Call of Duty Modern Warfare 37: War of ____!", true),
		new Card("In brightest day, in blackest night, no ____ shall escape my sight.", true),
		new Card("Yes, Mr. Death... I'll play you a game! But not chess! My game is ____.", true),
		new Card("I cannot preach hate and warfare when I am a disciple of ____.", true),
		new Card("With great power comes great ____.", true),
		new Card("Don't make me ____. You wouldn't like me when I'm ____.", true),
		new Card("Fighting a never-ending battle for truth, justice, and the American ____!", true),
		new Card("Faster than a speeding ____! More powerful than a ____!", true),
		new Card("Able to leap ____ in a single bound! ", true),
		new Card("Disguised as ____, mild-mannered ____. ", true),
		new Card("Patriotism doesn't automatically equal ____.", true),
		new Card("I'm loyal to nothing, General - except the ____.", true),
		new Card("Alright you Primitive Screwheads, listen up! You see this? This... is my ____!", true),
		new Card("Shop smart. Shop ____.", true),
		new Card("Hail to the ____, baby.", true),
		new Card("Good. Bad. I'm the guy with the ____.", true),
		new Card("How will we stop an army of the dead at our castle walls?", true),
		new Card("I seek The Holy ____.", true),
		new Card("I see you have the machine that goes ____.", true),
		new Card("Every sperm is ____.", true),
		new Card("An African or European ____?", true),
		new Card("Well you can't expect to wield supreme executive power just 'cause some watery tart threw a ____ at you!", true),
		new Card("'____!' 'It's only a model.'", true),
		new Card("Good night. Sleep well. I'll most likely ____ you in the morning.", true),
		new Card("I am The Dread Pirate ____.", true),
		new Card("Do you want me to send you back to where you were, ____ in ____?", true),
		new Card("I see ____ people", true),
		new Card("____? We don't need no stinking ____!", true),
		new Card("These aren't the ____ you're looking for.", true),
		new Card("We're gonna need a bigger ____.", true),
		new Card("Beavis and Butthead Do ____.", true),
		new Card("I, for one, welcome our new ____ overlords.", true),
		new Card("You know, there's a million fine looking women in the world, dude. But they don't all bring you ____ at work. Most of 'em just ____.", true),
		new Card("Teenage Mutant Ninja ____.", true),
		new Card("Achy Breaky ____.", true),
		new Card("I'm not a ____, but I play one on TV", true),
		new Card("____'s latest music video features a dozen ____ on ____.", true),
		new Card("____. Like a boss!", true),
		new Card("In Soviet ____, ____ ____s you.", true),
		new Card("____. It's not just for breakfast anymore.", true),
		new Card("____. It's what's for dinner!", true),
		new Card("____. Part of this nutritious breakfast.", true),
		new Card("____. Breakfast of champions!", true),
		new Card("Where's the beef?", true),
		new Card("Oh my god! They killed ____!", true),
		new Card("I am not fat! I'm just ____.", true),
		new Card("Two by two, hands of ____.", true),
		new Card("The anxiously awaited new season of Firefly is rumoured to kick off with an action packed scene, featuring River Tam's amazing feats of ____!", true),
		new Card("I swear by my pretty floral  ____, I will ____ you.", true),
		new Card("Wendy's ____ & Juicy.", true),
		new Card("I HATE it when ____(s) crawl(s) up my ____!", true),
		new Card("At ____, where every day is ____ day!", true),
		new Card("____ at last! ____ at last! Thank God almighty, I'm ____ at last! ", true),
		new Card("I have a dream that one day this nation will rise up and live out the true meaning of its creed:", true),
		new Card("This year's ____ guest of honour is ____.", true),
		new Card("This will be the greatest ____con ever!", true),
		new Card("____ is the new ____.", true),
		new Card("Bitches LOVE ____!", true),
		new Card("The only good ____ is a dead ____.", true),
		new Card("A vote for ____ is a vote for ____.", true),
		new Card("Thou shalt not____.", true),
		new Card("I am the King of ____!", true),
		new Card("Team ____!", true),
		new Card("We went to a workshop on tantric ____.", true),
		new Card("My safeword is ____.", true),
		new Card("I like ____, but ____ is a hard limit!", true),
		new Card("I ____, therefore I ____.", true),
		new Card("Welcome to my secret lair. I call it The Fortress of ____.", true),
		new Card("These are my minions of ____!", true),
	}, responseCards = new Card[]{
		new Card("Godwin's law.", false),
		new Card("Nope! Chuck Testa.", false),
		new Card("Pedo-bear.", false),
		new Card("Honey badger.", false),
		new Card("Linux.", false),
		new Card("Unix.", false),
		new Card("My ANUS is bleeding!", false),
		new Card("My spoon is too big.", false),
		new Card("Badger badger badger badger badger...", false),
		new Card("Candy Mountain.", false),
		new Card("Pewdiepie.", false),
		new Card("Black Mesa.", false),
		new Card("The Umbrella Corporation.", false),
		new Card("Gordon Freeman.", false),
		new Card("Head Crabs.", false),
		new Card("GLaDOS's cake recipe.", false),
		new Card("An arrow to the knee.", false),
		new Card("All your base.", false),
		new Card("Wood for sheep.", false),
		new Card("Wonder Woman's invisible chopper", false),
		new Card("The Tick.", false),
		new Card("SHAZAM!", false),
		new Card("Being tied up with Wonder Woman's Magic Lasso.", false),
		new Card("The Batmobile!", false),
		new Card("Outrunning The Flash!", false),
		new Card("Getting caught in Spiderman's sticky, sticky... web.", false),
		new Card("Getting caught between Green Lantern creating an anvil and Sinestro creating a hammer.", false),
		new Card("Pissing in the suit", false),
		new Card("A REALLY cool cape and tights", false),
		new Card("Content.", false),
		new Card("Good Ash", false),
		new Card("Evil Ash", false),
		new Card("My boomstick", false),
		new Card("S-Mart", false),
		new Card("The Necronomiconexmortis", false),
		new Card("We're coming to get you, Barbara!", false),
		new Card("Groovy", false),
		new Card("A shrubbery!", false),
		new Card("The machine that goes 'Ping!'", false),
		new Card("A herring!", false),
		new Card("The Holy Grail", false),
		new Card("Camelot", false),
		new Card("Morgan Freeman", false),
		new Card("Inconceivable!!", false),
		new Card("To the pain", false),
		new Card("Iocane powder", false),
		new Card("The Orgazmorator", false),
		new Card("Damn dirty ape", false),
		new Card("Cowboys from Hell", false),
		new Card("Festively plump", false),
		new Card("Ants in the Pants", false),
		new Card("Mecha-Streisand", false),
		new Card("Snookie", false),
		new Card("Honey Boo Boo", false),
		new Card("Like a boss!", false),
		new Card("Mutton Vindaloo Beast", false),
		new Card("Queeg 500", false),
		new Card("Talkie Toaster", false),
		new Card("Droid Rot", false),
		new Card("Athlete's Hand", false),
		new Card("Anti-Matter Chopsticks", false),
		new Card("Groinal Exploder", false),
		new Card("Shiny!", false),
		new Card("River Tam", false),
		new Card("Browncoats", false),
		new Card("Getting raped to death by reavers", false),
		new Card("I'll be in my bunk!", false),
		new Card("The Alliance", false),
		new Card("A bigger, blacker deck", false),
		new Card("The Necronomicon", false),
		new Card("Fruit flies", false),
		new Card("Fruit bat", false),
		new Card("Traumatic insemination", false),
		new Card("Bagpipes", false),
		new Card("The Metal!", false),
		new Card("All the ass in the world!", false),
		new Card("Prehensile nipples", false),
		new Card("No pants", false),
		new Card("Locusts", false),
		new Card("A tantrum", false),
		new Card("Fifi the dancing poodle", false),
		new Card("Wal-Mart", false),
		new Card("Rape culture", false),
		new Card("Cultural misappropriation", false),
		new Card("Soggy biscuit", false),
		new Card("A gang of bikers", false),
		new Card("Cake", false),
		new Card("Lice", false),
		new Card("The walk of shame", false),
		new Card("Rough trade", false),
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