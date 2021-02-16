package com.jordan.betcher.siviso.sivisolite.service;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;

import androidx.annotation.RequiresApi;

class SingleSivisoNotifactionChannel
{
	@RequiresApi(api = Build.VERSION_CODES.O)
	public SingleSivisoNotifactionChannel(NotificationManager notificationManager, Factory$NotificationChannel$Siviso factory)
	{
		NotificationChannel notificationChannel = factory.create();
		String channelId = factory.id();
		if(notificationManager.getNotificationChannel(channelId) == null)
		{
			notificationManager.createNotificationChannel(notificationChannel);
		}
	}
}
