package com.jordan.betcher.siviso.sivisolite.service;

import android.content.Context;
import android.content.res.Resources;
import android.media.AudioManager;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationServices;
import com.jordan.betcher.siviso.sivisolite.home.Database.Database;
import com.jordan.betcher.siviso.sivisolite.home.Database.StoreSiviso$Default;
import com.jordan.betcher.siviso.sivisolite.home.Database.StoreSiviso$Home;

import static android.content.Context.AUDIO_SERVICE;

class FusedLocationClientSiviso
{
	LocationClient$Manager client;
	
	public FusedLocationClientSiviso(Context context)
	{
		Resources resources = context.getResources();
		Factory$LocationRequestPowerSaver factory$LocationRequestPowerSaver = new Factory$LocationRequestPowerSaver(resources);
		Factory$LocationRequestSingleUpdate factory$LocationRequestSingleUpdate = new Factory$LocationRequestSingleUpdate();
		FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(context);
		
		Database database = new Database(context);
		StoreSiviso$Home home = database.homee();
		LocationChecker locationChecker = new LocationChecker(home, resources);
		
		StoreSiviso$Default defaultt = database.defaultt();
		AudioManager audioManager = (AudioManager) context.getSystemService(AUDIO_SERVICE);
		RingmodeControl ringmodeControl = new RingmodeControl(audioManager, home, defaultt);
		LocationCallback callback = new LocationCallback$Siviso(locationChecker, ringmodeControl);
		client = new LocationClient$Manager(fusedLocationProviderClient, factory$LocationRequestPowerSaver,
		                                    callback);
		//LocationClient$Continual fastUpdate = new LocationClient$FastUpdate();
		//new OnPreferenceChange$FastUpdate(preferences, fastUpdate);
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
