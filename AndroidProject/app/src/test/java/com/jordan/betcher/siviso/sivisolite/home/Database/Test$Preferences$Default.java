package com.jordan.betcher.siviso.sivisolite.home.Database;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.media.AudioManager;

import com.jordan.betcher.siviso.sivisolite.R;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class Test$Preferences$Default
{
	@Test
	public void siviso_siviso1default1_1()
	{
		int siviso = 1;
		int defaultSiviso = 1;
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		Resources resources = mock(Resources.class);
		when(resources.getInteger(R.integer.ringmode_default_default)).thenReturn(defaultSiviso);
		
		Preferences$Default preferences = new Preferences$Default(sharedPreferences, resources);
		when(sharedPreferences.getInt(preferences.defaultSivisoKey, defaultSiviso)).thenReturn(siviso);
		
		int actualSiviso = preferences.siviso();
		assertEquals(siviso, actualSiviso);
	}
	
	@Test
	public void siviso_siviso2default0_2()
	{
		int siviso = 2;
		int defaultSiviso = 0;
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		Resources resources = mock(Resources.class);
		when(resources.getInteger(R.integer.ringmode_default_default)).thenReturn(defaultSiviso);
		
		Preferences$Default preferences = new Preferences$Default(sharedPreferences, resources);
		when(sharedPreferences.getInt(preferences.defaultSivisoKey, defaultSiviso)).thenReturn(siviso);
		
		int actualSiviso = preferences.siviso();
		assertEquals(siviso, actualSiviso);
	}
	
	@Test
	public void siviso_siviso1default0_1()
	{
		int siviso = 1;
		int defaultSiviso = 0;
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		Resources resources = mock(Resources.class);
		when(resources.getInteger(R.integer.ringmode_default_default)).thenReturn(defaultSiviso);
		
		Preferences$Default preferences = new Preferences$Default(sharedPreferences, resources);
		when(sharedPreferences.getInt(preferences.defaultSivisoKey, defaultSiviso)).thenReturn(siviso);
		
		int actualSiviso = preferences.siviso();
		assertEquals(siviso, actualSiviso);
	}
	
	@Test
	public void saveSiviso_silent_callSaveChainUsingSilent()
	{
		int siviso = AudioManager.RINGER_MODE_SILENT;
		SharedPreferences.Editor editor1 = mock(SharedPreferences.Editor.class);
		SharedPreferences.Editor editor2 = mock(SharedPreferences.Editor.class);
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		Resources resources = mock(Resources.class);
		
		Preferences$Default preferences = new Preferences$Default(sharedPreferences, resources);
		when(sharedPreferences.edit()).thenReturn(editor1);
		when(editor1.putInt(preferences.defaultSivisoKey, siviso)).thenReturn(editor2);
		preferences.saveSiviso(siviso);
		
		verify(editor2, times(1)).apply();
	}
}