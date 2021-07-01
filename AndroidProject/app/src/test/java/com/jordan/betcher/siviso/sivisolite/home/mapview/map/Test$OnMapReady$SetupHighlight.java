package com.jordan.betcher.siviso.sivisolite.home.mapview.map;

import android.content.res.Resources;

import com.jordan.betcher.siviso.sivisolite.home.Database.StoreSiviso$Home;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.MapCreator;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.Wrapper$Map;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class Test$OnMapReady$SetupHighlight
{
	@Test
	public void mapReady__createOnMapClickHighlight()
	{
		MapCreator mapCreator = mock(MapCreator.class);
		Resources resources = mock(Resources.class);
		StoreSiviso$Home storeHome = mock(StoreSiviso$Home.class);
		Wrapper$Map map = mock(Wrapper$Map.class);
		
		OnMapReady$SetupHighlight setupHighlight = new OnMapReady$SetupHighlight(mapCreator, storeHome);
		setupHighlight.mapReady(map);
		
		OnMapClick$Highlight onMapClickHighlight = setupHighlight.onMapClickHighlight;
		assertNotNull(onMapClickHighlight);
	}
	
	@Test
	public void __callWhenReadyThis()
	{
		MapCreator mapCreator = mock(MapCreator.class);
		Resources resources = mock(Resources.class);
		StoreSiviso$Home storeHome = mock(StoreSiviso$Home.class);
		
		OnMapReady$SetupHighlight setupHighlight = new OnMapReady$SetupHighlight(mapCreator, storeHome);
		
		verify(mapCreator, times(1)).callWhenReady(setupHighlight);
	}
}