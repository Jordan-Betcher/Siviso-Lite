package com.jordan.betcher.siviso.sivisolite.home;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.widget.Toast;

import androidx.core.app.ActivityCompat;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;

public class SivisoGoogleMap
{
	GoogleMap map = null;
	Context context;
	
	public SivisoGoogleMap(Context context, SupportMapFragment mapFragment)
	{
		createMap(mapFragment);
		this.context = context;
	}
	
	private void createMap(SupportMapFragment mapFragment)
	{
		mapFragment.getMapAsync(new InternalCreateGoogleMap());
	}
	
	private void createdMap(GoogleMap googleMap)
	{
		this.map = googleMap;
	}
	
	private class InternalCreateGoogleMap implements OnMapReadyCallback
	{
		@Override
		public void onMapReady(GoogleMap googleMap)
		{
			createdMap(googleMap);
		}
	}
}
