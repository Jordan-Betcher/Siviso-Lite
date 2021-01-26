package com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap;

import com.google.android.gms.internal.maps.zzh;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertEquals;
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
		
		verify(fakeGoogleMap, times(1)).moveCamera(cameraUpdate);
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
		
		verify(fakeGoogleMap, times(1)).moveCamera(cameraUpdate);
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
		
		verify(googleMap, times(1)).moveCamera(cameraUpdate);
	}
	
	@Test
	public void createCircle_circleOptions_circle()
	{
		zzh zzh = mock(zzh.class);
		Circle circle = new Circle(zzh);
		CircleOptions circleOptions = new CircleOptions();
		CircleOptionsCreator circleOptionsCreator = mock(CircleOptionsCreator.class);
		GoogleMap fakeGoogleMap = PowerMockito.mock(GoogleMap.class);
		Wrapper$Map map = new Wrapper$Map(fakeGoogleMap);
		when(circleOptionsCreator.circleOptions()).thenReturn(circleOptions);
		PowerMockito.when(fakeGoogleMap.addCircle(circleOptions)).thenReturn(circle);
		
		Wrapper$Circle actualCircle = map.createCircle(circleOptionsCreator);
		
		assertEquals(circle.toString(), actualCircle.circle.toString());
	}
	
	@Test
	public void __setOnMapClickListenerToMultipleOnMapClick()
	{
		GoogleMap googleMap = PowerMockito.mock(GoogleMap.class);
		Wrapper$Map wrapper$map = new Wrapper$Map(googleMap);
		
		OnMapClickListener$MultipleOnMapClick listener = wrapper$map.multipleOnMapClick;
		
		verify(googleMap, times(1)).setOnMapClickListener(listener);
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
		OnMapClick onMapClick = mock(OnMapClick.class);
		OnMapClickListener$MultipleOnMapClick listener = mock(OnMapClickListener$MultipleOnMapClick.class);
		
		wrapper$map.multipleOnMapClick = listener;
		wrapper$map.addOnMapClick(onMapClick);
		
		verify(listener, times(1)).addOnMapClick(onMapClick);
	}
}