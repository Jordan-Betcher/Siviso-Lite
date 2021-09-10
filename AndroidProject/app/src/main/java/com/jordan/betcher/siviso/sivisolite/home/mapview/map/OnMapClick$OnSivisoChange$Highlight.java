package com.jordan.betcher.siviso.sivisolite.home.mapview.map;

import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.sivisolite.home.Database.OnSivisoChange;
import com.jordan.betcher.siviso.sivisolite.home.Database.StoreSiviso$Home;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.OnMapClick;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.Wrapper$Circle;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.Wrapper_GoogleMap;

class OnMapClick$OnSivisoChange$Highlight implements OnMapClick, OnSivisoChange
{
	Wrapper$Circle highlight;
	private Wrapper_GoogleMap map;
	private StoreSiviso$Home home;
	
	public OnMapClick$OnSivisoChange$Highlight(
	Wrapper_GoogleMap map, StoreSiviso$Home home)
	{
		this.map = map;
		this.home = home;
		
		map.addOnMapClick(this);
		
		if(home.isLocation())
		{
			highlight = map.createCircle(home);
		}

		home.addOnSivisoChange(this);
	}
	
	@Override
	public void onMapClick(LatLng latLng)
	{
		if(highlight == null)
		{
			highlight = map.createCircle(home);
			highlight.moveTo(latLng);
		}
	}
	
	@Override
	public void sivisoChanged()
	{
		if(highlight != null)
		{
			highlight.setColor(home.color());
			highlight.moveTo(home.latLng());
		}
	}
}
