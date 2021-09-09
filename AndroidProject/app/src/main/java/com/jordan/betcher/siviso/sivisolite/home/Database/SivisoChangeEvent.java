package com.jordan.betcher.siviso.sivisolite.home.Database;

import java.util.ArrayList;

class SivisoChangeEvent
{
	private ArrayList<OnSivisoChange> onSivisoChanges = new ArrayList<>();
	
	public void addOnSivisoChange(OnSivisoChange onSivisoChange)
	{
		onSivisoChanges.add(onSivisoChange);
	}
	
	public void callOnSivisoChanges()
	{
		for(OnSivisoChange onSivisoChange : onSivisoChanges)
		{
			onSivisoChange.sivisoChanged();
		}
	}
}
