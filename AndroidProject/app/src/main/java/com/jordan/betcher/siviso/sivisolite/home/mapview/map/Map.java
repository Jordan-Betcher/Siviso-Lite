package com.jordan.betcher.siviso.sivisolite.home.mapview.map;

import android.content.res.Resources;
import android.location.LocationManager;

import com.google.android.gms.maps.SupportMapFragment;
import com.jordan.betcher.siviso.sivisolite.home.Database;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.MapCreator;
import com.jordan.betcher.siviso.sivisolite.thirdparty.locationManager.CurrentLocation;
import com.jordan.betcher.siviso.sivisolite.thirdparty.permissions.Permission$AccessFineLocation;

public class Map
{
	OnMapReady$StartAtCurrentLocation startAtCurrentLocation;
	OnMapReady$OnMapClick$SaveLatLng saveLatLng;
	OnMapReady$OnMapClick$HighlightLatLng highlightLatLng;
	
	public Map(SupportMapFragment supportMapFragment, LocationManager locationManager, Database database, Resources resources, Permission$AccessFineLocation permission)
	{
		MapCreator mapCreator = new MapCreator(supportMapFragment);
		CurrentLocation currentLocation = new CurrentLocation(locationManager, permission, resources);
		
		startAtCurrentLocation = new OnMapReady$StartAtCurrentLocation(mapCreator, currentLocation, resources);
		highlightLatLng = new OnMapReady$OnMapClick$HighlightLatLng(mapCreator, resources);
		saveLatLng = new OnMapReady$OnMapClick$SaveLatLng(mapCreator, database);
	}
}
