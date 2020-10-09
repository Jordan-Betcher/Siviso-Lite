package com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;

class Wrapper$OnMapClickListener implements GoogleMap.OnMapClickListener
{
	private MapClick mapClick;
	
	public Wrapper$OnMapClickListener(MapClick mapClick)
	{
		this.mapClick = mapClick;
	}
	
	@Override
	public void onMapClick(LatLng latLng)
	{
		mapClick.onMapClick(latLng);
	}
}
