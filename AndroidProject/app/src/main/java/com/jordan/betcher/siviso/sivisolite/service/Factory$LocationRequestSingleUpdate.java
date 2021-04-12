package com.jordan.betcher.siviso.sivisolite.service;

import com.google.android.gms.location.LocationRequest;

class Factory$LocationRequestSingleUpdate
{
	public LocationRequest create()
	{
		LocationRequest locationRequest = LocationRequest.create();
		locationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);
		locationRequest.setInterval(1);
		locationRequest.setNumUpdates(1);
		locationRequest.setSmallestDisplacement(0);
		return locationRequest;
	}
}
