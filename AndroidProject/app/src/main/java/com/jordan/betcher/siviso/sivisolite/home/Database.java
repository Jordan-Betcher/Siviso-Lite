package com.jordan.betcher.siviso.sivisolite.home;

import com.google.android.gms.maps.model.LatLng;

public interface Database
{
	void saveLocation(LatLng latLng);
	
	boolean hasHome();
	
	LatLng home();
}
