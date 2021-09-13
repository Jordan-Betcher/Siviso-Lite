package com.jordan.betcher.siviso.sivisolite.thirdparty.locationManager;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.location.LocationManager;

import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.sivisolite.thirdparty.permissions.OnPermissionGranted;

public class OnPermissionGranted_StartCurrentLocation
implements OnPermissionGranted
{
	private LocationManager locationManager;
	
	@SuppressLint("MissingPermission")
	public OnPermissionGranted_StartCurrentLocation(
	Resources resources, LocationManager locationManager,
	LocationListener_CurrentLocation currentLocation)
	{
		
		this.locationManager = locationManager;
	}
	
	@SuppressLint("MissingPermission")
	@Override
	public void permissionGranted()
	{
		locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 1, 0,
		                                       new LocationListener_CurrentLocation(new Event<LatLng>()));
	}
}
