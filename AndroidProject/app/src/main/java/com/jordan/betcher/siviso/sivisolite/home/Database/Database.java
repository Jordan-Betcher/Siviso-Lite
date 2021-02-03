package com.jordan.betcher.siviso.sivisolite.home.Database;

import android.util.Log;

import com.google.android.gms.maps.model.LatLng;

public class Database
{
	private static final String TAG = "Database";
	
	public Store$Default defaultt()
	{
		return new Store$Default(){
			@Override
			public void saveSiviso(int position)
			{
				Log.d(TAG, "saveSiviso default: " + position);
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
				Log.d(TAG, "saveSiviso home: " + position);
			}
			
			@Override
			public String siviso()
			{
				return null;
			}
		};
	}
}
