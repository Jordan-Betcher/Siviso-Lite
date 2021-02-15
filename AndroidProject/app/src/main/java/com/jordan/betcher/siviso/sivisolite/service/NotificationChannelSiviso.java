package com.jordan.betcher.siviso.sivisolite.service;

import android.content.Context;
import android.os.Build;

class NotificationChannelSiviso
{
	SingleSivisoNotifactionChannel singleSivisoNotifactionChannel;
	NotificationSiviso notifactionSiviso;
	int SDK = Build.VERSION.SDK_INT;
	
	public NotificationChannelSiviso(Context context)
	{
		notifactionSiviso = new NotificationSiviso();
	}
	
	public void createSingleSivisoNotifactionChannel()
	{
		if(SDK >= Build.VERSION_CODES.O)
		{
			singleSivisoNotifactionChannel = new SingleSivisoNotifactionChannel();
		}
	}
	
	public void startForeground()
	{
		notifactionSiviso.startForeground();
	}
}
