package com.jordan.betcher.siviso.sivisolite.home.Database;

import android.content.SharedPreferences;
import android.content.res.Resources;

import com.jordan.betcher.siviso.sivisolite.R;

class Preferences$Default implements StoreSiviso$Default
{
	final String defaultSivisoKey = "DefaultSivisoKey";
	private SharedPreferences sharedPreferences;
	private int defaultDefaultSiviso;
	
	public Preferences$Default(SharedPreferences sharedPreferences, Resources resources)
	{
		this.sharedPreferences = sharedPreferences;
		defaultDefaultSiviso = resources.getInteger(R.integer.ringmode_default_default);
	}
	
	@Override
	public void saveSiviso(int siviso)
	{
		sharedPreferences.edit().putInt(defaultSivisoKey, siviso).apply();
	}
	
	@Override
	public int siviso()
	{
		return sharedPreferences.getInt(defaultSivisoKey, defaultDefaultSiviso);
	}
}
