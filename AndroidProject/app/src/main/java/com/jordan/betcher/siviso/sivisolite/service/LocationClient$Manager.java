package com.jordan.betcher.siviso.sivisolite.service;

import android.annotation.SuppressLint;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;

class LocationClient$Manager
{
	private FusedLocationProviderClient fusedLocationProviderClient;
	private LocationRequest locationRequest;
	private LocationCallback callback;
	
	public LocationClient$Manager(
	FusedLocationProviderClient fusedLocationProviderClient,
	Factory$LocationRequestPowerSaver locationRequestFactory,
	LocationCallback callback)
	{
		this.fusedLocationProviderClient = fusedLocationProviderClient;
		this.locationRequest = locationRequestFactory.create();
		this.callback = callback;
	}
	
	@SuppressLint("MissingPermission")
	public void start()
	{
		fusedLocationProviderClient.requestLocationUpdates(locationRequest, callback, null);
	}
	
	public void stop()
	{
		fusedLocationProviderClient.removeLocationUpdates(callback);
	}
}
