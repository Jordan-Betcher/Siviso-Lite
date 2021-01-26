package com.jordan.betcher.siviso.sivisolite.home.mapview.map;

import android.content.res.Resources;

import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.sivisolite.ArgumentMatcher$Same;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.Wrapper$Circle;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.Wrapper$Map;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.argThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class Test$OnMapReady$OnMapClick$HighlightLatLng
{
	@Test
	public void mapReady__addOnMapClickSelf()
	{
		Wrapper$Map map = mock(Wrapper$Map.class);
		Resources resources = mock(Resources.class);
		OnMapReady$OnMapClick$HighlightLatLng highlightLatLng = new OnMapReady$OnMapClick$HighlightLatLng(resources);
		
		highlightLatLng.mapReady(map);
		
		verify(map, times(1)).addOnMapClick(highlightLatLng);
	}
	
	@Test
	public void onMapClick__highlightLatLng()
	{
		Wrapper$Circle circle = mock(Wrapper$Circle.class);
		LatLng latLng = new LatLng(0, 0);
		Wrapper$Map map = mock(Wrapper$Map.class);
		Resources resources = mock(Resources.class);
		OnMapReady$OnMapClick$HighlightLatLng highlightLatLng = new OnMapReady$OnMapClick$HighlightLatLng(resources);
		CircleOptionsCreator$Highlight highlight = new CircleOptionsCreator$Highlight(resources, latLng);
		when(map.createCircle(argThat(new Same$Wrapper$CircleOptions$Highlight(highlight)))).thenReturn(circle);
		
		highlightLatLng.mapReady(map);
		highlightLatLng.onMapClick(latLng);
		
		Wrapper$Circle actualCircle = highlightLatLng.circle;
		assertEquals(circle, actualCircle);
	}
	
	private class Same$Wrapper$CircleOptions$Highlight
	extends ArgumentMatcher$Same<CircleOptionsCreator$Highlight>
	{
		
		public Same$Wrapper$CircleOptions$Highlight(
		CircleOptionsCreator$Highlight first)
		{
			super(first);
		}
		
		@Override
		protected boolean isSameValues(
		CircleOptionsCreator$Highlight other)
		{
			return first.latLng == other.latLng;
		}
	}
}