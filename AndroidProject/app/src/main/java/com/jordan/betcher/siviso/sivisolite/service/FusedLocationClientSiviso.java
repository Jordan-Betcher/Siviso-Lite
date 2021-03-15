package com.jordan.betcher.siviso.sivisolite.service;

import android.content.Context;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;

class FusedLocationClientSiviso
{
	FusedLocationProviderClient$Siviso client;
	
	public FusedLocationClientSiviso(Context context)
	{
		Factory$LocationRequest factory$LocationRequest = new Factory$LocationRequest();
		FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(context);
		client = new FusedLocationProviderClient$Siviso(fusedLocationProviderClient, factory$LocationRequest);
	}
	
	public void start()
	{
		client.start();
	}
	
	public void stop()
	{
		client.stop();
	}
}
