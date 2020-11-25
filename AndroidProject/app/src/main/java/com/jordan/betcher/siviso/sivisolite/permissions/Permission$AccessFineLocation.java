package com.jordan.betcher.siviso.sivisolite.permissions;

import android.Manifest;
import android.app.Activity;

import androidx.core.app.ActivityCompat;

import com.jordan.betcher.siviso.sivisolite.R;

class Permission$AccessFineLocation implements Permission
{
	private Activity activity;
	
	public Permission$AccessFineLocation(Activity activity)
	{
		
		this.activity = activity;
	}
	
	@Override
	public String name()
	{
		return activity.getResources().getString(R.string.permission_access_fine_location_name);
	}
	
	@Override
	public String details()
	{
		return activity.getResources().getString(R.string.permission_access_fine_location_details);
	}
	
	@Override
	public void accept()
	{
		ActivityCompat
		.requestPermissions(activity, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 1);
	}
}
