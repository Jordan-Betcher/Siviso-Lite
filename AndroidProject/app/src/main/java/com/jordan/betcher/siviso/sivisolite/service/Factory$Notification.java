package com.jordan.betcher.siviso.sivisolite.service;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;

import androidx.core.app.NotificationCompat;

import com.jordan.betcher.siviso.sivisolite.R;

class Factory$Notification
{
	private NotificationCompat.Builder builder;
	
	public Factory$Notification(
	Context context)
	{
		builder = new NotificationCompat.Builder(context, "");
		
		Resources resources = context.getResources();
		Intent$Activity$Home intent = new Intent$Activity$Home();
		PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, intent, 0);
		builder.setContentTitle(resources.getString(R.string.notification_create_content_title));
		builder.setContentText(resources.getString(R.string.notification_create_content_text));
		builder.setContentIntent(pendingIntent);
		builder.setChannelId("1");
	}
	
	public Notification create()
	{
		return builder.build();
	}
}
