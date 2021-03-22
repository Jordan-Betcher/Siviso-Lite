package com.jordan.betcher.siviso.sivisolite.service;

import android.media.AudioManager;

import com.jordan.betcher.siviso.sivisolite.home.Database.StoreSiviso$Default;
import com.jordan.betcher.siviso.sivisolite.home.Database.StoreSiviso$Home;

import org.junit.Test;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class Test$RingmodeControl
{
	@Test
	public void defaultt_ringerModeVibrate_setRingerModeVibrate()
	{
		StoreSiviso$Home storeSiviso$Home = mock(StoreSiviso$Home.class);
		
		int defaulttSiviso = AudioManager.RINGER_MODE_VIBRATE;
		StoreSiviso$Default storeSiviso$Default = mock(StoreSiviso$Default.class);
		when(storeSiviso$Default.siviso()).thenReturn(defaulttSiviso);
		
		AudioManager audioManager = mock(AudioManager.class);
		
		RingmodeControl ringmodeControl = new RingmodeControl(audioManager, storeSiviso$Home, storeSiviso$Default);
		ringmodeControl.defaultt();
		
		verify(audioManager, times(1)).setRingerMode(defaulttSiviso);
	}
	
	@Test
	public void defaultt_ringerModeSilent_setRingerModeSilent()
	{
		StoreSiviso$Home storeSiviso$Home = mock(StoreSiviso$Home.class);
		
		int defaulttSiviso = AudioManager.RINGER_MODE_SILENT;
		StoreSiviso$Default storeSiviso$Default = mock(StoreSiviso$Default.class);
		when(storeSiviso$Default.siviso()).thenReturn(defaulttSiviso);
		
		AudioManager audioManager = mock(AudioManager.class);
		
		RingmodeControl ringmodeControl = new RingmodeControl(audioManager, storeSiviso$Home, storeSiviso$Default);
		ringmodeControl.defaultt();
		
		verify(audioManager, times(1)).setRingerMode(defaulttSiviso);
	}
	
	@Test
	public void home_ringerModeNormal_onlyOneSetRingerMode()
	{
		int homeSiviso = AudioManager.RINGER_MODE_NORMAL;
		StoreSiviso$Home storeSiviso$Home = mock(StoreSiviso$Home.class);
		when(storeSiviso$Home.siviso()).thenReturn(homeSiviso);
		
		StoreSiviso$Default storeSiviso$Default = mock(StoreSiviso$Default.class);
		AudioManager audioManager = mock(AudioManager.class);
		
		RingmodeControl ringmodeControl = new RingmodeControl(audioManager, storeSiviso$Home,
		                                                      storeSiviso$Default);
		ringmodeControl.home();
		
		verify(audioManager, times(1)).setRingerMode(anyInt());
	}
	
	@Test
	public void home_ringerModeNormal_setRingerModeNormal()
	{
		int homeSiviso = AudioManager.RINGER_MODE_NORMAL;
		StoreSiviso$Home storeSiviso$Home = mock(StoreSiviso$Home.class);
		when(storeSiviso$Home.siviso()).thenReturn(homeSiviso);
		
		StoreSiviso$Default storeSiviso$Default = mock(StoreSiviso$Default.class);
		AudioManager audioManager = mock(AudioManager.class);
		
		RingmodeControl ringmodeControl = new RingmodeControl(audioManager, storeSiviso$Home,
		                                                      storeSiviso$Default);
		ringmodeControl.home();
		
		verify(audioManager, times(1)).setRingerMode(homeSiviso);
	}
	
	@Test
	public void _ringerModeSilent_noSetRingerModeSilent()
	{
		int homeSiviso = AudioManager.RINGER_MODE_SILENT;
		StoreSiviso$Home storeSiviso$Home = mock(StoreSiviso$Home.class);
		when(storeSiviso$Home.siviso()).thenReturn(homeSiviso);
		
		StoreSiviso$Default storeSiviso$Default = mock(StoreSiviso$Default.class);
		AudioManager audioManager = mock(AudioManager.class);
		
		RingmodeControl ringmodeControl = new RingmodeControl(audioManager, storeSiviso$Home,
		                                                      storeSiviso$Default);
		
		verify(audioManager, times(0)).setRingerMode(anyInt());
	}
	
	@Test
	public void home_ringerModeSilent_setRingerModeSilent()
	{
		int homeSiviso = AudioManager.RINGER_MODE_SILENT;
		StoreSiviso$Home storeSiviso$Home = mock(StoreSiviso$Home.class);
		when(storeSiviso$Home.siviso()).thenReturn(homeSiviso);
		
		StoreSiviso$Default storeSiviso$Default = mock(StoreSiviso$Default.class);
		AudioManager audioManager = mock(AudioManager.class);
		
		RingmodeControl ringmodeControl = new RingmodeControl(audioManager, storeSiviso$Home,
		                                                      storeSiviso$Default);
		ringmodeControl.home();
		
		verify(audioManager, times(1)).setRingerMode(homeSiviso);
	}
}