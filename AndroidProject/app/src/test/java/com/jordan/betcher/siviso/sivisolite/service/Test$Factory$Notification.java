package com.jordan.betcher.siviso.sivisolite.service;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.res.Resources;

import androidx.core.app.NotificationCompat.Builder;

import com.jordan.betcher.siviso.sivisolite.ArgumentMatcher$Same;
import com.jordan.betcher.siviso.sivisolite.R;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.argThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class Test$Factory$Notification
{
	@Test
	public void create__setChannelIdNotEmpty()
	{
		Factory$PendingIntent factoryPendingIntent = mock(Factory$PendingIntent.class);
		Resources resources = mock(Resources.class);
		Builder builder = mock(Builder.class);
		
		Factory$Notification factory = new Factory$Notification(resources, builder,
		                                                        factoryPendingIntent);
		factory.create();
		
		verify(builder).setChannelId(argThat(new StringNotEmpty()));
	}
	
	@Test
	public void create__setContentIntentIntentSiviso()
	{
		Resources resources = mock(Resources.class);
		Builder builder = mock(Builder.class);
		PendingIntent pendingIntent = mock(PendingIntent.class);
		Factory$PendingIntent factory$PendingIntent = mock(Factory$PendingIntent.class);
		when(factory$PendingIntent.create()).thenReturn(pendingIntent);
		
		Factory$Notification factory = new Factory$Notification(resources, builder, factory$PendingIntent);
		factory.create();
		
		verify(builder).setContentIntent(pendingIntent);
	}
	
	@Test
	public void create_2_setContentText2()
	{
		Factory$PendingIntent factoryPendingIntent = mock(Factory$PendingIntent.class);
		String contentText = "2";
		Resources resources = mock(Resources.class);
		Builder builder = mock(Builder.class);
		when(resources.getString(R.string.notification_create_content_text)).thenReturn(contentText);
		
		Factory$Notification factory = new Factory$Notification(resources, builder,
		                                                        factoryPendingIntent);
		factory.create();
		
		verify(builder).setContentText(contentText);
	}
	
	@Test
	public void create_1_setContentText1()
	{
		Factory$PendingIntent factoryPendingIntent = mock(Factory$PendingIntent.class);
		String contentText = "1";
		Resources resources = mock(Resources.class);
		Builder builder = mock(Builder.class);
		when(resources.getString(R.string.notification_create_content_text)).thenReturn(contentText);
		
		Factory$Notification factory = new Factory$Notification(resources, builder,
		                                                        factoryPendingIntent);
		factory.create();
		
		verify(builder).setContentText(contentText);
	}
	
	@Test
	public void create_2_setContentTitle2()
	{
		Factory$PendingIntent factoryPendingIntent = mock(Factory$PendingIntent.class);
		String contentTitle = "2";
		Resources resources = mock(Resources.class);
		Builder builder = mock(Builder.class);
		when(resources.getString(R.string.notification_create_content_title)).thenReturn(contentTitle);
		
		Factory$Notification factory = new Factory$Notification(resources, builder,
		                                                        factoryPendingIntent);
		factory.create();
		
		verify(builder).setContentTitle(contentTitle);
	}
	
	@Test
	public void create_1_setContentTitle1()
	{
		Factory$PendingIntent factoryPendingIntent = mock(Factory$PendingIntent.class);
		String contentTitle = "1";
		Resources resources = mock(Resources.class);
		Builder builder = mock(Builder.class);
		when(resources.getString(R.string.notification_create_content_title)).thenReturn(contentTitle);
		
		Factory$Notification factory = new Factory$Notification(resources, builder,
		                                                        factoryPendingIntent);
		factory.create();
		
		verify(builder).setContentTitle(contentTitle);
	}
	
	@Test
	public void create__returnsNotifiaction()
	{
		Factory$PendingIntent factoryPendingIntent = mock(Factory$PendingIntent.class);
		Resources resources = mock(Resources.class);
		Builder builder = mock(Builder.class);
		Notification notification = mock(Notification.class);
		when(builder.build()).thenReturn(notification);
		
		Factory$Notification factory = new Factory$Notification(resources, builder,
		                                                        factoryPendingIntent);
		Notification actualNotification = factory.create();
		
		assertEquals(notification, actualNotification);
	}
	
	private class StringNotEmpty extends ArgumentMatcher$Same<String>
	{
		public StringNotEmpty()
		{
			super("");
		}
		
		@Override
		protected boolean isSameValues(String other)
		{
			return ! other.equals(first);
		}
	}
}