package com.jordan.betcher.siviso.sivisolite.thirdparty.permissions;

import android.app.Activity;

import androidx.core.app.ActivityCompat;

class Wrapper_ActivityCompat
{
	public int checkSelfPermission(Activity activity, String permissionName)
	{
		return ActivityCompat.checkSelfPermission(activity, permissionName);
	}
	
	public void requestPermissions(Activity activity, String[] permissionNames, int requestCode)
	{
		ActivityCompat.requestPermissions(activity, permissionNames, requestCode);
	}
}
