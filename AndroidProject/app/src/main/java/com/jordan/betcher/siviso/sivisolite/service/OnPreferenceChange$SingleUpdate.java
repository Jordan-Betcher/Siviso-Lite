package com.jordan.betcher.siviso.sivisolite.service;

import android.content.SharedPreferences;

class OnPreferenceChange$SingleUpdate implements SharedPreferences.OnSharedPreferenceChangeListener
{
	private LocationClient$Manager singleUpdate;
	
	public OnPreferenceChange$SingleUpdate(
	SharedPreferences preferences, LocationClient$Manager$SingleUpdate singleUpdate)
	{
		this.singleUpdate = singleUpdate;
		preferences.registerOnSharedPreferenceChangeListener(this);
	}
	
	@Override
	public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key)
	{
		singleUpdate.start();
	}
}
