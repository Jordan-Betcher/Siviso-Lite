package com.jordan.betcher.siviso.sivisolite.home.mapview.map;

import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.sivisolite.home.Database.StoreSiviso$Home;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.MapCreator;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.Wrapper$Map;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class Test$OnMapReady$OnMapClick$SaveLatLng
{
	@Test
	public void _mapCreator_addThisToMapCreatorCallWhenReady()
	{
		
		Wrapper$Map map = mock(Wrapper$Map.class);
		StoreSiviso$Home store$Home = mock(StoreSiviso$Home.class);
		MapCreator mapCreator = mock(MapCreator.class);
		
		OnMapReady$OnMapClick$SaveLatLng saveLatLng =
		new OnMapReady$OnMapClick$SaveLatLng(mapCreator, store$Home);
		
		verify(mapCreator, times(1)).callWhenReady(saveLatLng);
	}
	
	@Test
	public void mapReady__addThis()
	{
		Wrapper$Map map = mock(Wrapper$Map.class);
		StoreSiviso$Home store$Home = mock(StoreSiviso$Home.class);
		MapCreator mapCreator = mock(MapCreator.class);
		OnMapReady$OnMapClick$SaveLatLng saveLatLng =
		new OnMapReady$OnMapClick$SaveLatLng(mapCreator, store$Home);
		
		saveLatLng.mapReady(map);
		
		verify(map, times(1)).addOnMapClick(saveLatLng);
	}
	
	@Test
	public void onMapClick_latLng00_SaveLatLng00()
	{
		StoreSiviso$Home store$Home = mock(StoreSiviso$Home.class);
		MapCreator mapCreator = mock(MapCreator.class);
		OnMapReady$OnMapClick$SaveLatLng saveLatLng =
		new OnMapReady$OnMapClick$SaveLatLng(mapCreator, store$Home);
		LatLng latLng = new LatLng(0, 0);
		saveLatLng.onMapClick(latLng);
		verify(store$Home, times(1)).saveLocation(latLng);
	}
	
	@Test
	public void onMapClick_latLng11_SaveLatLng11()
	{
		StoreSiviso$Home store$Home = mock(StoreSiviso$Home.class);
		MapCreator mapCreator = mock(MapCreator.class);
		OnMapReady$OnMapClick$SaveLatLng saveLatLng =
		new OnMapReady$OnMapClick$SaveLatLng(mapCreator, store$Home);
		LatLng latLng = new LatLng(1, 1);
		saveLatLng.onMapClick(latLng);
		verify(store$Home, times(1)).saveLocation(latLng);
	}
}