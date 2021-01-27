package com.jordan.betcher.siviso.sivisolite.thirdparty.locationManager;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.location.Location;
import android.location.LocationManager;

import com.jordan.betcher.siviso.sivisolite.R;
import com.jordan.betcher.siviso.sivisolite.thirdparty.permissions.OnPermissionGranted;
import com.jordan.betcher.siviso.sivisolite.thirdparty.permissions.Permission$AccessFineLocation;

import java.util.ArrayList;

public class CurrentLocation implements OnPermissionGranted
{
//	static final long SECOND = 1000;
//	static final long MINUTE = 60 * SECOND;
//	static final long MAP_REQUEST_TIME_MIN = 1 * MINUTE;
//	static final long MINIMUM_DISTANCE = 10;
	private int mapMinInterval;
	private int mapMinDistanceToUpdate;
	
	Location currentLocation = null;
	ArrayList<CurrentLocationAction> actions = new ArrayList<>();
	private LocationManager locationManager;
	
	public CurrentLocation(
	LocationManager locationManager,
	Permission$AccessFineLocation permission$AccessFineLocation,
	Resources resources)
	{
		this.locationManager = locationManager;
		permission$AccessFineLocation.addListener(this);
		mapMinInterval = resources.getInteger(R.integer.current_location_min_time_interval);
		mapMinDistanceToUpdate = resources.getInteger(R.integer.current_location_min_distance);
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
	
	@SuppressLint("MissingPermission")
	@Override
	public void permissionGranted()
	{
		LocationListener$CurrentLocation locationListener = new LocationListener$CurrentLocation(this);
		
		locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, mapMinInterval, mapMinDistanceToUpdate, locationListener);
	}
}
