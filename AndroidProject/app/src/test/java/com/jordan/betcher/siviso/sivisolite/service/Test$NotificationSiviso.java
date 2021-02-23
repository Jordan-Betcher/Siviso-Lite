package com.jordan.betcher.siviso.sivisolite.service;

import android.app.Notification;
import android.app.Service;

import org.junit.Test;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class Test$NotificationSiviso
{
	@Test
	public void startForeground__startForegroundNotificationIdGreaterThan0()
	{
		Service service = mock(Service.class);
		Notification notification = mock(Notification.class);
		Factory$Notification factory = mock(Factory$Notification.class);
		when(factory.create()).thenReturn(notification);
		
		NotificationSiviso notificationSiviso = new NotificationSiviso(service, factory);
		notificationSiviso.startForeground();
		
		//Set 1 because creating argThat gives null error
		verify(service, times(1)).startForeground(1, notification);
	}
	
	@Test
	public void startForeground__startForegroundNotification()
	{
		Service service = mock(Service.class);
		Notification notification = mock(Notification.class);
		Factory$Notification factory = mock(Factory$Notification.class);
		when(factory.create()).thenReturn(notification);
		
		NotificationSiviso notificationSiviso = new NotificationSiviso(service, factory);
		notificationSiviso.startForeground();
		
		verify(service, times(1)).startForeground(any(Integer.class), eq(notification));
	}
}