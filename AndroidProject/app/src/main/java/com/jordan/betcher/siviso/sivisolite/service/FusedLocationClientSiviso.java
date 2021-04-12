package com.jordan.betcher.siviso.sivisolite.service;

import android.content.Context;
import android.content.SharedPreferences;
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
	OnPreferenceChange$SingleUpdate dataChangeListener;
	
	public FusedLocationClientSiviso(Context context)
	{
		Resources resources = context.getResources();
		Factory$LocationRequestPowerSaver locationRequestPowerSaver = new Factory$LocationRequestPowerSaver(resources);
		FusedLocationProviderClient fusedLocation = LocationServices.getFusedLocationProviderClient(context);
		SharedPreferences preferences = context.getSharedPreferences(Database.sharedPreferncesName, Context.MODE_PRIVATE);
		
		Database database = new Database(context);
		StoreSiviso$Home home = database.homee();
		LocationChecker locationChecker = new LocationChecker(home, resources);
		
		StoreSiviso$Default defaultt = database.defaultt();
		AudioManager audioManager = (AudioManager) context.getSystemService(AUDIO_SERVICE);
		RingmodeControl ringmodeControl = new RingmodeControl(audioManager, home, defaultt);
		LocationCallback callback = new LocationCallback$Siviso(locationChecker, ringmodeControl);
		client = new LocationClient$Manager(fusedLocation, locationRequestPowerSaver, callback);
		LocationClient$Manager$SingleUpdate singleUpdate = new LocationClient$Manager$SingleUpdate(fusedLocation, callback);
		singleUpdate.start();
		dataChangeListener = new OnPreferenceChange$SingleUpdate(preferences, singleUpdate);
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
