package com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap;

import android.location.Location;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;

public class Map
{
	GoogleMap googleMap;
	
	public Map(GoogleMap googleMap)
	{
		this.googleMap = googleMap;
	}
	
	public void setOnMapClick(OnMapClick mapClick)
	{
		GoogleMap.OnMapClickListener wrapper = new Wrapper$OnMapClickListener(mapClick);
		googleMap.setOnMapClickListener(wrapper);
	}
	
	public void goToLocation(Location location)
	{
		double lat = location.getLatitude();
		double lng = location.getLongitude();
		LatLng latLng = new LatLng(lat, lng);
		CameraUpdate moveToLocation = locationCameraUpdate(latLng);
		googleMap.moveCamera(moveToLocation);
	}
	
	protected CameraUpdate locationCameraUpdate(LatLng latLng)
	{
		CameraUpdate moveToLocation = CameraUpdateFactory.newLatLng(latLng);
		return moveToLocation;
	}
	
	public Circle createCircle(CircleOptions circleOptions)
	{
		Circle circle = googleMap.addCircle(circleOptions);
		return circle;
	}
}

