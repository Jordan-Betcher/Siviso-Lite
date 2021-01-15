package com.jordan.betcher.siviso.sivisolite.home.onMapReady;

import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.sivisolite.ArgumentMatcher$Same;
import com.jordan.betcher.siviso.sivisolite.R;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.Map;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.Wrapper$Circle;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.mockito.Matchers.argThat;
import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class Test$OnMapClick$HighlightLocation
{
	@Test
	public void onMapClick_latLng_callhighlightWithCircleOptionMatchingLatLng()
	{
		Map map = mock(Map.class);
		OnMapClick$HighlightLocation onMapClick = new OnMapClick$HighlightLocation(map);
		LatLng latLng = new LatLng(0,0);
		
		onMapClick.onMapClick(latLng);
		
		CircleOptions circleOptions = new CircleOptions();
		circleOptions.center(latLng);
		verify(map).createCircle(argThat(new Same$CircleOptionLatLng(circleOptions)));
	}
	
	
	private class Same$CircleOptionLatLng extends ArgumentMatcher$Same<CircleOptions>
	{
		public Same$CircleOptionLatLng(CircleOptions first)
		{
			super(first);
		}
		
		@Override
		protected boolean isSameValues(CircleOptions other)
		{
			return first.getCenter() == other.getCenter();
		}
	}
	
	
	@Test
	public void onMapClick_latLng_callhighlightWithCircleOptionMatchingRadius()
	{
		Map map = mock(Map.class);
		OnMapClick$HighlightLocation onMapClick = new OnMapClick$HighlightLocation(map);
		LatLng latLng = new LatLng(0,0);
		
		onMapClick.onMapClick(latLng);
		
		CircleOptions circleOptions = new CircleOptions();
		circleOptions.radius(R.integer.highlightRadius);
		verify(map).createCircle(argThat(new Same$CircleOptionRadius(circleOptions)));
	}
	
	
	private class Same$CircleOptionRadius extends ArgumentMatcher$Same<CircleOptions>
	{
		public Same$CircleOptionRadius(CircleOptions first)
		{
			super(first);
		}
		
		@Override
		protected boolean isSameValues(CircleOptions other)
		{
			return first.getRadius() == other.getRadius();
		}
	}
	
	@Test
	public void onMapClick_latLng_callhighlightWithCircleOptionMatchingFillColor()
	{
		Map map = mock(Map.class);
		OnMapClick$HighlightLocation onMapClick = new OnMapClick$HighlightLocation(map);
		LatLng latLng = new LatLng(0,0);
		
		onMapClick.onMapClick(latLng);
		
		CircleOptions circleOptions = new CircleOptions();
		circleOptions.fillColor(R.color.highlight);
		verify(map).createCircle(argThat(new Same$CircleOptionFillColor(circleOptions)));
	}
	
	
	private class Same$CircleOptionFillColor extends ArgumentMatcher$Same<CircleOptions>
	{
		public Same$CircleOptionFillColor(CircleOptions first)
		{
			super(first);
		}
		
		@Override
		protected boolean isSameValues(CircleOptions other)
		{
			return first.getFillColor() == other.getFillColor();
		}
	}
	
	
	@Test
	public void onMapClick__circleCreated()
	{
		Wrapper$Circle circle = mock(Wrapper$Circle.class);
		Map map = mock(Map.class);
		when(map.createCircle(isA(CircleOptions.class))).thenReturn(circle);
		OnMapClick$HighlightLocation onMapClick = new OnMapClick$HighlightLocation(map);
		LatLng latLng = new LatLng(0,0);
		
		onMapClick.onMapClick(latLng);
		
		assertNotNull(onMapClick.circle);
	}
	
	@Test
	public void __circleNull()
	{
		
		Map map = mock(Map.class);
		OnMapClick$HighlightLocation onMapClick = new OnMapClick$HighlightLocation(map);
		
		assertNull(onMapClick.circle);
	}
	
	@Test
	public void onMapClickTwice_differentLatLng_differentCircle()
	{
		
		Wrapper$Circle circle1 = mock(Wrapper$Circle.class);
		Wrapper$Circle circle2 = mock(Wrapper$Circle.class);
		Map map = mock(Map.class);
		OnMapClick$HighlightLocation onMapClick = new OnMapClick$HighlightLocation(map);
		when(map.createCircle(onMapClick.highlight)).thenReturn(circle1);
		LatLng latLng1 = new LatLng(0,0);
		LatLng latLng2 = new LatLng(1,1);
		
		onMapClick.onMapClick(latLng1);
		
		Wrapper$Circle actualCircle1 = onMapClick.circle;
		
		when(map.createCircle(onMapClick.highlight)).thenReturn(circle2);
		onMapClick.onMapClick(latLng2);
		
		Wrapper$Circle actualCircle2 = onMapClick.circle;
		
		assertNotSame(actualCircle1, actualCircle2);
	}
}