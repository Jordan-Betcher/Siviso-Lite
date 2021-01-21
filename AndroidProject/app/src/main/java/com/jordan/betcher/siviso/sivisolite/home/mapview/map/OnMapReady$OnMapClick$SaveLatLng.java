package com.jordan.betcher.siviso.sivisolite.home.mapview.map;

import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.sivisolite.home.Database;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.OnMapClick;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.OnMapReady;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.Wrapper$Map;

class OnMapReady$OnMapClick$SaveLatLng implements OnMapReady, OnMapClick
{
	Database database;
	
	public OnMapReady$OnMapClick$SaveLatLng(Database database)
	{
		this.database = database;
	}
	
	@Override
	public void mapReady(Wrapper$Map wrapper$map)
	{
		wrapper$map.addOnMapClick(this);
	}
	
	@Override
	public void onMapClick(LatLng latLng)
	{
		database.saveLocation(latLng);
	}
}
