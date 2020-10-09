package com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap;

import com.google.android.gms.maps.GoogleMap;

public class Map
{
	GoogleMap googleMap;
	
	public Map(GoogleMap googleMap)
	{
		this.googleMap = googleMap;
	}
	
	public void setOnMapClickListener(MapClick mapClick)
	{
		GoogleMap.OnMapClickListener wrapper = new Wrapper$OnMapClickListener(mapClick);
		googleMap.setOnMapClickListener(wrapper);
	}
}

