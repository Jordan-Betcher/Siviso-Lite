package com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap;

import java.util.ArrayList;

public class MultipleOnMapReady
{
	ArrayList<OnMapReady> onMapReadies = new ArrayList<>();
	Wrapper_GoogleMap googleMap = null;
	
	public void onMapReady(Wrapper_GoogleMap googleMap)
	{
		this.googleMap = googleMap;
		doActions(googleMap);
	}
	
	public void addOnMapReady(OnMapReady onMapReady)
	{
		if(googleMap == null)
		{
			onMapReadies.add(onMapReady);
		}
		else
		{
			onMapReady.mapReady(googleMap);
		}
	}
	
	private void doActions(Wrapper_GoogleMap wrapperGoogleMap)
	{
		for(OnMapReady action : onMapReadies)
		{
			action.mapReady(wrapperGoogleMap);
		}
		
		onMapReadies.clear();
	}
	
	public Wrapper_GoogleMap getMapIfAvailable()
	{
		return googleMap;
	}
}
