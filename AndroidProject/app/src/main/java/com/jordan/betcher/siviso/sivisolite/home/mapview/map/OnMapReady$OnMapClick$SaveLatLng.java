package com.jordan.betcher.siviso.sivisolite.home.mapview.map;

import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.sivisolite.home.Database.StoreSiviso$Home;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.MapCreator;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.OnMapClick;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.OnMapReady;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.Wrapper$Map;

class OnMapReady$OnMapClick$SaveLatLng implements OnMapReady, OnMapClick
{
	boolean editable = true;
	StoreSiviso$Home store$Home;
	
	public OnMapReady$OnMapClick$SaveLatLng(
	MapCreator mapCreator,
	StoreSiviso$Home store$Home)
	{
		this.store$Home = store$Home;
		mapCreator.callWhenReady(this);
	}
	
	@Override
	public void mapReady(Wrapper$Map wrapper$map)
	{
		wrapper$map.addOnMapClick(this);
	}
	
	@Override
	public void onMapClick(LatLng latLng)
	{
		if(editable)
		{
			store$Home.saveLocation(latLng);
		}
	}
	
	public void setEditable(boolean editable)
	{
		//TODO OnMapReady$OnMapClick$SaveLatLng setEditable
	}
}
