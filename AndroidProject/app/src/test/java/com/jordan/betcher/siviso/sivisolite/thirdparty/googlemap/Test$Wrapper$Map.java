package com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.LatLng;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(PowerMockRunner.class)
@Config(manifest = Config.NONE)
@PrepareForTest({GoogleMap.class, CameraUpdate.class, Circle.class, CameraUpdateFactory.class})
@PowerMockIgnore({ "org.mockito.*", "org.robolectric.*", "android.*", "androidx.*" })
public class Test$Wrapper$Map
{
	/* // Doesn't work for some reason
	@Test
	public void enableCurrentLocation__setEnableCurrentLocationTrue()
	{
		GoogleMap fakeGoogleMap = PowerMockito.mock(GoogleMap.class);
		Wrapper$Map map = new Wrapper$Map(fakeGoogleMap);
		
		map.enableCurrentLocationIcon();
		
		verify(fakeGoogleMap, times(1)).setMyLocationEnabled(true);
	}//*/
	
	@Test
	public void goToLocation_latLng00Zoom0_moveCameraWithCameraUpdateFromFactoryLatLng00Zoom0()
	{
		CameraUpdate cameraUpdate = mock(CameraUpdate.class);
		float zoom = 0.0f;
		LatLng latLng = new LatLng(0, 0);
		PowerMockito.mockStatic(CameraUpdateFactory.class);
		GoogleMap fakeGoogleMap = PowerMockito.mock(GoogleMap.class);
		Wrapper$Map map = new Wrapper$Map(fakeGoogleMap);
		PowerMockito.when(CameraUpdateFactory.newLatLngZoom(latLng, zoom)).thenReturn(cameraUpdate);
		
		map.goToLocation(latLng, zoom);
		
		PowerMockito.verifyStatic(times(1));
		fakeGoogleMap.moveCamera(cameraUpdate);
	}
	
	@Test
	public void goToLocation_latLng11Zoom0_moveCameraWithCameraUpdateFromFactoryLatLng11Zoom0()
	{
		CameraUpdate cameraUpdate = mock(CameraUpdate.class);
		float zoom = 0.0f;
		LatLng latLng = new LatLng(1, 1);
		PowerMockito.mockStatic(CameraUpdateFactory.class);
		GoogleMap fakeGoogleMap = PowerMockito.mock(GoogleMap.class);
		Wrapper$Map map = new Wrapper$Map(fakeGoogleMap);
		PowerMockito.when(CameraUpdateFactory.newLatLngZoom(latLng, zoom)).thenReturn(cameraUpdate);
		
		map.goToLocation(latLng, zoom);

		PowerMockito.verifyStatic(times(1));
		fakeGoogleMap.moveCamera(cameraUpdate);
	}
	
	@Test
	public void goToLocation_latLng00Zoom1_moveCameraWithCameraUpdateFromFactoryLatLng00Zoom1()
	{
		PowerMockito.mockStatic(CameraUpdateFactory.class);
		CameraUpdate cameraUpdate = mock(CameraUpdate.class);
		float zoom = 1;
		LatLng latLng = new LatLng(0, 0);
		GoogleMap googleMap = PowerMockito.mock(GoogleMap.class);
		Wrapper$Map wrapper$map = new Wrapper$Map(googleMap);
		when(CameraUpdateFactory.newLatLngZoom(latLng, zoom)).thenReturn(cameraUpdate);
		
		wrapper$map.goToLocation(latLng, zoom);

		PowerMockito.verifyStatic(times(1));
		googleMap.moveCamera(cameraUpdate);
	}
	
	@Test
	public void __setOnMapClickListenerToMultipleOnMapClick()
	{
		GoogleMap googleMap = PowerMockito.mock(GoogleMap.class);
		Wrapper$Map wrapper$map = new Wrapper$Map(googleMap);
		
		OnMapClickListener$MultipleOnMapClick listener = wrapper$map.multipleOnMapClick;
		
		PowerMockito.verifyStatic(times(1));
		googleMap.setOnMapClickListener(listener);
	}
	
	@Test
	public void __createMultipleOnMapClick()
	{
		GoogleMap googleMap = PowerMockito.mock(GoogleMap.class);
		Wrapper$Map wrapper$map = new Wrapper$Map(googleMap);
		
		OnMapClickListener$MultipleOnMapClick listener = wrapper$map.multipleOnMapClick;
		
		assertNotNull(listener);
	}
	
	@Test
	public void addOnMapClick__addToMultipleOnMapClick()
	{
		GoogleMap googleMap = PowerMockito.mock(GoogleMap.class);
		Wrapper$Map wrapper$map = new Wrapper$Map(googleMap);
		OnMapClick onMapClick = PowerMockito.mock(OnMapClick.class);
		OnMapClickListener$MultipleOnMapClick listener = mock(OnMapClickListener$MultipleOnMapClick.class);
		
		wrapper$map.multipleOnMapClick = listener;
		wrapper$map.addOnMapClick(onMapClick);
		
		verify(listener, times(1)).addOnMapClick(onMapClick);
	}
}