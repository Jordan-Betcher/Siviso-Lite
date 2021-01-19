package com.jordan.betcher.siviso.sivisolite.home.mapview.map;

public class Map
{
	OnMapReady$StartAtCurrentLocation startAtCurrentLocation;
	OnMapReady$OnMapClick$SaveLatLng saveLatLng;
	OnMapReady$OnMapClick$HighlightLatLng highlightLatLng;
	
	public Map()
	{
		startAtCurrentLocation = new OnMapReady$StartAtCurrentLocation();
		highlightLatLng = new OnMapReady$OnMapClick$HighlightLatLng();
		saveLatLng = new OnMapReady$OnMapClick$SaveLatLng();
	}
}
