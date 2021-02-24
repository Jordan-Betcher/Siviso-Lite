package com.jordan.betcher.siviso.sivisolite.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import androidx.annotation.Nullable;

public class Service_Siviso extends Service
{
	LocationListenerSiviso locationListener;
	NotificationChannelSiviso notificationChannel;
	
	@Override
	public void onCreate()
	{
		locationListener = new LocationListenerSiviso(this);
		notificationChannel = new NotificationChannelSiviso(this);
		notificationChannel.createSingleSivisoNotifactionChannel();
	}
	
	@Override
	public int onStartCommand(Intent intent, int flags, int startId)
	{
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
