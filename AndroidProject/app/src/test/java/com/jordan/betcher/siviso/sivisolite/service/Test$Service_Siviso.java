package com.jordan.betcher.siviso.sivisolite.service;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.res.Resources;
import android.location.Criteria;
import android.location.LocationManager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(PowerMockRunner.class)
@Config(manifest = Config.NONE)
@PrepareForTest({PendingIntent.class, NotificationChannelSiviso.class, Service_Siviso.class, Criteria.class, Factory$Criteria$Siviso.class})
public class Test$Service_Siviso
{
	Resources resources = mock(Resources.class);
	LocationManager locationManager = mock(LocationManager.class);
	
	@Test
	public void onCreate__callCreateSingleSivisoNotificationChannel()
	{
		NotificationChannelSiviso notificationChannel = mock(NotificationChannelSiviso.class);
		
		PowerMockito.mockStatic(PendingIntent.class);
		PowerMockito.when(PendingIntent.getActivity(isA(Service_Siviso.class), anyInt(), isA(Intent$Activity$Home.class), anyInt()))
		            .thenReturn(PowerMockito.mock(PendingIntent.class));
		
		
		Service_Siviso service = new Service_Siviso_Test();
		try
		{
			PowerMockito.whenNew(NotificationChannelSiviso.class).withArguments(service).thenReturn(notificationChannel);
			service.onCreate();
			
			verify(notificationChannel, times(1)).createSingleSivisoNotifactionChannel();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test
	public void onDestroy__callLocationListenerSivisoStop()
	{
		LocationListenerSiviso locationListener = mock(LocationListenerSiviso.class);
		
		PowerMockito.mockStatic(PendingIntent.class);
		PowerMockito.when(PendingIntent.getActivity(isA(Service_Siviso.class), anyInt(), isA(Intent$Activity$Home.class), anyInt()))
		            .thenReturn(PowerMockito.mock(PendingIntent.class));
		
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
		
		PowerMockito.mockStatic(PendingIntent.class);
		PowerMockito.when(PendingIntent.getActivity(isA(Service_Siviso.class), anyInt(), isA(Intent$Activity$Home.class), anyInt()))
		            .thenReturn(PowerMockito.mock(PendingIntent.class));
		
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
		
		PowerMockito.mockStatic(PendingIntent.class);
		PowerMockito.when(PendingIntent.getActivity(isA(Service_Siviso.class), anyInt(), isA(Intent$Activity$Home.class), anyInt()))
		            .thenReturn(PowerMockito.mock(PendingIntent.class));
		try
		{
			PowerMockito.whenNew(Criteria.class).withNoArguments().thenReturn(new Criteria_Test());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
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
		
		PowerMockito.mockStatic(PendingIntent.class);
		PowerMockito.when(PendingIntent.getActivity(isA(Service_Siviso.class), anyInt(), isA(Intent$Activity$Home.class), anyInt()))
		            .thenReturn(PowerMockito.mock(PendingIntent.class));
		
		try
		{
			PowerMockito.whenNew(Criteria.class).withNoArguments().thenReturn(new Criteria_Test());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
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
		
		@Override
		public Object getSystemService(String name)
		{
			if(name.equals(Context.LOCATION_SERVICE))
			{
				return locationManager;
			}
			return super.getSystemService(name);
		}
	}
	
	private class Criteria_Test extends Criteria
	{
		@Override
		public void setPowerRequirement(int level)
		{
		
		}
		
		@Override
		public void setAccuracy(int accuracy)
		{
		
		}
		
		@Override
		public void setBearingRequired(boolean bearingRequired)
		{
		
		}
		
		@Override
		public void setAltitudeRequired(boolean altitudeRequired){}
		
		@Override
		public void setSpeedRequired(boolean speedRequired){}
	}
}