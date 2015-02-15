package org.tilegames.hexicube.cah.common;

public abstract class Player
{
	public abstract String getUsername();
	public abstract int getID();
	
	public abstract int getNumCards();
	public abstract boolean hasPlayedCards();
}