package com.jordan.betcher.siviso.sivisolite.home.sivisomap;

import com.google.android.gms.maps.GoogleMap;

class WrapperGoogleMap
{
	GoogleMap googleMap;
	
	public WrapperGoogleMap(GoogleMap googleMap)
	{
		this.googleMap = googleMap;
	}
	
	public void setOnMapClickListener(GoogleMap.OnMapClickListener onMapClickListener)
	{
		googleMap.setOnMapClickListener(onMapClickListener);
	}
}
