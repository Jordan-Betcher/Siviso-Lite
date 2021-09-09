package com.jordan.betcher.siviso.sivisolite.home.Database;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Color;

import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.sivisolite.R;

import java.util.ArrayList;

class Preferences$Home implements StoreSiviso$Home
{
	private SharedPreferences sharedPreferences;
	final int defaultHomeSiviso;
	String sivisoKey = "HomeSivisoKey";
	String isLocationKey = "HomeIsLocationKey";
	String longitudeKey = "HomeLongitudeKey";
	String latitudeKey = "HomeLatitudeKey";
	
	private int radius;
	private int colorSilent;
	private int colorVibrate;
	private int colorSound;
	private ArrayList<OnSivisoChange> onSivisoChanges = new ArrayList<>();
	
	public Preferences$Home(SharedPreferences sharedPreferences, Resources resources)
	{
		this.sharedPreferences = sharedPreferences;
		defaultHomeSiviso = resources.getInteger(R.integer.ringmode_default_home);
		radius = resources.getInteger(R.integer.highlightRadius);
		colorSilent = resources.getColor(R.color.colorSilent);
		colorVibrate = resources.getColor(R.color.colorVibrate);
		colorSound = resources.getColor(R.color.colorSound);
	}
	
	@Override
	public void saveLocation(LatLng latLng)
	{
		SharedPreferences.Editor editor = sharedPreferences.edit();
		editor.putString(latitudeKey, latLng.latitude + "").apply();
		editor.putString(longitudeKey, latLng.longitude + "").apply();
		editor.putBoolean(isLocationKey, true).apply();
		
		//TODO call onSivisoChange
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
	public int radius()
	{
		return radius;
	}
	
	@Override
	public int color()
	{
		switch(siviso())
		{
			case 0:
				return colorSilent;
			case 1:
				return colorVibrate;
			case 2:
				return colorSound;
			default:
				return Color.GRAY;
		}
	}
	
	@Override
	public void addOnSivisoChange(
	OnSivisoChange onSivisoChange)
	{
		onSivisoChanges.add(onSivisoChange);
	}
	
	@Override
	public void saveSiviso(int siviso)
	{
		sharedPreferences.edit().putInt(sivisoKey, siviso).apply();
		
		for(OnSivisoChange onSivisoChange : onSivisoChanges)
		{
			onSivisoChange.sivisoChanged(siviso);
		}
	}
	
	@Override
	public int siviso()
	{
		return sharedPreferences.getInt(sivisoKey, defaultHomeSiviso);
	}
}
