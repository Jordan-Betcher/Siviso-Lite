package com.jordan.betcher.siviso.sivisolite.service;

import android.app.NotificationManager;
import android.content.Context;
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
		Context context = mock(Context.class);
		NotificationManager notificationManager = mock(NotificationManager.class);
		when(context.getSystemService(NotificationManager.class)).thenReturn(notificationManager);
		
		NotificationChannelSiviso notificationChannelSiviso = new NotificationChannelSiviso(context);
		
		NotificationSiviso actualNotificationSiviso = notificationChannelSiviso.notifactionSiviso;
		assertNotNull(actualNotificationSiviso);
	}
	
	@Test
	public void startForeground__callNotifactionSivisoStartForeground()
	{
		NotificationSiviso notifactionSiviso = mock(NotificationSiviso.class);
		Context context = mock(Context.class);
		NotificationManager notificationManager = mock(NotificationManager.class);
		when(context.getSystemService(NotificationManager.class)).thenReturn(notificationManager);
		
		NotificationChannelSiviso notificationChannelSiviso = new NotificationChannelSiviso(context);
		notificationChannelSiviso.notifactionSiviso = notifactionSiviso;
		notificationChannelSiviso.startForeground();
		
		verify(notifactionSiviso).startForeground();
	}
	
	
	@Test
	public void createNotifactionChannel_SDKOPlus1_createNotifactionChannelNotNull()
	{
		int SDK = Build.VERSION_CODES.O + 1;
		Context context = mock(Context.class);
		NotificationManager notificationManager = mock(NotificationManager.class);
		when(context.getSystemService(NotificationManager.class)).thenReturn(notificationManager);
		
		NotificationChannelSiviso notificationChannelSiviso = new NotificationChannelSiviso(context);
		notificationChannelSiviso.SDK = SDK;
		notificationChannelSiviso.createSingleSivisoNotifactionChannel();
		
		SingleSivisoNotifactionChannel singleSivisoNotifactionChannel = notificationChannelSiviso.singleSivisoNotifactionChannel;
		assertNotNull(singleSivisoNotifactionChannel);
	}
	
	@Test
	public void createNotifactionChannel_SDKOMinus1_createNotifactionChannelIsNull()
	{
		int SDK = Build.VERSION_CODES.O - 1;
		Context context = mock(Context.class);
		NotificationManager notificationManager = mock(NotificationManager.class);
		when(context.getSystemService(NotificationManager.class)).thenReturn(notificationManager);
		
		NotificationChannelSiviso notificationChannelSiviso = new NotificationChannelSiviso(context);
		notificationChannelSiviso.SDK = SDK;
		notificationChannelSiviso.createSingleSivisoNotifactionChannel();
		
		SingleSivisoNotifactionChannel singleSivisoNotifactionChannel = notificationChannelSiviso.singleSivisoNotifactionChannel;
		assertNull(singleSivisoNotifactionChannel);
	}
	
	@Test
	public void createNotifactionChannel_SDKO_createNotifactionChannelNotNull()
	{
		int SDK = Build.VERSION_CODES.O;
		Context context = mock(Context.class);
		NotificationManager notificationManager = mock(NotificationManager.class);
		when(context.getSystemService(NotificationManager.class)).thenReturn(notificationManager);
		
		NotificationChannelSiviso notificationChannelSiviso = new NotificationChannelSiviso(context);
		notificationChannelSiviso.SDK = SDK;
		notificationChannelSiviso.createSingleSivisoNotifactionChannel();
		
		SingleSivisoNotifactionChannel singleSivisoNotifactionChannel = notificationChannelSiviso.singleSivisoNotifactionChannel;
		assertNotNull(singleSivisoNotifactionChannel);
	}
}