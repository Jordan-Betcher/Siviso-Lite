package com.jordan.betcher.siviso.sivisolite.thirdparty.locationManager;

import static org.mockito.Mockito.*;
import android.location.*;
import org.junit.Test;

public class Test$LocationListener$CurrentLocation
{
	@Test
	public void onLocationChanged_Location_CallCurrentLocationSetLocation()
	{
		Location fakeLocation = mock(Location.class);
		CurrentLocation fakeCurrentLocation = mock(CurrentLocation.class);
		
		LocationListener locationListener = new LocationListener$CurrentLocation(fakeCurrentLocation);
		locationListener.onLocationChanged(fakeLocation);
		
		verify(fakeCurrentLocation).setCurrentLocation(fakeLocation);
	}
}