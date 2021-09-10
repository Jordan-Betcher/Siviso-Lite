package com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap;

import android.annotation.SuppressLint;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.sivisolite.home.Database.StoreSiviso$Home;
import com.jordan.betcher.siviso.sivisolite.home.mapview.map.Factory$CircleOptions;

public class Wrapper_GoogleMap
{
	public OnMapClickListener$MultipleOnMapClick multipleOnMapClick;
	GoogleMap googleMap;
	
	public Wrapper_GoogleMap(GoogleMap googleMap)
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
	
	public Wrapper$Circle createCircle(StoreSiviso$Home home)
	{
		Factory$CircleOptions factory = new Factory$CircleOptions();
		CircleOptions circleOptions = factory.create(home);
		Circle circle = googleMap.addCircle(circleOptions);
		Wrapper$Circle wrapper$Circle = new Wrapper$Circle(circle);
		return wrapper$Circle;
	}
	
	@SuppressLint("MissingPermission")
	public void enableCurrentLocationIcon()
	{
		googleMap.setMyLocationEnabled(true);
	}
}

