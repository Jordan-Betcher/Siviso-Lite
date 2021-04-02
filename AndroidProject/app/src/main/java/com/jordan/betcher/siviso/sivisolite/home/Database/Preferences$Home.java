package com.jordan.betcher.siviso.sivisolite.home.Database;

import android.content.SharedPreferences;
import android.content.res.Resources;

import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.sivisolite.R;

class Preferences$Home implements StoreSiviso$Home
{
	private SharedPreferences sharedPreferences;
	final int defaultHomeSiviso;
	String sivisoKey = "HomeSivisoKey";
	String isLocationKey = "HomeIsLocationKey";
	String longitudeKey = "HomeLongitudeKey";
	String latitudeKey = "HomeLatitudeKey";
	
	public Preferences$Home(SharedPreferences sharedPreferences, Resources resources)
	{
		this.sharedPreferences = sharedPreferences;
		defaultHomeSiviso = resources.getInteger(R.integer.ringmode_default_home);
	}
	
	@Override
	public void saveLocation(LatLng latLng)
	{
		SharedPreferences.Editor editor = sharedPreferences.edit();
		editor.putString(latitudeKey, latLng.latitude + "").apply();
		editor.putString(longitudeKey, latLng.longitude + "").apply();
		editor.putBoolean(isLocationKey, true).apply();
	}
	
	@Override
	public double latitude()
	{
		String stringLatitude = sharedPreferences.getString(latitudeKey, "0.0");
		double latitude = Double.parseDouble(stringLatitude);
		return latitude;
	}
	
	@Override
	public double longitude()
	{
		String stringLongitude = sharedPreferences.getString(longitudeKey, "0.0");
		double longitude = Double.parseDouble(stringLongitude);
		return longitude;
	}
	
	@Override
	public boolean isLocation()
	{
		return sharedPreferences.getBoolean(isLocationKey, false);
	}
	
	@Override
	public LatLng latLng()
	{
		return new LatLng(latitude(), longitude());
	}
	
	@Override
	public void saveSiviso(int siviso)
	{
		sharedPreferences.edit().putInt(sivisoKey, siviso).apply();
	}
	
	@Override
	public int siviso()
	{
		return sharedPreferences.getInt(sivisoKey, defaultHomeSiviso);
	}
}
