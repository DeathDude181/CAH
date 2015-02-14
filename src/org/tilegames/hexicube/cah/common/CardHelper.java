package org.tilegames.hexicube.cah.common;

public class CardHelper
{
	/*
	Call Card Modifiers:
	**CAPS** Converts input card into full caps.
	**FIRST** Capitalises input card's first word.
	**REPEAT** Uses the previous card for this slot as well.
	**HAIKU** Completely ignore the call card text, request 3 cards, and show them as a haiku.
	*/
	
	/*
	Response Card Modifiers:
	**EXCLAIM** If there's a period after the card, make it an exclamation mark.
	**QUERY** If there's a period after the card, make it a question mark.
	*/
	
	public static String getCardHandAppearance(String card)
	{
		card = card.replace("**EXCLAIM**", "!");
		card = card.replace("**QUERY**", "?");
		if(!card.endsWith("!") && !card.endsWith("?")) card = card + ".";
		return card.substring(0,1).toUpperCase() + card.substring(1);
	}
	
	public static String getCallCardAppearance(String card)
	{
		card = card.replace("**CAPS**", "");
		card = card.replace("**FIRST**", "");
		card = card.replace("**REPEAT**", "");
		card = card.replace("**HAIKU**", "");
		return card;
	}
	
	public static int getCardSlots(String callCard)
	{
		if(callCard.endsWith("**HAIKU**")) return 3;
		int slots = 0;
		while(true)
		{
			int pos = callCard.indexOf('_');
			if(pos == -1) break;
			callCard = callCard.substring(pos+1);
			if(!callCard.startsWith("**REPEAT**")) slots++;
		}
		if(slots == 0) return 1;
		return slots;
	}
	
	public static String getResultTest(String callCard, String[] inputs)
	{
		if(callCard.endsWith("**HAIKU**")) callCard = "_\n_\n_";
		String text = "";
		int inputPos = 0;
		while(true)
		{
			int pos = callCard.indexOf('_');
			if(pos == -1)
			{
				text += callCard;
				break;
			}
			text += callCard.substring(0, pos);
			callCard = callCard.substring(pos+1);
			if(callCard.startsWith("**"))
			{
				if(callCard.startsWith("**CAPS**"))
				{
					text += inputs[inputPos++].toUpperCase();
					callCard = callCard.substring(8);
				}
				if(callCard.startsWith("**FIRST**"))
				{
					text += inputs[inputPos].substring(0,1).toUpperCase() + inputs[inputPos++].substring(1);
					callCard = callCard.substring(9);
				}
				if(callCard.startsWith("**REPEAT**"))
				{
					text += inputs[inputPos-1];
					callCard = callCard.substring(10);
				}
			}
			else text += inputs[inputPos++];
		}
		if(inputPos == 0) text += inputs[0].substring(0,1).toUpperCase() + inputs[0].substring(1);
		text = text.replace("**EXCLAIM**.", "!");
		text = text.replace("**EXCLAIM**", "");
		text = text.replace("**QUERY**.", "?");
		text = text.replace("**QUERY**", "");
		return text;
	}
}