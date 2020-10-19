package com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap;

import android.location.Location;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(PowerMockRunner.class)
@Config(manifest = Config.NONE)
@PrepareForTest({GoogleMap.class, CameraUpdate.class})
@PowerMockIgnore({ "org.mockito.*", "org.robolectric.*", "android.*", "androidx.*" })
public class Test$Map
{
	@Test
	public void setOnMapClickListener_called_setOnMapClickListener()
	{
		GoogleMap fakeGoogleMap = PowerMockito.mock(GoogleMap.class);
		MapClick fakeOnMapClick = PowerMockito.mock(MapClick.class);
		Map map = new Map(fakeGoogleMap);
		
		map.setOnMapClickListener(fakeOnMapClick);
		
		verify(fakeGoogleMap).setOnMapClickListener(isA(GoogleMap.OnMapClickListener.class));
	}
	
	@Test
	public void goToLocation_fakeLocation_CalledCameraWithLocation()
	{
		GoogleMap fakeGoogleMap = PowerMockito.mock(GoogleMap.class);
		Map map = new Map$CameraUpdate(fakeGoogleMap);
		
		Location fakeLocation = PowerMockito.mock(Location.class);
		map.goToLocation(fakeLocation);
		
		verify(fakeGoogleMap).moveCamera(isA(CameraUpdate.class));
	}
	
	@Test
	public void goToLocation_fakeLocation00_CalledLocationCameraUpdateWithLatLng00()
	{
		GoogleMap fakeGoogleMap = PowerMockito.mock(GoogleMap.class);
		Map$CameraUpdate map = new Map$CameraUpdate(fakeGoogleMap);
		
		Location fakeLocation = PowerMockito.mock(Location.class);
		when(fakeLocation.getLatitude()).thenReturn(0.0);
		when(fakeLocation.getLongitude()).thenReturn(0.0);
		map.goToLocation(fakeLocation);
		
		assertEquals(map.latLng, new LatLng(0.0, 0.0));
	}
	
	@Test
	public void goToLocation_fakeLocation11_CalledLocationCameraUpdateWithLatLng11()
	{
		GoogleMap fakeGoogleMap = PowerMockito.mock(GoogleMap.class);
		Map$CameraUpdate map = new Map$CameraUpdate(fakeGoogleMap);
		
		Location fakeLocation = PowerMockito.mock(Location.class);
		when(fakeLocation.getLatitude()).thenReturn(1.0);
		when(fakeLocation.getLongitude()).thenReturn(1.0);
		map.goToLocation(fakeLocation);
		
		assertEquals(map.latLng, new LatLng(1.0, 1.0));
	}
	
	private class Map$CameraUpdate extends Map
	{
		public LatLng latLng;
		public Map$CameraUpdate(GoogleMap googleMap)
		{
			super(googleMap);
		}
		
		@Override
		protected CameraUpdate locationCameraUpdate(LatLng latLng)
		{
			this.latLng = latLng;
			return PowerMockito.mock(CameraUpdate.class);
		}
	}
}