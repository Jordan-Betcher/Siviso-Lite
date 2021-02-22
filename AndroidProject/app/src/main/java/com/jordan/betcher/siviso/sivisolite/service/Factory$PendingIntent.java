package com.jordan.betcher.siviso.sivisolite.service;

import android.app.PendingIntent;
import android.content.Context;

class Factory$PendingIntent
{
	private Context context;
	private Intent$Activity$Home intent;
	
	public Factory$PendingIntent(Context context, Intent$Activity$Home intent)
	{
		this.context = context;
		this.intent = intent;
	}
	
	public PendingIntent create()
	{
		return PendingIntent.getActivity(context, 0, intent, 0);
	}
}
