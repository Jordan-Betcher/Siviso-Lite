package com.jordan.betcher.siviso.sivisolite.thirdparty.locationManager;

import static org.mockito.Mockito.*;

import android.location.Location;

import com.google.android.gms.maps.model.LatLng;

import org.junit.Test;

public class Test$LocationListener_CurrentLocation
{
	@Test
	public void onLocationChanged_00onCurrentLocation_onCurrentLocation00()
	{
		LatLng latLng = new LatLng(0, 0);
		Location location = mock(Location.class);
		OnCurrentLocation onCurrentLocation = mock(OnCurrentLocation.class);
		Event<LatLng> event = mock(Event.class);
		when(location.getLatitude()).thenReturn(latLng.latitude);
		when(location.getLongitude()).thenReturn(latLng.longitude);
		
		LocationListener_CurrentLocation currentLocation = new LocationListener_CurrentLocation(event);
		currentLocation.callWhenReady(onCurrentLocation);
		currentLocation.onLocationChanged(location);
		
		verify(onCurrentLocation, times(1)).currentLocation(latLng);
	}
}