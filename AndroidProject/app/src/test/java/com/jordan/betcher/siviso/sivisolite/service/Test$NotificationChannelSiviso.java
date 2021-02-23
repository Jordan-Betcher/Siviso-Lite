package com.jordan.betcher.siviso.sivisolite.service;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.res.Resources;
import android.os.Build;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.eq;
import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(PowerMockRunner.class)
@Config(manifest = Config.NONE)
@PrepareForTest({PendingIntent.class})
public class Test$NotificationChannelSiviso
{
	@Test
	public void __NotifactionSivisoNotNull()
	{
		Service service = mock(Service.class);
		NotificationManager notificationManager = mock(NotificationManager.class);
		when(service.getSystemService(NotificationManager.class)).thenReturn(notificationManager);
		when(service.getResources()).thenReturn(mock(Resources.class));
		PowerMockito.mockStatic(PendingIntent.class);
		PowerMockito.when(PendingIntent.getActivity(eq(service), anyInt(), isA(Intent$Activity$Home.class), anyInt()))
		.thenReturn(PowerMockito.mock(PendingIntent.class));
		
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
		when(service.getResources()).thenReturn(mock(Resources.class));
		PowerMockito.mockStatic(PendingIntent.class);
		PowerMockito.when(PendingIntent.getActivity(eq(service), anyInt(), isA(Intent$Activity$Home.class), anyInt()))
		            .thenReturn(PowerMockito.mock(PendingIntent.class));
		
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
		PowerMockito.mockStatic(PendingIntent.class);
		PowerMockito.when(PendingIntent.getActivity(eq(service), anyInt(), isA(Intent$Activity$Home.class), anyInt()))
		            .thenReturn(PowerMockito.mock(PendingIntent.class));
		
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
		when(service.getResources()).thenReturn(mock(Resources.class));
		PowerMockito.mockStatic(PendingIntent.class);
		PowerMockito.when(PendingIntent.getActivity(eq(service), anyInt(), isA(Intent$Activity$Home.class), anyInt()))
		            .thenReturn(PowerMockito.mock(PendingIntent.class));
		
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
		PowerMockito.mockStatic(PendingIntent.class);
		PowerMockito.when(PendingIntent.getActivity(eq(service), anyInt(), isA(Intent$Activity$Home.class), anyInt()))
		            .thenReturn(PowerMockito.mock(PendingIntent.class));
		
		NotificationChannelSiviso notificationChannelSiviso = new NotificationChannelSiviso(service);
		notificationChannelSiviso.SDK = SDK;
		notificationChannelSiviso.createSingleSivisoNotifactionChannel();
		
		SingleSivisoNotifactionChannel singleSivisoNotifactionChannel = notificationChannelSiviso.singleSivisoNotifactionChannel;
		assertNotNull(singleSivisoNotifactionChannel);
	}
}