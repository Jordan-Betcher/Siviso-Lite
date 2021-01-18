package com.jordan.betcher.siviso.sivisolite.home.onMapReady;

import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.sivisolite.ArgumentMatcher$Same;
import com.jordan.betcher.siviso.sivisolite.R;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.Map;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.Wrapper$Circle;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.argThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Test$Highlight
{
	
	@Test
	public void createCircle_latLngMap_wrapperCircleSameCenter()
	{
		Highlight highlight = new Highlight();
		LatLng latLng = new LatLng(0, 0);
		Map map = mock(Map.class);
		
		CircleOptions circleOptions = new CircleOptions();
		circleOptions.center(latLng);
		
		Wrapper$Circle expectedCircle = mock(Wrapper$Circle.class);
		when(map.createCircle(argThat(new Same$CircleOptions$Center(circleOptions)))).thenReturn(expectedCircle);
		
		Wrapper$Circle actualCircle = highlight.createCircle(map, latLng);
		assertEquals(expectedCircle, actualCircle);
	}
	
	class Same$CircleOptions$Center extends ArgumentMatcher$Same<CircleOptions>
	{
		public Same$CircleOptions$Center(CircleOptions first)
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
	public void createCircle_latLngMap_wrapperCircleSameRadius()
	{
		Highlight highlight = new Highlight();
		LatLng latLng = new LatLng(0, 0);
		Map map = mock(Map.class);
		
		CircleOptions circleOptions = new CircleOptions();
		circleOptions.radius(R.integer.highlightRadius);
		
		Wrapper$Circle expectedCircle = mock(Wrapper$Circle.class);
		when(map.createCircle(argThat(new Same$CircleOptions$Radius(circleOptions)))).thenReturn(expectedCircle);
		
		Wrapper$Circle actualCircle = highlight.createCircle(map, latLng);
		assertEquals(expectedCircle, actualCircle);
	}
	
	class Same$CircleOptions$Radius extends ArgumentMatcher$Same<CircleOptions>
	{
		public Same$CircleOptions$Radius(CircleOptions first)
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
	public void createCircle_latLngMap_wrapperCircleSameVisibility()
	{
		Highlight highlight = new Highlight();
		LatLng latLng = new LatLng(0, 0);
		Map map = mock(Map.class);
		
		CircleOptions circleOptions = new CircleOptions();
		circleOptions.visible(true);
		
		Wrapper$Circle expectedCircle = mock(Wrapper$Circle.class);
		when(map.createCircle(argThat(new Same$CircleOptions$Visibility(circleOptions)))).thenReturn(expectedCircle);
		
		Wrapper$Circle actualCircle = highlight.createCircle(map, latLng);
		assertEquals(expectedCircle, actualCircle);
	}
	
	class Same$CircleOptions$Visibility extends ArgumentMatcher$Same<CircleOptions>
	{
		public Same$CircleOptions$Visibility(CircleOptions first)
		{
			super(first);
		}
		
		@Override
		protected boolean isSameValues(CircleOptions other)
		{
			return first.isVisible() == other.isVisible();
		}
	}
	
	@Test
	public void createCircle_latLngMap_wrapperCircleSameFillColor()
	{
		Highlight highlight = new Highlight();
		LatLng latLng = new LatLng(0, 0);
		Map map = mock(Map.class);
		
		CircleOptions circleOptions = new CircleOptions();
		circleOptions.fillColor(R.color.highlight);
		
		Wrapper$Circle expectedCircle = mock(Wrapper$Circle.class);
		when(map.createCircle(argThat(new Same$CircleOptions$FillColor(circleOptions)))).thenReturn(expectedCircle);
		
		Wrapper$Circle actualCircle = highlight.createCircle(map, latLng);
		assertEquals(expectedCircle, actualCircle);
	}
	
	class Same$CircleOptions$FillColor extends ArgumentMatcher$Same<CircleOptions>
	{
		public Same$CircleOptions$FillColor(CircleOptions first)
		{
			super(first);
		}
		
		@Override
		protected boolean isSameValues(CircleOptions other)
		{
			return first.getFillColor() == other.getFillColor();
		}
	}
}