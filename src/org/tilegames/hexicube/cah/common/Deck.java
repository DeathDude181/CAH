package org.tilegames.hexicube.cah.common;

public abstract class Deck
{
	private boolean enabled;
	
	public abstract String getDeckName();
	public abstract String getShortDeckName();
	public abstract boolean officialDeck();
	
	public abstract int numCallCards();
	public abstract int numResponseCards();
	
	public abstract Card[] getCallCards();
	public abstract Card[] getResponseCards();
	
	public void toggleEnabled()
	{
		enabled = !enabled;
	}
	
	public boolean isEnabled()
	{
		return enabled;
	}
}