package com.jordan.betcher.siviso.sivisolite.service;

import android.content.res.Resources;
import android.location.Location;

import com.jordan.betcher.siviso.sivisolite.R;
import com.jordan.betcher.siviso.sivisolite.home.Database.StoreSiviso$Home;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Test$LocationChecker
{
	
	@Test
	public void isInHome_HomeTrueRadius0LocationNull_false()
	{
		boolean isHomeLocation = true;
		StoreSiviso$Home home = mock(StoreSiviso$Home.class);
		when(home.isLocation()).thenReturn(isHomeLocation);
		
		int radius = 0;
		Resources resources = mock(Resources.class);
		when(resources.getInteger(R.integer.highlightRadius)).thenReturn(radius);
		
		LocationChecker locationChecker = new LocationChecker(home, resources);
		
		boolean actualIsInHome = locationChecker.isInHome(null);
		boolean expected = false;
		assertEquals(expected, actualIsInHome);
	}
	
	@Test
	public void isInHome_HomeTrueRadius0Location01_false()
	{
		double currentLatitude = 0;
		double currentLongitude = 1;
		Location currentLocation = mock(Location.class);
		when(currentLocation.getLatitude()).thenReturn(currentLatitude);
		when(currentLocation.getLongitude()).thenReturn(currentLongitude);
		
		boolean isHomeLocation = true;
		Location homeLocation = mock(Location.class);
		StoreSiviso$Home home = mock(StoreSiviso$Home.class);
		when(home.createHomeLocation(currentLocation)).thenReturn(homeLocation);
		when(home.isLocation()).thenReturn(isHomeLocation);
		
		when(currentLocation.distanceTo(homeLocation)).thenReturn(1f);
		
		int radius = 0;
		Resources resources = mock(Resources.class);
		when(resources.getInteger(R.integer.highlightRadius)).thenReturn(radius);
		
		LocationChecker locationChecker = new LocationChecker(home, resources);
		
		boolean actualIsInHome = locationChecker.isInHome(currentLocation);
		boolean expected = false;
		assertEquals(expected, actualIsInHome);
	}
	
	@Test
	public void isInHome_HomeFalseRadius0Location00_false()
	{
		double homeLatitude = 0;
		double homeLongitude = 0;
		boolean isHomeLocation = false;
		StoreSiviso$Home home = mock(StoreSiviso$Home.class);
		when(home.latitude()).thenReturn(homeLatitude);
		when(home.longitude()).thenReturn(homeLongitude);
		when(home.isLocation()).thenReturn(isHomeLocation);
		
		double currentLatitude = 0;
		double currentLongitude = 0;
		Location currentLocation = mock(Location.class);
		when(currentLocation.getLatitude()).thenReturn(currentLatitude);
		when(currentLocation.getLongitude()).thenReturn(currentLongitude);
		
		int radius = 0;
		Resources resources = mock(Resources.class);
		when(resources.getInteger(R.integer.highlightRadius)).thenReturn(radius);
		
		LocationChecker locationChecker = new LocationChecker(home, resources);
		
		boolean actualIsInHome = locationChecker.isInHome(currentLocation);
		boolean expected = false;
		assertEquals(expected, actualIsInHome);
	}
	
	@Test
	public void isInHome_HomeTrueRadius0Location00_true()
	{
		double homeLatitude = 0;
		double homeLongitude = 0;
		boolean isHomeLocation = true;
		StoreSiviso$Home home = mock(StoreSiviso$Home.class);
		when(home.latitude()).thenReturn(homeLatitude);
		when(home.longitude()).thenReturn(homeLongitude);
		when(home.isLocation()).thenReturn(isHomeLocation);
		
		double currentLatitude = 0;
		double currentLongitude = 0;
		Location currentLocation = mock(Location.class);
		when(currentLocation.getLatitude()).thenReturn(currentLatitude);
		when(currentLocation.getLongitude()).thenReturn(currentLongitude);
		
		int radius = 0;
		Resources resources = mock(Resources.class);
		when(resources.getInteger(R.integer.highlightRadius)).thenReturn(radius);
		
		LocationChecker locationChecker = new LocationChecker(home, resources);
		
		boolean actualIsInHome = locationChecker.isInHome(currentLocation);
		boolean expected = true;
		assertEquals(expected, actualIsInHome);
	}
}