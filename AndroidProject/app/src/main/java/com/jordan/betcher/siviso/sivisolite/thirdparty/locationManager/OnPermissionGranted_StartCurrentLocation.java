package com.jordan.betcher.siviso.sivisolite.thirdparty.locationManager;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.location.LocationManager;

import com.jordan.betcher.siviso.sivisolite.R;
import com.jordan.betcher.siviso.sivisolite.thirdparty.permissions.OnPermissionGranted;

public class OnPermissionGranted_StartCurrentLocation
implements OnPermissionGranted
{
	private LocationManager locationManager;
	private String serviceProvider;
	private long minTimeMilliseconds;
	private float minDistanceMeters;
	private LocationListener_CurrentLocation currentLocation;
	
	@SuppressLint("MissingPermission")
	public OnPermissionGranted_StartCurrentLocation(
	Resources resources, LocationManager locationManager,
	LocationListener_CurrentLocation currentLocation)
	{
		this.locationManager = locationManager;
		serviceProvider = LocationManager.GPS_PROVIDER;
		minTimeMilliseconds = resources.getInteger(R.integer.map_min_time_interval_milliseconds);
		minDistanceMeters = resources.getInteger(R.integer.map_min_distance_meters);
		this.currentLocation = currentLocation;
	}
	
	@SuppressLint("MissingPermission")
	@Override
	public void permissionGranted()
	{
		locationManager.requestLocationUpdates(serviceProvider, minTimeMilliseconds, minDistanceMeters, currentLocation);
	}
}
