package com.jordan.betcher.siviso.sivisolite.service;

import android.app.NotificationChannel;
import android.content.res.Resources;
import android.os.Build;

import androidx.annotation.RequiresApi;

import com.jordan.betcher.siviso.sivisolite.R;

class Factory$NotificationChannel$Siviso
{
	private final String channelID;
	private final String channelName;
	private final int channelImportance;
	
	public Factory$NotificationChannel$Siviso(Resources resources)
	{
		channelID = resources.getString(R.string.channel_id);
		channelName = resources.getString(R.string.channel_name);
		channelImportance = resources.getInteger(R.integer.channel_importance);
	}
	
	@RequiresApi(api = Build.VERSION_CODES.O)
	public NotificationChannel create()
	{
		return new NotificationChannel(channelID, channelName, channelImportance);
	}
	
	public String id()
	{
		return channelID;
	}
}
