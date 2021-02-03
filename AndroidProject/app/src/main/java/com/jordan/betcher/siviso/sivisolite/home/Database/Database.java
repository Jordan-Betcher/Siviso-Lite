package com.jordan.betcher.siviso.sivisolite.home.Database;

import com.google.android.gms.maps.model.LatLng;

public class Database implements Store$Home, Storage$Default
{
	@Override
	public void saveLocation(LatLng latLng)
	{
	
	}
	
	@Override
	public boolean hasHome()
	{
		return false;
	}
	
	@Override
	public LatLng home()
	{
		return null;
	}
	
	@Override
	public String defaultSiviso()
	{
		return null;
	}
	
	@Override
	public void saveDefaultSiviso(int sivisoPosition)
	{
	
	}
}
