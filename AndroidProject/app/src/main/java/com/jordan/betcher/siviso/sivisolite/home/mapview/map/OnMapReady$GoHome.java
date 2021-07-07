package com.jordan.betcher.siviso.sivisolite.home.mapview.map;

import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.sivisolite.home.Database.StoreSiviso$Home;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.MapCreator;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.OnMapReady;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.Wrapper$Map;

class OnMapReady$GoHome implements OnMapReady
{
	private MapCreator mapCreator;
	private StoreSiviso$Home store$Home;
	private float zoom;
	
	public OnMapReady$GoHome(MapCreator mapCreator, StoreSiviso$Home store$Home, float zoom)
	{
		this.mapCreator = mapCreator;
		this.store$Home = store$Home;
		this.zoom = zoom;
	}
	
	@Override
	public void mapReady(
	Wrapper$Map wrapper$map)
	{
		LatLng latLng = store$Home.latLng();
		wrapper$map.goToLocation(latLng, zoom);
	}
	
	public void goHome()
	{
		mapCreator.callWhenReady(this);
	}
}
