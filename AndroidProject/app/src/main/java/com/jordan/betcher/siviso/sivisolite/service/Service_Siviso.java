package com.jordan.betcher.siviso.sivisolite.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import androidx.annotation.Nullable;

public class Service_Siviso extends Service
{
	Wrapper$Notification$Siviso notification;
	LocationListenerSiviso locationListener;
	SivisoNotificationChannel notificationChannel;
	
	@Override
	public void onCreate()
	{
		locationListener = new LocationListenerSiviso();
		
		Wrapper$NotificationManager$Siviso manager = new Wrapper$NotificationManager$Siviso();
		Wrapper$NotificationChannel$Siviso channel = new Wrapper$NotificationChannel$Siviso();
		notificationChannel = new SivisoNotificationChannel(manager, channel);
		
		notification = new Wrapper$Notification$Siviso();
	}
	
	@Override
	public int onStartCommand(Intent intent, int flags, int startId)
	{
		notificationChannel.startForeground(notification);
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
