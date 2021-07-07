package com.jordan.betcher.siviso.sivisolite.home.mapview.map;

import android.content.res.Resources;
import android.location.Location;

import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.sivisolite.ArgumentMatcher$Same;
import com.jordan.betcher.siviso.sivisolite.R;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.MapCreator;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.Wrapper$Map;
import com.jordan.betcher.siviso.sivisolite.thirdparty.locationManager.CurrentLocation;

import org.junit.Test;

import static org.mockito.Matchers.anyFloat;
import static org.mockito.Matchers.argThat;
import static org.mockito.Matchers.eq;
import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class Test$OnMapReady$StartAtCurrentLocation
{
	
	//when(resources.getInteger(R.integer.start_zoom)).thenReturn(0);
	
	@Test
	public void GoToCurrentLocation_Created_MapCreatorCallWhenReady()
	{
		MapCreator fakeMapCreator = mock(MapCreator.class);
		CurrentLocation fakeCurrentLocation = mock(CurrentLocation.class);
		Resources resources = mock(Resources.class);
		OnMapReady$CurrentLocationAction$GoToCurrentLocation action = new OnMapReady$CurrentLocationAction$GoToCurrentLocation(fakeMapCreator, fakeCurrentLocation, resources);
		
		verify(fakeMapCreator).callWhenReady(action);
	}
	
	@Test
	public void GoToCurrentLocation_Created_CurrentLocationCallWhenReady()
	{
		MapCreator fakeMapCreator = mock(MapCreator.class);
		CurrentLocation fakeCurrentLocation = mock(CurrentLocation.class);
		Resources resources = mock(Resources.class);
		OnMapReady$CurrentLocationAction$GoToCurrentLocation action = new OnMapReady$CurrentLocationAction$GoToCurrentLocation(fakeMapCreator, fakeCurrentLocation, resources);
		
		verify(fakeCurrentLocation).callWhenReady(action);
	}
	
	@Test
	public void GoToCurrentLocation_MapLocation00_goToLocationLatLng0X()
	{
		MapCreator fakeMapCreator = mock(MapCreator.class);
		CurrentLocation fakeCurrentLocation = mock(CurrentLocation.class);
		Resources resources = mock(Resources.class);
		OnMapReady$CurrentLocationAction$GoToCurrentLocation action = new OnMapReady$CurrentLocationAction$GoToCurrentLocation(fakeMapCreator, fakeCurrentLocation, resources);
		
		Wrapper$Map fakeWrapper$Map = mock(Wrapper$Map.class);
		Location fakeLocation = mock(Location.class);
		when(fakeLocation.getLatitude()).thenReturn(0.0);
		when(fakeLocation.getLongitude()).thenReturn(0.0);
		
		action.mapReady(fakeWrapper$Map);
		action.currentLocationReady(fakeLocation);
		
		LatLng expectedLatLng = new LatLng(0.0,0.0);
		verify(fakeWrapper$Map).goToLocation(argThat(new Same$LatLng$Latitude(expectedLatLng)), anyFloat());
	}
	
	@Test
	public void GoToCurrentLocation_MapLocation00_goToLocationLatLngX0()
	{
		MapCreator fakeMapCreator = mock(MapCreator.class);
		CurrentLocation fakeCurrentLocation = mock(CurrentLocation.class);
		Resources resources = mock(Resources.class);
		OnMapReady$CurrentLocationAction$GoToCurrentLocation action = new OnMapReady$CurrentLocationAction$GoToCurrentLocation(fakeMapCreator, fakeCurrentLocation, resources);
		
		Wrapper$Map fakeWrapper$Map = mock(Wrapper$Map.class);
		Location fakeLocation = mock(Location.class);
		when(fakeLocation.getLatitude()).thenReturn(0.0);
		when(fakeLocation.getLongitude()).thenReturn(0.0);
		
		action.mapReady(fakeWrapper$Map);
		action.currentLocationReady(fakeLocation);
		
		LatLng expectedLatLng = new LatLng(0.0,0.0);
		verify(fakeWrapper$Map).goToLocation(argThat(new Same$LatLng$Longitude(expectedLatLng)), anyFloat());
	}
	
	@Test
	public void GoToCurrentLocation_ResourceZoom0_goToLocationZoomMatchesResource()
	{
		int zoom = 0;
		MapCreator fakeMapCreator = mock(MapCreator.class);
		CurrentLocation fakeCurrentLocation = mock(CurrentLocation.class);
		Resources resources = mock(Resources.class);
		when(resources.getInteger(R.integer.start_zoom)).thenReturn(zoom);
		OnMapReady$CurrentLocationAction$GoToCurrentLocation action = new OnMapReady$CurrentLocationAction$GoToCurrentLocation(fakeMapCreator, fakeCurrentLocation, resources);
		
		Wrapper$Map fakeWrapper$Map = mock(Wrapper$Map.class);
		Location fakeLocation = mock(Location.class);
		when(fakeLocation.getLatitude()).thenReturn(0.0);
		when(fakeLocation.getLongitude()).thenReturn(0.0);
		
		action.mapReady(fakeWrapper$Map);
		action.currentLocationReady(fakeLocation);
		
		verify(fakeWrapper$Map).goToLocation(isA(LatLng.class), eq((float)zoom));
	}
	
	@Test
	public void GoToCurrentLocation_ResourceZoom1_goToLocationZoomMatchesResource()
	{
		int zoom = 1;
		MapCreator fakeMapCreator = mock(MapCreator.class);
		CurrentLocation fakeCurrentLocation = mock(CurrentLocation.class);
		Resources resources = mock(Resources.class);
		when(resources.getInteger(R.integer.start_zoom)).thenReturn(zoom);
		OnMapReady$CurrentLocationAction$GoToCurrentLocation action = new OnMapReady$CurrentLocationAction$GoToCurrentLocation(fakeMapCreator, fakeCurrentLocation, resources);
		
		Wrapper$Map fakeWrapper$Map = mock(Wrapper$Map.class);
		Location fakeLocation = mock(Location.class);
		when(fakeLocation.getLatitude()).thenReturn(0.0);
		when(fakeLocation.getLongitude()).thenReturn(0.0);
		
		action.mapReady(fakeWrapper$Map);
		action.currentLocationReady(fakeLocation);
		
		verify(fakeWrapper$Map).goToLocation(isA(LatLng.class), eq((float)zoom));
	}
	
	@Test
	public void GoToCurrentLocation_MapLocation11_goToLocationLatLng1X()
	{
		MapCreator fakeMapCreator = mock(MapCreator.class);
		CurrentLocation fakeCurrentLocation = mock(CurrentLocation.class);
		Resources resources = mock(Resources.class);
		OnMapReady$CurrentLocationAction$GoToCurrentLocation action = new OnMapReady$CurrentLocationAction$GoToCurrentLocation(fakeMapCreator, fakeCurrentLocation, resources);
		
		Wrapper$Map fakeWrapper$Map = mock(Wrapper$Map.class);
		Location fakeLocation = mock(Location.class);
		when(fakeLocation.getLatitude()).thenReturn(1.0);
		when(fakeLocation.getLongitude()).thenReturn(1.0);
		
		action.mapReady(fakeWrapper$Map);
		action.currentLocationReady(fakeLocation);
		
		LatLng expectedLatLng = new LatLng(1.0,1.0);
		verify(fakeWrapper$Map).goToLocation(argThat(new Same$LatLng$Latitude(expectedLatLng)), anyFloat());
	}
	
	@Test
	public void GoToCurrentLocation_MapLocation11_goToLocationLatLngX1()
	{
		MapCreator fakeMapCreator = mock(MapCreator.class);
		CurrentLocation fakeCurrentLocation = mock(CurrentLocation.class);
		Resources resources = mock(Resources.class);
		OnMapReady$CurrentLocationAction$GoToCurrentLocation action = new OnMapReady$CurrentLocationAction$GoToCurrentLocation(fakeMapCreator, fakeCurrentLocation, resources);
		
		Wrapper$Map fakeWrapper$Map = mock(Wrapper$Map.class);
		Location fakeLocation = mock(Location.class);
		when(fakeLocation.getLatitude()).thenReturn(1.0);
		when(fakeLocation.getLongitude()).thenReturn(1.0);
		
		action.mapReady(fakeWrapper$Map);
		action.currentLocationReady(fakeLocation);
		
		LatLng expectedLatLng = new LatLng(1.0,1.0);
		verify(fakeWrapper$Map).goToLocation(argThat(new Same$LatLng$Longitude(expectedLatLng)), anyFloat());
	}
	
	private class Same$LatLng$Latitude extends ArgumentMatcher$Same<LatLng>
	{
		public Same$LatLng$Latitude(LatLng first)
		{
			super(first);
		}
		
		@Override
		protected boolean isSameValues(LatLng other)
		{
			return first.latitude == other.latitude;
		}
	}
	
	private class Same$LatLng$Longitude extends ArgumentMatcher$Same<LatLng>
	{
		public Same$LatLng$Longitude(LatLng first)
		{
			super(first);
		}
		
		@Override
		protected boolean isSameValues(LatLng other)
		{
			return first.longitude == other.longitude;
		}
	}
}