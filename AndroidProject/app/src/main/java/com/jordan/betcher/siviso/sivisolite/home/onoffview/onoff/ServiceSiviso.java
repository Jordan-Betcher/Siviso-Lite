package com.jordan.betcher.siviso.sivisolite.home.onoffview.onoff;

import android.content.Context;

class ServiceSiviso
{
	private Context context;
	private StoreBoolean$ServiceRunning serviceRunning;
	private Intent$Service$Siviso intent;
	
	public ServiceSiviso(
	Context context, StoreBoolean$ServiceRunning serviceRunning,
	Intent$Service$Siviso intent)
	{
		this.context = context;
		this.serviceRunning = serviceRunning;
		this.intent = intent;
	}
	
	public void start()
	{
		if( ! serviceRunning.isTrue())
		{
			serviceRunning.setTrue();
			context.startService(intent);
		}
	}
	
	public void stop()
	{
		serviceRunning.setFalse();
		context.stopService(intent);
	}
}
