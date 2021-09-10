package com.jordan.betcher.siviso.sivisolite.home.mapview.map;

import com.jordan.betcher.siviso.sivisolite.home.Database.StoreSiviso$Home;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.MultipleOnMapReady;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.OnMapReady;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.Wrapper_GoogleMap;

class OnMapReady$SetupHighlight implements OnMapReady
{
	public OnMapClick$OnSivisoChange$Highlight onMapClickHighlight;
	private StoreSiviso$Home home;
	
	public OnMapReady$SetupHighlight(MultipleOnMapReady multipleOnMapReady, StoreSiviso$Home home)
	{
		this.home = home;
		multipleOnMapReady.addOnMapReady(this);
	}
	
	@Override
	public void mapReady(Wrapper_GoogleMap map)
	{
		onMapClickHighlight = new OnMapClick$OnSivisoChange$Highlight(map, home);
	}
}
