package com.jordan.betcher.siviso.sivisolite.service;

import android.app.Service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class Test$Service_Siviso
{
	@Test
	public void onDestroy__callLocationListenerSivisoStop()
	{
		LocationListenerSiviso locationListener = mock(LocationListenerSiviso.class);
		
		Service_Siviso service = createServiceLikeSystemWould();
		service.locationListener = locationListener;
		service.onDestroy();
		
		verify(locationListener).destroy();
	}
	
	@Test
	public void onStartCommand__callLocationListenerSivisoStart()
	{
		LocationListenerSiviso locationListener = mock(LocationListenerSiviso.class);
		
		Service_Siviso service = createServiceLikeSystemWould();
		service.locationListener = locationListener;
		service.onStartCommand(null, 0,0);
		
		verify(locationListener).create();
	}
	
	@Test
	public void onStartCommand__openNotification()
	{
		SivisoNotificationChannel notificationChannel = mock(SivisoNotificationChannel.class);
		
		Service_Siviso service = createServiceLikeSystemWould();
		service.notificationChannel = notificationChannel;
		service.onStartCommand(null, 0,0);
		
		verify(notificationChannel).openChannel(service);
	}
	
	@Test
	public void onStartCommand__StartSticky()
	{
		Service_Siviso service = createServiceLikeSystemWould();
		int actual = service.onStartCommand(null, 0, 0);
		
		assertEquals(actual, Service.START_STICKY);
	}
	
	private Service_Siviso createServiceLikeSystemWould()
	{
		Service_Siviso service = new Service_Siviso();
		service.onCreate();
		return service;
	}
}