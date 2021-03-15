package com.jordan.betcher.siviso.sivisolite.service;

import android.content.res.Resources;

import com.google.android.gms.location.LocationRequest;
import com.jordan.betcher.siviso.sivisolite.R;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Test$Factory$LocationRequest
{
	
	@Test
	public void create__RequestLocationSettingWaitForAccurateLocationTrue()
	{
		Resources resources = mock(Resources.class);
		Factory$LocationRequest factory$LocationRequest = new Factory$LocationRequest(resources);
		LocationRequest locationRequest = factory$LocationRequest.create();
		
		boolean waitForAccurateLocation = locationRequest.isWaitForAccurateLocation();
		assertEquals(true, waitForAccurateLocation);
	}
	
	@Test
	public void create_Displacement2_RequestLocationSettingDisplacement2()
	{
		int displacement = 2;
		Resources resources = mock(Resources.class);
		when(resources.getInteger(R.integer.location_request_smallest_displacement_meters)).thenReturn(displacement);
		
		Factory$LocationRequest factory$LocationRequest = new Factory$LocationRequest(resources);
		LocationRequest locationRequest = factory$LocationRequest.create();
		
		float actualInterval = locationRequest.getSmallestDisplacement();
		assertEquals(displacement, actualInterval, 0.1);
	}
	
	@Test
	public void create_Displacement1_RequestLocationSettingDisplacement1()
	{
		int displacement = 1;
		Resources resources = mock(Resources.class);
		when(resources.getInteger(R.integer.location_request_smallest_displacement_meters)).thenReturn(displacement);
		
		Factory$LocationRequest factory$LocationRequest = new Factory$LocationRequest(resources);
		LocationRequest locationRequest = factory$LocationRequest.create();
		
		float actualInterval = locationRequest.getSmallestDisplacement();
		assertEquals(displacement, actualInterval, 0.1);
	}
	
	@Test
	public void create_Interval2_RequestLocationSettingInterval2()
	{
		int interval = 2;
		Resources resources = mock(Resources.class);
		when(resources.getInteger(R.integer.location_request_interval_milliseconds)).thenReturn(interval);
		
		Factory$LocationRequest factory$LocationRequest = new Factory$LocationRequest(resources);
		LocationRequest locationRequest = factory$LocationRequest.create();
		
		long actualInterval = locationRequest.getInterval();
		assertEquals(interval, actualInterval);
	}
	
	@Test
	public void create_Interval1_RequestLocationSettingInterval1()
	{
		int interval = 1;
		Resources resources = mock(Resources.class);
		when(resources.getInteger(R.integer.location_request_interval_milliseconds)).thenReturn(interval);
		
		Factory$LocationRequest factory$LocationRequest = new Factory$LocationRequest(resources);
		LocationRequest locationRequest = factory$LocationRequest.create();
		
		long actualInterval = locationRequest.getInterval();
		assertEquals(interval, actualInterval);
	}
	
	@Test
	public void create__RequestLocationSettingLowPower()
	{
		Resources resources = mock(Resources.class);
		Factory$LocationRequest factory$LocationRequest = new Factory$LocationRequest(resources);
		LocationRequest locationRequest = factory$LocationRequest.create();
		
		int actualPowerSetting = locationRequest.getPriority();
		int expectedPowerSetting = LocationRequest.PRIORITY_LOW_POWER;
		assertEquals(expectedPowerSetting, actualPowerSetting);
	}
}