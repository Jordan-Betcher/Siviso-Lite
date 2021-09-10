package com.jordan.betcher.siviso.sivisolite.service;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.res.Resources;
import android.os.Build;

public class NotificationChannelSiviso
{
	Factory$Notification factory;
	int SDK = Build.VERSION.SDK_INT;
	private Service service;
	
	public NotificationChannelSiviso(Service service)
	{
		this.service = service;
		this.factory = new Factory$Notification(service);
	}
	
	public void createSingleSivisoNotifactionChannel()
	{
		if(SDK >= Build.VERSION_CODES.O)
		{
			Resources resources = service.getResources();
			NotificationManager notificationManager = service
			.getSystemService(NotificationManager.class);
			Factory$NotificationChannel$Siviso factory = new Factory$NotificationChannel$Siviso(resources);
			new SingleSivisoNotifactionChannel(notificationManager, factory);
		}
	}
	
	public void startForeground()
	{
		Notification notification = factory.create();
		service.startForeground(1, notification);
	}
}
