package com.jordan.betcher.siviso.sivisolite.home.Database;

class SivisoChangeEvent
{
	public void addOnSivisoChange(OnSivisoChange onSivisoChange)
	{
		onSivisoChange.sivisoChanged();
	}
	
	public void callOnSivisoChanges()
	{
	
	}
}
