package com.jordan.betcher.siviso.sivisolite.service;

import android.content.res.Resources;

import com.google.android.gms.location.LocationRequest;
import com.jordan.betcher.siviso.sivisolite.R;

class Factory$LocationRequest
{
	int interval;
	float smallestDisplacement;
	
	public Factory$LocationRequest(Resources resources)
	{
		interval = resources.getInteger(R.integer.location_request_interval_milliseconds);
		smallestDisplacement = resources.getInteger(R.integer.location_request_smallest_displacement_meters);
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
