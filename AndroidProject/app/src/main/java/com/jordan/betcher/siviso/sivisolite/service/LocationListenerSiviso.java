package com.jordan.betcher.siviso.sivisolite.service;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.location.LocationManager;

import com.jordan.betcher.siviso.sivisolite.R;

class LocationListenerSiviso
{
	Criteria$Siviso criteria;
	LocationListener$Siviso listener;
	LocationManager locationManager;
	Resources resources;
	
	public LocationListenerSiviso(Service_Siviso serviceSiviso)
	{
		locationManager = (LocationManager) serviceSiviso
		.getSystemService(Context.LOCATION_SERVICE);
		resources = serviceSiviso.getResources();
		
		listener = new LocationListener$Siviso();
		criteria = new Criteria$Siviso();
	}
	
	@SuppressLint("MissingPermission")
	public void create()
	{
		long minTime = resources.getInteger(R.integer.location_listener_min_milliseconds);
		float minDistance = resources.getInteger(R.integer.location_listener_min_meters);
		String provider = locationManager.getBestProvider(criteria, true);
		locationManager.requestLocationUpdates(provider, minTime, minDistance, listener);
	}
	
	public void destroy()
	{
		locationManager.removeUpdates(listener);
	}
}
