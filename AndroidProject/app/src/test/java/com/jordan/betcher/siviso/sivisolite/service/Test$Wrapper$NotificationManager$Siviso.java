package com.jordan.betcher.siviso.sivisolite.service;

import android.app.NotificationManager;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class Test$Wrapper$NotificationManager$Siviso
{
	@Test
	public void createNotificationChannel_BuildSDK24AndChannelNull_noCallChannelCreate()
	{
		int buildVersion = 24;
		Wrapper$NotificationChannel$Siviso channel = mock(Wrapper$NotificationChannel$Siviso.class);
		NotificationManager notificationManager = mock(NotificationManager.class);
		Service_Siviso serviceSiviso = mock(Service_Siviso.class);
		when(serviceSiviso.getSystemService(NotificationManager.class)).thenReturn(notificationManager);
		
		Wrapper$NotificationManager$Siviso wrapper = new Wrapper$NotificationManager$Siviso();
		wrapper.buildVersion = buildVersion;
		wrapper.createNotificationChannel(channel);
		
		verify(channel, times(0)).create();
	}
	
	@Test
	public void createNotificationChannel_BuildSDK27AndChannelNull_callChannelCreate()
	{
		int buildVersion = 27;
		Wrapper$NotificationChannel$Siviso channel = mock(Wrapper$NotificationChannel$Siviso.class);
		NotificationManager notificationManager = mock(NotificationManager.class);
		Service_Siviso serviceSiviso = mock(Service_Siviso.class);
		when(serviceSiviso.getSystemService(NotificationManager.class)).thenReturn(notificationManager);
		
		Wrapper$NotificationManager$Siviso wrapper = new Wrapper$NotificationManager$Siviso();
		wrapper.buildVersion = buildVersion;
		wrapper.createNotificationChannel(channel);
		
		verify(channel, times(1)).create();
	}
	
	@Test
	public void createNotificationChannel_BuildSDK25AndChannelNull_noCallChannelCreate()
	{
		int buildVersion = 25;
		Wrapper$NotificationChannel$Siviso channel = mock(Wrapper$NotificationChannel$Siviso.class);
		NotificationManager notificationManager = mock(NotificationManager.class);
		Service_Siviso serviceSiviso = mock(Service_Siviso.class);
		when(serviceSiviso.getSystemService(NotificationManager.class)).thenReturn(notificationManager);
		
		Wrapper$NotificationManager$Siviso wrapper = new Wrapper$NotificationManager$Siviso();
		wrapper.buildVersion = buildVersion;
		wrapper.createNotificationChannel(channel);
		
		verify(channel, times(0)).create();
	}
	
	@Test
	public void createNotificationChannel_BuildSDK26AndChannelNull_callChannelCreate()
	{
		int buildVersion = 26;
		Wrapper$NotificationChannel$Siviso channel = mock(Wrapper$NotificationChannel$Siviso.class);
		NotificationManager notificationManager = mock(NotificationManager.class);
		Service_Siviso serviceSiviso = mock(Service_Siviso.class);
		when(serviceSiviso.getSystemService(NotificationManager.class)).thenReturn(notificationManager);
		
		Wrapper$NotificationManager$Siviso wrapper = new Wrapper$NotificationManager$Siviso();
		wrapper.buildVersion = buildVersion;
		wrapper.createNotificationChannel(channel);
		
		verify(channel, times(1)).create();
	}
}