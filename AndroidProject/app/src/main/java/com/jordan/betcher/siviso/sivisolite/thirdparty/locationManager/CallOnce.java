package com.jordan.betcher.siviso.sivisolite.thirdparty.locationManager;

import java.util.ArrayList;

public class CallOnce<T>
{
	private ArrayList<On<T>> ons = new ArrayList<>();
	private T t;
	
	public void call(T t)
	{
		this.t = t;
		for(On<T> on : ons)
		{
			on.call(t);
		}
		
		ons.clear();
	}
	
	public void add(On<T> on)
	{
		if(t == null)
		{
			ons.add(on);
		}
		else
		{
			on.call(t);
		}
	}
}
