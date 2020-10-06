package com.jordan.betcher.siviso.sivisolite.home.sivisomap;

import com.google.android.gms.maps.GoogleMap;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.robolectric.annotation.Config;

import static org.mockito.Mockito.verify;

@RunWith(PowerMockRunner.class)
@Config(manifest = Config.NONE)
@PrepareForTest(GoogleMap.class)
@PowerMockIgnore({ "org.mockito.*", "org.robolectric.*", "android.*", "androidx.*" })
public class WrapperGoogleMapTest
{
	@Test
	public void setOnMapClickListener_called_setOnMapClickListener()
	{
		GoogleMap fakeGoogleMap = PowerMockito.mock(GoogleMap.class);
		GoogleMap.OnMapClickListener fakeOnMapClickListener = PowerMockito.mock(GoogleMap.OnMapClickListener.class);
		WrapperGoogleMap wrapperGoogleMap = new WrapperGoogleMap(fakeGoogleMap);
		
		wrapperGoogleMap.setOnMapClickListener(fakeOnMapClickListener);
		
		verify(fakeGoogleMap).setOnMapClickListener(fakeOnMapClickListener);
	}
}