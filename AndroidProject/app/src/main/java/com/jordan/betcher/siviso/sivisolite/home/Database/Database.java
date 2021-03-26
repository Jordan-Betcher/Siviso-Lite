package com.jordan.betcher.siviso.sivisolite.home.Database;

import android.content.Context;
import android.content.SharedPreferences;

public class Database
{
	private static final String TAG = "Database";
	private StoreSiviso$Home homee;
	private StoreSiviso$Default defaultt;
	private Preferences$ServiceRunning serviceRunning;
	
	public Database(Context context)
	{
		SharedPreferences sharedPreferences = context.getSharedPreferences("SharedPreferences", Context.MODE_PRIVATE);
		homee = new Preferences$Home();
		defaultt = new Preferences$Default();
		serviceRunning = new Preferences$ServiceRunning(sharedPreferences);
	}
	
	public StoreSiviso$Default defaultt()
	{
		return defaultt;
	}
	
	public StoreSiviso$Home homee()
	{
		return homee;
	}
	
	public Preferences$ServiceRunning isOnn()
	{
		return serviceRunning;
	}
}
