package com.jordan.betcher.siviso.sivisolite.thirdparty.locationManager;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.location.LocationManager;

import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.sivisolite.thirdparty.permissions.OnPermissionGranted;

public class OnPermissionGranted_StartCurrentLocation
implements OnPermissionGranted
{
	@SuppressLint("MissingPermission")
	public OnPermissionGranted_StartCurrentLocation(
	Resources resources, LocationManager locationManager,
	LocationListener_CurrentLocation currentLocation)
	{
		locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0,
		                                       new LocationListener_CurrentLocation(new Event<LatLng>()));
	}
	
	@SuppressLint("MissingPermission")
	@Override
	public void permissionGranted()
	{
		
		//TODO OnPermissionGranted_StartCurrentLocation OnPermissionGranted_StartCurrentLocation
		/*
		float minTime = 0;
		long minDistance = 0;
		locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, minDistance, minTime,
		                                       currentLocation);
		//*/
	}
	//TODO
}
