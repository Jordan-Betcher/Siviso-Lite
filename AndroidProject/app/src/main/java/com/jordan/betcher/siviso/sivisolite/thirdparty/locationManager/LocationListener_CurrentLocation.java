package com.jordan.betcher.siviso.sivisolite.thirdparty.locationManager;

import android.location.Location;
import android.location.LocationListener;

import androidx.annotation.NonNull;

import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.OnMapReady;

public class LocationListener_CurrentLocation implements LocationListener
{
	public LocationListener_CurrentLocation(Event<LatLng> currentLocationEvent)
	{
		//TODO LocationListener_CurrentLocation LocationListener_CurrentLocation
	}
	
	@Override
	public void onLocationChanged(@NonNull Location location)
	{
	
	}
	
	public void callWhenReady(OnMapReady onMapReady)
	{
		//TODO LocationListener_CurrentLocation callWhenReady
	}
}
