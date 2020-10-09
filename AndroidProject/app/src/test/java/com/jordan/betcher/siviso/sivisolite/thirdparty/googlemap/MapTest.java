package com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap;

import com.google.android.gms.maps.GoogleMap;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.robolectric.annotation.Config;

import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.verify;

@RunWith(PowerMockRunner.class)
@Config(manifest = Config.NONE)
@PrepareForTest(GoogleMap.class)
@PowerMockIgnore({ "org.mockito.*", "org.robolectric.*", "android.*", "androidx.*" })
public class MapTest
{
	@Test
	public void setOnMapClickListener_called_setOnMapClickListener()
	{
		GoogleMap fakeGoogleMap = PowerMockito.mock(GoogleMap.class);
		MapClick fakeOnMapClick = PowerMockito.mock(MapClick.class);
		Map wrapperGoogleMap = new Map(fakeGoogleMap);
		
		wrapperGoogleMap.setOnMapClickListener(fakeOnMapClick);
		
		verify(fakeGoogleMap).setOnMapClickListener(isA(GoogleMap.OnMapClickListener.class));
	}
}