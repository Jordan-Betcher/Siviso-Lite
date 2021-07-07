package com.jordan.betcher.siviso.sivisolite.home.mapview.map;

import android.content.res.Resources;
import android.location.LocationManager;

import com.google.android.gms.maps.SupportMapFragment;
import com.jordan.betcher.siviso.sivisolite.R;
import com.jordan.betcher.siviso.sivisolite.home.Database.StoreSiviso$Home;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.MapCreator;
import com.jordan.betcher.siviso.sivisolite.thirdparty.locationManager.CurrentLocation;
import com.jordan.betcher.siviso.sivisolite.thirdparty.permissions.Permission$AccessFineLocation;

public class SetupMap
{
	public SetupMap(
	Map$Siviso map,
	SupportMapFragment supportMapFragment, LocationManager locationManager,
	StoreSiviso$Home store$Home, Resources resources, Permission$AccessFineLocation permission)
	{
		MapCreator mapCreator = new MapCreator(supportMapFragment);
		CurrentLocation currentLocation = new CurrentLocation(locationManager, permission, resources);
		float defaultZoom = resources.getInteger(R.integer.start_zoom);
		
		GoToCurrentLocation goToCurrentLocation = new OnMapReady$CurrentLocationAction$GoToCurrentLocation(mapCreator, currentLocation, resources);
		OnMapReady$GoHome goToHome = new OnMapReady$GoHome(mapCreator, store$Home, defaultZoom);
		map.init(goToCurrentLocation, goToHome);
		
		new OnMapReady$SetupHighlight(mapCreator, store$Home);
		new OnMapReady$OnMapClick$SaveLatLng(mapCreator, store$Home);
		new OnMapReady$OnPermissionGranted$EnableCurrentLocation(mapCreator, permission);
	}
}
