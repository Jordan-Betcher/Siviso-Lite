package com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;

public class OnMapClickListener$MultipleOnMapClick implements GoogleMap.OnMapClickListener
{
	private ArrayList<OnMapClick> onMapClicks = new ArrayList<>();
	
	public void addOnMapClick(OnMapClick onMapClick)
	{
		this.onMapClicks.add(onMapClick);
	}
	
	@Override
	public void onMapClick(LatLng latLng)
	{
		for(OnMapClick onMapClick : onMapClicks)
		{
			onMapClick.onMapClick(latLng);
		}
	}
}
