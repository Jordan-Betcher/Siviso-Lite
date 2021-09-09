package com.jordan.betcher.siviso.sivisolite.home.Database;

class SivisoChangeEvent
{
	private OnSivisoChange onSivisoChange;
	
	public void addOnSivisoChange(OnSivisoChange onSivisoChange)
	{
		if(this.onSivisoChange == null)
			this.onSivisoChange = onSivisoChange;
	}
	
	public void callOnSivisoChanges()
	{
		onSivisoChange.sivisoChanged();
	}
}
