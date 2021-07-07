package com.jordan.betcher.siviso.sivisolite.home.mapview.map;

import android.content.res.Resources;
import android.location.LocationManager;

import com.google.android.gms.maps.SupportMapFragment;
import com.jordan.betcher.siviso.sivisolite.home.Database.StoreSiviso$Home;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.MapCreator;
import com.jordan.betcher.siviso.sivisolite.thirdparty.locationManager.CurrentLocation;
import com.jordan.betcher.siviso.sivisolite.thirdparty.permissions.Permission$AccessFineLocation;

public class SetupMap
{
	OnMapReady$StartAtCurrentLocation startAtCurrentLocation;
	OnMapReady$OnMapClick$SaveLatLng saveLatLng;
	OnMapReady$SetupHighlight highlightLatLng;
	
	public SetupMap(SupportMapFragment supportMapFragment, LocationManager locationManager, StoreSiviso$Home store$Home, Resources resources, Permission$AccessFineLocation permission)
	{
		MapCreator mapCreator = new MapCreator(supportMapFragment);
		CurrentLocation currentLocation = new CurrentLocation(locationManager, permission, resources);
		
		startAtCurrentLocation = new OnMapReady$StartAtCurrentLocation(mapCreator, currentLocation, resources);
		highlightLatLng = new OnMapReady$SetupHighlight(mapCreator, store$Home);
		saveLatLng = new OnMapReady$OnMapClick$SaveLatLng(mapCreator, store$Home);
		new OnMapReady$OnPermissionGranted$EnableCurrentLocation(mapCreator, permission);
	}
}
