package com.jordan.betcher.siviso.sivisolite.thirdparty.permissions;

import android.Manifest;
import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;

public class Permission$AccessNotificationPolicy extends Permission
{
	private static final String TAG = "Permission$AccessNotifi";
	private Activity activity;
	int buildVersion = Build.VERSION.SDK_INT;
	
	public Permission$AccessNotificationPolicy(Activity activity)
	{
		super(activity, Manifest.permission.ACCESS_NOTIFICATION_POLICY);
		this.activity = activity;
	}
	
	@Override
	public void request()
	{
		activity.startActivityForResult(new Intent$PermissionSettingNotification(), 1);
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
