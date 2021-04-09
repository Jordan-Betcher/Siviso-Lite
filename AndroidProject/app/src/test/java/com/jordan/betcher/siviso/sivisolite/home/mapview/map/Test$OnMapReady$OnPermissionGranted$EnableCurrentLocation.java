package com.jordan.betcher.siviso.sivisolite.home.mapview.map;

import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.MapCreator;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.Wrapper$Map;
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
		MapCreator mapCreator = mock(MapCreator.class);
		Permission$AccessFineLocation permission = mock(Permission$AccessFineLocation.class);
		Wrapper$Map map = mock(Wrapper$Map.class);
		
		OnMapReady$OnPermissionGranted$EnableCurrentLocation enableCurrentLocation = new OnMapReady$OnPermissionGranted$EnableCurrentLocation(mapCreator,
		                                                                                                                                      permission);
		enableCurrentLocation.permissionGranted();
		enableCurrentLocation.mapReady(map);
		
		verify(map, times(1)).enableCurrentLocationIcon();
	}
	
	@Test
	public void mapReady_map_()
	{
		MapCreator mapCreator = mock(MapCreator.class);
		Permission$AccessFineLocation permission = mock(Permission$AccessFineLocation.class);
		Wrapper$Map map = mock(Wrapper$Map.class);
		
		OnMapReady$OnPermissionGranted$EnableCurrentLocation enableCurrentLocation = new OnMapReady$OnPermissionGranted$EnableCurrentLocation(mapCreator,
		                                                                                                                                      permission);
		enableCurrentLocation.mapReady(map);
		
		verify(map, times(0)).enableCurrentLocationIcon();
	}
	
	@Test
	public void mapReadyAndPermissionGranted_map_EnableCurrentLocationIcon()
	{
		MapCreator mapCreator = mock(MapCreator.class);
		Permission$AccessFineLocation permission = mock(Permission$AccessFineLocation.class);
		Wrapper$Map map = mock(Wrapper$Map.class);
		
		OnMapReady$OnPermissionGranted$EnableCurrentLocation enableCurrentLocation = new OnMapReady$OnPermissionGranted$EnableCurrentLocation(mapCreator,
		                                                                                                                                      permission);
		enableCurrentLocation.mapReady(map);
		enableCurrentLocation.permissionGranted();
		
		verify(map, times(1)).enableCurrentLocationIcon();
	}
	
	@Test
	public void _permission_addThisToPermissionOnPermissionGranted()
	{
		MapCreator mapCreator = mock(MapCreator.class);
		Permission$AccessFineLocation permission = mock(Permission$AccessFineLocation.class);
		
		OnMapReady$OnPermissionGranted$EnableCurrentLocation enableCurrentLocation = new OnMapReady$OnPermissionGranted$EnableCurrentLocation(mapCreator,
		                                                                                                                                      permission);
		
		verify(permission, times(1)).addOnPermissionGranted(enableCurrentLocation);
	}
	
	@Test
	public void _mapCreator_addThisToMapCreatorOnMapReady()
	{
		MapCreator mapCreator = mock(MapCreator.class);
		Permission$AccessFineLocation permission = mock(Permission$AccessFineLocation.class);
		
		OnMapReady$OnPermissionGranted$EnableCurrentLocation enableCurrentLocation = new OnMapReady$OnPermissionGranted$EnableCurrentLocation(mapCreator,
		                                                                                                                                      permission);
		
		verify(mapCreator, times(1)).callWhenReady(enableCurrentLocation);
	}
}