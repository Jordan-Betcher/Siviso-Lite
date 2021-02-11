package com.jordan.betcher.siviso.sivisolite.service;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class Test$SivisoNotificationChannel
{
	@Test
	public void startForeground_serviceSiviso_callServiceStartForeground()
	{
		
		Wrapper$Notification$Siviso notification = mock(Wrapper$Notification$Siviso.class);
		Service_Siviso serviceSiviso = mock(Service_Siviso.class);
		Wrapper$NotificationManager$Siviso notificationManager = mock(Wrapper$NotificationManager$Siviso.class);
		Wrapper$NotificationChannel$Siviso notificationChannel = mock(Wrapper$NotificationChannel$Siviso.class);
		
		SivisoNotificationChannel sivisoNotificationChannel = new SivisoNotificationChannel(notificationManager, notificationChannel);
		
		sivisoNotificationChannel.startForeground(notification);
		
		verify(notification).startForeground();
	}
	
	@Test
	public void __createNotificationChannel()
	{
		Wrapper$NotificationManager$Siviso notificationManager = mock(Wrapper$NotificationManager$Siviso.class);
		Wrapper$NotificationChannel$Siviso notificationChannel = mock(Wrapper$NotificationChannel$Siviso.class);
		
		SivisoNotificationChannel sivisoNotificationChannel = new SivisoNotificationChannel(notificationManager, notificationChannel);
		
		verify(notificationManager).createNotificationChannel(notificationChannel);
	}
}