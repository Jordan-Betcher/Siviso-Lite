package com.jordan.betcher.siviso.sivisolite.thirdparty.locationManager;

import android.location.Location;
import android.location.LocationListener;

import androidx.annotation.NonNull;

import com.google.android.gms.maps.model.LatLng;

public class LocationListener_CurrentLocation implements LocationListener
{
	private CallOnce<LatLng> currentLocationEvent;
	
	public LocationListener_CurrentLocation(CallOnce<LatLng> currentLocationEvent)
	{
		this.currentLocationEvent = currentLocationEvent;
	}
	
	@Override
	public void onLocationChanged(@NonNull Location location)
	{
		LatLng latLng = new LatLng(location.getLatitude(), location.getLongitude());
		currentLocationEvent.call(latLng);
	}
	
	public void callOnce(OnCurrentLocation onCurrentLocation)
	{
		currentLocationEvent.add(onCurrentLocation);
	}
}
