package com.jordan.betcher.siviso.sivisolite.home.mapview.map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;

public class Test$Map$Siviso
{
	@Test
	public void setEditable_noInit_noError()
	{
		Map$Siviso map$Siviso = new Map$Siviso();
		map$Siviso.setEditable(true);
	}
	
	@Test
	public void setEditable_false_saveLatLngEditableFalse()
	{
		boolean editable = false;
		OnMapReady$OnMapClick$SaveLatLng saveLatLng = mock(OnMapReady$OnMapClick$SaveLatLng.class);
		
		Map$Siviso map$Siviso = new Map$Siviso();
		map$Siviso.init(null, null, saveLatLng);
		map$Siviso.setEditable(editable);
		
		verify(saveLatLng, times(1)).setEditable(editable);
	}
	
	@Test
	public void setEditable_true_saveLatLngEditableTrue()
	{
		boolean editable = true;
		OnMapReady$OnMapClick$SaveLatLng saveLatLng = mock(OnMapReady$OnMapClick$SaveLatLng.class);
		
		Map$Siviso map$Siviso = new Map$Siviso();
		map$Siviso.init(null, null, saveLatLng);
		map$Siviso.setEditable(editable);
		
		verify(saveLatLng, times(1)).setEditable(editable);
	}
	
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
		map$Siviso.init(goToCurrentLocation, goHome, null);
		
		verify(goHome, times(0)).goHome();
	}
	
	@Test
	public void initGoToHome_goToHome_go()
	{
		OnMapReady$GoHome goHome = mock(OnMapReady$GoHome.class);
		GoToCurrentLocation goToCurrentLocation = mock(GoToCurrentLocation.class);
		
		Map$Siviso map$Siviso = new Map$Siviso();
		map$Siviso.init(goToCurrentLocation, goHome, null);
		map$Siviso.goToHome();
		
		verify(goHome, times(1)).goHome();
	}
	
	@Test
	public void init_goToCurrentLocation_0go()
	{
		OnMapReady$GoHome goHome = mock(OnMapReady$GoHome.class);
		GoToCurrentLocation goToCurrentLocation = mock(GoToCurrentLocation.class);
		
		Map$Siviso map$Siviso = new Map$Siviso();
		map$Siviso.init(goToCurrentLocation, goHome, null);
		
		verify(goToCurrentLocation, times(0)).go();
	}
	
	@Test
	public void initGoToCurrentLocation_goToCurrentLocation_go()
	{
		OnMapReady$GoHome goHome = mock(OnMapReady$GoHome.class);
		GoToCurrentLocation goToCurrentLocation = mock(GoToCurrentLocation.class);
		
		Map$Siviso map$Siviso = new Map$Siviso();
		map$Siviso.init(goToCurrentLocation, goHome, null);
		map$Siviso.goToCurrentLocation();
		
		verify(goToCurrentLocation, times(1)).go();
	}
}