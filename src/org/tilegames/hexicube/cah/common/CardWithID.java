package org.tilegames.hexicube.cah.common;

public class CardWithID
{
	private String text, shortText;
	private int id;
	
	public CardWithID(String text, String shortText, int id)
	{
		this.text = text;
		this.shortText = shortText;
		this.id = id;
	}
	
	public String getCardText()
	{
		return text;
	}
	
	public String getCardShortText()
	{
		return shortText;
	}
	
	public int getCardID()
	{
		return id;
	}
}