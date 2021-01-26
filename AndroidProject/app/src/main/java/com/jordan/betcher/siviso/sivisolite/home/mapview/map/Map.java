package com.jordan.betcher.siviso.sivisolite.home.mapview.map;

import android.content.res.Resources;
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
	
	public Map(SupportMapFragment supportMapFragment, LocationManager locationManager, Database database, Resources resources)
	{
		MapCreator mapCreator = new MapCreator(supportMapFragment);
		startAtCurrentLocation = createStartAtCurrentLocation(mapCreator, locationManager, resources);
		highlightLatLng = new OnMapReady$OnMapClick$HighlightLatLng(resources);
		saveLatLng = new OnMapReady$OnMapClick$SaveLatLng(database);
		mapCreator.callWhenReady(highlightLatLng);
		mapCreator.callWhenReady(saveLatLng);
	}
	
	private OnMapReady$StartAtCurrentLocation createStartAtCurrentLocation(MapCreator mapCreator, LocationManager locationManager, Resources resources)
	{
		CurrentLocation currentLocation = new CurrentLocation(locationManager);
		OnMapReady$StartAtCurrentLocation startAtCurrentLocation = new OnMapReady$StartAtCurrentLocation(mapCreator, currentLocation, resources);
		return startAtCurrentLocation;
	}
}
