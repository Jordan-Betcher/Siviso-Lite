package com.jordan.betcher.siviso.sivisolite.service;

import android.app.NotificationManager;
import android.app.Service;
import android.content.res.Resources;
import android.os.Build;

import androidx.core.app.NotificationCompat;

class NotificationChannelSiviso
{
	SingleSivisoNotifactionChannel singleSivisoNotifactionChannel;
	NotificationSiviso notifactionSiviso;
	int SDK = Build.VERSION.SDK_INT;
	private Service service;
	
	public NotificationChannelSiviso(Service service)
	{
		this.service = service;
		Resources resources = service.getResources();
		NotificationCompat.Builder builder = new NotificationCompat.Builder(service, "");
		Factory$PendingIntent factory$PendingIntent = new Factory$PendingIntent();
		Factory$Notification factory = new Factory$Notification(resources, builder, factory$PendingIntent);
		notifactionSiviso = new NotificationSiviso(service, factory);
	}
	
	public void createSingleSivisoNotifactionChannel()
	{
		if(SDK >= Build.VERSION_CODES.O)
		{
			Resources resources = service.getResources();
			NotificationManager notificationManager = service
			.getSystemService(NotificationManager.class);
			Factory$NotificationChannel$Siviso factory = new Factory$NotificationChannel$Siviso(resources);
			singleSivisoNotifactionChannel = new SingleSivisoNotifactionChannel(notificationManager, factory);
		}
	}
	
	public void startForeground()
	{
		notifactionSiviso.startForeground();
	}
}
