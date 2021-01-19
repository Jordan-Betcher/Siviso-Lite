package com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.robolectric.annotation.Config;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(PowerMockRunner.class)
@Config(manifest = Config.NONE)
@PrepareForTest(GoogleMap.class)
@PowerMockIgnore({ "org.mockito.*", "org.robolectric.*", "android.*", "androidx.*" })
public class Test$MapCreator
{
	@Test
	public void MapCreator_Created_CallsMapAsync()
	{
		SupportMapFragment fakeSupportMapFragment = mock(SupportMapFragment.class);
		MapCreator mapCreator = new MapCreator(fakeSupportMapFragment);
		verify(fakeSupportMapFragment).getMapAsync(mapCreator);
	}
	
	@Test
	public void CallWhenReady_BeforeOnMapReadyAddMapCreatedAction_CalledAction()
	{
		SupportMapFragment fakeSupportMapFragment = mock(SupportMapFragment.class);
		GoogleMap fakeGoogleMap = PowerMockito.mock(GoogleMap.class);
		MapCreator mapCreator = new MapCreator(fakeSupportMapFragment);
		OnMapReady fakeOnMapReady = mock(OnMapReady.class);
		
		mapCreator.callWhenReady(fakeOnMapReady);
		mapCreator.onMapReady(fakeGoogleMap);
		
		verify(fakeOnMapReady).mapReady(mapCreator.getMapIfAvailable());
	}
	
	@Test
	public void CallWhenReady_BeforeOnMapReadyAddMapCreatedAction_CalledActionOnce()
	{
		SupportMapFragment fakeSupportMapFragment = mock(SupportMapFragment.class);
		GoogleMap fakeGoogleMap = PowerMockito.mock(GoogleMap.class);
		MapCreator mapCreator = new MapCreator(fakeSupportMapFragment);
		OnMapReady fakeOnMapReady = mock(OnMapReady.class);
		
		mapCreator.callWhenReady(fakeOnMapReady);
		mapCreator.onMapReady(fakeGoogleMap);
		mapCreator.onMapReady(fakeGoogleMap);
		
		verify(fakeOnMapReady, times(1)).mapReady(mapCreator.getMapIfAvailable());
	}
	
	@Test
	public void CallWhenReady_BeforeOnMapReadyAddMultipleMapCreatedAction_CallAllActions()
	{
		SupportMapFragment fakeSupportMapFragment = mock(SupportMapFragment.class);
		GoogleMap fakeGoogleMap = PowerMockito.mock(GoogleMap.class);
		MapCreator mapCreator = new MapCreator(fakeSupportMapFragment);
		OnMapReady fakeOnMapReady1 = mock(OnMapReady.class);
		OnMapReady fakeOnMapReady2 = mock(OnMapReady.class);
		
		mapCreator.callWhenReady(fakeOnMapReady1);
		mapCreator.callWhenReady(fakeOnMapReady2);
		mapCreator.onMapReady(fakeGoogleMap);
		
		verify(fakeOnMapReady1).mapReady(mapCreator.getMapIfAvailable());
		verify(fakeOnMapReady2).mapReady(mapCreator.getMapIfAvailable());
	}
	
	@Test
	public void CallWhenReady_AfterOnMapReadyAddMapCreatedAction_CalledMapCreated()
	{
		SupportMapFragment fakeSupportMapFragment = mock(SupportMapFragment.class);
		GoogleMap fakeGoogleMap = PowerMockito.mock(GoogleMap.class);
		MapCreator mapCreator = new MapCreator(fakeSupportMapFragment);
		OnMapReady fakeOnMapReady = mock(OnMapReady.class);
		
		mapCreator.onMapReady(fakeGoogleMap);
		mapCreator.callWhenReady(fakeOnMapReady);
		
		verify(fakeOnMapReady).mapReady(mapCreator.getMapIfAvailable());
	}
}