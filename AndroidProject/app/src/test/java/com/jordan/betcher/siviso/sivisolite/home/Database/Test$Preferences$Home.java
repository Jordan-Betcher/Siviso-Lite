package com.jordan.betcher.siviso.sivisolite.home.Database;

import android.content.SharedPreferences;
import android.content.res.Resources;

import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.sivisolite.R;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class Test$Preferences$Home
{
	@Test
	public void siviso_default0_1()
	{
		int siviso = 1;
		int defaultSiviso = 0;
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		Resources resources = mock(Resources.class);
		when(resources.getInteger(R.integer.ringmode_default_home)).thenReturn(defaultSiviso);
		
		Preferences$Home preferences = new Preferences$Home(sharedPreferences, resources);
		when(sharedPreferences.getInt(preferences.sivisoKey, defaultSiviso)).thenReturn(siviso);
		
		int actualSivso = preferences.siviso();
		assertEquals(siviso, actualSivso);
	}
	
	@Test
	public void siviso_0_0()
	{
		int siviso = 0;
		int defaultSiviso = 1;
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		Resources resources = mock(Resources.class);
		when(resources.getInteger(R.integer.ringmode_default_home)).thenReturn(defaultSiviso);
		
		Preferences$Home preferences = new Preferences$Home(sharedPreferences, resources);
		when(sharedPreferences.getInt(preferences.sivisoKey, defaultSiviso)).thenReturn(siviso);
		
		int actualSivso = preferences.siviso();
		assertEquals(siviso, actualSivso);
	}
	
	@Test
	public void siviso_1_1()
	{
		int siviso = 1;
		int defaultSiviso = 1;
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		Resources resources = mock(Resources.class);
		when(resources.getInteger(R.integer.ringmode_default_home)).thenReturn(defaultSiviso);
		
		Preferences$Home preferences = new Preferences$Home(sharedPreferences, resources);
		when(sharedPreferences.getInt(preferences.sivisoKey, defaultSiviso)).thenReturn(siviso);
		
		int actualSivso = preferences.siviso();
		assertEquals(siviso, actualSivso);
	}
	
	@Test
	public void saveSiviso_0_save0()
	{
		int siviso = 0;
		SharedPreferences.Editor editor1 = mock(SharedPreferences.Editor.class);
		SharedPreferences.Editor editor2 = mock(SharedPreferences.Editor.class);
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		Resources resources = mock(Resources.class);
		
		Preferences$Home preferences = new Preferences$Home(sharedPreferences, resources);
		when(sharedPreferences.edit()).thenReturn(editor1);
		when(editor1.putInt(preferences.sivisoKey, siviso)).thenReturn(editor2);
		preferences.saveSiviso(siviso);
		
		verify(editor2, times(1)).apply();
	}
	
	@Test
	public void saveSiviso_1_save1()
	{
		int siviso = 1;
		SharedPreferences.Editor editor1 = mock(SharedPreferences.Editor.class);
		SharedPreferences.Editor editor2 = mock(SharedPreferences.Editor.class);
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		Resources resources = mock(Resources.class);
		
		Preferences$Home preferences = new Preferences$Home(sharedPreferences, resources);
		when(sharedPreferences.edit()).thenReturn(editor1);
		when(editor1.putInt(preferences.sivisoKey, siviso)).thenReturn(editor2);
		preferences.saveSiviso(siviso);
		
		verify(editor2, times(1)).apply();
	}
	
	@Test
	public void isLocation_false_false()
	{
		boolean isLocation = false;
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		Resources resources = mock(Resources.class);
		
		Preferences$Home preferences = new Preferences$Home(sharedPreferences, resources);
		when(sharedPreferences.getBoolean(preferences.isLocationKey, false)).thenReturn(isLocation);
		
		boolean actualIsLocation = preferences.isLocation();
		assertEquals(isLocation, actualIsLocation);
	}
	
	@Test
	public void isLocation_true_true()
	{
		boolean isLocation = true;
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		Resources resources = mock(Resources.class);
		
		Preferences$Home preferences = new Preferences$Home(sharedPreferences, resources);
		when(sharedPreferences.getBoolean(preferences.isLocationKey, false)).thenReturn(isLocation);
		
		boolean actualIsLocation = preferences.isLocation();
		assertEquals(isLocation, actualIsLocation);
	}
	
	@Test
	public void longitude_0_0()
	{
		double longitude = 0;
		String stringLatitude = longitude + "";
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		Resources resources = mock(Resources.class);
		
		Preferences$Home preferences = new Preferences$Home(sharedPreferences, resources);
		when(sharedPreferences.getString(preferences.longitudeKey, "0.0")).thenReturn(stringLatitude);
		
		double actualLongitude = preferences.longitude();
		assertEquals(longitude, actualLongitude, 0.0001);
	}
	
	@Test
	public void longitude_1_1()
	{
		double longitude = 1;
		String stringLatitude = longitude + "";
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		Resources resources = mock(Resources.class);
		
		Preferences$Home preferences = new Preferences$Home(sharedPreferences, resources);
		when(sharedPreferences.getString(preferences.longitudeKey, "0.0")).thenReturn(stringLatitude);
		
		double actualLongitude = preferences.longitude();
		assertEquals(longitude, actualLongitude, 0.0001);
	}
	
	@Test
	public void latitude_0_0()
	{
		double latitude = 0;
		String stringLatitude = latitude + "";
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		Resources resources = mock(Resources.class);
		
		Preferences$Home preferences = new Preferences$Home(sharedPreferences, resources);
		when(sharedPreferences.getString(preferences.latitudeKey, "0.0")).thenReturn(stringLatitude);
		
		double actualLatitude = preferences.latitude();
		assertEquals(latitude, actualLatitude, 0.0001);
	}
	
	@Test
	public void latitude_1_1()
	{
		double latitude = 1;
		String stringLatitude = latitude + "";
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		Resources resources = mock(Resources.class);
		
		Preferences$Home preferences = new Preferences$Home(sharedPreferences, resources);
		when(sharedPreferences.getString(preferences.latitudeKey, "0.0")).thenReturn(stringLatitude);
		
		double actualLatitude = preferences.latitude();
		assertEquals(latitude, actualLatitude, 0.0001);
	}
	
	@Test
	public void saveLocation_00_saveIsLocationTrue()
	{
		double latitude = 0;
		double longitude = 0;
		LatLng latLng = new LatLng(latitude, longitude);
		SharedPreferences.Editor editor1 = mock(SharedPreferences.Editor.class);
		SharedPreferences.Editor editor2 = mock(SharedPreferences.Editor.class);
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		Resources resources = mock(Resources.class);
		
		Preferences$Home preferences = new Preferences$Home(sharedPreferences, resources);
		when(sharedPreferences.edit()).thenReturn(editor1);
		when(editor1.putString(preferences.latitudeKey, latitude + "")).thenReturn(editor1);
		when(editor1.putString(preferences.longitudeKey, longitude + "")).thenReturn(editor1);
		when(editor1.putBoolean(preferences.isLocationKey, true)).thenReturn(editor2);
		preferences.saveLocation(latLng);
		
		verify(editor2, times(1)).apply();
	}
	
	@Test
	public void saveLocation_01_saveLongitude1()
	{
		double latitude = 0;
		double longitude = 1;
		LatLng latLng = new LatLng(latitude, longitude);
		SharedPreferences.Editor editor1 = mock(SharedPreferences.Editor.class);
		SharedPreferences.Editor editor2 = mock(SharedPreferences.Editor.class);
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		Resources resources = mock(Resources.class);
		
		Preferences$Home preferences = new Preferences$Home(sharedPreferences, resources);
		when(sharedPreferences.edit()).thenReturn(editor1);
		when(editor1.putString(preferences.latitudeKey, latitude + "")).thenReturn(editor1);
		when(editor1.putString(preferences.longitudeKey, longitude + "")).thenReturn(editor2);
		when(editor1.putBoolean(preferences.isLocationKey, true)).thenReturn(editor1);
		preferences.saveLocation(latLng);
		
		verify(editor2, times(1)).apply();
	}
	
	@Test
	public void saveLocation_00_saveLongitude0()
	{
		double latitude = 0;
		double longitude = 0;
		LatLng latLng = new LatLng(latitude, longitude);
		SharedPreferences.Editor editor1 = mock(SharedPreferences.Editor.class);
		SharedPreferences.Editor editor2 = mock(SharedPreferences.Editor.class);
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		Resources resources = mock(Resources.class);
		
		Preferences$Home preferences = new Preferences$Home(sharedPreferences, resources);
		when(sharedPreferences.edit()).thenReturn(editor1);
		when(editor1.putString(preferences.latitudeKey, latitude + "")).thenReturn(editor1);
		when(editor1.putString(preferences.longitudeKey, longitude + "")).thenReturn(editor2);
		when(editor1.putBoolean(preferences.isLocationKey, true)).thenReturn(editor1);
		preferences.saveLocation(latLng);
		
		verify(editor2, times(1)).apply();
	}
	
	@Test
	public void saveLocation_10_saveLatitude1()
	{
		double latitude = 1;
		double longitude = 0;
		LatLng latLng = new LatLng(latitude, longitude);
		SharedPreferences.Editor editor1 = mock(SharedPreferences.Editor.class);
		SharedPreferences.Editor editor2 = mock(SharedPreferences.Editor.class);
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		Resources resources = mock(Resources.class);
		
		Preferences$Home preferences = new Preferences$Home(sharedPreferences, resources);
		when(sharedPreferences.edit()).thenReturn(editor1);
		when(editor1.putString(preferences.latitudeKey, latitude + "")).thenReturn(editor2);
		when(editor1.putString(preferences.longitudeKey, longitude + "")).thenReturn(editor1);
		when(editor1.putBoolean(preferences.isLocationKey, true)).thenReturn(editor1);
		preferences.saveLocation(latLng);
		
		verify(editor2, times(1)).apply();
	}
	
	@Test
	public void saveLocation_00_saveLatitude0()
	{
		double latitude = 0;
		double longitude = 0;
		LatLng latLng = new LatLng(latitude, longitude);
		SharedPreferences.Editor editor1 = mock(SharedPreferences.Editor.class);
		SharedPreferences.Editor editor2 = mock(SharedPreferences.Editor.class);
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		Resources resources = mock(Resources.class);
		
		Preferences$Home preferences = new Preferences$Home(sharedPreferences, resources);
		when(sharedPreferences.edit()).thenReturn(editor1);
		when(editor1.putString(preferences.latitudeKey, latitude + "")).thenReturn(editor2);
		when(editor1.putString(preferences.longitudeKey, longitude + "")).thenReturn(editor1);
		when(editor1.putBoolean(preferences.isLocationKey, true)).thenReturn(editor1);
		preferences.saveLocation(latLng);
		
		verify(editor2, times(1)).apply();
	}
}