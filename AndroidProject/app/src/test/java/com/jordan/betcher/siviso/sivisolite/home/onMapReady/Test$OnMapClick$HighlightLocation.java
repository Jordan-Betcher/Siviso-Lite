package com.jordan.betcher.siviso.sivisolite.home.onMapReady;

import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.Map;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.Wrapper$Circle;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class Test$OnMapClick$HighlightLocation
{
	@Test
	public void onMapClick__circleCreated()
	{
		Wrapper$Circle circle = mock(Wrapper$Circle.class);
		Map map = mock(Map.class);
		when(map.createCircle(isA(CircleOptions.class))).thenReturn(circle);
		OnMapClick$HighlightLocation onMapClick = new OnMapClick$HighlightLocation(map);
		LatLng latLng = new LatLng(0,0);
		
		onMapClick.onMapClick(latLng);
		
		assertEquals(circle, onMapClick.circle);
	}
	
	@Test
	public void __circleNull()
	{
		
		Map map = mock(Map.class);
		OnMapClick$HighlightLocation onMapClick = new OnMapClick$HighlightLocation(map);
		
		assertNull(onMapClick.circle);
	}
	
	@Test
	public void onMapClickTwice__callRemoveOnFirstCircle()
	{
		Wrapper$Circle circle1 = mock(Wrapper$Circle.class);
		Wrapper$Circle circle2 = mock(Wrapper$Circle.class);
		Map map = mock(Map.class);
		OnMapClick$HighlightLocation onMapClick = new OnMapClick$HighlightLocation(map);
		LatLng latLng = new LatLng(0,0);
		
		when(map.createCircle(isA(CircleOptions.class))).thenReturn(circle1);
		onMapClick.onMapClick(latLng);
		
		when(map.createCircle(isA(CircleOptions.class))).thenReturn(circle2);
		onMapClick.onMapClick(latLng);
		
		verify(circle1, times(1)).remove();
	}
	
	@Test
	public void onMapClickTwice__notCallRemoveOn2ndCircle()
	{
		Wrapper$Circle circle1 = mock(Wrapper$Circle.class);
		Wrapper$Circle circle2 = mock(Wrapper$Circle.class);
		Map map = mock(Map.class);
		OnMapClick$HighlightLocation onMapClick = new OnMapClick$HighlightLocation(map);
		LatLng latLng = new LatLng(0,0);
		
		when(map.createCircle(isA(CircleOptions.class))).thenReturn(circle1);
		onMapClick.onMapClick(latLng);
		
		when(map.createCircle(isA(CircleOptions.class))).thenReturn(circle2);
		onMapClick.onMapClick(latLng);
		
		verify(circle2, times(0)).remove();
	}
}