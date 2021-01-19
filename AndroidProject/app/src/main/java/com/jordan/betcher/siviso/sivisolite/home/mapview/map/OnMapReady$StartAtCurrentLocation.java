package com.jordan.betcher.siviso.sivisolite.home.mapview.map;

import android.location.Location;

import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.OnMapReady;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.Wrapper$Map;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.MapCreator;
import com.jordan.betcher.siviso.sivisolite.thirdparty.locationManager.CurrentLocation;
import com.jordan.betcher.siviso.sivisolite.thirdparty.locationManager.CurrentLocationAction;

class OnMapReady$StartAtCurrentLocation implements OnMapReady, CurrentLocationAction
{
	private Wrapper$Map wrapper$map = null;
	private Location location = null;
	
	OnMapReady$StartAtCurrentLocation(MapCreator mapCreator, CurrentLocation currentLocation)
	{
		mapCreator.callWhenReady(this);
		currentLocation.callWhenReady(this);
	}
	
	@Override
	public void mapReady(Wrapper$Map wrapper$map)
	{
		this.wrapper$map = wrapper$map;
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
		if(wrapper$map != null && location != null)
		{
			wrapper$map.goToLocation(location);
		}
	}
}
