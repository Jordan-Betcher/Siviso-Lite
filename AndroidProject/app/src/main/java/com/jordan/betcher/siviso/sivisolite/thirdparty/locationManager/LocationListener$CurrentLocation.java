package com.jordan.betcher.siviso.sivisolite.thirdparty.locationManager;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

class LocationListener$CurrentLocation implements LocationListener
{
	
	CurrentLocation currentLocation;
	
	public LocationListener$CurrentLocation(CurrentLocation currentLocation)
	{
		this.currentLocation = currentLocation;
	}
	
	@Override
	public void onLocationChanged(Location location)
	{
		currentLocation.setCurrentLocation(location);
	}
	
	@Override
	public void onStatusChanged(String provider, int status, Bundle extras)
	{
	
	}
	
	@Override
	public void onProviderEnabled(String provider)
	{
	
	}
	
	@Override
	public void onProviderDisabled(String provider)
	{
	
	}
}
