package com.jordan.betcher.siviso.sivisolite.home.sivisomap;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;

class Home
{
	public Home(WrapperGoogleMap map)
	{
		map.setOnMapClickListener(new OnMapClickListener_Home());
	}
	
	public LatLng latLng()
	{
		return null;
	}
	
	class OnMapClickListener_Home implements GoogleMap.OnMapClickListener
	{
		@Override
		public void onMapClick(LatLng latLng)
		{
		
		}
	}
}
