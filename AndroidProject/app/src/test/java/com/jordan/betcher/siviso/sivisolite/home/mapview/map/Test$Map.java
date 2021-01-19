package com.jordan.betcher.siviso.sivisolite.home.mapview.map;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class Test$Map
{
	@Test
	public void __startAtCurrentLocation()
	{
		Map map = new Map();
		
		OnMapReady$StartAtCurrentLocation startAtCurrentLocation = map.startAtCurrentLocation;
		
		assertNotNull(startAtCurrentLocation);
	}
	
	@Test
	public void __highlightLatLng()
	{
		Map map = new Map();
		
		OnMapReady$OnMapClick$HighlightLatLng highlightLatLng = map.highlightLatLng;
		
		assertNotNull(highlightLatLng);
	}
	
	@Test
	public void __saveLatLng()
	{
		Map map = new Map();
		
		OnMapReady$OnMapClick$SaveLatLng saveLatLng = map.saveLatLng;
		
		assertNotNull(saveLatLng);
	}
}