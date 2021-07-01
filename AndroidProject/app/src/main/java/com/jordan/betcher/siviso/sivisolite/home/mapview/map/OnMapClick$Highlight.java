package com.jordan.betcher.siviso.sivisolite.home.mapview.map;

import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.sivisolite.home.Database.StoreSiviso$Home;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.OnMapClick;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.Wrapper$Circle;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.Wrapper$Map;

class OnMapClick$Highlight implements OnMapClick
{
	Wrapper$Circle highlight;
	private Wrapper$Map map;
	private StoreSiviso$Home home;
	
	public OnMapClick$Highlight(
	Wrapper$Map map, StoreSiviso$Home home)
	{
		this.map = map;
		this.home = home;
		map.addOnMapClick(this);
		
		if(home.isLocation())
		{
			highlight = map.createCircle(home);
		}
	}
	
	@Override
	public void onMapClick(LatLng latLng)
	{
		if(highlight == null)
		{
			highlight = map.createCircle(home);
			highlight.moveTo(latLng);
		}
		else
		{
			highlight.moveTo(latLng);
		}
	}
}
