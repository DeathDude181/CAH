package org.tilegames.hexicube.cah.common.decks;

import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.Card;

public class DeckAnimeExpansion extends Deck
{
	private static final Card[] callCards = new Card[]{
		new Card("What does Alucard have nightmares about?", true),
		new Card("I've always wanted to become a voice actor, so I could play the role of ____.", true),
		new Card("If the anime industry is dying, what will be the final nail in it's coffin?", true),
		new Card("Don't stand behind him, if you value your ____.", true),
		new Card("What the hell is ", true),
		new Card("As part of a recent promotion, Japanese KFCs are now dressing their Colonel Sanders statues up as ____.", true),
		new Card("Fighting ____ by moonlight! Winning ____ by daylight! Never running from a real fight! She is the one named ____!", true),
		new Card("It's no secret.  Deep down, everybody wants to fuck ____.", true),
		new Card("Behold! My trap card, ____!", true),
		new Card("After eating a Devil Fruit, I now have the power of ____.", true),
		new Card("By far, the most mind-bogglingly awesome thing I've ever seen in anime is ____.", true),
		new Card("My Little Sister Can't Be ____!", true),
		new Card("No matter how I look at it, it's your fault I'm not ____!", true),
		new Card("They are the prey, and we are the ____.", true),
		new Card("My love for you is like ____.  BERSERKER!", true),
		new Card("IT'S ____ TIME!", true),
		new Card("It has been said... That there are entire forests of ____, made from the sweetest ____.", true),
		new Card("Attention, duelists: My hair is ____.", true),
		new Card("What do otaku smell like?", true),
		new Card("Madoka Kyouno's nickname for Muginami's older brother is ____.", true),
		new Card("____.", true),
		new Card("And from Kyoto Animation, a show about cute girls doing ____.", true),
		new Card("Anime has taught me that classic literature can always be improved by adding ____.", true),
		new Card("The mo&eacute; debate was surprisingly civil until someone mentioned ____.", true),
		new Card("That's not a squid!  It's ____!", true),
		new Card("The Chocolate Underground stopped the Good For You Party by capturing their ____ and exposing their leader as ____.", true),
		new Card("Who cares about the printing press, did that medieval peasant girl just invent ____?!", true),
		new Card("The court finds the defendant, ____, guilty of ____, and sentences them to a lifetime of ____.", true),
	}, responseCards = new Card[]{
		new Card("Rock-hard, glistening abs.", false),
		new Card("A diet consisting almost entirely of potatoes.", false),
		new Card("Mamoru Oshii's dog love.", false),
		new Card("An 8 million yen debt to a club of rich pretty boys.", false),
		new Card("Hideaki Anno's poor, tortured therapist.", false),
		new Card("Fucking postcards as a cheap-ass pack-in gift.", false),
		new Card("Wild Tiger's Hundred Power.", false),
		new Card("Totoro.", false),
		new Card("Traps.", false),
		new Card("Korean Jesus.", false),
		new Card("Astro Boy.", false),
		new Card("Jacking off into a bottle of formaldehyde and calling it our firstborn.", false),
		new Card("Valvrape the Dominator.", false),
		new Card("Piles of dead children.", false),
		new Card("An unending, unquenchable thirst for orange Fanta.", false),
		new Card("Breaking the fourth wall to kill the mangaka.", false),
		new Card("Hentai voice acting.", false),
		new Card("A vampire ninja.", false),
		new Card("A potato committing seppuku.", false),
		new Card("A giant robot German suplex.", false),
		new Card("A Godzilla attack.", false),
		new Card("Eating KFC on Christmas day.", false),
		new Card("Hello Kitty! pregnancy doujins.", false),
		new Card("Waving it around all willy-nilly.", false),
		new Card("Hot anime moms.", false),
		new Card("Pissing yourself.", false),
		new Card("GAO! GAI! GAR!!!", false),
		new Card("Vocaloid death metal.", false),
		new Card("The Dark Lord Shawne Kleckner.", false),
		new Card("Yaoi paddles.", false),
		new Card("Bad Steven Foster dubs.", false),
		new Card("Mr. Satan.", false),
		new Card("An actual, honest-to-God black guy.", false),
		new Card("4,000 tacos, and one Diet Coke.", false),
		new Card("Sick with the cancer.", false),
		new Card("Black and white samurai movies.", false),
		new Card("A promotional crossover with Pizza Hut.", false),
		new Card("Transvestite police officers.", false),
		new Card("Con funk.", false),
		new Card("Star-shaped nipples.", false),
		new Card("A laser horse.", false),
		new Card("Girls with guns AND glasses.", false),
		new Card("Teenaged miniskirt-wearing space pirates.", false),
		new Card("Gas station sushi.", false),
		new Card("Jerry Jewell's serial killer face.", false),
		new Card("A FUCKING DRAGONITE, MOTHERFUCKER!!", false),
		new Card("A school bus orgy.", false),
		new Card("Super Aryan Hitler.", false),
		new Card("Having sex with a dragon.", false),
		new Card("Manga Jesus.", false),
		new Card("Manly pink sparkles.", false),
		new Card("7 ft. tall red-headed Alexander the Great.", false),
		new Card("Training a dinosaur to ride a ball.", false),
		new Card("Samba-dancing dinosaurs.", false),
		new Card("An armored truck full of shit.", false),
		new Card("A Togepi omelet.", false),
		new Card("The Puchuu.", false),
		new Card("Dying over and over again.", false),
		new Card("Fuckingham Palace.", false),
		new Card("Epic old bald dudes.", false),
		new Card("A smashed-in face.", false),
		new Card("A Dragon Slave.", false),
		new Card("Zelgadis' flame-proof bikini briefs.", false),
		new Card("Morphin'.", false),
		new Card("A naughty nurse outfit.", false),
		new Card("A sweaty shirtless man holding a large, writhing fish against his chest.", false),
		new Card("Millionaire Beaver.", false),
		new Card("Dick Saucer.", false),
		new Card("A couple that spends over 30 manga volumes trying to get to first base.", false),
		new Card("Alice in Sexland.", false),
		new Card("Succubus-on-futanari action.", false),
		new Card("High-stakes mahjong.", false),
		new Card("Garbage collectors... IN SPACE!!", false),
		new Card("Magical friendship lasers.", false),
		new Card("The War on Pants.", false),
		new Card("An ending where everyone dies.", false),
		new Card("A cyborg assassin dressed as a magical girl fighting a talking lion and a floating psychic electric jellyfish.", false),
		new Card("J-pop idols.", false),
		new Card("Chest-hair afros.", false),
		new Card("Cowboy Andy.", false),
		new Card("A chainsaw-wielding male magical girl zombie.", false),
		new Card("Inoue Kikoku, 17-years old.", false),
		new Card("Fujoshi.", false),
		new Card("Matrix boobs.", false),
		new Card("Completely losing your shit over Endless Eight.", false),
		new Card("Violently beating your friends to death with a baseball bat.", false),
		new Card("Clothing-dissolving slime.", false),
		new Card("Involuntary crossdressing.", false),
		new Card("Getting sucked into a fantasy world.", false),
		new Card("Hentai artists who don't change their pen name when they go legit.", false),
		new Card("A Masamune Shirou artbook.", false),
		new Card("Loli in a box.", false),
		new Card("Romance of the Three Kingdoms, but everyone is gender-swapped.", false),
		new Card("Mo&eacute; schoolgirl Hitler.", false),
		new Card("Franken Fran.", false),
		new Card("A washpan falling onto someone's head from out of nowhere.", false),
		new Card("SHAFT being SHAFT.", false),
		new Card("A third-grader seducing her 23-year-old teacher.", false),
		new Card("Shotas.", false),
		new Card("One a them bamboo things that goes ", false),
		new Card("Banging your adopted daughter.", false),
		new Card("Tripping, falling, and landing with your face in a girl's breasts.", false),
		new Card("A bunny girl having a lightsaber duel with Darth Vader.", false),
		new Card("A 10-year old with boobs twice the size of her head.", false),
		new Card("An ancient vampire who looks like she's 10.", false),
		new Card("Literally ripping your own heart out.", false),
		new Card("Japanese-style elf ears.", false),
		new Card("Flamboyantly gay William Shakespeare.", false),
		new Card("Gen ", false),
		new Card("Mikuru Beam!", false),
		new Card("Tons and tons of close-up underaged schoolgirl ass-shots.", false),
		new Card("Starfish Hitler.", false),
		new Card("Pok&eacute;mon tears.", false),
		new Card("Pok&eacute;sexuality.", false),
		new Card("Chopstick-based martial arts.", false),
		new Card("All the gayness in GetBackers.", false),
		new Card("Naming yourself after the method of your suicide.", false),
		new Card("The Chupacabra.", false),
		new Card("Blowing a child's head off with a rocket launcher.", false),
		new Card("Erotic incestuous toothbrushing.", false),
		new Card("An artbox that feels like human skin.", false),
		new Card("Polygamy jokes in a kid's show.", false),
		new Card("Urd, Kana, and Misato in a drinking contest.", false),
		new Card("Cute stuff.", false),
		new Card("A robot having an orgasm.", false),
		new Card("Villagulio.", false),
		new Card("Dangling Pok&eacute;balls.", false),
		new Card("Having a giant drill for a dick.", false),
		new Card("Going Super Saiyan.", false),
		new Card("Going Super Saiyan during orgasm.", false),
		new Card("Going Super Saiyan while taking a massive dump.", false),
		new Card("Angry naked people.", false),
		new Card("Literally spanking a monkey.", false),
		new Card("My daikon.", false),
	};
	
	@Override
	public String getDeckName()
	{
		return "[C] Anime Expansion #1";
	}
	
	@Override
	public String getShortDeckName()
	{
		return "Anim3";
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