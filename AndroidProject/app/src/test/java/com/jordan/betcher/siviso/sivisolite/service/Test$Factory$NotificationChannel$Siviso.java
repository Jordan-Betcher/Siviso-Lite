package com.jordan.betcher.siviso.sivisolite.service;

import android.app.NotificationChannel;
import android.content.res.Resources;

import com.jordan.betcher.siviso.sivisolite.R;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(PowerMockRunner.class)
@PrepareForTest({Factory$NotificationChannel$Siviso.class, NotificationChannel.class})
public class Test$Factory$NotificationChannel$Siviso
{
	@Test
	public void create_Id2Name2Importance2_notificationChannelReturned()
	{
		String id = "2";
		String name = "2";
		int importance = 2;
		
		NotificationChannel notificationChannel = mock(NotificationChannel.class);
		when(notificationChannel.toString()).thenReturn("norificationChannel");
		try
		{
			PowerMockito.whenNew(NotificationChannel.class).withArguments(id, name,
			                                                              importance).thenReturn(notificationChannel);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		Resources resources = mock(Resources.class);
		when(resources.getString(R.string.channel_id)).thenReturn(id);
		when(resources.getString(R.string.channel_name)).thenReturn(name);
		when(resources.getInteger(R.integer.channel_importance)).thenReturn(importance);
		
		Factory$NotificationChannel$Siviso factory = new Factory$NotificationChannel$Siviso(resources);
		NotificationChannel actualNotificationChannel = factory.create();
		
		assertEquals(notificationChannel, actualNotificationChannel);
	}
	
	@Test
	public void create_Id1Name1Importance1_notificationChannelReturned()
	{
		String id = "1";
		String name = "1";
		int importance = 1;
		
		NotificationChannel notificationChannel = mock(NotificationChannel.class);
		when(notificationChannel.toString()).thenReturn("norificationChannel");
		try
		{
			PowerMockito.whenNew(NotificationChannel.class).withArguments(id, name,
			                                                              importance).thenReturn(notificationChannel);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		Resources resources = mock(Resources.class);
		when(resources.getString(R.string.channel_id)).thenReturn(id);
		when(resources.getString(R.string.channel_name)).thenReturn(name);
		when(resources.getInteger(R.integer.channel_importance)).thenReturn(importance);
		
		Factory$NotificationChannel$Siviso factory = new Factory$NotificationChannel$Siviso(resources);
		NotificationChannel actualNotificationChannel = factory.create();
		
		assertEquals(notificationChannel, actualNotificationChannel);
	}
	
	@Test
	public void id_ResourcesId2_2()
	{
		String id = "2";
		Resources resources = mock(Resources.class);
		when(resources.getString(R.string.channel_id)).thenReturn(id);
		
		Factory$NotificationChannel$Siviso factory = new Factory$NotificationChannel$Siviso(resources);
		String actualId = factory.id();
		
		assertEquals(id, actualId);
	}
	
	@Test
	public void id_ResourcesId1_1()
	{
		String id = "1";
		Resources resources = mock(Resources.class);
		when(resources.getString(R.string.channel_id)).thenReturn(id);
		
		Factory$NotificationChannel$Siviso factory = new Factory$NotificationChannel$Siviso(resources);
		String actualId = factory.id();
		
		assertEquals(id, actualId);
	}
}