package com.jordan.betcher.siviso.sivisolite.service;

import android.content.Context;
import android.os.Build;

import androidx.test.core.app.ActivityScenario;

import com.jordan.betcher.siviso.sivisolite.home.Activity_Home;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(RobolectricTestRunner.class)
@Config(sdk = Build.VERSION_CODES.JELLY_BEAN)
public class Test$FusedLocationClientSiviso
{
	//get arround not being able to intu create robolectric service
	//by using Activity_home as the context
	Context context;
	
	@Before
	public void setup()
	{
		try(ActivityScenario<Activity_Home> scenario = ActivityScenario
		.launch(Activity_Home.class))
		{
			scenario.onActivity
			(
			new ActivityScenario.ActivityAction<Activity_Home>()
			{
				@Override
				public void perform(Activity_Home activity)
				{
					Test$FusedLocationClientSiviso.this.context = activity;
				}
			}
			);
		}
	}
	
	@Test
	public void __FusedLocationClientSivisoNotNull()
	{
		FusedLocationClientSiviso handler = new FusedLocationClientSiviso(context);
		
		FusedLocationProviderClient$Siviso client = handler.client;
		assertNotNull(client);
	}
	
	@Test
	public void start__LocationCallbackStart()
	{
		FusedLocationProviderClient$Siviso client = mock(FusedLocationProviderClient$Siviso.class);
		
		FusedLocationClientSiviso handler = new FusedLocationClientSiviso(context);
		handler.client = client;
		handler.start();
		
		verify(client, times(1)).start();
	}
	
	@Test
	public void stop__LocationCallbackStop()
	{
		FusedLocationProviderClient$Siviso client = mock(FusedLocationProviderClient$Siviso.class);
		
		FusedLocationClientSiviso handler = new FusedLocationClientSiviso(context);
		handler.client = client;
		handler.stop();
		
		verify(client, times(1)).stop();
	}
	
}