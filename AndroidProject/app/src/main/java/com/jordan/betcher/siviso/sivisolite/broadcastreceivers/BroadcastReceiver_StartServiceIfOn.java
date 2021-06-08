package com.jordan.betcher.siviso.sivisolite.broadcastreceivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.jordan.betcher.siviso.sivisolite.home.Database.Database;
import com.jordan.betcher.siviso.sivisolite.service.Intent$Service$Siviso;
import com.jordan.betcher.siviso.sivisolite.service.ServiceSiviso;

public class BroadcastReceiver_StartServiceIfOn extends BroadcastReceiver
{
	@Override
	public void onReceive(Context context, Intent intent)
	{
		Database database = new Database(context);
		if(database.isOnn().isTrue())
		{
			Intent$Service$Siviso serviceIntent = new Intent$Service$Siviso(context);
			ServiceSiviso serviceSiviso = new ServiceSiviso(context, database.isOnn(), serviceIntent);
			serviceSiviso.start();
		}
	}
}
