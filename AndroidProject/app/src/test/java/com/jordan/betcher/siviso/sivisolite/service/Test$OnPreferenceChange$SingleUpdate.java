package com.jordan.betcher.siviso.sivisolite.service;

import android.content.SharedPreferences;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class Test$OnPreferenceChange$SingleUpdate
{
	@Test
	public void onSharedPreferenceChanged__0locationClientStart()
	{
		SharedPreferences preferences = mock(SharedPreferences.class);
		LocationClient$Manager$SingleUpdate locationClient = mock(LocationClient$Manager$SingleUpdate.class);
		
		OnPreferenceChange$SingleUpdate onPreferenceChange = new OnPreferenceChange$SingleUpdate(preferences, locationClient);
		
		verify(locationClient, times(0)).start();
	}
	
	@Test
	public void onSharedPreferenceChanged__1locationClientStart()
	{
		SharedPreferences preferences = mock(SharedPreferences.class);
		LocationClient$Manager$SingleUpdate locationClient = mock(LocationClient$Manager$SingleUpdate.class);
		
		OnPreferenceChange$SingleUpdate onPreferenceChange = new OnPreferenceChange$SingleUpdate(preferences, locationClient);
		onPreferenceChange.onSharedPreferenceChanged(null, "");
		
		verify(locationClient, times(1)).start();
	}
	
	@Test
	public void __registerOnSharedPreferenceChangeListenerThis()
	{
		SharedPreferences preferences = mock(SharedPreferences.class);
		LocationClient$Manager$SingleUpdate locationClient = mock(LocationClient$Manager$SingleUpdate.class);
		
		OnPreferenceChange$SingleUpdate onPreferenceChange = new OnPreferenceChange$SingleUpdate(preferences, locationClient);
		
		verify(preferences, times(1)).registerOnSharedPreferenceChangeListener(onPreferenceChange);
	}
}