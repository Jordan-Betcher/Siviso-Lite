package com.jordan.betcher.siviso.sivisolite.home.mapview.map;

import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.sivisolite.home.Database;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.Wrapper$Map;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class Test$OnMapReady$OnMapClick$SaveLatLng
{
	@Test
	public void mapReady__addThis()
	{
		Wrapper$Map map = mock(Wrapper$Map.class);
		Database database = mock(Database.class);
		OnMapReady$OnMapClick$SaveLatLng saveLatLng = new OnMapReady$OnMapClick$SaveLatLng(database);
		saveLatLng.mapReady(map);
		verify(map, times(1)).addOnMapClick(saveLatLng);
	}
	
	@Test
	public void onMapClick_latLng00_SaveLatLng00()
	{
		Database database = mock(Database.class);
		OnMapReady$OnMapClick$SaveLatLng saveLatLng = new OnMapReady$OnMapClick$SaveLatLng(database);
		LatLng latLng = new LatLng(0, 0);
		saveLatLng.onMapClick(latLng);
		verify(database, times(1)).saveLocation(latLng);
	}
	
	@Test
	public void onMapClick_latLng11_SaveLatLng11()
	{
		Database database = mock(Database.class);
		OnMapReady$OnMapClick$SaveLatLng saveLatLng = new OnMapReady$OnMapClick$SaveLatLng(database);
		LatLng latLng = new LatLng(1, 1);
		saveLatLng.onMapClick(latLng);
		verify(database, times(1)).saveLocation(latLng);
	}
}