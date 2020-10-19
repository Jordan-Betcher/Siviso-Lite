package com.jordan.betcher.siviso.sivisolite.home;

import android.location.Location;

import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.Map;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.MapAction;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.MapCreator;
import com.jordan.betcher.siviso.sivisolite.thirdparty.locationManager.CurrentLocation;
import com.jordan.betcher.siviso.sivisolite.thirdparty.locationManager.CurrentLocationAction;

class GoToCurrentLocation implements MapAction, CurrentLocationAction
{
	private Map map = null;
	private Location location = null;
	
	GoToCurrentLocation(MapCreator mapCreator, CurrentLocation currentLocation)
	{
		mapCreator.callWhenReady(this);
		currentLocation.callWhenReady(this);
	}
	
	@Override
	public void mapReady(Map map)
	{
		this.map = map;
		goToCurrentLocation();
	}
	
	@Override
	public void currentLocationReady(Location location)
	{
		this.location = location;
		goToCurrentLocation();
	}
	
	private void goToCurrentLocation()
	{
		if(map != null && location != null)
		{
			map.goToLocation(location);
		}
	}
}
