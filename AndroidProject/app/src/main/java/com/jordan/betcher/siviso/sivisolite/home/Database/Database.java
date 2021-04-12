package com.jordan.betcher.siviso.sivisolite.home.Database;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;

public class Database
{
	private static final String TAG = "Database";
	private StoreSiviso$Home homee;
	private StoreSiviso$Default defaultt;
	private Preferences$ServiceRunning serviceRunning;
	public static final String sharedPreferncesName = "SharedPreferences";
	
	public Database(Context context)
	{
		SharedPreferences sharedPreferences = context.getSharedPreferences(sharedPreferncesName, Context.MODE_PRIVATE);
		Resources resources = context.getResources();
		
		homee = new Preferences$Home(sharedPreferences, resources);
		defaultt = new Preferences$Default(sharedPreferences, resources);
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
