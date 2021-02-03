package com.jordan.betcher.siviso.sivisolite.home.Database;

import android.util.Log;

import com.google.android.gms.maps.model.LatLng;

public class Database
{
	private static final String TAG = "Database";
	private Store$Home homee;
	private Store$Default defaultt;
	
	public Database()
	{
		this.defaultt = new Store$Default(){
			@Override
			public void saveSivisoIndex(int position)
			{
				Log.d(TAG, "saveSiviso default: " + position);
			}
			
			@Override
			public int index()
			{
				return 0;
			}
		};
		
		this.homee = new Store$Home(){
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
			public void saveSivisoIndex(int position)
			{
				Log.d(TAG, "saveSiviso home: " + position);
			}
			
			@Override
			public int index()
			{
				return 0;
			}
		};
	}
	
	public Store$Default defaultt()
	{
		return defaultt;
	}
	
	public Store$Home homee()
	{
		return homee;
	}
}
