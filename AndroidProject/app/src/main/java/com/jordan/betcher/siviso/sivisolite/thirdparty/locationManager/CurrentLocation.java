package com.jordan.betcher.siviso.sivisolite.thirdparty.locationManager;

import android.annotation.SuppressLint;
import android.content.Context;
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
	
	public CurrentLocation(Context context)
	{
		createLocationListener(context, this);
	}
	
	@SuppressLint("MissingPermission")
	void createLocationListener(
	Context context,
	CurrentLocation currentLocation)
	{
		LocationListener$CurrentLocation locationListener = new LocationListener$CurrentLocation(currentLocation);
		
		LocationManager
		locationManager
		= (LocationManager) context
		.getApplicationContext()
		.getSystemService(Context.LOCATION_SERVICE);
		
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
