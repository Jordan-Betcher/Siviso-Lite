package com.jordan.betcher.siviso.sivisolite.home.mapview.map;

import android.location.LocationManager;

import com.google.android.gms.maps.SupportMapFragment;
import com.jordan.betcher.siviso.sivisolite.home.Database;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.MapCreator;
import com.jordan.betcher.siviso.sivisolite.thirdparty.locationManager.CurrentLocation;

public class Map
{
	OnMapReady$StartAtCurrentLocation startAtCurrentLocation;
	OnMapReady$OnMapClick$SaveLatLng saveLatLng;
	OnMapReady$OnMapClick$HighlightLatLng highlightLatLng;
	
	public Map(SupportMapFragment supportMapFragment, LocationManager locationManager, Database database)
	{
		startAtCurrentLocation = createStartAtCurrentLocation(supportMapFragment, locationManager);
		highlightLatLng = new OnMapReady$OnMapClick$HighlightLatLng();
		saveLatLng = new OnMapReady$OnMapClick$SaveLatLng(database);
	}
	
	private OnMapReady$StartAtCurrentLocation createStartAtCurrentLocation(SupportMapFragment supportMapFragment, LocationManager locationManager)
	{
		MapCreator mapCreator = new MapCreator(supportMapFragment);
		CurrentLocation currentLocation = new CurrentLocation(locationManager);
		OnMapReady$StartAtCurrentLocation startAtCurrentLocation = new OnMapReady$StartAtCurrentLocation(mapCreator, currentLocation);
		return startAtCurrentLocation;
	}
}
