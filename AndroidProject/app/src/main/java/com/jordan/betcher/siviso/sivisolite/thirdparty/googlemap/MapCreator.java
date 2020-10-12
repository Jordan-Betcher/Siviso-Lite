package com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;

import java.util.ArrayList;

public class MapCreator implements OnMapReadyCallback
{
	ArrayList<MapAction> mapActions = new ArrayList<>();
	Map map = null;
	
	public MapCreator(SupportMapFragment supportMapFragment){supportMapFragment.getMapAsync(this);}
	
	@Override
	public void onMapReady(GoogleMap googleMap)
	{
		map = new Map(googleMap);
		doActions(map);
	}
	
	public void callWhenReady(MapAction mapAction)
	{
		if(map == null)
		{
			mapActions.add(mapAction);
		}
		else
		{
			mapAction.mapReady(map);
		}
	}
	
	private void doActions(Map map)
	{
		for(MapAction action : mapActions)
		{
			action.mapReady(map);
		}
	}
	
	public Map getMapIfAvailable()
	{
		return map;
	}
}
