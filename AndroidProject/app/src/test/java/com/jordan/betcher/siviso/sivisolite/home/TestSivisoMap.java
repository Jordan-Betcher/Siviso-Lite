package com.jordan.betcher.siviso.sivisolite.home;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.jordan.betcher.siviso.sivisolite.home.sivisomap.OnMapClickListenerSingleCircle;
import com.jordan.betcher.siviso.sivisolite.home.sivisomap.SivisoMap;

import org.junit.Test;

import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class TestSivisoMap
{
	@Test
	public void SivisoMap_JustCreated_calledGetMapAsyncWithSelf()
	{
		SupportMapFragment fakeSupportMapFragment = mock(SupportMapFragment.class);
		SivisoMap sivisoMap = new SivisoMap(fakeSupportMapFragment);
		verify(fakeSupportMapFragment).getMapAsync(sivisoMap);
	}
	
	@Test
	public void SivisoMap_OnMapCallback_addOnMapClickListener()
	{
		SupportMapFragment fakeSupportMapFragment = mock(SupportMapFragment.class);
		GoogleMap fakeGoogleMap = mock(GoogleMap.class);
		SivisoMap sivisoMap = new SivisoMap(fakeSupportMapFragment);
		sivisoMap.onMapReady(fakeGoogleMap);
		verify(fakeGoogleMap).setOnMapClickListener(isA(OnMapClickListenerSingleCircle.class));
	}
}