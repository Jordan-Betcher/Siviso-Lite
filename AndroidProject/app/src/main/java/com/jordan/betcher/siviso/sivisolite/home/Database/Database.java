package com.jordan.betcher.siviso.sivisolite.home.Database;

import com.google.android.gms.maps.model.LatLng;

public class Database
{
	public Store$Default defaultt()
	{
		return new Store$Default(){
			@Override
			public void saveSiviso(int position)
			{
			
			}
			
			@Override
			public String siviso()
			{
				return null;
			}
		};
	}
	
	public Store$Home homee()
	{
		return new Store$Home(){
			@Override
			public void saveLocation(LatLng latLng)
			{
			
			}
			
			@Override
			public LatLng home()
			{
				return null;
			}
			
			@Override
			public void saveSiviso(int position)
			{
			
			}
			
			@Override
			public String siviso()
			{
				return null;
			}
		};
	}
}
