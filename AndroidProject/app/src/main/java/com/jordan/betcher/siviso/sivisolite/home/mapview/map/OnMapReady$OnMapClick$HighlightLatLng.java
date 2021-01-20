package com.jordan.betcher.siviso.sivisolite.home.mapview.map;

import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.OnMapClick;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.OnMapReady;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.Wrapper$Circle;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.Wrapper$Map;

class OnMapReady$OnMapClick$HighlightLatLng implements OnMapReady, OnMapClick
{
	public Wrapper$Circle circle;
	private Wrapper$Map map;
	
	@Override
	public void mapReady(
	Wrapper$Map wrapper$map)
	{
		this.map = wrapper$map;
		wrapper$map.addOnMapClick(this);
	}
	
	@Override
	public void onMapClick(LatLng latLng)
	{
		circle = map.createCircle(new CircleOptionsCreator$Highlight(latLng));
	}
}
