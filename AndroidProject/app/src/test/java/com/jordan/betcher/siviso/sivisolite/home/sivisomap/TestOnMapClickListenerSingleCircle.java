package com.jordan.betcher.siviso.sivisolite.home.sivisomap;

import com.google.android.gms.maps.GoogleMap;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.robolectric.annotation.Config;

@RunWith(PowerMockRunner.class)
@Config(manifest = Config.NONE)
@PrepareForTest(GoogleMap.class)
@PowerMockIgnore({ "org.mockito.*", "org.robolectric.*", "android.*", "androidx.*" })
public class TestOnMapClickListenerSingleCircle
{
	
	@Test
	public void onMapClick_00_home00()
	{
		/*
		GoogleMap fakeGoogleMap = PowerMockito.mock(GoogleMap.class);
		Home home = new Home(fakeGoogleMap);
		
		OnMapClickListenerSingleCircle homeListener = new OnMapClickListenerSingleCircle(home);
		
		homeListener.onMapClick(new LatLng(0, 0));
		Assert.assertTrue(new LatLng(0,0 ) == home.latLng());
		//*/
	}
}