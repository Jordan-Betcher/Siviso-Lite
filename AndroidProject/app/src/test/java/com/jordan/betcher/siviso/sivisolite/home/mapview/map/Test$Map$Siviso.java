package com.jordan.betcher.siviso.sivisolite.home.mapview.map;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class Test$Map$Siviso
{
	@Test
	public void goToCurrentLocation__()
	{
		Map$Siviso map$Siviso = new Map$Siviso();
		map$Siviso.goToCurrentLocation();
	}
	
	@Test
	public void goToHome__()
	{
		Map$Siviso map$Siviso = new Map$Siviso();
		map$Siviso.goToHome();
	}
	
	@Test
	public void _goToHome_0go()
	{
		OnMapReady$GoHome goHome = mock(OnMapReady$GoHome.class);
		GoToCurrentLocation goToCurrentLocation = mock(GoToCurrentLocation.class);
		
		Map$Siviso map$Siviso = new Map$Siviso();
		map$Siviso.init(goToCurrentLocation, goHome);
		
		verify(goHome, times(0)).goHome();
	}
	
	@Test
	public void initGoToHome_goToHome_go()
	{
		OnMapReady$GoHome goHome = mock(OnMapReady$GoHome.class);
		GoToCurrentLocation goToCurrentLocation = mock(GoToCurrentLocation.class);
		
		Map$Siviso map$Siviso = new Map$Siviso();
		map$Siviso.init(goToCurrentLocation, goHome);
		map$Siviso.goToHome();
		
		verify(goHome, times(1)).goHome();
	}
	
	@Test
	public void init_goToCurrentLocation_0go()
	{
		OnMapReady$GoHome goHome = mock(OnMapReady$GoHome.class);
		GoToCurrentLocation goToCurrentLocation = mock(GoToCurrentLocation.class);
		
		Map$Siviso map$Siviso = new Map$Siviso();
		map$Siviso.init(goToCurrentLocation, goHome);
		
		verify(goToCurrentLocation, times(0)).go();
	}
	
	@Test
	public void initGoToCurrentLocation_goToCurrentLocation_go()
	{
		OnMapReady$GoHome goHome = mock(OnMapReady$GoHome.class);
		GoToCurrentLocation goToCurrentLocation = mock(GoToCurrentLocation.class);
		
		Map$Siviso map$Siviso = new Map$Siviso();
		map$Siviso.init(goToCurrentLocation, goHome);
		map$Siviso.goToCurrentLocation();
		
		verify(goToCurrentLocation, times(1)).go();
	}
}