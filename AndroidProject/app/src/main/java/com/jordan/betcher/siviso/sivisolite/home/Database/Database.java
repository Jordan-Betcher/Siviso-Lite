package com.jordan.betcher.siviso.sivisolite.home.Database;

import android.util.Log;

import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.sivisolite.home.onoffview.onoff.StoreBoolean;

public class Database
{
	private static final String TAG = "Database";
	private StoreSiviso$Home homee;
	private StoreSiviso$Default defaultt;
	
	public Database()
	{
		this.defaultt = new StoreSiviso$Default(){
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
		
		this.homee = new StoreSiviso$Home(){
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
	
	public StoreSiviso$Default defaultt()
	{
		return defaultt;
	}
	
	public StoreSiviso$Home homee()
	{
		return homee;
	}
	
	public StoreBoolean isOnn()
	{
		return new StoreBoolean(){
			@Override
			public boolean isOn()
			{
				return false;
			}
		};
	}
}
