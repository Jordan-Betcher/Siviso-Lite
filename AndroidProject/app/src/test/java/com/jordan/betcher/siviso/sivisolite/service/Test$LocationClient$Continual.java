package com.jordan.betcher.siviso.sivisolite.service;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class Test$LocationClient$Continual
{
	
	@Test
	public void stopTwice__2removeLocationUpdates()
	{
		FusedLocationProviderClient client = mock(FusedLocationProviderClient.class);
		LocationCallback callback = mock(LocationCallback.class);
		LocationRequest locationRequest = new LocationRequest();
		Factory$LocationRequestPowerSaver factory$LocationRequest = mock(
		Factory$LocationRequestPowerSaver.class);
		when(factory$LocationRequest.create()).thenReturn(locationRequest);
		
		LocationClient$Manager sivisoClient = new LocationClient$Manager(client, factory$LocationRequest, callback);
		sivisoClient.stop();
		sivisoClient.stop();
		
		verify(client, times(2)).removeLocationUpdates(callback);
	}
	
	@Test
	public void stop__removeLocationUpdates()
	{
		FusedLocationProviderClient client = mock(FusedLocationProviderClient.class);
		LocationCallback callback = mock(LocationCallback.class);
		LocationRequest locationRequest = new LocationRequest();
		Factory$LocationRequestPowerSaver factory$LocationRequest = mock(
		Factory$LocationRequestPowerSaver.class);
		when(factory$LocationRequest.create()).thenReturn(locationRequest);
		
		LocationClient$Manager sivisoClient = new LocationClient$Manager(client, factory$LocationRequest, callback);
		sivisoClient.stop();
		
		verify(client, times(1)).removeLocationUpdates(callback);
	}
	
	@Test
	public void startTwice__2requestLocationUpdates()
	{
		FusedLocationProviderClient client = mock(FusedLocationProviderClient.class);
		LocationCallback callback = mock(LocationCallback.class);
		LocationRequest locationRequest = new LocationRequest();
		Factory$LocationRequestPowerSaver factory$LocationRequest = mock(
		Factory$LocationRequestPowerSaver.class);
		when(factory$LocationRequest.create()).thenReturn(locationRequest);
		
		LocationClient$Manager sivisoClient = new LocationClient$Manager(client, factory$LocationRequest, callback);
		sivisoClient.start();
		sivisoClient.start();
		
		verify(client, times(2)).requestLocationUpdates(locationRequest, callback, null);
	}
	
	@Test
	public void start__requestLocationUpdates()
	{
		FusedLocationProviderClient client = mock(FusedLocationProviderClient.class);
		LocationCallback callback = mock(LocationCallback.class);
		LocationRequest locationRequest = new LocationRequest();
		Factory$LocationRequestPowerSaver factory$LocationRequest = mock(
		Factory$LocationRequestPowerSaver.class);
		when(factory$LocationRequest.create()).thenReturn(locationRequest);
		
		LocationClient$Manager sivisoClient = new LocationClient$Manager(client, factory$LocationRequest, callback);
		sivisoClient.start();
		
		verify(client, times(1)).requestLocationUpdates(locationRequest, callback, null);
	}
}