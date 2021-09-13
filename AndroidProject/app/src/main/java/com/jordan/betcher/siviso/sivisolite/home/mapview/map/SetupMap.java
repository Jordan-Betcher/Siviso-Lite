package com.jordan.betcher.siviso.sivisolite.home.mapview.map;

import android.content.res.Resources;
import android.location.LocationManager;

import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.sivisolite.R;
import com.jordan.betcher.siviso.sivisolite.home.Database.StoreSiviso$Home;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.MultipleOnMapReady;
import com.jordan.betcher.siviso.sivisolite.thirdparty.locationManager.CallOnce;
import com.jordan.betcher.siviso.sivisolite.thirdparty.locationManager.LocationListener_CurrentLocation;
import com.jordan.betcher.siviso.sivisolite.thirdparty.locationManager.OnPermissionGranted_StartCurrentLocation;
import com.jordan.betcher.siviso.sivisolite.thirdparty.permissions.Permission$AccessFineLocation;

public class SetupMap
{
	public SetupMap(
	Map$Siviso map,
	SupportMapFragment supportMapFragment, LocationManager locationManager,
	StoreSiviso$Home store$Home, Resources resources, Permission$AccessFineLocation permission)
	{
		MultipleOnMapReady multipleOnMapReady = new MultipleOnMapReady();
		Wrapper_OnMapReadyCallback onMapReadyCallback = new Wrapper_OnMapReadyCallback(multipleOnMapReady);
		supportMapFragment.getMapAsync(onMapReadyCallback);
		
		CallOnce<LatLng> currentLocationEvent = new CallOnce<>();
		LocationListener_CurrentLocation currentLocation = new LocationListener_CurrentLocation(currentLocationEvent);
		OnPermissionGranted_StartCurrentLocation startCurrentLocation = new OnPermissionGranted_StartCurrentLocation(resources, locationManager, currentLocation);
		permission.addOnPermissionGranted(startCurrentLocation);
		float defaultZoom = resources.getInteger(R.integer.start_zoom);
		
		GoToCurrentLocation goToCurrentLocation = new OnMapReady$OnCurrentLocation$GoToCurrentLocation(
		multipleOnMapReady, currentLocation, resources);
		OnMapReady$GoHome goToHome = new OnMapReady$GoHome(multipleOnMapReady, store$Home, defaultZoom);
		OnMapReady$OnMapClick$SaveLatLng saveLatLng = new OnMapReady$OnMapClick$SaveLatLng(
		multipleOnMapReady, store$Home);
		map.init(goToCurrentLocation, goToHome, saveLatLng);
		new OnMapReady$SetupHighlight(multipleOnMapReady, store$Home);
		new OnMapReady$OnPermissionGranted$EnableCurrentLocation(multipleOnMapReady, permission);
		
		goToCurrentLocation.go();
	}
}
