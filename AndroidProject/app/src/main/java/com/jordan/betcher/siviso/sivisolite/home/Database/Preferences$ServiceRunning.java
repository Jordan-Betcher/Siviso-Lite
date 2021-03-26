package com.jordan.betcher.siviso.sivisolite.home.Database;

import android.content.SharedPreferences;

public class Preferences$ServiceRunning implements StoreBoolean
{
	
	private SharedPreferences sharedPreferences;
	final String serviceRunningIsTrue = "serviceRunningIsTrue";
	
	public Preferences$ServiceRunning(SharedPreferences sharedPreferences)
	{
		this.sharedPreferences = sharedPreferences;
	}
	
	@Override
	public boolean isTrue()
	{
		return sharedPreferences.getBoolean(serviceRunningIsTrue, false);
	}
	
	@Override
	public void setTrue()
	{
		sharedPreferences.edit().putBoolean(serviceRunningIsTrue, true).apply();
	}
	
	@Override
	public void setFalse()
	{
		sharedPreferences.edit().putBoolean(serviceRunningIsTrue, false).apply();
	}
}
