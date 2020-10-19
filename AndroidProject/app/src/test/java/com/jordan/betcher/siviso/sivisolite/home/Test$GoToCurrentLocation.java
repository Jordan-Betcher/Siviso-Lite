package com.jordan.betcher.siviso.sivisolite.home;

import android.location.Location;

import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.Map;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.MapCreator;
import com.jordan.betcher.siviso.sivisolite.thirdparty.locationManager.CurrentLocation;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class Test$GoToCurrentLocation
{
	@Test
	public void GoToCurrentLocation_Created_MapCreatorCallWhenReady()
	{
		MapCreator fakeMapCreator = mock(MapCreator.class);
		CurrentLocation fakeCurrentLocation = mock(CurrentLocation.class);
		GoToCurrentLocation action = new GoToCurrentLocation(fakeMapCreator, fakeCurrentLocation);
		
		verify(fakeMapCreator).callWhenReady(action);
	}
	
	@Test
	public void GoToCurrentLocation_Created_CurrentLocationCallWhenReady()
	{
		MapCreator fakeMapCreator = mock(MapCreator.class);
		CurrentLocation fakeCurrentLocation = mock(CurrentLocation.class);
		GoToCurrentLocation action = new GoToCurrentLocation(fakeMapCreator, fakeCurrentLocation);
		
		verify(fakeCurrentLocation).callWhenReady(action);
	}
	
	@Test
	public void GoToCurrentLocation_BothMapReadyCurrentLocationReady_MapCalledWithLocation()
	{
		MapCreator fakeMapCreator = mock(MapCreator.class);
		CurrentLocation fakeCurrentLocation = mock(CurrentLocation.class);
		GoToCurrentLocation action = new GoToCurrentLocation(fakeMapCreator, fakeCurrentLocation);
		
		Map fakeMap = mock(Map.class);
		Location fakeLocation = mock(Location.class);
		
		action.mapReady(fakeMap);
		action.currentLocationReady(fakeLocation);
		
		verify(fakeMap).goToLocation(fakeLocation);
	}
	
	@Test
	public void GoToCurrentLocation_BothCurrentLocationReadyMapReady_MapCalledWithLocation()
	{
		MapCreator fakeMapCreator = mock(MapCreator.class);
		CurrentLocation fakeCurrentLocation = mock(CurrentLocation.class);
		GoToCurrentLocation action = new GoToCurrentLocation(fakeMapCreator, fakeCurrentLocation);
		
		Map fakeMap = mock(Map.class);
		Location fakeLocation = mock(Location.class);
		
		action.currentLocationReady(fakeLocation);
		action.mapReady(fakeMap);
		
		verify(fakeMap).goToLocation(fakeLocation);
	}
}