package com.jordan.betcher.siviso.sivisolite.thirdparty.locationManager;

import android.location.Location;
import android.location.LocationListener;

import androidx.annotation.NonNull;

import com.google.android.gms.maps.model.LatLng;

public class LocationListener_CurrentLocation implements LocationListener
{
	public LocationListener_CurrentLocation(Event<LatLng> currentLocationEvent)
	{

	}
	
	@Override
	public void onLocationChanged(@NonNull Location location)
	{
	
	}
	
	public void callWhenReady(OnCurrentLocation onCurrentLocation)
	{
		//TODO LocationListener_CurrentLocation callWhenReady
	}
}
