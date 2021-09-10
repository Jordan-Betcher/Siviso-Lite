package com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;

public class Test$MultipleOnMapReady
{
	@Test
	public void CallWhenReady_BeforeOnMapReadyAddMapCreatedAction_CalledAction()
	{
		Wrapper_GoogleMap googleMap = mock(Wrapper_GoogleMap.class);
		MultipleOnMapReady multipleOnMapReady = new MultipleOnMapReady();
		OnMapReady fakeOnMapReady = mock(OnMapReady.class);
		
		multipleOnMapReady.addOnMapReady(fakeOnMapReady);
		multipleOnMapReady.onMapReady(googleMap);
		
		verify(fakeOnMapReady).mapReady(multipleOnMapReady.getMapIfAvailable());
	}
	
	@Test
	public void CallWhenReady_BeforeOnMapReadyAddMapCreatedAction_CalledActionOnce()
	{
		Wrapper_GoogleMap googleMap = mock(Wrapper_GoogleMap.class);
		MultipleOnMapReady multipleOnMapReady = new MultipleOnMapReady();
		OnMapReady fakeOnMapReady = mock(OnMapReady.class);
		
		multipleOnMapReady.addOnMapReady(fakeOnMapReady);
		multipleOnMapReady.onMapReady(googleMap);
		multipleOnMapReady.onMapReady(googleMap);
		
		verify(fakeOnMapReady, times(1)).mapReady(multipleOnMapReady.getMapIfAvailable());
	}
	
	@Test
	public void CallWhenReady_BeforeOnMapReadyAddMultipleMapCreatedAction_CallAllActions()
	{
		Wrapper_GoogleMap googleMap = mock(Wrapper_GoogleMap.class);
		MultipleOnMapReady multipleOnMapReady = new MultipleOnMapReady();
		OnMapReady fakeOnMapReady1 = mock(OnMapReady.class);
		OnMapReady fakeOnMapReady2 = mock(OnMapReady.class);
		
		multipleOnMapReady.addOnMapReady(fakeOnMapReady1);
		multipleOnMapReady.addOnMapReady(fakeOnMapReady2);
		multipleOnMapReady.onMapReady(googleMap);
		
		verify(fakeOnMapReady1).mapReady(multipleOnMapReady.getMapIfAvailable());
		verify(fakeOnMapReady2).mapReady(multipleOnMapReady.getMapIfAvailable());
	}
	
	@Test
	public void CallWhenReady_AfterOnMapReadyAddMapCreatedAction_CalledMapCreated()
	{
		Wrapper_GoogleMap googleMap = mock(Wrapper_GoogleMap.class);
		MultipleOnMapReady multipleOnMapReady = new MultipleOnMapReady();
		OnMapReady fakeOnMapReady = mock(OnMapReady.class);
		
		multipleOnMapReady.onMapReady(googleMap);
		multipleOnMapReady.addOnMapReady(fakeOnMapReady);
		
		verify(fakeOnMapReady).mapReady(multipleOnMapReady.getMapIfAvailable());
	}
}