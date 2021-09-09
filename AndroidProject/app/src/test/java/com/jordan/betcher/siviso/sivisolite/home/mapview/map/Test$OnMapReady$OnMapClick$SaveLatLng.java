package com.jordan.betcher.siviso.sivisolite.home.mapview.map;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.sivisolite.home.Database.StoreSiviso$Home;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.MapCreator;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.Wrapper$Map;

import org.junit.Test;

public class Test$OnMapReady$OnMapClick$SaveLatLng
{
	
	@Test
	public void onMapClick_latLng00EditableFalse_0SaveLatLng()
	{
		boolean editable = false;
		StoreSiviso$Home store$Home = mock(StoreSiviso$Home.class);
		MapCreator mapCreator = mock(MapCreator.class);
		OnMapReady$OnMapClick$SaveLatLng saveLatLng =
		new OnMapReady$OnMapClick$SaveLatLng(mapCreator, store$Home);
		LatLng latLng = new LatLng(0, 0);
		saveLatLng.editable = editable;
		saveLatLng.onMapClick(latLng);
		verify(store$Home, times(0)).saveLocation(any());
	}
	
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
	public void onMapClick_latLng00EditableTrue_SaveLatLng00()
	{
		boolean editable = true;
		StoreSiviso$Home store$Home = mock(StoreSiviso$Home.class);
		MapCreator mapCreator = mock(MapCreator.class);
		OnMapReady$OnMapClick$SaveLatLng saveLatLng =
		new OnMapReady$OnMapClick$SaveLatLng(mapCreator, store$Home);
		LatLng latLng = new LatLng(0, 0);
		saveLatLng.editable = editable;
		saveLatLng.onMapClick(latLng);
		verify(store$Home, times(1)).saveLocation(latLng);
	}
	
	@Test
	public void onMapClick_latLng11EditableTrue_SaveLatLng11()
	{
		boolean editable = true;
		StoreSiviso$Home store$Home = mock(StoreSiviso$Home.class);
		MapCreator mapCreator = mock(MapCreator.class);
		OnMapReady$OnMapClick$SaveLatLng saveLatLng =
		new OnMapReady$OnMapClick$SaveLatLng(mapCreator, store$Home);
		LatLng latLng = new LatLng(1, 1);
		saveLatLng.editable = editable;
		saveLatLng.onMapClick(latLng);
		verify(store$Home, times(1)).saveLocation(latLng);
	}
}