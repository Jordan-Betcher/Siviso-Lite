package com.jordan.betcher.siviso.sivisolite.home.mapview.map;

import android.content.res.Resources;

import com.jordan.betcher.siviso.sivisolite.home.Database.StoreSiviso$Home;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.MapCreator;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.OnMapReady;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.Wrapper$Map;

class OnMapReady$SetupHighlight implements OnMapReady
{
	public OnMapClick$Highlight onMapClickHighlight;
	private StoreSiviso$Home home;
	private Resources resources;
	
	public OnMapReady$SetupHighlight(MapCreator mapCreator, StoreSiviso$Home home, Resources resources)
	{
		this.home = home;
		this.resources = resources;
		mapCreator.callWhenReady(this);
	}
	
	@Override
	public void mapReady(Wrapper$Map map)
	{
		onMapClickHighlight = new OnMapClick$Highlight(map, resources, home);
	}
}