package com.jordan.betcher.siviso.sivisolite.home.mapview.map;

import android.content.res.Resources;

import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.sivisolite.home.Database.StoreSiviso$Home;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.OnMapClick;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.Wrapper$Circle;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.Wrapper$Map;

class OnMapClick$Highlight implements OnMapClick
{
	Wrapper$Circle highlight;
	private Wrapper$Map map;
	private Resources resources;
	
	public OnMapClick$Highlight(Wrapper$Map map, Resources resources, StoreSiviso$Home home)
	{
		this.map = map;
		this.resources = resources;
		map.addOnMapClick(this);
		
		if(home.isLocation())
		{
			highlight = map.createCircle(new CircleOptionsCreator$Highlight(resources, home.latLng()));
		}
	}
	
	@Override
	public void onMapClick(LatLng latLng)
	{
		if(highlight == null)
		{
			highlight = map.createCircle(new CircleOptionsCreator$Highlight(resources, latLng));
			highlight.moveTo(latLng);
		}
		else
		{
			highlight.moveTo(latLng);
		}
	}
}
