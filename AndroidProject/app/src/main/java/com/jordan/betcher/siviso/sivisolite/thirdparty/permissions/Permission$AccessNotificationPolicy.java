package com.jordan.betcher.siviso.sivisolite.thirdparty.permissions;

import android.Manifest;
import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;

public class Permission$AccessNotificationPolicy extends Permission
{
	private Activity activity;
	private Intent$PermissionSettingNotification intent;
	int buildVersion = Build.VERSION.SDK_INT;
	
	public Permission$AccessNotificationPolicy(Activity activity, Intent$PermissionSettingNotification intent)
	{
		super(activity, new Wrapper_ActivityCompat(), Manifest.permission.ACCESS_NOTIFICATION_POLICY);
		this.activity = activity;
		this.intent = intent;
	}
	
	@Override
	public void request()
	{
		activity.startActivityForResult(intent, 1);
	}
	
	@Override
	public boolean isGranted()
	{
		NotificationManager notificationManager =
		(NotificationManager) activity.getSystemService(
		Context.NOTIFICATION_SERVICE);
		if(buildVersion >= Build.VERSION_CODES.M)
		{
			return notificationManager.isNotificationPolicyAccessGranted();
		}
		
		return true;
	}
}
