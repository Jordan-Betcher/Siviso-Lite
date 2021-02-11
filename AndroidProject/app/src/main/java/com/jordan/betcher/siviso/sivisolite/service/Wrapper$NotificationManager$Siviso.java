package com.jordan.betcher.siviso.sivisolite.service;

import android.os.Build;

class Wrapper$NotificationManager$Siviso
{
	int buildVersion = Build.VERSION.SDK_INT;
	
	public void createNotificationChannel(Wrapper$NotificationChannel$Siviso notificationChannel)
	{
		if(buildVersion > 25)
		{
			notificationChannel.create();
		}
	}
}
