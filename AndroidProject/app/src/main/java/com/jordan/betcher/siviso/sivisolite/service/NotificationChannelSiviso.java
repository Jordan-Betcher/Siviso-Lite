package com.jordan.betcher.siviso.sivisolite.service;

import android.app.NotificationManager;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;

class NotificationChannelSiviso
{
	SingleSivisoNotifactionChannel singleSivisoNotifactionChannel;
	NotificationSiviso notifactionSiviso;
	int SDK = Build.VERSION.SDK_INT;
	private Context context;
	
	public NotificationChannelSiviso(Context context)
	{
		this.context = context;
		notifactionSiviso = new NotificationSiviso();
	}
	
	public void createSingleSivisoNotifactionChannel()
	{
		if(SDK >= Build.VERSION_CODES.O)
		{
			Resources resources = context.getResources();
			NotificationManager notificationManager = context.getSystemService(NotificationManager.class);
			Factory$NotificationChannel$Siviso factory = new Factory$NotificationChannel$Siviso(resources);
			singleSivisoNotifactionChannel = new SingleSivisoNotifactionChannel(notificationManager, factory);
		}
	}
	
	public void startForeground()
	{
		notifactionSiviso.startForeground();
	}
}
