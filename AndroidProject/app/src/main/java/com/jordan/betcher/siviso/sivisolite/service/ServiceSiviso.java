package com.jordan.betcher.siviso.sivisolite.service;

import android.content.Context;
import android.os.Build;

import com.jordan.betcher.siviso.sivisolite.home.Database.StoreBoolean;

public class ServiceSiviso
{
	private Context context;
	private StoreBoolean serviceRunning;
	private Intent$Service$Siviso intent;
	
	public ServiceSiviso(
	Context context, StoreBoolean serviceRunning,
	Intent$Service$Siviso intent)
	{
		this.context = context;
		this.serviceRunning = serviceRunning;
		this.intent = intent;
	}
	
	public void start()
	{
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O)
		{
			context.startForegroundService(intent);
		}
		else
		{
			context.startService(intent);
		}
		
		serviceRunning.setTrue();
	}
	
	public void stop()
	{
		serviceRunning.setFalse();
		context.stopService(intent);
	}
}
