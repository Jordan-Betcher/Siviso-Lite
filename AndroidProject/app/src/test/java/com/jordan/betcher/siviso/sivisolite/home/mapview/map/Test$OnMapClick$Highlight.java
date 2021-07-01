package com.jordan.betcher.siviso.sivisolite.home.mapview.map;

import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.sivisolite.home.Database.StoreSiviso$Home;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.Wrapper$Circle;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.Wrapper$Map;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class Test$OnMapClick$Highlight
{
	@Test
	public void onMapClick_highlightAlreadyMade_highlightNotNull()
	{
		LatLng latLng = new LatLng(0, 0);
		boolean homeIsLocation = false;
		
		Wrapper$Map map = mock(Wrapper$Map.class);
		Wrapper$Circle highlight = mock(Wrapper$Circle.class);
		
		StoreSiviso$Home home = mock(StoreSiviso$Home.class);
		when(home.isLocation()).thenReturn(homeIsLocation);
		
		OnMapClick$Highlight onMapClickHighlight = new OnMapClick$Highlight(map, home);
		onMapClickHighlight.highlight = highlight;
		onMapClickHighlight.onMapClick(latLng);
		
		verify(highlight, times(1)).moveTo(latLng);
	}
	
	@Test
	public void onMapClick_LatLng00_highlightNotNull()
	{
		LatLng latLng = new LatLng(0, 0);
		Wrapper$Map map = mock(Wrapper$Map.class);
		Wrapper$Circle highlight = mock(Wrapper$Circle.class);
		
		StoreSiviso$Home home = mock(StoreSiviso$Home.class);
		when(home.isLocation()).thenReturn(false);
		
		when(map.createCircle(home)).thenReturn(highlight);
		
		OnMapClick$Highlight onMapClickHighlight = new OnMapClick$Highlight(map, home);
		onMapClickHighlight.onMapClick(latLng);
		
		Wrapper$Circle actualHighlight = onMapClickHighlight.highlight;
		assertEquals(highlight, actualHighlight);
	}
	
	@Test
	public void _homeIsLocationFalse_highlightNull()
	{
		LatLng homeLatLng = new LatLng(0, 0);
		Wrapper$Map map = mock(Wrapper$Map.class);
		Wrapper$Circle highlight = mock(Wrapper$Circle.class);
		
		StoreSiviso$Home home = mock(StoreSiviso$Home.class);
		when(home.isLocation()).thenReturn(false);
		when(home.latLng()).thenReturn(homeLatLng);
		
		OnMapClick$Highlight onMapClickHighlight = new OnMapClick$Highlight(map, home);
		
		Wrapper$Circle actualHighlight = onMapClickHighlight.highlight;
		assertEquals(null, actualHighlight);
	}
	
	@Test
	public void _homeIsLocationTrue_highlightNotNull()
	{
		LatLng homeLatLng = new LatLng(0, 0);
		Wrapper$Map map = mock(Wrapper$Map.class);
		Wrapper$Circle highlight = mock(Wrapper$Circle.class);
		
		StoreSiviso$Home home = mock(StoreSiviso$Home.class);
		when(home.isLocation()).thenReturn(true);
		when(home.latLng()).thenReturn(homeLatLng);
		when(map.createCircle(home)).thenReturn(highlight);
		
		OnMapClick$Highlight onMapClickHighlight = new OnMapClick$Highlight(map, home);
		
		Wrapper$Circle actualHighlight = onMapClickHighlight.highlight;
		assertEquals(highlight, actualHighlight);
	}
	
	@Test
	public void __callOnMapClickThis()
	{
		Wrapper$Map map = mock(Wrapper$Map.class);
		StoreSiviso$Home home = mock(StoreSiviso$Home.class);
		
		OnMapClick$Highlight onMapClickHighlight = new OnMapClick$Highlight(map, home);
		
		verify(map, times(1)).addOnMapClick(onMapClickHighlight);
	}
}