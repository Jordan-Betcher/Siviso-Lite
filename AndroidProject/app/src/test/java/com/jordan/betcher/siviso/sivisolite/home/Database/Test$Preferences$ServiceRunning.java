package com.jordan.betcher.siviso.sivisolite.home.Database;

import android.content.SharedPreferences;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class Test$Preferences$ServiceRunning
{
	
	@Test
	public void setFalse__callEditSetFalseChain()
	{
		SharedPreferences.Editor editor1 = mock(SharedPreferences.Editor.class);
		SharedPreferences.Editor editor2 = mock(SharedPreferences.Editor.class);
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		
		Preferences$ServiceRunning preferences = new Preferences$ServiceRunning(sharedPreferences);
		when(sharedPreferences.edit()).thenReturn(editor1);
		when(editor1.putBoolean(preferences.serviceRunningIsTrue, false)).thenReturn(editor2);
		preferences.setFalse();
		
		verify(editor2, times(1)).apply();
	}
	
	@Test
	public void setTrue__callEditSetTrueChain()
	{
		SharedPreferences.Editor editor1 = mock(SharedPreferences.Editor.class);
		SharedPreferences.Editor editor2 = mock(SharedPreferences.Editor.class);
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		
		Preferences$ServiceRunning preferences = new Preferences$ServiceRunning(sharedPreferences);
		when(sharedPreferences.edit()).thenReturn(editor1);
		when(editor1.putBoolean(preferences.serviceRunningIsTrue, true)).thenReturn(editor2);
		preferences.setTrue();
		
		verify(editor2, times(1)).apply();
	}
	
	@Test
	public void isTrue_false_false()
	{
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		
		Preferences$ServiceRunning preferences = new Preferences$ServiceRunning(sharedPreferences);
		when(sharedPreferences.getBoolean(preferences.serviceRunningIsTrue, false)).thenReturn(false);
		
		boolean actualIsTrue = preferences.isTrue();
		assertFalse(actualIsTrue);
	}
	
	@Test
	public void isTrue_true_true()
	{
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		
		Preferences$ServiceRunning preferences = new Preferences$ServiceRunning(sharedPreferences);
		when(sharedPreferences.getBoolean(preferences.serviceRunningIsTrue, false)).thenReturn(true);
		
		boolean actualIsTrue = preferences.isTrue();
		assertTrue(actualIsTrue);
	}
}