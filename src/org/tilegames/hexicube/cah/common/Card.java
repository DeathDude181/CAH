package org.tilegames.hexicube.cah.common;

public class Card
{
	private String text;
	
	public Card(String text)
	{
		this.text = text;
	}
	
	public Card(String text, boolean isCallCard)
	{
		this.text = text;
		//TODO: phase this out as isCallCard is useless
	}
	
	public String getCardText()
	{
		return text;
	}
}