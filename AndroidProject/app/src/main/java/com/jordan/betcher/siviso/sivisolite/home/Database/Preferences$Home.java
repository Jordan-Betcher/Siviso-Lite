package com.jordan.betcher.siviso.sivisolite.home.Database;

import android.location.Location;

import com.google.android.gms.maps.model.LatLng;

class Preferences$Home implements StoreSiviso$Home
{
	@Override
	public void saveLocation(LatLng latLng)
	{
	
	}
	
	@Override
	public double latitude()
	{
		return 0;
	}
	
	@Override
	public double longitude()
	{
		return 0;
	}
	
	@Override
	public boolean isLocation()
	{
		return false;
	}
	
	@Override
	public Location createHomeLocation(Location location)
	{
		return null;
	}
	
	@Override
	public void saveSiviso(int siviso)
	{
	
	}
	
	@Override
	public int siviso()
	{
		return 0;
	}
}
