package com.jordan.betcher.siviso.sivisolite.home.mapview.map;

import android.content.res.Resources;
import android.location.Location;

import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.sivisolite.R;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.OnMapReady;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.Wrapper$Map;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.MapCreator;
import com.jordan.betcher.siviso.sivisolite.thirdparty.locationManager.CurrentLocation;
import com.jordan.betcher.siviso.sivisolite.thirdparty.locationManager.CurrentLocationAction;

class OnMapReady$CurrentLocationAction$GoToCurrentLocation
implements OnMapReady, CurrentLocationAction, GoToCurrentLocation
{
	private Wrapper$Map wrapper$map = null;
	private LatLng latLng = null;
	private float zoom;
	
	OnMapReady$CurrentLocationAction$GoToCurrentLocation(MapCreator mapCreator, CurrentLocation currentLocation, Resources resources)
	{
		mapCreator.callWhenReady(this);
		currentLocation.callWhenReady(this);
		zoom = resources.getInteger(R.integer.start_zoom);
	}
	
	@Override
	public void mapReady(Wrapper$Map wrapper$map)
	{
		this.wrapper$map = wrapper$map;
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
		if(wrapper$map != null && latLng != null)
		{
			wrapper$map.goToLocation(latLng, zoom);
		}
	}
	
	@Override
	public void go()
	{
		//TODO
	}
}
