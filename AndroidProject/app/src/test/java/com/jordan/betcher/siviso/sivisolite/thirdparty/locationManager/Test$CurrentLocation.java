package com.jordan.betcher.siviso.sivisolite.thirdparty.locationManager;

import android.content.res.Resources;
import android.location.Location;
import android.location.LocationManager;

import com.jordan.betcher.siviso.sivisolite.ArgumentMatcher$Same;
import com.jordan.betcher.siviso.sivisolite.R;
import com.jordan.betcher.siviso.sivisolite.thirdparty.permissions.Permission$AccessFineLocation;

import org.junit.Test;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.argThat;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyZeroInteractions;
import static org.mockito.Mockito.when;


public class Test$CurrentLocation
{
	@Test
	public void act_ResourceMinDistance1_RequestWithMinDistance1()
	{
		int minDistance = 1;
		LocationManager locationManager = mock(LocationManager.class);
		Permission$AccessFineLocation permission$AccessFineLocation = mock(Permission$AccessFineLocation.class);
		Resources resources = mock(Resources.class);
		when(resources.getInteger(R.integer.map_min_distance_meters)).thenReturn(minDistance);
		
		CurrentLocation currentLocation = new CurrentLocation(locationManager, permission$AccessFineLocation, resources);
		currentLocation.permissionGranted();
		
		verify(locationManager).requestLocationUpdates(anyString(), anyLong(),
		                                               eq((float) minDistance), any(LocationListener$CurrentLocation.class));
	}
	
	@Test
	public void act_ResourceMinDistance0_RequestWithMinDistance0()
	{
		int minTimeDistance = 0;
		LocationManager locationManager = mock(LocationManager.class);
		Permission$AccessFineLocation permission$AccessFineLocation = mock(Permission$AccessFineLocation.class);
		Resources resources = mock(Resources.class);
		when(resources.getInteger(R.integer.map_min_time_interval_milliseconds)).thenReturn(minTimeDistance);
		
		CurrentLocation currentLocation = new CurrentLocation(locationManager, permission$AccessFineLocation, resources);
		currentLocation.permissionGranted();
		
		verify(locationManager).requestLocationUpdates(anyString(), anyLong(),
		                                               eq((float) minTimeDistance), any(LocationListener$CurrentLocation.class));
	}
	
	@Test
	public void act_ResourceMinTime1_RequestWithMinTime1()
	{
		int minTimeInterval = 1;
		LocationManager locationManager = mock(LocationManager.class);
		Permission$AccessFineLocation permission$AccessFineLocation = mock(Permission$AccessFineLocation.class);
		Resources resources = mock(Resources.class);
		when(resources.getInteger(R.integer.map_min_time_interval_milliseconds)).thenReturn(minTimeInterval);
		
		CurrentLocation currentLocation = new CurrentLocation(locationManager, permission$AccessFineLocation, resources);
		currentLocation.permissionGranted();
		
		verify(locationManager).requestLocationUpdates(anyString(), eq((long)minTimeInterval),
		                                               anyLong(), any(LocationListener$CurrentLocation.class));
	}
	
	@Test
	public void act_ResourceMinTime0_RequestWithMinTime0()
	{
		int minTimeInterval = 0;
		LocationManager locationManager = mock(LocationManager.class);
		Permission$AccessFineLocation permission$AccessFineLocation = mock(Permission$AccessFineLocation.class);
		Resources resources = mock(Resources.class);
		when(resources.getInteger(R.integer.map_min_time_interval_milliseconds)).thenReturn(minTimeInterval);
		
		CurrentLocation currentLocation = new CurrentLocation(locationManager, permission$AccessFineLocation, resources);
		currentLocation.permissionGranted();
		
		verify(locationManager).requestLocationUpdates(anyString(), eq((long)minTimeInterval),
		                                               anyLong(), any(LocationListener$CurrentLocation.class));
	}
	
	@Test
	public void act__RequestWithGPSProvider()
	{
		LocationManager locationManager = mock(LocationManager.class);
		Permission$AccessFineLocation permission$AccessFineLocation = mock(Permission$AccessFineLocation.class);
		Resources resources = mock(Resources.class);
		
		CurrentLocation currentLocation = new CurrentLocation(locationManager, permission$AccessFineLocation, resources);
		currentLocation.permissionGranted();
		
		verify(locationManager).requestLocationUpdates(eq(LocationManager.GPS_PROVIDER), anyLong(),
		                                               anyLong(), any(LocationListener$CurrentLocation.class));
	}
	
	@Test
	public void act__RequestWithLocationListener()
	{
		LocationManager locationManager = mock(LocationManager.class);
		Permission$AccessFineLocation permission$AccessFineLocation = mock(Permission$AccessFineLocation.class);
		Resources resources = mock(Resources.class);
		CurrentLocation currentLocation = new CurrentLocation(locationManager, permission$AccessFineLocation, resources);
		currentLocation.permissionGranted();
		
		LocationListener$CurrentLocation expectedListener = new LocationListener$CurrentLocation(currentLocation);
		verify(locationManager).requestLocationUpdates(anyString(), anyLong(),
		                                               anyLong(), argThat(new Same$LocationListener$CurrentLocation(expectedListener)));
	}
	
	@Test
	public void __addThisToPermissionAccessFineLocation()
	{
		LocationManager locationManager = mock(LocationManager.class);
		Permission$AccessFineLocation permission$AccessFineLocation = mock(Permission$AccessFineLocation.class);
		Resources resources = mock(Resources.class);
		CurrentLocation currentLocation = new CurrentLocation(locationManager, permission$AccessFineLocation, resources);
		
		verify(permission$AccessFineLocation, times(1)).addOnPermissionGranted(currentLocation);
	}
	
	@Test
	public void CallWhenReady_HasLocationAndGivenAction_CallAction()
	{
		LocationManager locationManager = mock(LocationManager.class);
		Permission$AccessFineLocation permission$AccessFineLocation = mock(Permission$AccessFineLocation.class);
		
		Resources resources = mock(Resources.class);
		CurrentLocation currentLocation = new CurrentLocation(locationManager, permission$AccessFineLocation, resources);
		
		Location fakeLocation = mock(Location.class);
		CurrentLocationAction fakeAction = mock(CurrentLocationAction.class);
		
		currentLocation.setCurrentLocation(fakeLocation);
		currentLocation.callWhenReady(fakeAction);
		
		verify(fakeAction).currentLocationReady(fakeLocation);
	}
	
	@Test
	public void CallWhenReady_NullLocationAndGivenAction_NoAction()
	{
		LocationManager locationManager = mock(LocationManager.class);
		Permission$AccessFineLocation permission$AccessFineLocation = mock(Permission$AccessFineLocation.class);
		
		Resources resources = mock(Resources.class);
		CurrentLocation currentLocation = new CurrentLocation(locationManager, permission$AccessFineLocation, resources);
		
		CurrentLocationAction fakeAction = mock(CurrentLocationAction.class);
		
		currentLocation.callWhenReady(fakeAction);
		
		verifyZeroInteractions(fakeAction);
	}
	
	
	@Test
	public void CallWhenReady_GivenActionAndLocationGivenAfter_CallAction()
	{
		LocationManager locationManager = mock(LocationManager.class);
		Permission$AccessFineLocation permission$AccessFineLocation = mock(Permission$AccessFineLocation.class);
		
		Resources resources = mock(Resources.class);
		CurrentLocation currentLocation = new CurrentLocation(locationManager, permission$AccessFineLocation, resources);
		
		Location fakeLocation = mock(Location.class);
		CurrentLocationAction fakeAction = mock(CurrentLocationAction.class);
		
		currentLocation.callWhenReady(fakeAction);
		currentLocation.setCurrentLocation(fakeLocation);
		
		verify(fakeAction).currentLocationReady(fakeLocation);
	}
	
	@Test
	public void CallWhenReady_GivenActionAndLocationGivenAfter_CallActionOnlyOnce()
	{
		LocationManager locationManager = mock(LocationManager.class);
		Permission$AccessFineLocation permission$AccessFineLocation = mock(Permission$AccessFineLocation.class);
		
		Resources resources = mock(Resources.class);
		CurrentLocation currentLocation = new CurrentLocation(locationManager, permission$AccessFineLocation, resources);
		
		Location fakeLocation = mock(Location.class);
		CurrentLocationAction fakeAction = mock(CurrentLocationAction.class);
		
		currentLocation.callWhenReady(fakeAction);
		currentLocation.setCurrentLocation(fakeLocation);
		currentLocation.setCurrentLocation(fakeLocation);
		
		verify(fakeAction, times(1)).currentLocationReady(fakeLocation);
	}
	
	
	@Test
	public void CallWhenReady_MultipleGivenActionAndLocationGivenAfter_CallAction()
	{
		LocationManager locationManager = mock(LocationManager.class);
		Permission$AccessFineLocation permission$AccessFineLocation = mock(Permission$AccessFineLocation.class);
		
		Resources resources = mock(Resources.class);
		CurrentLocation currentLocation = new CurrentLocation(locationManager, permission$AccessFineLocation, resources);
		
		Location fakeLocation = mock(Location.class);
		CurrentLocationAction fakeAction1 = mock(CurrentLocationAction.class);
		CurrentLocationAction fakeAction2 = mock(CurrentLocationAction.class);
		
		currentLocation.callWhenReady(fakeAction1);
		currentLocation.callWhenReady(fakeAction2);
		currentLocation.setCurrentLocation(fakeLocation);
		
		verify(fakeAction1).currentLocationReady(fakeLocation);
		verify(fakeAction2).currentLocationReady(fakeLocation);
	}
	
	private class Same$LocationListener$CurrentLocation
	extends ArgumentMatcher$Same<LocationListener$CurrentLocation>
	{
		public Same$LocationListener$CurrentLocation(
		LocationListener$CurrentLocation first)
		{
			super(first);
		}
		
		@Override
		protected boolean isSameValues(
		LocationListener$CurrentLocation other)
		{
			return first.currentLocation == other.currentLocation;
		}
	}
}