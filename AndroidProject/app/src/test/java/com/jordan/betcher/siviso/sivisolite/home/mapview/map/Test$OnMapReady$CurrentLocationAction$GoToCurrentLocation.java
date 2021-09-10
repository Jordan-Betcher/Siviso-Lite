package com.jordan.betcher.siviso.sivisolite.home.mapview.map;

import static org.mockito.Matchers.eq;
import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import android.content.res.Resources;
import android.location.Location;

import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.sivisolite.R;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.MultipleOnMapReady;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.Wrapper_GoogleMap;
import com.jordan.betcher.siviso.sivisolite.thirdparty.locationManager.CurrentLocation;

import org.junit.Test;

public class Test$OnMapReady$CurrentLocationAction$GoToCurrentLocation
{
	
	@Test
	public void go_currentLocation_callWhenReadyThis()
	{
		int zoom = 0;
		MultipleOnMapReady multipleOnMapReady = mock(MultipleOnMapReady.class);
		CurrentLocation currentLocation = mock(CurrentLocation.class);
		Resources resources = mock(Resources.class);
		when(resources.getInteger(R.integer.start_zoom)).thenReturn(zoom);
		
		
		OnMapReady$CurrentLocationAction$GoToCurrentLocation goToCurrentLocation =
		new OnMapReady$CurrentLocationAction$GoToCurrentLocation(multipleOnMapReady, currentLocation, resources);
		goToCurrentLocation.go();
		
		verify(currentLocation, times(1)).callWhenReady(goToCurrentLocation);
	}
	
	@Test
	public void _currentLocation_0callWhenReadyThis()
	{
		int zoom = 0;
		MultipleOnMapReady multipleOnMapReady = mock(MultipleOnMapReady.class);
		CurrentLocation currentLocation = mock(CurrentLocation.class);
		Resources resources = mock(Resources.class);
		when(resources.getInteger(R.integer.start_zoom)).thenReturn(zoom);
		
		
		OnMapReady$CurrentLocationAction$GoToCurrentLocation goToCurrentLocation =
		new OnMapReady$CurrentLocationAction$GoToCurrentLocation(multipleOnMapReady, currentLocation, resources);
		
		verify(currentLocation, times(0)).callWhenReady(goToCurrentLocation);
	}
	
	@Test
	public void _mapCreator_0callWhenReadyThis()
	{
		int zoom = 0;
		MultipleOnMapReady multipleOnMapReady = mock(MultipleOnMapReady.class);
		CurrentLocation currentLocation = mock(CurrentLocation.class);
		Resources resources = mock(Resources.class);
		when(resources.getInteger(R.integer.start_zoom)).thenReturn(zoom);
		
		
		OnMapReady$CurrentLocationAction$GoToCurrentLocation goToCurrentLocation =
		new OnMapReady$CurrentLocationAction$GoToCurrentLocation(multipleOnMapReady, currentLocation, resources);
		
		verify(multipleOnMapReady, times(0)).addOnMapReady(goToCurrentLocation);
	}
	
	@Test
	public void go_mapCreator_callWhenReadyThis()
	{
		int zoom = 0;
		MultipleOnMapReady multipleOnMapReady = mock(MultipleOnMapReady.class);
		CurrentLocation currentLocation = mock(CurrentLocation.class);
		Resources resources = mock(Resources.class);
		when(resources.getInteger(R.integer.start_zoom)).thenReturn(zoom);
		
		
		OnMapReady$CurrentLocationAction$GoToCurrentLocation goToCurrentLocation =
		new OnMapReady$CurrentLocationAction$GoToCurrentLocation(multipleOnMapReady, currentLocation, resources);
		goToCurrentLocation.go();
		
		verify(multipleOnMapReady, times(1)).addOnMapReady(goToCurrentLocation);
	}
	
	@Test
	public void GoToCurrentLocation_MapLocation00_goToLocationLatLng0X()
	{
		MultipleOnMapReady fakeMultipleOnMapReady = mock(MultipleOnMapReady.class);
		CurrentLocation fakeCurrentLocation = mock(CurrentLocation.class);
		int zoom = 0;
		Resources resources = mock(Resources.class);
		when(resources.getInteger(R.integer.start_zoom)).thenReturn(zoom);
		
		OnMapReady$CurrentLocationAction$GoToCurrentLocation action = new OnMapReady$CurrentLocationAction$GoToCurrentLocation(
		fakeMultipleOnMapReady, fakeCurrentLocation, resources);
		
		Wrapper_GoogleMap fakeWrapperGoogleMap = mock(Wrapper_GoogleMap.class);
		Location fakeLocation = mock(Location.class);
		when(fakeLocation.getLatitude()).thenReturn(0.0);
		when(fakeLocation.getLongitude()).thenReturn(0.0);
		
		action.mapReady(fakeWrapperGoogleMap);
		action.currentLocationReady(fakeLocation);
		
		LatLng expectedLatLng = new LatLng(0.0,0.0);
		verify(fakeWrapperGoogleMap).goToLocation(expectedLatLng, zoom);
	}
	
	@Test
	public void GoToCurrentLocation_MapLocation00_goToLocationLatLngX0()
	{
		MultipleOnMapReady fakeMultipleOnMapReady = mock(MultipleOnMapReady.class);
		CurrentLocation fakeCurrentLocation = mock(CurrentLocation.class);
		int zoom = 0;
		Resources resources = mock(Resources.class);
		when(resources.getInteger(R.integer.start_zoom)).thenReturn(zoom);
		OnMapReady$CurrentLocationAction$GoToCurrentLocation action = new OnMapReady$CurrentLocationAction$GoToCurrentLocation(
		fakeMultipleOnMapReady, fakeCurrentLocation, resources);
		
		Wrapper_GoogleMap fakeWrapperGoogleMap = mock(Wrapper_GoogleMap.class);
		Location fakeLocation = mock(Location.class);
		when(fakeLocation.getLatitude()).thenReturn(0.0);
		when(fakeLocation.getLongitude()).thenReturn(0.0);
		
		action.mapReady(fakeWrapperGoogleMap);
		action.currentLocationReady(fakeLocation);
		
		LatLng expectedLatLng = new LatLng(0.0,0.0);
		verify(fakeWrapperGoogleMap).goToLocation(expectedLatLng, zoom);
	}
	
	@Test
	public void GoToCurrentLocation_ResourceZoom0_goToLocationZoomMatchesResource()
	{
		int zoom = 0;
		MultipleOnMapReady fakeMultipleOnMapReady = mock(MultipleOnMapReady.class);
		CurrentLocation fakeCurrentLocation = mock(CurrentLocation.class);
		Resources resources = mock(Resources.class);
		when(resources.getInteger(R.integer.start_zoom)).thenReturn(zoom);
		OnMapReady$CurrentLocationAction$GoToCurrentLocation action = new OnMapReady$CurrentLocationAction$GoToCurrentLocation(
		fakeMultipleOnMapReady, fakeCurrentLocation, resources);
		
		Wrapper_GoogleMap fakeWrapperGoogleMap = mock(Wrapper_GoogleMap.class);
		Location fakeLocation = mock(Location.class);
		when(fakeLocation.getLatitude()).thenReturn(0.0);
		when(fakeLocation.getLongitude()).thenReturn(0.0);
		
		action.mapReady(fakeWrapperGoogleMap);
		action.currentLocationReady(fakeLocation);
		
		verify(fakeWrapperGoogleMap).goToLocation(isA(LatLng.class), eq((float)zoom));
	}
	
	@Test
	public void GoToCurrentLocation_ResourceZoom1_goToLocationZoomMatchesResource()
	{
		int zoom = 1;
		MultipleOnMapReady fakeMultipleOnMapReady = mock(MultipleOnMapReady.class);
		CurrentLocation fakeCurrentLocation = mock(CurrentLocation.class);
		Resources resources = mock(Resources.class);
		when(resources.getInteger(R.integer.start_zoom)).thenReturn(zoom);
		OnMapReady$CurrentLocationAction$GoToCurrentLocation action = new OnMapReady$CurrentLocationAction$GoToCurrentLocation(
		fakeMultipleOnMapReady, fakeCurrentLocation, resources);
		
		Wrapper_GoogleMap fakeWrapperGoogleMap = mock(Wrapper_GoogleMap.class);
		Location fakeLocation = mock(Location.class);
		when(fakeLocation.getLatitude()).thenReturn(0.0);
		when(fakeLocation.getLongitude()).thenReturn(0.0);
		
		action.mapReady(fakeWrapperGoogleMap);
		action.currentLocationReady(fakeLocation);
		
		verify(fakeWrapperGoogleMap).goToLocation(isA(LatLng.class), eq((float)zoom));
	}
	
	@Test
	public void GoToCurrentLocation_MapLocation11_goToLocationLatLng1X()
	{
		MultipleOnMapReady fakeMultipleOnMapReady = mock(MultipleOnMapReady.class);
		CurrentLocation fakeCurrentLocation = mock(CurrentLocation.class);
		int zoom = 0;
		Resources resources = mock(Resources.class);
		when(resources.getInteger(R.integer.start_zoom)).thenReturn(zoom);
		OnMapReady$CurrentLocationAction$GoToCurrentLocation action = new OnMapReady$CurrentLocationAction$GoToCurrentLocation(
		fakeMultipleOnMapReady, fakeCurrentLocation, resources);
		
		Wrapper_GoogleMap fakeWrapperGoogleMap = mock(Wrapper_GoogleMap.class);
		Location fakeLocation = mock(Location.class);
		when(fakeLocation.getLatitude()).thenReturn(1.0);
		when(fakeLocation.getLongitude()).thenReturn(1.0);
		
		action.mapReady(fakeWrapperGoogleMap);
		action.currentLocationReady(fakeLocation);
		
		LatLng expectedLatLng = new LatLng(1.0,1.0);
		verify(fakeWrapperGoogleMap).goToLocation(expectedLatLng, zoom);
	}
	
	@Test
	public void GoToCurrentLocation_MapLocation11_goToLocationLatLngX1()
	{
		MultipleOnMapReady fakeMultipleOnMapReady = mock(MultipleOnMapReady.class);
		CurrentLocation fakeCurrentLocation = mock(CurrentLocation.class);
		int zoom = 0;
		Resources resources = mock(Resources.class);
		when(resources.getInteger(R.integer.start_zoom)).thenReturn(zoom);
		OnMapReady$CurrentLocationAction$GoToCurrentLocation action = new OnMapReady$CurrentLocationAction$GoToCurrentLocation(
		fakeMultipleOnMapReady, fakeCurrentLocation, resources);
		
		Wrapper_GoogleMap fakeWrapperGoogleMap = mock(Wrapper_GoogleMap.class);
		Location fakeLocation = mock(Location.class);
		when(fakeLocation.getLatitude()).thenReturn(1.0);
		when(fakeLocation.getLongitude()).thenReturn(1.0);
		
		action.mapReady(fakeWrapperGoogleMap);
		action.currentLocationReady(fakeLocation);
		
		LatLng expectedLatLng = new LatLng(1.0,1.0);
		verify(fakeWrapperGoogleMap).goToLocation(expectedLatLng, zoom);
	}
}