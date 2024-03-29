package com.jordan.betcher.siviso.sivisolite.thirdparty.locationManager;

import static org.mockito.Mockito.*;

import android.location.Location;

import com.google.android.gms.maps.model.LatLng;

import org.junit.Test;

public class Test$LocationListener_CurrentLocation
{
	@Test
	public void add_onCurrentLocation_eventAddOnCurrentLocation()
	{
		CallOnce<LatLng> event = mock(CallOnce.class);
		OnCurrentLocation onCurrentLocation = mock(OnCurrentLocation.class);
		
		LocationListener_CurrentLocation currentLocation = new LocationListener_CurrentLocation(event);
		currentLocation.callOnce(onCurrentLocation);
		
		verify(event, times(1)).add(onCurrentLocation);
	}
	
	@Test
	public void onLocationChanged_10_EventCall10()
	{
		LatLng latLng = new LatLng(1, 0);
		Location location = mock(Location.class);
		CallOnce<LatLng> event = mock(CallOnce.class);
		when(location.getLatitude()).thenReturn(latLng.latitude);
		when(location.getLongitude()).thenReturn(latLng.longitude);
		
		LocationListener_CurrentLocation currentLocation = new LocationListener_CurrentLocation(event);
		currentLocation.onLocationChanged(location);
		
		verify(event, times(1)).call(latLng);
	}
	
	@Test
	public void onLocationChanged_01_EventCall01()
	{
		LatLng latLng = new LatLng(0, 1);
		Location location = mock(Location.class);
		CallOnce<LatLng> event = mock(CallOnce.class);
		when(location.getLatitude()).thenReturn(latLng.latitude);
		when(location.getLongitude()).thenReturn(latLng.longitude);
		
		LocationListener_CurrentLocation currentLocation = new LocationListener_CurrentLocation(event);
		currentLocation.onLocationChanged(location);
		
		verify(event, times(1)).call(latLng);
	}
	
	@Test
	public void onLocationChanged_00_EventCall00()
	{
		LatLng latLng = new LatLng(0, 0);
		Location location = mock(Location.class);
		CallOnce<LatLng> event = mock(CallOnce.class);
		when(location.getLatitude()).thenReturn(latLng.latitude);
		when(location.getLongitude()).thenReturn(latLng.longitude);
		
		LocationListener_CurrentLocation currentLocation = new LocationListener_CurrentLocation(event);
		currentLocation.onLocationChanged(location);
		
		verify(event, times(1)).call(latLng);
	}
}