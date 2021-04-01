package com.jordan.betcher.siviso.sivisolite.home.mapview.map;

import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.MapCreator;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.Wrapper$Map;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class Test$OnMapReady$EnableCurrentLocation
{
	@Test
	public void _mapCreator_addThisToMapCreatorOnMapReady()
	{
		
		Wrapper$Map map = mock(Wrapper$Map.class);
		MapCreator mapCreator = mock(MapCreator.class);
		
		OnMapReady$EnableCurrentLocation enableCurrentLocation = new OnMapReady$EnableCurrentLocation(mapCreator);

		verify(mapCreator, times(1)).callWhenReady(enableCurrentLocation);
	}
	
	@Test
	public void mapReady_map_callEnableCurrentLocation()
	{
		Wrapper$Map map = mock(Wrapper$Map.class);
		MapCreator mapCreator = mock(MapCreator.class);
		
		OnMapReady$EnableCurrentLocation enableCurrentLocation = new OnMapReady$EnableCurrentLocation(mapCreator);
		enableCurrentLocation.mapReady(map);
		
		verify(map, times(1)).enableCurrentLocationIcon();
	}
}