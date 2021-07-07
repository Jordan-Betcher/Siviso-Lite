package com.jordan.betcher.siviso.sivisolite.home.mapview.map;

import android.content.res.Resources;
import android.location.LocationManager;

import com.google.android.gms.maps.SupportMapFragment;
import com.jordan.betcher.siviso.sivisolite.home.Database.StoreSiviso$Home;
import com.jordan.betcher.siviso.sivisolite.thirdparty.permissions.Permission$AccessFineLocation;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

public class Test$SetupMap
{
	@Test
	public void __startAtCurrentLocation()
	{
		SupportMapFragment supportMapFragment = mock(SupportMapFragment.class);
		LocationManager locationManager = mock(LocationManager.class);
		StoreSiviso$Home store$Home = mock(StoreSiviso$Home.class);
		Resources resources = mock(Resources.class);
		Permission$AccessFineLocation permission = mock(Permission$AccessFineLocation.class);
		SetupMap setupMap = new SetupMap(supportMapFragment, locationManager, store$Home, resources, permission);
		
		OnMapReady$StartAtCurrentLocation startAtCurrentLocation = setupMap.startAtCurrentLocation;
		
		assertNotNull(startAtCurrentLocation);
	}
	
	@Test
	public void __highlightLatLng()
	{
		SupportMapFragment supportMapFragment = mock(SupportMapFragment.class);
		LocationManager locationManager = mock(LocationManager.class);
		StoreSiviso$Home store$Home = mock(StoreSiviso$Home.class);
		Resources resources = mock(Resources.class);
		Permission$AccessFineLocation permission = mock(Permission$AccessFineLocation.class);
		SetupMap setupMap = new SetupMap(supportMapFragment, locationManager, store$Home, resources, permission);
		
		OnMapReady$SetupHighlight highlightLatLng = setupMap.highlightLatLng;
		
		assertNotNull(highlightLatLng);
	}
	
	@Test
	public void __saveLatLng()
	{
		SupportMapFragment supportMapFragment = mock(SupportMapFragment.class);
		LocationManager locationManager = mock(LocationManager.class);
		StoreSiviso$Home store$Home = mock(StoreSiviso$Home.class);
		Resources resources = mock(Resources.class);
		Permission$AccessFineLocation permission = mock(Permission$AccessFineLocation.class);
		SetupMap setupMap = new SetupMap(supportMapFragment, locationManager, store$Home, resources, permission);
		
		OnMapReady$OnMapClick$SaveLatLng saveLatLng = setupMap.saveLatLng;
		
		assertNotNull(saveLatLng);
	}
}