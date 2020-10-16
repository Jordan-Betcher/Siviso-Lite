package com.jordan.betcher.siviso.sivisolite.thirdparty.locationManager;

import android.location.Location;
import android.location.LocationListener;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

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