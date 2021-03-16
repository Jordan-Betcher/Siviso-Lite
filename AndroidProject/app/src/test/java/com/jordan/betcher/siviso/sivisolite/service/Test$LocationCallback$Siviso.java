package com.jordan.betcher.siviso.sivisolite.service;

import android.location.Location;

import com.google.android.gms.location.LocationResult;

import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class Test$LocationCallback$Siviso
{
	
	@Test
	public void onLocationResult_LocationNotInHome_0CallSetRingtoneHome()
	{
		boolean locationInHome = false;
		LocationChecker locationChecker = mock(LocationChecker.class);
		RingmodeControl ringmodeControl = mock(RingmodeControl.class);
		LocationResult locationResult = LocationResult.create(new ArrayList<Location>());
		when(locationChecker.isInHome(locationResult)).thenReturn(locationInHome);
		
		LocationCallback$Siviso callback = new LocationCallback$Siviso(locationChecker, ringmodeControl);
		callback.onLocationResult(locationResult);
		
		verify(ringmodeControl, times(0)).home();
	}
	
	@Test
	public void onLocationResult_LocationInHome_0CallSetRingtoneDefaultt()
	{
		boolean locationInHome = true;
		LocationChecker locationChecker = mock(LocationChecker.class);
		RingmodeControl ringmodeControl = mock(RingmodeControl.class);
		LocationResult locationResult = LocationResult.create(new ArrayList<Location>());
		when(locationChecker.isInHome(locationResult)).thenReturn(locationInHome);
		
		LocationCallback$Siviso callback = new LocationCallback$Siviso(locationChecker, ringmodeControl);
		callback.onLocationResult(locationResult);
		
		verify(ringmodeControl, times(0)).defaultt();
	}
	
	@Test
	public void _LocationNotInHome_0CallSetRingtoneDefaultt()
	{
		boolean locationInHome = false;
		LocationChecker locationChecker = mock(LocationChecker.class);
		RingmodeControl ringmodeControl = mock(RingmodeControl.class);
		LocationResult locationResult = LocationResult.create(new ArrayList<Location>());
		when(locationChecker.isInHome(locationResult)).thenReturn(locationInHome);
		
		LocationCallback$Siviso callback = new LocationCallback$Siviso(locationChecker, ringmodeControl);
		
		verify(ringmodeControl, times(0)).defaultt();
	}
	
	@Test
	public void _LocationInHome_0CallSetRingtoneHome()
	{
		boolean locationInHome = true;
		LocationChecker locationChecker = mock(LocationChecker.class);
		RingmodeControl ringmodeControl = mock(RingmodeControl.class);
		LocationResult locationResult = LocationResult.create(new ArrayList<Location>());
		when(locationChecker.isInHome(locationResult)).thenReturn(locationInHome);
		
		new LocationCallback$Siviso(locationChecker, ringmodeControl);
		
		verify(ringmodeControl, times(0)).home();
	}
	
	@Test
	public void onLocationResult_LocationNotInHome_CallSetRingtoneDefaultt()
	{
		boolean locationInHome = false;
		LocationChecker locationChecker = mock(LocationChecker.class);
		RingmodeControl ringmodeControl = mock(RingmodeControl.class);
		LocationResult locationResult = LocationResult.create(new ArrayList<Location>());
		when(locationChecker.isInHome(locationResult)).thenReturn(locationInHome);
		
		LocationCallback$Siviso callback = new LocationCallback$Siviso(locationChecker, ringmodeControl);
		callback.onLocationResult(locationResult);
		
		verify(ringmodeControl, times(1)).defaultt();
	}
	
	@Test
	public void onLocationResult_LocationInHome_CallSetRingtoneHome()
	{
		boolean locationInHome = true;
		LocationChecker locationChecker = mock(LocationChecker.class);
		RingmodeControl ringmodeControl = mock(RingmodeControl.class);
		LocationResult locationResult = LocationResult.create(new ArrayList<Location>());
		when(locationChecker.isInHome(locationResult)).thenReturn(locationInHome);
		
		LocationCallback$Siviso callback = new LocationCallback$Siviso(locationChecker, ringmodeControl);
		callback.onLocationResult(locationResult);
		
		verify(ringmodeControl, times(1)).home();
	}
}