package com.jordan.betcher.siviso.sivisolite.home.mapview.map;

import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.sivisolite.home.Database.StoreSiviso$Home;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.MultipleOnMapReady;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.Wrapper_GoogleMap;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class Test$OnMapReady$GoHome
{
	
	
	
	@Test
	public void mapReady_mapHomeLatLng00Zoom1_mapGoToLocation00Zoom1()
	{
		float zoom = 1f;
		LatLng latLng = new LatLng(0, 1);
		Wrapper_GoogleMap map = mock(Wrapper_GoogleMap.class);
		MultipleOnMapReady multipleOnMapReady = mock(MultipleOnMapReady.class);
		StoreSiviso$Home home = mock(StoreSiviso$Home.class);
		when(home.latLng()).thenReturn(latLng);
		
		OnMapReady$GoHome goToHome = new OnMapReady$GoHome(multipleOnMapReady, home, zoom);
		goToHome.mapReady(map);
		
		verify(map, times(1)).goToLocation(latLng, zoom);
	}
	
	@Test
	public void mapReady_mapHomeLatLng00LatLng11Zoom0_mapGoToLocation11Zoom0()
	{
		float zoom = 0f;
		LatLng latLng1 = new LatLng(0, 0);
		LatLng latLng2 = new LatLng(1, 1);
		Wrapper_GoogleMap map = mock(Wrapper_GoogleMap.class);
		MultipleOnMapReady multipleOnMapReady = mock(MultipleOnMapReady.class);
		StoreSiviso$Home home = mock(StoreSiviso$Home.class);
		when(home.latLng()).thenReturn(latLng1);
		
		OnMapReady$GoHome goToHome = new OnMapReady$GoHome(multipleOnMapReady, home, zoom);
		when(home.latLng()).thenReturn(latLng2);
		goToHome.mapReady(map);
		
		verify(map, times(1)).goToLocation(latLng2, zoom);
	}
	
	@Test
	public void mapReady_mapHomeLatLng01Zoom0_mapGoToLocation01Zoom0()
	{
		float zoom = 0f;
		LatLng latLng = new LatLng(0, 1);
		Wrapper_GoogleMap map = mock(Wrapper_GoogleMap.class);
		MultipleOnMapReady multipleOnMapReady = mock(MultipleOnMapReady.class);
		StoreSiviso$Home home = mock(StoreSiviso$Home.class);
		when(home.latLng()).thenReturn(latLng);
		
		OnMapReady$GoHome goToHome = new OnMapReady$GoHome(multipleOnMapReady, home, zoom);
		goToHome.mapReady(map);
		
		verify(map, times(1)).goToLocation(latLng, zoom);
	}
	
	@Test
	public void mapReady_mapHomeLatLng00Zoom0_mapGoToLocation00Zoom0()
	{
		float zoom = 0f;
		LatLng latLng = new LatLng(0, 0);
		Wrapper_GoogleMap map = mock(Wrapper_GoogleMap.class);
		MultipleOnMapReady multipleOnMapReady = mock(MultipleOnMapReady.class);
		StoreSiviso$Home home = mock(StoreSiviso$Home.class);
		when(home.latLng()).thenReturn(latLng);
		
		OnMapReady$GoHome goToHome = new OnMapReady$GoHome(multipleOnMapReady, home, zoom);
		goToHome.mapReady(map);
		
		verify(map, times(1)).goToLocation(latLng, zoom);
	}
	
	@Test
	public void __0MapCreatorCallWhenReadyThis()
	{
		MultipleOnMapReady multipleOnMapReady = mock(MultipleOnMapReady.class);
		StoreSiviso$Home home = mock(StoreSiviso$Home.class);
		
		OnMapReady$GoHome goToHome = new OnMapReady$GoHome(multipleOnMapReady, home, 0);
		
		verify(multipleOnMapReady, times(0)).addOnMapReady(goToHome);
	}
	
	@Test
	public void goHome__mapCreatorCallWhenReadyThis()
	{
		MultipleOnMapReady multipleOnMapReady = mock(MultipleOnMapReady.class);
		StoreSiviso$Home home = mock(StoreSiviso$Home.class);
		
		OnMapReady$GoHome goToHome = new OnMapReady$GoHome(multipleOnMapReady, home, 0);
		goToHome.goHome();
		
		verify(multipleOnMapReady, times(1)).addOnMapReady(goToHome);
	}
}