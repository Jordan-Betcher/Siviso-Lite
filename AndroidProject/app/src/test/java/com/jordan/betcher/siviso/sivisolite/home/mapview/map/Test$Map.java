package com.jordan.betcher.siviso.sivisolite.home.mapview.map;

import android.location.LocationManager;

import com.google.android.gms.maps.SupportMapFragment;
import com.jordan.betcher.siviso.sivisolite.home.Database;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

public class Test$Map
{
	@Test
	public void __startAtCurrentLocation()
	{
		SupportMapFragment supportMapFragment = mock(SupportMapFragment.class);
		LocationManager locationManager = mock(LocationManager.class);
		Database database = mock(Database.class);
		Map map = new Map(supportMapFragment, locationManager, database);
		
		OnMapReady$StartAtCurrentLocation startAtCurrentLocation = map.startAtCurrentLocation;
		
		assertNotNull(startAtCurrentLocation);
	}
	
	@Test
	public void __highlightLatLng()
	{
		SupportMapFragment supportMapFragment = mock(SupportMapFragment.class);
		LocationManager locationManager = mock(LocationManager.class);
		Database database = mock(Database.class);
		Map map = new Map(supportMapFragment, locationManager, database);
		
		OnMapReady$OnMapClick$HighlightLatLng highlightLatLng = map.highlightLatLng;
		
		assertNotNull(highlightLatLng);
	}
	
	@Test
	public void __saveLatLng()
	{
		SupportMapFragment supportMapFragment = mock(SupportMapFragment.class);
		LocationManager locationManager = mock(LocationManager.class);
		Database database = mock(Database.class);
		Map map = new Map(supportMapFragment, locationManager, database);
		
		OnMapReady$OnMapClick$SaveLatLng saveLatLng = map.saveLatLng;
		
		assertNotNull(saveLatLng);
	}
}