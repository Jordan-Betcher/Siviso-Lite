package com.jordan.betcher.siviso.sivisolite.home.mapview.map;

import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.MapCreator;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.OnMapReady;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.Wrapper$Map;

class OnMapReady$EnableCurrentLocation implements OnMapReady
{
	public OnMapReady$EnableCurrentLocation(MapCreator mapCreator)
	{
		mapCreator.callWhenReady(this);
	}
	
	@Override
	public void mapReady(Wrapper$Map wrapper$map)
	{
		wrapper$map.enableCurrentLocationIcon();
	}
}
