package com.jordan.betcher.siviso.sivisolite.home.mapview.map;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.MultipleOnMapReady;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.Wrapper_GoogleMap;

class Wrapper_OnMapReadyCallback implements OnMapReadyCallback
{
	private MultipleOnMapReady multipleOnMapReady;
	
	public Wrapper_OnMapReadyCallback(
	MultipleOnMapReady multipleOnMapReady)
	{
		
		this.multipleOnMapReady = multipleOnMapReady;
	}
	
	@Override
	public void onMapReady(GoogleMap googleMap)
	{
		multipleOnMapReady.onMapReady(new Wrapper_GoogleMap(googleMap));
	}
}
