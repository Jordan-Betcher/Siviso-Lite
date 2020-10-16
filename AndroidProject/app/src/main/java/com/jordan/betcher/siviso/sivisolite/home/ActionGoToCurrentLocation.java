package com.jordan.betcher.siviso.sivisolite.home;

import android.content.Context;
import android.location.Location;

import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.Map;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.MapAction;
import com.jordan.betcher.siviso.sivisolite.thirdparty.locationManager.CurrentLocationAction;

class ActionGoToCurrentLocation implements MapAction, CurrentLocationAction
{
	private Context context;
	
	ActionGoToCurrentLocation(Context context)
	{
		//this.context = context;
	}
	
	@Override
	public void mapReady(Map map)
	{
		/*
		CurrentLocation currentLocation = new CurrentLocation(context);
		currentLocation.callWhenReady(new CurrentLocationAction$GoToLocation(map));
		//*/
	}
	
	@Override
	public void currentLocationReady(Location location)
	{
		// map.goToLocation(location);
	}
}
