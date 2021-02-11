package com.jordan.betcher.siviso.sivisolite.service;

class SivisoNotificationChannel
{
	public SivisoNotificationChannel(Wrapper$NotificationManager$Siviso notificationManager, Wrapper$NotificationChannel$Siviso notificationChannel)
	{
		notificationManager.createNotificationChannel(notificationChannel);
	}
	
	public void startForeground(Wrapper$Notification$Siviso notification)
	{
		notification.startForeground();
	}
}
