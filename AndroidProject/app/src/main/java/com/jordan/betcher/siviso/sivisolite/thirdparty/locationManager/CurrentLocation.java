package com.jordan.betcher.siviso.sivisolite.thirdparty.locationManager;

import android.annotation.SuppressLint;
import android.location.Location;
import android.location.LocationManager;

import java.util.ArrayList;

public class CurrentLocation
{
	static final long SECOND = 1000;
	static final long MINUTE = 60 * SECOND;
	static final long MAP_REQUEST_TIME_MIN = 1 * MINUTE;
	static final long MINIMUM_DISTANCE = 10;
	
	Location currentLocation = null;
	ArrayList<CurrentLocationAction> actions = new ArrayList<>();
	
	public CurrentLocation(LocationManager locationManager)
	{
		createLocationListener(locationManager, this);
	}
	
	@SuppressLint("MissingPermission")
	void createLocationListener(
	LocationManager locationManager,
	CurrentLocation currentLocation)
	{
		LocationListener$CurrentLocation locationListener = new LocationListener$CurrentLocation(currentLocation);
		
		locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, MAP_REQUEST_TIME_MIN,
		                                       MINIMUM_DISTANCE, locationListener);
	}
	
	void setCurrentLocation(Location location)
	{
		this.currentLocation = location;
		
		callActions();
	}
	
	public void callWhenReady(CurrentLocationAction action)
	{
		actions.add(action);
		
		callActions();
	}
	
	private void callActions()
	{
		if(currentLocation != null)
		{
			for(CurrentLocationAction action : actions)
			{
				action.currentLocationReady(currentLocation);
			}
			
			actions.clear();
		}
	}
}
