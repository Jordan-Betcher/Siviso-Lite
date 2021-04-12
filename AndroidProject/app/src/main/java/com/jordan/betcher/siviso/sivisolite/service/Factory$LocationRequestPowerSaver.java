package com.jordan.betcher.siviso.sivisolite.service;

import android.content.res.Resources;

import com.google.android.gms.location.LocationRequest;
import com.jordan.betcher.siviso.sivisolite.R;

class Factory$LocationRequestPowerSaver implements Factory$LocationRequest
{
	int interval;
	float smallestDisplacement;
	
	public Factory$LocationRequestPowerSaver(Resources resources)
	{
		interval = resources.getInteger(R.integer.location_request_power_saver_interval_milliseconds);
		smallestDisplacement = resources.getInteger(R.integer.location_request_power_saver_smallest_displacement_meters);
	}
	
	public LocationRequest create()
	{
		LocationRequest locationRequest = LocationRequest.create();
		locationRequest.setPriority(LocationRequest.PRIORITY_LOW_POWER);
		locationRequest.setInterval(interval);
		locationRequest.setWaitForAccurateLocation(true);
		locationRequest.setSmallestDisplacement(smallestDisplacement);
		return locationRequest;
	}
}
