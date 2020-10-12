package com.jordan.betcher.siviso.sivisolite.home.sivisomap;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;

public class SivisoMap implements OnMapReadyCallback
{
	public SivisoMap(SupportMapFragment supportMapFragment)
	{
		supportMapFragment.getMapAsync(this);
	}
	
	@Override
	public void onMapReady(GoogleMap googleMap)
	{
		//Map wrapperGoogleMap = new Map(googleMap);
		MapClick$Home home = new MapClick$Home();
	}
	
	public void goToCurrentLocation()
	{
		GoogleMap googleMap;
	}
}
