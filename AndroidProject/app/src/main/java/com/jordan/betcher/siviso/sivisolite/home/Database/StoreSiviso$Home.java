package com.jordan.betcher.siviso.sivisolite.home.Database;

import com.google.android.gms.maps.model.LatLng;

public interface StoreSiviso$Home extends StoreSiviso
{
	void saveLocation(LatLng latLng);
	double latitude();
	double longitude();
	boolean isLocation();
	
	LatLng latLng();
	
	int radius();
	
	int color();
	void addOnSivisoChange(OnSivisoChange onSivisoChange);
}
