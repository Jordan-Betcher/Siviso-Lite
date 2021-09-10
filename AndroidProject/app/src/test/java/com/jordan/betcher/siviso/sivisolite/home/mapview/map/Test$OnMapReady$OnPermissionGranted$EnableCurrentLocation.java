package com.jordan.betcher.siviso.sivisolite.home.mapview.map;

import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.MultipleOnMapReady;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.Wrapper_GoogleMap;
import com.jordan.betcher.siviso.sivisolite.thirdparty.permissions.Permission$AccessFineLocation;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class Test$OnMapReady$OnPermissionGranted$EnableCurrentLocation
{
	@Test
	public void permissionGrantedAndMapReady_map_EnableCurrentLocationIcon()
	{
		MultipleOnMapReady multipleOnMapReady = mock(MultipleOnMapReady.class);
		Permission$AccessFineLocation permission = mock(Permission$AccessFineLocation.class);
		Wrapper_GoogleMap map = mock(Wrapper_GoogleMap.class);
		
		OnMapReady$OnPermissionGranted$EnableCurrentLocation enableCurrentLocation = new OnMapReady$OnPermissionGranted$EnableCurrentLocation(
		multipleOnMapReady,
		permission);
		enableCurrentLocation.permissionGranted();
		enableCurrentLocation.mapReady(map);
		
		verify(map, times(1)).enableCurrentLocationIcon();
	}
	
	@Test
	public void mapReady_map_()
	{
		MultipleOnMapReady multipleOnMapReady = mock(MultipleOnMapReady.class);
		Permission$AccessFineLocation permission = mock(Permission$AccessFineLocation.class);
		Wrapper_GoogleMap map = mock(Wrapper_GoogleMap.class);
		
		OnMapReady$OnPermissionGranted$EnableCurrentLocation enableCurrentLocation = new OnMapReady$OnPermissionGranted$EnableCurrentLocation(
		multipleOnMapReady,
		permission);
		enableCurrentLocation.mapReady(map);
		
		verify(map, times(0)).enableCurrentLocationIcon();
	}
	
	@Test
	public void mapReadyAndPermissionGranted_map_EnableCurrentLocationIcon()
	{
		MultipleOnMapReady multipleOnMapReady = mock(MultipleOnMapReady.class);
		Permission$AccessFineLocation permission = mock(Permission$AccessFineLocation.class);
		Wrapper_GoogleMap map = mock(Wrapper_GoogleMap.class);
		
		OnMapReady$OnPermissionGranted$EnableCurrentLocation enableCurrentLocation = new OnMapReady$OnPermissionGranted$EnableCurrentLocation(
		multipleOnMapReady,
		permission);
		enableCurrentLocation.mapReady(map);
		enableCurrentLocation.permissionGranted();
		
		verify(map, times(1)).enableCurrentLocationIcon();
	}
	
	@Test
	public void _permission_addThisToPermissionOnPermissionGranted()
	{
		MultipleOnMapReady multipleOnMapReady = mock(MultipleOnMapReady.class);
		Permission$AccessFineLocation permission = mock(Permission$AccessFineLocation.class);
		
		OnMapReady$OnPermissionGranted$EnableCurrentLocation enableCurrentLocation = new OnMapReady$OnPermissionGranted$EnableCurrentLocation(
		multipleOnMapReady,
		permission);
		
		verify(permission, times(1)).addOnPermissionGranted(enableCurrentLocation);
	}
	
	@Test
	public void _mapCreator_addThisToMapCreatorOnMapReady()
	{
		MultipleOnMapReady multipleOnMapReady = mock(MultipleOnMapReady.class);
		Permission$AccessFineLocation permission = mock(Permission$AccessFineLocation.class);
		
		OnMapReady$OnPermissionGranted$EnableCurrentLocation enableCurrentLocation = new OnMapReady$OnPermissionGranted$EnableCurrentLocation(
		multipleOnMapReady,
		permission);
		
		verify(multipleOnMapReady, times(1)).addOnMapReady(enableCurrentLocation);
	}
}