package com.jordan.betcher.siviso.sivisolite.thirdparty.locationManager;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.location.LocationManager;

import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.sivisolite.R;
import com.jordan.betcher.siviso.sivisolite.thirdparty.permissions.OnPermissionGranted;

public class OnPermissionGranted_StartCurrentLocation
implements OnPermissionGranted
{
	private LocationManager locationManager;
	private long minTimeMilliseconds;
	
	@SuppressLint("MissingPermission")
	public OnPermissionGranted_StartCurrentLocation(
	Resources resources, LocationManager locationManager,
	LocationListener_CurrentLocation currentLocation)
	{
		this.locationManager = locationManager;
		
		minTimeMilliseconds = resources.getInteger(R.integer.map_min_time_interval_milliseconds);
	}
	
	@SuppressLint("MissingPermission")
	@Override
	public void permissionGranted()
	{
		locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, minTimeMilliseconds, 1,
		                                       new LocationListener_CurrentLocation(new Event<LatLng>()));
	}
}
