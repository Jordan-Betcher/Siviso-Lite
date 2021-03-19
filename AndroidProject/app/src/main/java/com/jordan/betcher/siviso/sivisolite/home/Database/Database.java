package com.jordan.betcher.siviso.sivisolite.home.Database;

import android.location.Location;
import android.util.Log;

import com.google.android.gms.maps.model.LatLng;

public class Database
{
	private static final String TAG = "Database";
	private StoreSiviso$Home homee;
	private StoreSiviso$Default defaultt;
	
	public Database()
	{
		this.defaultt = new StoreSiviso$Default(){
			@Override
			public void saveSiviso(int siviso)
			{
				Log.d(TAG, "saveSiviso default: " + siviso);
			}
			
			@Override
			public int siviso()
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
				Log.d(TAG, "saveSiviso home: " + siviso);
			}
			
			@Override
			public int siviso()
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
	
	public StoreBoolean$ServiceRunning isOnn()
	{
		return new StoreBoolean$ServiceRunning();
	}
}
