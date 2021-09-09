package com.jordan.betcher.siviso.sivisolite.home.Database;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import android.content.SharedPreferences;
import android.content.res.Resources;

import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.sivisolite.R;

import org.junit.Test;

public class Test$Preferences$Home
{
	@Test
	public void addOnSivisoChange_onSivisoChange_addToSivisoChangeEvent()
	{
		OnSivisoChange onSivisoChange = mock(OnSivisoChange.class);
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		Resources resources = mock(Resources.class);
		SivisoChangeEvent sivisoChangeEvent = mock(SivisoChangeEvent.class);
		
		Preferences$Home home = new Preferences$Home(sharedPreferences, resources, sivisoChangeEvent);
		home.addOnSivisoChange(onSivisoChange);
		
		verify(sivisoChangeEvent, times(1)).addOnSivisoChange(onSivisoChange);
	}
	
	@Test
	public void color_siviso2ResourcesColorSound0_0()
	{
		int siviso = 1;
		int color = 0;
		
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		Resources resources = mock(Resources.class);
		when(resources.getColor(R.color.colorSound)).thenReturn(color);
		
		Preferences$Home preferences = new Preferences$Home(sharedPreferences, resources, null);
		when(sharedPreferences.getInt(preferences.sivisoKey, 0)).thenReturn(siviso);
		
		
		int actualColor = preferences.color();
		assertEquals(color, actualColor);
	}
	
	@Test
	public void color_siviso2ResourcesColorSound1_1()
	{
		int siviso = 2;
		int color = 1;
		
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		Resources resources = mock(Resources.class);
		when(resources.getColor(R.color.colorSound)).thenReturn(color);
		
		Preferences$Home preferences = new Preferences$Home(sharedPreferences, resources, null);
		when(sharedPreferences.getInt(preferences.sivisoKey, 0)).thenReturn(siviso);
		
		
		int actualColor = preferences.color();
		assertEquals(color, actualColor);
	}
	
	@Test
	public void color_siviso1ResourcesColorVibrate0_0()
	{
		int siviso = 1;
		int color = 0;
		
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		Resources resources = mock(Resources.class);
		when(resources.getColor(R.color.colorVibrate)).thenReturn(color);
		
		Preferences$Home preferences = new Preferences$Home(sharedPreferences, resources, null);
		when(sharedPreferences.getInt(preferences.sivisoKey, 0)).thenReturn(siviso);
		
		
		int actualColor = preferences.color();
		assertEquals(color, actualColor);
	}
	
	@Test
	public void color_siviso1ResourcesColorVibrate1_1()
	{
		int siviso = 1;
		int color = 1;
		
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		Resources resources = mock(Resources.class);
		when(resources.getColor(R.color.colorVibrate)).thenReturn(color);
		
		Preferences$Home preferences = new Preferences$Home(sharedPreferences, resources, null);
		when(sharedPreferences.getInt(preferences.sivisoKey, 0)).thenReturn(siviso);
		
		
		int actualColor = preferences.color();
		assertEquals(color, actualColor);
	}
	
	@Test
	public void color_siviso0ResourcesColorSilent0_0()
	{
		int siviso = 0;
		int color = 0;
		
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		Resources resources = mock(Resources.class);
		when(resources.getColor(R.color.colorSilent)).thenReturn(color);
		
		Preferences$Home preferences = new Preferences$Home(sharedPreferences, resources, null);
		when(sharedPreferences.getInt(preferences.sivisoKey, 0)).thenReturn(siviso);
		
		
		int actualColor = preferences.color();
		assertEquals(color, actualColor);
	}
	
	@Test
	public void color_siviso0ResourcesColorSilent1_1()
	{
		int siviso = 0;
		int color = 1;
		
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		Resources resources = mock(Resources.class);
		when(resources.getColor(R.color.colorSilent)).thenReturn(color);
		
		Preferences$Home preferences = new Preferences$Home(sharedPreferences, resources, null);
		when(sharedPreferences.getInt(preferences.sivisoKey, 0)).thenReturn(siviso);
		
		
		int actualColor = preferences.color();
		assertEquals(color, actualColor);
	}
	
	@Test
	public void radius_resourcesRadius0_0()
	{
		int radius = 0;
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		Resources resources = mock(Resources.class);
		
		when(resources.getInteger(R.integer.highlightRadius)).thenReturn(radius);
		
		Preferences$Home preferences = new Preferences$Home(sharedPreferences, resources, null);
		
		int actualRadius = preferences.radius();
		assertEquals(radius, actualRadius);
	}
	
	@Test
	public void radius_resourcesRadius1_1()
	{
		int radius = 1;
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		Resources resources = mock(Resources.class);
		
		when(resources.getInteger(R.integer.highlightRadius)).thenReturn(radius);
		
		Preferences$Home preferences = new Preferences$Home(sharedPreferences, resources, null);
		
		int actualRadius = preferences.radius();
		assertEquals(radius, actualRadius);
	}
	
	@Test
	public void latLng_00_latLngLongitude0()
	{
		double latitude = 0;
		double longitude = 0;
		String stringLatitude = latitude + "";
		String stringLongitude = longitude + "";
		
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		Resources resources = mock(Resources.class);
		
		Preferences$Home preferences = new Preferences$Home(sharedPreferences, resources, null);
		when(sharedPreferences.getString(preferences.latitudeKey, "0.0")).thenReturn(stringLatitude);
		when(sharedPreferences.getString(preferences.longitudeKey, "0.0")).thenReturn(stringLongitude);
		
		LatLng actualLatLng = preferences.latLng();
		double actualLongitdue = actualLatLng.longitude;
		assertEquals(longitude, actualLongitdue, 0.0001);
	}
	
	@Test
	public void latLng_01_latLngLongitude1()
	{
		double latitude = 0;
		double longitude = 1;
		String stringLatitude = latitude + "";
		String stringLongitude = longitude + "";
		
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		Resources resources = mock(Resources.class);
		
		Preferences$Home preferences = new Preferences$Home(sharedPreferences, resources, null);
		when(sharedPreferences.getString(preferences.latitudeKey, "0.0")).thenReturn(stringLatitude);
		when(sharedPreferences.getString(preferences.longitudeKey, "0.0")).thenReturn(stringLongitude);
		
		LatLng actualLatLng = preferences.latLng();
		double actualLongitude = actualLatLng.longitude;
		assertEquals(longitude, actualLongitude, 0.0001);
	}
	
	@Test
	public void latLng_10_latLngLatitude1()
	{
		double latitude = 1;
		double longitude = 0;
		String stringLatitude = latitude + "";
		String stringLongitude = longitude + "";
		
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		Resources resources = mock(Resources.class);
		
		Preferences$Home preferences = new Preferences$Home(sharedPreferences, resources, null);
		when(sharedPreferences.getString(preferences.latitudeKey, "0.0")).thenReturn(stringLatitude);
		when(sharedPreferences.getString(preferences.longitudeKey, "0.0")).thenReturn(stringLongitude);
		
		LatLng actualLatLng = preferences.latLng();
		double actualLatitude = actualLatLng.latitude;
		assertEquals(latitude, actualLatitude, 0.0001);
	}
	
	@Test
	public void latLng_00_latLngLatitude0()
	{
		double latitude = 0;
		double longitude = 0;
		String stringLatitude = latitude + "";
		String stringLongitude = longitude + "";
		
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		Resources resources = mock(Resources.class);
		
		Preferences$Home preferences = new Preferences$Home(sharedPreferences, resources, null);
		when(sharedPreferences.getString(preferences.latitudeKey, "0.0")).thenReturn(stringLatitude);
		when(sharedPreferences.getString(preferences.longitudeKey, "0.0")).thenReturn(stringLongitude);
		
		LatLng actualLatLng = preferences.latLng();
		double actualLatitude = actualLatLng.latitude;
		assertEquals(latitude, actualLatitude, 0.0001);
	}
	
	@Test
	public void siviso_default0_1()
	{
		int siviso = 1;
		int defaultSiviso = 0;
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		Resources resources = mock(Resources.class);
		when(resources.getInteger(R.integer.ringmode_default_home)).thenReturn(defaultSiviso);
		
		Preferences$Home preferences = new Preferences$Home(sharedPreferences, resources, null);
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
		
		Preferences$Home preferences = new Preferences$Home(sharedPreferences, resources, null);
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
		
		Preferences$Home preferences = new Preferences$Home(sharedPreferences, resources, null);
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
		
		Preferences$Home preferences = new Preferences$Home(sharedPreferences, resources, null);
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
		
		Preferences$Home preferences = new Preferences$Home(sharedPreferences, resources, null);
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
		
		Preferences$Home preferences = new Preferences$Home(sharedPreferences, resources, null);
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
		
		Preferences$Home preferences = new Preferences$Home(sharedPreferences, resources, null);
		when(sharedPreferences.getBoolean(preferences.isLocationKey, false)).thenReturn(isLocation);
		
		boolean actualIsLocation = preferences.isLocation();
		assertEquals(isLocation, actualIsLocation);
	}
	
	@Test
	public void longitude_0_0()
	{
		double longitude = 0;
		String stringLongitude = longitude + "";
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		Resources resources = mock(Resources.class);
		
		Preferences$Home preferences = new Preferences$Home(sharedPreferences, resources, null);
		when(sharedPreferences.getString(preferences.longitudeKey, "0.0")).thenReturn(stringLongitude);
		
		double actualLongitude = preferences.longitude();
		assertEquals(longitude, actualLongitude, 0.0001);
	}
	
	@Test
	public void longitude_1_1()
	{
		double longitude = 1;
		String stringLongitude = longitude + "";
		SharedPreferences sharedPreferences = mock(SharedPreferences.class);
		Resources resources = mock(Resources.class);
		
		Preferences$Home preferences = new Preferences$Home(sharedPreferences, resources, null);
		when(sharedPreferences.getString(preferences.longitudeKey, "0.0")).thenReturn(stringLongitude);
		
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
		
		Preferences$Home preferences = new Preferences$Home(sharedPreferences, resources, null);
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
		
		Preferences$Home preferences = new Preferences$Home(sharedPreferences, resources, null);
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
		
		Preferences$Home preferences = new Preferences$Home(sharedPreferences, resources, null);
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
		
		Preferences$Home preferences = new Preferences$Home(sharedPreferences, resources, null);
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
		
		Preferences$Home preferences = new Preferences$Home(sharedPreferences, resources, null);
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
		
		Preferences$Home preferences = new Preferences$Home(sharedPreferences, resources, null);
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
		
		Preferences$Home preferences = new Preferences$Home(sharedPreferences, resources, null);
		when(sharedPreferences.edit()).thenReturn(editor1);
		when(editor1.putString(preferences.latitudeKey, latitude + "")).thenReturn(editor2);
		when(editor1.putString(preferences.longitudeKey, longitude + "")).thenReturn(editor1);
		when(editor1.putBoolean(preferences.isLocationKey, true)).thenReturn(editor1);
		preferences.saveLocation(latLng);
		
		verify(editor2, times(1)).apply();
	}
}