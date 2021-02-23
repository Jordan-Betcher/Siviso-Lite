package com.jordan.betcher.siviso.sivisolite.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

public class Service_Siviso extends Service
{
	private static final String TAG = "Service_Siviso";
	LocationListenerSiviso locationListener;
	NotificationChannelSiviso notificationChannel;
	
	@Override
	public void onCreate()
	{
		Log.d(TAG, "onCreate: ");
		locationListener = new LocationListenerSiviso();
		notificationChannel = new NotificationChannelSiviso(this);
		notificationChannel.createSingleSivisoNotifactionChannel();
	}
	
	@Override
	public int onStartCommand(Intent intent, int flags, int startId)
	{
		Log.d(TAG, "onStartCommand: ");
		notificationChannel.startForeground();
		locationListener.create();
		return Service.START_STICKY;
	}
	
	@Override
	public void onDestroy()
	{
		locationListener.destroy();
	}
	
	@Nullable
	@Override
	public IBinder onBind(Intent intent)
	{
		return null;
	}
}
