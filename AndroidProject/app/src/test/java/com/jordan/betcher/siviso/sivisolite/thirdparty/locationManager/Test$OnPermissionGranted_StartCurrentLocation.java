package com.jordan.betcher.siviso.sivisolite.thirdparty.locationManager;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import android.content.res.Resources;
import android.location.LocationManager;

import com.jordan.betcher.siviso.sivisolite.R;

import org.junit.Test;

public class Test$OnPermissionGranted_StartCurrentLocation
{
	
	@Test
	public void permissionGranted_minTime1_requestLocationUpdatesMinTime1()
	{
		int minTime = 1;
		Resources resources = mock(Resources.class);
		LocationManager locationManager = mock(LocationManager.class);
		LocationListener_CurrentLocation currentLocation = mock(LocationListener_CurrentLocation.class);
		when(resources.getInteger(R.integer.map_min_time_interval_milliseconds)).thenReturn(minTime);
		
		OnPermissionGranted_StartCurrentLocation startCurrentLocation = new OnPermissionGranted_StartCurrentLocation(resources, locationManager, currentLocation);
		startCurrentLocation.permissionGranted();
		
		verify(locationManager, times(1)).requestLocationUpdates(anyString(), eq((long)minTime), anyFloat(), any(LocationListener_CurrentLocation.class));
	}
	
	@Test
	public void __0requestLocationUpdates()
	{
		Resources resources = mock(Resources.class);
		LocationManager locationManager = mock(LocationManager.class);
		LocationListener_CurrentLocation currentLocation = mock(LocationListener_CurrentLocation.class);
		
		new OnPermissionGranted_StartCurrentLocation(resources, locationManager, currentLocation);
		
		verify(locationManager, times(0)).requestLocationUpdates(anyString(), anyLong(), anyFloat(), any(LocationListener_CurrentLocation.class));
	}
	
	@Test
	public void permissionGranted__requestLocationUpdatesServiceProviderGPSProvider()
	{
		Resources resources = mock(Resources.class);
		LocationManager locationManager = mock(LocationManager.class);
		LocationListener_CurrentLocation currentLocation = mock(LocationListener_CurrentLocation.class);
		
		OnPermissionGranted_StartCurrentLocation startCurrentLocation = new OnPermissionGranted_StartCurrentLocation(resources, locationManager, currentLocation);
		startCurrentLocation.permissionGranted();
		
		verify(locationManager, times(1)).requestLocationUpdates(eq(LocationManager.GPS_PROVIDER), anyLong(), anyFloat(), any(LocationListener_CurrentLocation.class));
	}
}