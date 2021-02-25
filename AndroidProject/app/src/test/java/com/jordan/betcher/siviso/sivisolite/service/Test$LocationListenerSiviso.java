package com.jordan.betcher.siviso.sivisolite.service;

import android.content.Context;
import android.content.res.Resources;
import android.location.Criteria;
import android.location.LocationManager;

import com.jordan.betcher.siviso.sivisolite.R;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyFloat;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class Test$LocationListenerSiviso
{
	
	@Test
	public void remove__locationManagerRemoveListener()
	{
		int minMilliseconds = 1;
		int minMeters = 1;
		String provider = "1";
		Resources resources = mock(Resources.class);
		LocationListener$Siviso listener = mock(LocationListener$Siviso.class);
		LocationManager locationManager = mock(LocationManager.class);
		Criteria criteria = mock(Criteria.class);
		Factory$Criteria$Siviso factory = mock(Factory$Criteria$Siviso.class);
		when(factory.create()).thenReturn(criteria);
		when(locationManager.getBestProvider(criteria, true)).thenReturn(provider);
		Service_Siviso serviceSiviso = mock(Service_Siviso.class);
		when(serviceSiviso.getSystemService(Context.LOCATION_SERVICE)).thenReturn(locationManager);
		when(serviceSiviso.getResources()).thenReturn(resources);
		when(resources.getInteger(R.integer.location_listener_min_milliseconds)).thenReturn(minMilliseconds);
		when(resources.getInteger(R.integer.location_listener_min_meters)).thenReturn(minMeters);
		
		LocationListenerSiviso locationListenerSiviso = new LocationListenerSiviso(serviceSiviso);
		locationListenerSiviso.listener = listener;
		locationListenerSiviso.destroy();
		
		verify(locationManager, times(1)).removeUpdates(listener);
	}
	
	@Test
	public void __criteriaNotNull()
	{
		int minMilliseconds = 1;
		int minMeters = 1;
		Resources resources = mock(Resources.class);
		LocationManager locationManager = mock(LocationManager.class);
		Service_Siviso serviceSiviso = mock(Service_Siviso.class);
		when(serviceSiviso.getSystemService(Context.LOCATION_SERVICE)).thenReturn(locationManager);
		when(serviceSiviso.getResources()).thenReturn(resources);
		when(resources.getInteger(R.integer.location_listener_min_milliseconds)).thenReturn(minMilliseconds);
		when(resources.getInteger(R.integer.location_listener_min_meters)).thenReturn(minMeters);
		
		LocationListenerSiviso locationListenerSiviso = new LocationListenerSiviso(serviceSiviso);
		Factory$Criteria$Siviso factoryCriteria = locationListenerSiviso.factoryCriteria;
		
		assertNotNull(factoryCriteria);
	}
	
	@Test
	public void __listenerNotNull()
	{
		int minMilliseconds = 1;
		int minMeters = 1;
		String provider = "1";
		Resources resources = mock(Resources.class);
		LocationManager locationManager = mock(LocationManager.class);
		Service_Siviso serviceSiviso = mock(Service_Siviso.class);
		when(serviceSiviso.getSystemService(Context.LOCATION_SERVICE)).thenReturn(locationManager);
		when(serviceSiviso.getResources()).thenReturn(resources);
		when(resources.getInteger(R.integer.location_listener_min_milliseconds)).thenReturn(minMilliseconds);
		when(resources.getInteger(R.integer.location_listener_min_meters)).thenReturn(minMeters);
		
		LocationListenerSiviso locationListenerSiviso = new LocationListenerSiviso(serviceSiviso);
		LocationListener$Siviso listener = locationListenerSiviso.listener;
		
		assertNotNull(listener);
	}
	
	@Test
	public void create_listener_requestLocationUpdatesListener()
	{
		int minMilliseconds = 1;
		int minMeters = 1;
		String provider = "1";
		Resources resources = mock(Resources.class);
		LocationListener$Siviso listener = mock(LocationListener$Siviso.class);
		LocationManager locationManager = mock(LocationManager.class);
		Criteria criteria = mock(Criteria.class);
		Factory$Criteria$Siviso factory = mock(Factory$Criteria$Siviso.class);
		when(factory.create()).thenReturn(criteria);
		when(locationManager.getBestProvider(criteria, true)).thenReturn(provider);
		Service_Siviso serviceSiviso = mock(Service_Siviso.class);
		when(serviceSiviso.getSystemService(Context.LOCATION_SERVICE)).thenReturn(locationManager);
		when(serviceSiviso.getResources()).thenReturn(resources);
		when(resources.getInteger(R.integer.location_listener_min_milliseconds)).thenReturn(minMilliseconds);
		when(resources.getInteger(R.integer.location_listener_min_meters)).thenReturn(minMeters);
		
		LocationListenerSiviso locationListenerSiviso = new LocationListenerSiviso(serviceSiviso);
		locationListenerSiviso.listener = listener;
		locationListenerSiviso.factoryCriteria = factory;
		locationListenerSiviso.create();
		
		verify(locationManager, times(1)).requestLocationUpdates(anyString(), anyLong(), anyFloat(), eq(listener));
	}
	
	@Test
	public void create_minMeters2_requestLocationUpdatesMinMeters2()
	{
		int minMilliseconds = 1;
		int minMeters = 2;
		String provider = "1";
		Resources resources = mock(Resources.class);
		LocationListener$Siviso listener = mock(LocationListener$Siviso.class);
		LocationManager locationManager = mock(LocationManager.class);
		Criteria criteria = mock(Criteria.class);
		Factory$Criteria$Siviso factory = mock(Factory$Criteria$Siviso.class);
		when(factory.create()).thenReturn(criteria);
		when(locationManager.getBestProvider(criteria, true)).thenReturn(provider);
		Service_Siviso serviceSiviso = mock(Service_Siviso.class);
		when(serviceSiviso.getSystemService(Context.LOCATION_SERVICE)).thenReturn(locationManager);
		when(serviceSiviso.getResources()).thenReturn(resources);
		when(resources.getInteger(R.integer.location_listener_min_milliseconds)).thenReturn(minMilliseconds);
		when(resources.getInteger(R.integer.location_listener_min_meters)).thenReturn(minMeters);
		
		LocationListenerSiviso locationListenerSiviso = new LocationListenerSiviso(serviceSiviso);
		locationListenerSiviso.listener = listener;
		locationListenerSiviso.factoryCriteria = factory;
		locationListenerSiviso.create();
		
		verify(locationManager, times(1)).requestLocationUpdates(anyString(), anyLong(), eq((float)minMeters), any(LocationListener$Siviso.class));
	}
	
	@Test
	public void create_minMeters1_requestLocationUpdatesMinMeters1()
	{
		int minMilliseconds = 1;
		int minMeters = 1;
		String provider = "1";
		Resources resources = mock(Resources.class);
		LocationListener$Siviso listener = mock(LocationListener$Siviso.class);
		LocationManager locationManager = mock(LocationManager.class);
		Criteria criteria = mock(Criteria.class);
		Factory$Criteria$Siviso factory = mock(Factory$Criteria$Siviso.class);
		when(factory.create()).thenReturn(criteria);
		when(locationManager.getBestProvider(criteria, true)).thenReturn(provider);
		Service_Siviso serviceSiviso = mock(Service_Siviso.class);
		when(serviceSiviso.getSystemService(Context.LOCATION_SERVICE)).thenReturn(locationManager);
		when(serviceSiviso.getResources()).thenReturn(resources);
		when(resources.getInteger(R.integer.location_listener_min_milliseconds)).thenReturn(minMilliseconds);
		when(resources.getInteger(R.integer.location_listener_min_meters)).thenReturn(minMeters);
		
		LocationListenerSiviso locationListenerSiviso = new LocationListenerSiviso(serviceSiviso);
		locationListenerSiviso.listener = listener;
		locationListenerSiviso.factoryCriteria = factory;
		locationListenerSiviso.create();
		
		verify(locationManager, times(1)).requestLocationUpdates(anyString(), anyLong(), eq((float)minMeters), any(LocationListener$Siviso.class));
	}
	
	@Test
	public void create_minMillisecond2_requestLocationUpdatesMinMillisecond2()
	{
		int minMilliseconds = 2;
		int minMeters = 1;
		String provider = "1";
		Resources resources = mock(Resources.class);
		LocationListener$Siviso listener = mock(LocationListener$Siviso.class);
		LocationManager locationManager = mock(LocationManager.class);
		Criteria criteria = mock(Criteria.class);
		Factory$Criteria$Siviso factory = mock(Factory$Criteria$Siviso.class);
		when(factory.create()).thenReturn(criteria);
		when(locationManager.getBestProvider(criteria, true)).thenReturn(provider);
		Service_Siviso serviceSiviso = mock(Service_Siviso.class);
		when(serviceSiviso.getSystemService(Context.LOCATION_SERVICE)).thenReturn(locationManager);
		when(serviceSiviso.getResources()).thenReturn(resources);
		when(resources.getInteger(R.integer.location_listener_min_milliseconds)).thenReturn(minMilliseconds);
		when(resources.getInteger(R.integer.location_listener_min_meters)).thenReturn(minMeters);
		
		LocationListenerSiviso locationListenerSiviso = new LocationListenerSiviso(serviceSiviso);
		locationListenerSiviso.listener = listener;
		locationListenerSiviso.factoryCriteria = factory;
		locationListenerSiviso.create();
		
		verify(locationManager, times(1)).requestLocationUpdates(anyString(), eq((long)minMilliseconds), anyFloat(), any(LocationListener$Siviso.class));
	}
	
	@Test
	public void create_minMillisecond1_requestLocationUpdatesMinMillisecond1()
	{
		int minMilliseconds = 1;
		int minMeters = 1;
		String provider = "1";
		Resources resources = mock(Resources.class);
		LocationListener$Siviso listener = mock(LocationListener$Siviso.class);
		LocationManager locationManager = mock(LocationManager.class);
		Criteria criteria = mock(Criteria.class);
		Factory$Criteria$Siviso factory = mock(Factory$Criteria$Siviso.class);
		when(factory.create()).thenReturn(criteria);
		when(locationManager.getBestProvider(criteria, true)).thenReturn(provider);
		Service_Siviso serviceSiviso = mock(Service_Siviso.class);
		when(serviceSiviso.getSystemService(Context.LOCATION_SERVICE)).thenReturn(locationManager);
		when(serviceSiviso.getResources()).thenReturn(resources);
		when(resources.getInteger(R.integer.location_listener_min_milliseconds)).thenReturn(minMilliseconds);
		when(resources.getInteger(R.integer.location_listener_min_meters)).thenReturn(minMeters);
		
		LocationListenerSiviso locationListenerSiviso = new LocationListenerSiviso(serviceSiviso);
		locationListenerSiviso.listener = listener;
		locationListenerSiviso.factoryCriteria = factory;
		locationListenerSiviso.create();
		
		verify(locationManager, times(1)).requestLocationUpdates(anyString(), eq((long)minMilliseconds), anyFloat(), any(LocationListener$Siviso.class));
	}
	
	@Test
	public void create_provider2_requestLocationUpdatesProvider2()
	{
		int minMilliseconds = 1;
		int minMeters = 1;
		String provider = "2";
		Resources resources = mock(Resources.class);
		LocationListener$Siviso listener = mock(LocationListener$Siviso.class);
		LocationManager locationManager = mock(LocationManager.class);
		Criteria criteria = mock(Criteria.class);
		Factory$Criteria$Siviso factory = mock(Factory$Criteria$Siviso.class);
		when(factory.create()).thenReturn(criteria);
		when(locationManager.getBestProvider(criteria, true)).thenReturn(provider);
		Service_Siviso serviceSiviso = mock(Service_Siviso.class);
		when(serviceSiviso.getSystemService(Context.LOCATION_SERVICE)).thenReturn(locationManager);
		when(serviceSiviso.getResources()).thenReturn(resources);
		when(resources.getInteger(R.integer.location_listener_min_milliseconds)).thenReturn(minMilliseconds);
		when(resources.getInteger(R.integer.location_listener_min_meters)).thenReturn(minMeters);
		
		LocationListenerSiviso locationListenerSiviso = new LocationListenerSiviso(serviceSiviso);
		locationListenerSiviso.listener = listener;
		locationListenerSiviso.factoryCriteria = factory;
		locationListenerSiviso.create();
		
		verify(locationManager, times(1)).requestLocationUpdates(eq(provider), anyLong(), anyFloat(), any(LocationListener$Siviso.class));
	}
	
	@Test
	public void create_provider1_requestLocationUpdatesProvider1()
	{
		int minMilliseconds = 1;
		int minMeters = 1;
		String provider = "1";
		Resources resources = mock(Resources.class);
		LocationListener$Siviso listener = mock(LocationListener$Siviso.class);
		LocationManager locationManager = mock(LocationManager.class);
		Criteria criteria = mock(Criteria.class);
		Factory$Criteria$Siviso factory = mock(Factory$Criteria$Siviso.class);
		when(factory.create()).thenReturn(criteria);
		when(locationManager.getBestProvider(criteria, true)).thenReturn(provider);
		Service_Siviso serviceSiviso = mock(Service_Siviso.class);
		when(serviceSiviso.getSystemService(Context.LOCATION_SERVICE)).thenReturn(locationManager);
		when(serviceSiviso.getResources()).thenReturn(resources);
		when(resources.getInteger(R.integer.location_listener_min_milliseconds)).thenReturn(minMilliseconds);
		when(resources.getInteger(R.integer.location_listener_min_meters)).thenReturn(minMeters);
		
		LocationListenerSiviso locationListenerSiviso = new LocationListenerSiviso(serviceSiviso);
		locationListenerSiviso.listener = listener;
		locationListenerSiviso.factoryCriteria = factory;
		locationListenerSiviso.create();
		
		verify(locationManager, times(1)).requestLocationUpdates(eq(provider), anyLong(), anyFloat(), any(LocationListener$Siviso.class));
	}
}