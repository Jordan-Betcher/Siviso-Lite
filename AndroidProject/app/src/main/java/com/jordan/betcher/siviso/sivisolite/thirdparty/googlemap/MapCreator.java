package com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;

import java.util.ArrayList;

public class MapCreator implements OnMapReadyCallback
{
	ArrayList<OnMapReady> onMapReadies = new ArrayList<>();
	Wrapper$Map wrapper$map = null;
	
	public MapCreator(SupportMapFragment supportMapFragment){supportMapFragment.getMapAsync(this);}
	
	@Override
	public void onMapReady(GoogleMap googleMap)
	{
		wrapper$map = new Wrapper$Map(googleMap);
		doActions(wrapper$map);
	}
	
	public void callWhenReady(OnMapReady onMapReady)
	{
		if(wrapper$map == null)
		{
			onMapReadies.add(onMapReady);
		}
		else
		{
			onMapReady.mapReady(wrapper$map);
		}
	}
	
	private void doActions(Wrapper$Map wrapper$map)
	{
		for(OnMapReady action : onMapReadies)
		{
			action.mapReady(wrapper$map);
		}
	}
	
	public Wrapper$Map getMapIfAvailable()
	{
		return wrapper$map;
	}
}
