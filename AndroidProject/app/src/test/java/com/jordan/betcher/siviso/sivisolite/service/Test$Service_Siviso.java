package com.jordan.betcher.siviso.sivisolite.service;

import android.app.Service;
import android.content.res.Resources;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class Test$Service_Siviso
{
	Resources resources = mock(Resources.class);
	
	@Test
	public void onCreate__callCreateSingleSivisoNotificationChannel()
	{
		NotificationChannelSiviso notificationChannel = mock(NotificationChannelSiviso.class);
		
		Service_Siviso service = createService();
		service.notificationChannel = notificationChannel;
		service.onCreate();
		
		verify(notificationChannel).createSingleSivisoNotifactionChannel();
	}
	
	@Test
	public void onDestroy__callLocationListenerSivisoStop()
	{
		LocationListenerSiviso locationListener = mock(LocationListenerSiviso.class);
		
		Service_Siviso service = createService();
		service.onCreate();
		service.locationListener = locationListener;
		service.onDestroy();
		
		verify(locationListener).destroy();
	}
	
	@Test
	public void onStartCommand__callLocationListenerSivisoStart()
	{
		LocationListenerSiviso locationListener = mock(LocationListenerSiviso.class);
		NotificationChannelSiviso notificationChannel = mock(NotificationChannelSiviso.class);
		
		Service_Siviso service = createService();
		service.onCreate();
		service.locationListener = locationListener;
		service.notificationChannel = notificationChannel;
		service.onStartCommand(null, 0,0);
		
		verify(locationListener).create();
	}
	
	@Test
	public void onStartCommand__startForeground()
	{
		NotificationChannelSiviso notificationChannel = mock(NotificationChannelSiviso.class);
		
		Service_Siviso service = createService();
		service.onCreate();
		service.notificationChannel = notificationChannel;
		service.onStartCommand(null, 0,0);
		
		verify(notificationChannel).startForeground();
	}
	
	@Test
	public void onStartCommand__StartSticky()
	{
		NotificationChannelSiviso notificationChannel = mock(NotificationChannelSiviso.class);
		Service_Siviso service = createService();
		service.onCreate();
		service.notificationChannel = notificationChannel;
		int actual = service.onStartCommand(null, 0, 0);
		
		assertEquals(actual, Service.START_STICKY);
	}
	
	private Service_Siviso createService()
	{
		return new Service_Siviso_Test();
	}
	
	
	private class Service_Siviso_Test extends Service_Siviso
	{
		@Override
		public Resources getResources()
		{
			return resources;
		}
	}
}