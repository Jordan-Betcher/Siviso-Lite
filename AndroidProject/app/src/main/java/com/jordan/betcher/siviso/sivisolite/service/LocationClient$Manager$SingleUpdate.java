package com.jordan.betcher.siviso.sivisolite.service;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;

class LocationClient$Manager$SingleUpdate extends LocationClient$Manager
{
	public LocationClient$Manager$SingleUpdate(
	FusedLocationProviderClient fusedLocationProviderClient,
	LocationCallback callback)
	{
		super(fusedLocationProviderClient, new Factory$LocationRequestSingleUpdate(), callback);
	}
}
