package com.jordan.betcher.siviso.sivisolite.home.Database;

import com.google.android.gms.maps.model.LatLng;

public interface Store$Home
{
	void saveLocation(LatLng latLng);
	
	boolean hasHome();
	
	LatLng home();
}
