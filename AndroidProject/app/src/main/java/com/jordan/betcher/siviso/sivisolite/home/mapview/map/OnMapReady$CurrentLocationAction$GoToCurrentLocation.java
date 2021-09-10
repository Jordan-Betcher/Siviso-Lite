package com.jordan.betcher.siviso.sivisolite.home.mapview.map;

import android.content.res.Resources;
import android.location.Location;

import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.sivisolite.R;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.OnMapReady;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.Wrapper_GoogleMap;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.MultipleOnMapReady;
import com.jordan.betcher.siviso.sivisolite.thirdparty.locationManager.CurrentLocation;
import com.jordan.betcher.siviso.sivisolite.thirdparty.locationManager.CurrentLocationAction;

class OnMapReady$CurrentLocationAction$GoToCurrentLocation
implements OnMapReady, CurrentLocationAction, GoToCurrentLocation
{
	private Wrapper_GoogleMap wrapperGoogleMap = null;
	private LatLng latLng = null;
	private CurrentLocation currentLocation;
	private float zoom;
	private MultipleOnMapReady multipleOnMapReady;
	
	OnMapReady$CurrentLocationAction$GoToCurrentLocation(MultipleOnMapReady multipleOnMapReady, CurrentLocation currentLocation, Resources resources)
	{
		this.multipleOnMapReady = multipleOnMapReady;
		this.currentLocation = currentLocation;
		zoom = resources.getInteger(R.integer.start_zoom);
	}
	
	@Override
	public void mapReady(Wrapper_GoogleMap wrapperGoogleMap)
	{
		this.wrapperGoogleMap = wrapperGoogleMap;
		goToCurrentLocation();
	}
	
	@Override
	public void currentLocationReady(Location location)
	{
		double latitude = location.getLatitude();
		double longitude = location.getLongitude();
		latLng = new LatLng(latitude, longitude);
		goToCurrentLocation();
	}
	
	private void goToCurrentLocation()
	{
		if(wrapperGoogleMap != null && latLng != null)
		{
			wrapperGoogleMap.goToLocation(latLng, zoom);
		}
	}
	
	@Override
	public void go()
	{
		multipleOnMapReady.addOnMapReady(this);
		currentLocation.callWhenReady(this);
	}
}
