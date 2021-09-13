package com.jordan.betcher.siviso.sivisolite.thirdparty.locationManager;

import android.location.Location;
import android.location.LocationListener;

import androidx.annotation.NonNull;

import com.google.android.gms.maps.model.LatLng;

public class LocationListener_CurrentLocation implements LocationListener
{
	private Event<LatLng> currentLocationEvent;
	
	public LocationListener_CurrentLocation(Event<LatLng> currentLocationEvent)
	{
		this.currentLocationEvent = currentLocationEvent;
	}
	
	@Override
	public void onLocationChanged(@NonNull Location location)
	{
		currentLocationEvent.call(new LatLng(location.getLatitude(), location.getLongitude()));
	}
	
	public void callWhenReady(OnCurrentLocation onCurrentLocation)
	{
	
	}
}
