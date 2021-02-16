package com.jordan.betcher.siviso.sivisolite.service;

import android.app.NotificationChannel;
import android.app.NotificationManager;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class Test$SingleSivisoNotifactionChannel
{
	@Test
	public void _channelExists_notCreateNotificationChannel()
	{
		String channelID = "1";
		Factory$NotificationChannel$Siviso factory$NotificationChannel = mock(Factory$NotificationChannel$Siviso.class);
		NotificationChannel notificationChannel = mock(NotificationChannel.class);
		NotificationManager notificationManager = mock(NotificationManager.class);
		when(factory$NotificationChannel.create()).thenReturn(notificationChannel);
		when(factory$NotificationChannel.getId()).thenReturn(channelID);
		when(notificationManager.getNotificationChannel(channelID)).thenReturn(notificationChannel);
		
		new SingleSivisoNotifactionChannel(notificationManager, factory$NotificationChannel);
		
		verify(notificationManager, times(0)).createNotificationChannel(notificationChannel);
	}
	
	@Test
	public void _channelNotExists_createNotificationChannel()
	{
		String channelID = "1";
		Factory$NotificationChannel$Siviso factory$NotificationChannel = mock(Factory$NotificationChannel$Siviso.class);
		NotificationChannel notificationChannel = mock(NotificationChannel.class);
		NotificationManager notificationManager = mock(NotificationManager.class);
		when(factory$NotificationChannel.create()).thenReturn(notificationChannel);
		when(notificationChannel.getId()).thenReturn(channelID);
		when(notificationManager.getNotificationChannel(channelID)).thenReturn(null);
		
		new SingleSivisoNotifactionChannel(notificationManager, factory$NotificationChannel);
		
		verify(notificationManager, times(1)).createNotificationChannel(notificationChannel);
	}
}