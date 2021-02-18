package com.jordan.betcher.siviso.sivisolite.service;

import android.app.NotificationManager;
import android.app.Service;
import android.content.res.Resources;
import android.os.Build;

class NotificationChannelSiviso
{
	SingleSivisoNotifactionChannel singleSivisoNotifactionChannel;
	NotificationSiviso notifactionSiviso;
	int SDK = Build.VERSION.SDK_INT;
	private Service service;
	
	public NotificationChannelSiviso(Service service)
	{
		this.service = service;
		notifactionSiviso = new NotificationSiviso(service, new Factory$Notification());
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
