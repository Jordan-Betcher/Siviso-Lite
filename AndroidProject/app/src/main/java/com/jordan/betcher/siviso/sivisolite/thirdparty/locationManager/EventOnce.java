package com.jordan.betcher.siviso.sivisolite.thirdparty.locationManager;

import java.util.ArrayList;

public class EventOnce<T>
{
	private ArrayList<On<T>> ons = new ArrayList<>();
	
	public void call(T t)
	{
		for(On<T> on : ons)
		{
			on.call(t);
		}
		
		ons.clear();
	}
	
	public void add(On<T> on)
	{
		ons.add(on);
	}
}
