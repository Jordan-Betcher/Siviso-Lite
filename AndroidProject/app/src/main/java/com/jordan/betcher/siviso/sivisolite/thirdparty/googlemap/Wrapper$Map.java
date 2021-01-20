package com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap;

import android.location.Location;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.LatLng;

public class Wrapper$Map
{
	public OnMapClickListener$MultipleOnMapClick multipleOnMapClick;
	GoogleMap googleMap;
	
	public Wrapper$Map(GoogleMap googleMap)
	{
		this.googleMap = googleMap;
		multipleOnMapClick = new OnMapClickListener$MultipleOnMapClick();
		googleMap.setOnMapClickListener(multipleOnMapClick);
	}
	
	public void addOnMapClick(OnMapClick onMapClick)
	{
		multipleOnMapClick.addOnMapClick(onMapClick);
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
	
	public Wrapper$Circle createCircle(CircleOptionsCreator circleOptionsCreator)
	{
		Circle circle = googleMap.addCircle(circleOptionsCreator.circleOptions());
		Wrapper$Circle wrapper$Circle = new Wrapper$Circle(circle);
		return wrapper$Circle;
	}
}

