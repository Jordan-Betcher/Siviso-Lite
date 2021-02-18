package com.jordan.betcher.siviso.sivisolite.service;

import android.app.NotificationManager;
import android.app.Service;
import android.content.res.Resources;
import android.os.Build;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class Test$NotificationChannelSiviso
{
	@Test
	public void __NotifactionSivisoNotNull()
	{
		Service service = mock(Service.class);
		NotificationManager notificationManager = mock(NotificationManager.class);
		when(service.getSystemService(NotificationManager.class)).thenReturn(notificationManager);
		
		NotificationChannelSiviso notificationChannelSiviso = new NotificationChannelSiviso(service);
		
		NotificationSiviso actualNotificationSiviso = notificationChannelSiviso.notifactionSiviso;
		assertNotNull(actualNotificationSiviso);
	}
	
	@Test
	public void startForeground__callNotifactionSivisoStartForeground()
	{
		NotificationSiviso notifactionSiviso = mock(NotificationSiviso.class);
		Service service = mock(Service.class);
		NotificationManager notificationManager = mock(NotificationManager.class);
		when(service.getSystemService(NotificationManager.class)).thenReturn(notificationManager);
		
		NotificationChannelSiviso notificationChannelSiviso = new NotificationChannelSiviso(service);
		notificationChannelSiviso.notifactionSiviso = notifactionSiviso;
		notificationChannelSiviso.startForeground();
		
		verify(notifactionSiviso).startForeground();
	}
	
	
	@Test
	public void createNotifactionChannel_SDKOPlus1_createNotifactionChannelNotNull()
	{
		int SDK = Build.VERSION_CODES.O + 1;
		Service service = mock(Service.class);
		NotificationManager notificationManager = mock(NotificationManager.class);
		when(service.getSystemService(NotificationManager.class)).thenReturn(notificationManager);
		when(service.getResources()).thenReturn(mock(Resources.class));
		
		NotificationChannelSiviso notificationChannelSiviso = new NotificationChannelSiviso(service);
		notificationChannelSiviso.SDK = SDK;
		notificationChannelSiviso.createSingleSivisoNotifactionChannel();
		
		SingleSivisoNotifactionChannel singleSivisoNotifactionChannel = notificationChannelSiviso.singleSivisoNotifactionChannel;
		assertNotNull(singleSivisoNotifactionChannel);
	}
	
	@Test
	public void createNotifactionChannel_SDKOMinus1_createNotifactionChannelIsNull()
	{
		int SDK = Build.VERSION_CODES.O - 1;
		Service service = mock(Service.class);
		NotificationManager notificationManager = mock(NotificationManager.class);
		when(service.getSystemService(NotificationManager.class)).thenReturn(notificationManager);
		
		NotificationChannelSiviso notificationChannelSiviso = new NotificationChannelSiviso(service);
		notificationChannelSiviso.SDK = SDK;
		notificationChannelSiviso.createSingleSivisoNotifactionChannel();
		
		SingleSivisoNotifactionChannel singleSivisoNotifactionChannel = notificationChannelSiviso.singleSivisoNotifactionChannel;
		assertNull(singleSivisoNotifactionChannel);
	}
	
	@Test
	public void createNotifactionChannel_SDKO_createNotifactionChannelNotNull()
	{
		int SDK = Build.VERSION_CODES.O;
		Service service = mock(Service.class);
		NotificationManager notificationManager = mock(NotificationManager.class);
		when(service.getSystemService(NotificationManager.class)).thenReturn(notificationManager);
		when(service.getResources()).thenReturn(mock(Resources.class));
		
		NotificationChannelSiviso notificationChannelSiviso = new NotificationChannelSiviso(service);
		notificationChannelSiviso.SDK = SDK;
		notificationChannelSiviso.createSingleSivisoNotifactionChannel();
		
		SingleSivisoNotifactionChannel singleSivisoNotifactionChannel = notificationChannelSiviso.singleSivisoNotifactionChannel;
		assertNotNull(singleSivisoNotifactionChannel);
	}
}