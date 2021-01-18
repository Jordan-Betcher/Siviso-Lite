package com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap;

import com.google.android.gms.maps.model.LatLng;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class Test$OnMapClickListener$MultipleOnMapClick
{
	@Test
	public void onMapClick_1OnMapClick_CalledOnMapClick()
	{
		OnMapClick onMapClick = mock(OnMapClick.class);
		OnMapClickListener$MultipleOnMapClick listener = new OnMapClickListener$MultipleOnMapClick();
		LatLng latLng = new LatLng(0,0);
		
		listener.addOnMapClick(onMapClick);
		listener.onMapClick(latLng);
		
		verify(onMapClick, times(1)).onMapClick(latLng);
	}
	
	@Test
	public void onMapClick_2OnMapClick_CalledFirstOnMapClick()
	{
		OnMapClick onMapClick1 = mock(OnMapClick.class);
		OnMapClick onMapClick2 = mock(OnMapClick.class);
		OnMapClickListener$MultipleOnMapClick listener = new OnMapClickListener$MultipleOnMapClick();
		LatLng latLng = new LatLng(0,0);
		
		listener.addOnMapClick(onMapClick1);
		listener.addOnMapClick(onMapClick2);
		listener.onMapClick(latLng);
		
		verify(onMapClick1, times(1)).onMapClick(latLng);
	}
	
	@Test
	public void onMapClick_2OnMapClick_Called2ndOnMapClick()
	{
		OnMapClick onMapClick1 = mock(OnMapClick.class);
		OnMapClick onMapClick2 = mock(OnMapClick.class);
		OnMapClickListener$MultipleOnMapClick listener = new OnMapClickListener$MultipleOnMapClick();
		LatLng latLng = new LatLng(0,0);
		
		listener.addOnMapClick(onMapClick1);
		listener.addOnMapClick(onMapClick2);
		listener.onMapClick(latLng);
		
		verify(onMapClick2, times(1)).onMapClick(latLng);
	}
}