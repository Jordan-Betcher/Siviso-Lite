package com.jordan.betcher.siviso.sivisolite.service;

import android.media.AudioManager;

import com.jordan.betcher.siviso.sivisolite.home.Database.StoreSiviso$Default;
import com.jordan.betcher.siviso.sivisolite.home.Database.StoreSiviso$Home;

class RingmodeControl
{
	
	
	private final AudioManager audioManager;
	private StoreSiviso$Home home;
	private StoreSiviso$Default defaultt;
	
	public RingmodeControl(AudioManager audioManager, StoreSiviso$Home home, StoreSiviso$Default defaultt)
	{
		this.audioManager = audioManager;
		this.home = home;
		this.defaultt = defaultt;
	}
	
	public void home()
	{
		audioManager.setRingerMode(home.siviso());
	}
	
	public void defaultt()
	{
		audioManager.setRingerMode(defaultt.siviso());
	}
}
