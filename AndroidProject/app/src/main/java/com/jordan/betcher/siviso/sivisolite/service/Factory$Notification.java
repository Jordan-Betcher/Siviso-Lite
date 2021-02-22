package com.jordan.betcher.siviso.sivisolite.service;

import android.app.Notification;
import android.content.res.Resources;

import androidx.core.app.NotificationCompat;

import com.jordan.betcher.siviso.sivisolite.R;

class Factory$Notification
{
	private NotificationCompat.Builder builder;
	
	public Factory$Notification(
	Resources resources, NotificationCompat.Builder builder,
	Factory$PendingIntent factoryPendingIntent)
	{
		this.builder = builder;
		builder.setContentTitle(resources.getString(R.string.notification_create_content_title));
		builder.setContentText(resources.getString(R.string.notification_create_content_text));
		builder.setContentIntent(factoryPendingIntent.create());
	}
	
	public Notification create()
	{
		return builder.build();
	}
}
