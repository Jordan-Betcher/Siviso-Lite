package com.jordan.betcher.siviso.sivisolite.home.mapview.map;

import android.content.res.Resources;

import com.jordan.betcher.siviso.sivisolite.home.Database.StoreSiviso$Home;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.MultipleOnMapReady;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.Wrapper_GoogleMap;

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
		MultipleOnMapReady multipleOnMapReady = mock(MultipleOnMapReady.class);
		Resources resources = mock(Resources.class);
		StoreSiviso$Home storeHome = mock(StoreSiviso$Home.class);
		Wrapper_GoogleMap map = mock(Wrapper_GoogleMap.class);
		
		OnMapReady$SetupHighlight setupHighlight = new OnMapReady$SetupHighlight(multipleOnMapReady, storeHome);
		setupHighlight.mapReady(map);
		
		OnMapClick$OnSivisoChange$Highlight onMapClickHighlight = setupHighlight.onMapClickHighlight;
		assertNotNull(onMapClickHighlight);
	}
	
	@Test
	public void __callWhenReadyThis()
	{
		MultipleOnMapReady multipleOnMapReady = mock(MultipleOnMapReady.class);
		Resources resources = mock(Resources.class);
		StoreSiviso$Home storeHome = mock(StoreSiviso$Home.class);
		
		OnMapReady$SetupHighlight setupHighlight = new OnMapReady$SetupHighlight(multipleOnMapReady, storeHome);
		
		verify(multipleOnMapReady, times(1)).addOnMapReady(setupHighlight);
	}
}