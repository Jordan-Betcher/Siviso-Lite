package com.jordan.betcher.siviso.sivisolite.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import androidx.annotation.Nullable;

public class Service_Siviso extends Service
{
	LocationListenerSiviso locationListener;
	SivisoNotificationChannel notificationChannel;
	
	@Override
	public void onCreate()
	{
		locationListener = new LocationListenerSiviso();
		notificationChannel = new SivisoNotificationChannel();
	}
	
	@Override
	public int onStartCommand(Intent intent, int flags, int startId)
	{
		notificationChannel.openChannel(this);
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
