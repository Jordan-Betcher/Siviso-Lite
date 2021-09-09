package com.jordan.betcher.siviso.sivisolite.home.mapview.map;

import android.util.Log;

import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.sivisolite.home.Database.StoreSiviso$Home;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.MapCreator;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.OnMapClick;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.OnMapReady;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.Wrapper$Map;

class OnMapReady$OnMapClick$SaveLatLng implements OnMapReady, OnMapClick
{
	private static final String TAG = "SaveLatLng";
	boolean editable;
	StoreSiviso$Home store$Home;
	
	public OnMapReady$OnMapClick$SaveLatLng(
	MapCreator mapCreator,
	StoreSiviso$Home store$Home)
	{
		this.store$Home = store$Home;
		mapCreator.callWhenReady(this);
		editable = !store$Home.isLocation();
	}
	
	@Override
	public void mapReady(Wrapper$Map wrapper$map)
	{
		wrapper$map.addOnMapClick(this);
	}
	
	@Override
	public void onMapClick(LatLng latLng)
	{
		Log.d(TAG, "onMapClick: " + editable);
		if(editable)
		{
			store$Home.saveLocation(latLng);
		}
	}
	
	public void setEditable(boolean editable)
	{
		this.editable = editable;
	}
}
