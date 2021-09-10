package com.jordan.betcher.siviso.sivisolite.home.mapview.map;

import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.sivisolite.home.Database.StoreSiviso$Home;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.MultipleOnMapReady;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.OnMapClick;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.OnMapReady;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.Wrapper_GoogleMap;

class OnMapReady$OnMapClick$SaveLatLng implements OnMapReady, OnMapClick
{
	boolean editable;
	StoreSiviso$Home store$Home;
	
	public OnMapReady$OnMapClick$SaveLatLng(
	MultipleOnMapReady multipleOnMapReady,
	StoreSiviso$Home store$Home)
	{
		this.store$Home = store$Home;
		multipleOnMapReady.addOnMapReady(this);
		editable = !store$Home.isLocation();
	}
	
	@Override
	public void mapReady(Wrapper_GoogleMap wrapperGoogleMap)
	{
		wrapperGoogleMap.addOnMapClick(this);
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
		this.editable = editable;
	}
}
