package com.jordan.betcher.siviso.sivisolite.thirdparty.locationManager;

public class Event<T>
{
	private On<T> on;
	
	public void call(T t)
	{
		on.call(t);
	}
	
	public void add(On<T> on)
	{
		if(this.on == null) this.on = on;
	}
}
