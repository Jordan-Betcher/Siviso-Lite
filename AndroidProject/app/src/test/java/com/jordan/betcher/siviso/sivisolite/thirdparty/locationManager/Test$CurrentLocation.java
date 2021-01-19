package com.jordan.betcher.siviso.sivisolite.thirdparty.locationManager;

import android.location.Location;
import android.location.LocationManager;

import org.junit.Test;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyZeroInteractions;


public class Test$CurrentLocation
{
	@Test
	public void CurrentLocation_Created_AddLocationListener()
	{
		LocationManager fakelocationManager = mock(LocationManager.class);
		
		new CurrentLocation(fakelocationManager);
		
		verify(fakelocationManager).requestLocationUpdates(anyString(), anyLong(), anyLong(), any(LocationListener$CurrentLocation.class));
	}
	
	@Test
	public void CallWhenReady_HasLocationAndGivenAction_CallAction()
	{
		LocationManager fakelocationManager = mock(LocationManager.class);
		CurrentLocation currentLocation = new CurrentLocation(fakelocationManager);
		
		Location fakeLocation = mock(Location.class);
		CurrentLocationAction fakeAction = mock(CurrentLocationAction.class);
		
		currentLocation.setCurrentLocation(fakeLocation);
		currentLocation.callWhenReady(fakeAction);
		
		verify(fakeAction).currentLocationReady(fakeLocation);
	}
	
	@Test
	public void CallWhenReady_NullLocationAndGivenAction_NoAction()
	{
		LocationManager fakelocationManager = mock(LocationManager.class);
		CurrentLocation currentLocation = new CurrentLocation(fakelocationManager);
		
		CurrentLocationAction fakeAction = mock(CurrentLocationAction.class);
		
		currentLocation.callWhenReady(fakeAction);
		
		verifyZeroInteractions(fakeAction);
	}
	
	
	@Test
	public void CallWhenReady_GivenActionAndLocationGivenAfter_CallAction()
	{
		LocationManager fakelocationManager = mock(LocationManager.class);
		CurrentLocation currentLocation = new CurrentLocation(fakelocationManager);
		
		Location fakeLocation = mock(Location.class);
		CurrentLocationAction fakeAction = mock(CurrentLocationAction.class);
		
		currentLocation.callWhenReady(fakeAction);
		currentLocation.setCurrentLocation(fakeLocation);
		
		verify(fakeAction).currentLocationReady(fakeLocation);
	}
	
	@Test
	public void CallWhenReady_GivenActionAndLocationGivenAfter_CallActionOnlyOnce()
	{
		LocationManager fakelocationManager = mock(LocationManager.class);
		CurrentLocation currentLocation = new CurrentLocation(fakelocationManager);
		
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
		LocationManager fakelocationManager = mock(LocationManager.class);
		CurrentLocation currentLocation = new CurrentLocation(fakelocationManager);
		
		Location fakeLocation = mock(Location.class);
		CurrentLocationAction fakeAction1 = mock(CurrentLocationAction.class);
		CurrentLocationAction fakeAction2 = mock(CurrentLocationAction.class);
		
		currentLocation.callWhenReady(fakeAction1);
		currentLocation.callWhenReady(fakeAction2);
		currentLocation.setCurrentLocation(fakeLocation);
		
		verify(fakeAction1).currentLocationReady(fakeLocation);
		verify(fakeAction2).currentLocationReady(fakeLocation);
	}
}