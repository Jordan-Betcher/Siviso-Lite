package com.jordan.betcher.siviso.sivisolite.home.mapview.map;

import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.sivisolite.home.Database.OnSivisoChange;
import com.jordan.betcher.siviso.sivisolite.home.Database.StoreSiviso$Home;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.OnMapClick;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.Wrapper$Circle;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.Wrapper$Map;

class OnMapClick$OnSivisoChange$Highlight implements OnMapClick, OnSivisoChange
{
	Wrapper$Circle highlight;
	private Wrapper$Map map;
	private StoreSiviso$Home home;
	
	public OnMapClick$OnSivisoChange$Highlight(
	Wrapper$Map map, StoreSiviso$Home home)
	{
		this.map = map;
		this.home = home;
		
		if(home.isLocation())
		{
			highlight = map.createCircle(home);
		}
		//TODO get rid of onMapClick change so that highlight doesn't move when not in edit mode aka siviso changed
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
		else
		{
			highlight.moveTo(latLng);
		}
	}
	
	@Override
	public void sivisoChanged()
	{
		if(highlight != null)
		{
			highlight.setColor(home.color());
			//TODO move to home latlng
		}
	}
}
