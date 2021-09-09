package com.jordan.betcher.siviso.sivisolite.home.mapview.map;

public class Map$Siviso implements Map
{
	private GoToCurrentLocation goToCurrentLocation;
	private OnMapReady$GoHome goHome;
	
	public void init(
	GoToCurrentLocation goToCurrentLocation,
	OnMapReady$GoHome goHome, OnMapReady$OnMapClick$SaveLatLng saveLatLng)
	{
		this.goToCurrentLocation = goToCurrentLocation;
		this.goHome = goHome;
		saveLatLng.setEditable(true);
	}
	
	@Override
	public void goToCurrentLocation()
	{
		if(goToCurrentLocation != null)
		{
			goToCurrentLocation.go();
		}
	}
	
	@Override
	public void goToHome()
	{
		if(goHome != null)
		{
			goHome.goHome();
		}
	}
	
	@Override
	public void setEditable(boolean editable)
	{
		//TODO
	}
}
