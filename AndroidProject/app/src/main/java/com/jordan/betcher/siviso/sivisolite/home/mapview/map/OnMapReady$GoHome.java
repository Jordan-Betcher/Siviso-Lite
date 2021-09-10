package com.jordan.betcher.siviso.sivisolite.home.mapview.map;

import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.sivisolite.home.Database.StoreSiviso$Home;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.MultipleOnMapReady;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.OnMapReady;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.Wrapper_GoogleMap;

class OnMapReady$GoHome implements OnMapReady
{
	private MultipleOnMapReady multipleOnMapReady;
	private StoreSiviso$Home store$Home;
	private float zoom;
	
	public OnMapReady$GoHome(MultipleOnMapReady multipleOnMapReady, StoreSiviso$Home store$Home, float zoom)
	{
		this.multipleOnMapReady = multipleOnMapReady;
		this.store$Home = store$Home;
		this.zoom = zoom;
	}
	
	@Override
	public void mapReady(
	Wrapper_GoogleMap wrapperGoogleMap)
	{
		LatLng latLng = store$Home.latLng();
		wrapperGoogleMap.goToLocation(latLng, zoom);
	}
	
	public void goHome()
	{
		multipleOnMapReady.addOnMapReady(this);
	}
}
