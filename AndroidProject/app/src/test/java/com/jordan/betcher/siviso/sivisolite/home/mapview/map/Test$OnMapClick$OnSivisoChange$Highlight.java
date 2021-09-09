package com.jordan.betcher.siviso.sivisolite.home.mapview.map;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.sivisolite.home.Database.StoreSiviso$Home;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.Wrapper$Circle;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.Wrapper$Map;

import org.junit.Test;

public class Test$OnMapClick$OnSivisoChange$Highlight
{
	
	@Test
	public void sivisoChanged_color0NoHiglight_0Calls()
	{
		int color = 0;
		Wrapper$Map map = mock(Wrapper$Map.class);
		StoreSiviso$Home home = mock(StoreSiviso$Home.class);
		Wrapper$Circle highlight = mock(Wrapper$Circle.class);
		when(home.color()).thenReturn(color);
		
		OnMapClick$OnSivisoChange$Highlight onMapClickHighlight = new OnMapClick$OnSivisoChange$Highlight(map, home);
		onMapClickHighlight.sivisoChanged();
		
		verify(highlight, times(0)).setColor(color);
	}
	
	@Test
	public void sivisoChanged_color0_changeHighlightColor0()
	{
		int color = 0;
		Wrapper$Map map = mock(Wrapper$Map.class);
		StoreSiviso$Home home = mock(StoreSiviso$Home.class);
		Wrapper$Circle highlight = mock(Wrapper$Circle.class);
		when(home.color()).thenReturn(color);
		
		OnMapClick$OnSivisoChange$Highlight onMapClickHighlight = new OnMapClick$OnSivisoChange$Highlight(map, home);
		onMapClickHighlight.highlight = highlight;
		onMapClickHighlight.sivisoChanged();
		
		verify(highlight, times(1)).setColor(color);
	}
	
	@Test
	public void sivisoChanged_color1_changeHighlightColor1()
	{
		int color = 1;
		Wrapper$Map map = mock(Wrapper$Map.class);
		StoreSiviso$Home home = mock(StoreSiviso$Home.class);
		Wrapper$Circle highlight = mock(Wrapper$Circle.class);
		when(home.color()).thenReturn(color);
		
		OnMapClick$OnSivisoChange$Highlight onMapClickHighlight = new OnMapClick$OnSivisoChange$Highlight(map, home);
		onMapClickHighlight.highlight = highlight;
		onMapClickHighlight.sivisoChanged();
		
		verify(highlight, times(1)).setColor(color);
	}
	
	@Test
	public void _home_addThisToHome()
	{
		Wrapper$Map map = mock(Wrapper$Map.class);
		StoreSiviso$Home home = mock(StoreSiviso$Home.class);
		
		OnMapClick$OnSivisoChange$Highlight onMapClickHighlight = new OnMapClick$OnSivisoChange$Highlight(map, home);
		
		verify(home, times(1)).addOnSivisoChange(onMapClickHighlight);
	}
	
	@Test
	public void onMapClick_highlightAlreadyMade_0move()
	{
		LatLng latLng = new LatLng(0, 0);
		boolean homeIsLocation = false;
		
		Wrapper$Map map = mock(Wrapper$Map.class);
		Wrapper$Circle highlight = mock(Wrapper$Circle.class);
		
		StoreSiviso$Home home = mock(StoreSiviso$Home.class);
		when(home.isLocation()).thenReturn(homeIsLocation);
		
		OnMapClick$OnSivisoChange$Highlight onMapClickHighlight = new OnMapClick$OnSivisoChange$Highlight(map, home);
		onMapClickHighlight.highlight = highlight;
		onMapClickHighlight.onMapClick(latLng);
		
		verify(highlight, times(0)).moveTo(any());
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
		
		OnMapClick$OnSivisoChange$Highlight onMapClickHighlight = new OnMapClick$OnSivisoChange$Highlight(map, home);
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
		
		OnMapClick$OnSivisoChange$Highlight onMapClickHighlight = new OnMapClick$OnSivisoChange$Highlight(map, home);
		
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
		
		OnMapClick$OnSivisoChange$Highlight onMapClickHighlight = new OnMapClick$OnSivisoChange$Highlight(map, home);
		
		Wrapper$Circle actualHighlight = onMapClickHighlight.highlight;
		assertEquals(highlight, actualHighlight);
	}
	
	@Test
	public void __callOnMapClickThis()
	{
		Wrapper$Map map = mock(Wrapper$Map.class);
		StoreSiviso$Home home = mock(StoreSiviso$Home.class);
		
		OnMapClick$OnSivisoChange$Highlight onMapClickHighlight = new OnMapClick$OnSivisoChange$Highlight(map, home);
		
		verify(map, times(1)).addOnMapClick(onMapClickHighlight);
	}
}