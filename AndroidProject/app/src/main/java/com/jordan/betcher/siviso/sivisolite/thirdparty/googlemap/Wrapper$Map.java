package com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap;

import android.annotation.SuppressLint;

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
	
	public void goToLocation(LatLng latLng, float zoom)
	{
		CameraUpdate moveToLocation = CameraUpdateFactory.newLatLngZoom(latLng, zoom);
		googleMap.moveCamera(moveToLocation);
	}
	
	public Wrapper$Circle createCircle(CircleOptionsCreator circleOptionsCreator)
	{
		Circle circle = googleMap.addCircle(circleOptionsCreator.circleOptions());
		Wrapper$Circle wrapper$Circle = new Wrapper$Circle(circle);
		return wrapper$Circle;
	}
	
	@SuppressLint("MissingPermission")
	public void enableCurrentLocationIcon()
	{
		googleMap.setMyLocationEnabled(true);
	}
}

