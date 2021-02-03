package com.jordan.betcher.siviso.sivisolite.home.Database;

import com.google.android.gms.maps.model.LatLng;

public interface Store$Home extends Store
{
	void saveLocation(LatLng latLng);
	
	LatLng home();
}
