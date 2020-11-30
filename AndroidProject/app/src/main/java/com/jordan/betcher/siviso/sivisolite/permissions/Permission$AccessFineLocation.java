package com.jordan.betcher.siviso.sivisolite.permissions;

import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;

import androidx.core.app.ActivityCompat;

import com.jordan.betcher.siviso.sivisolite.R;

class Permission$AccessFineLocation implements Permission
{
	private Activity activity;
	private String manifestName = Manifest.permission.ACCESS_FINE_LOCATION;
	
	public Permission$AccessFineLocation(Activity activity)
	{
		
		this.activity = activity;
	}
	
	@Override
	public String guiName()
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
		.requestPermissions(activity, new String[]{manifestName}, 1);
	}
	
	@Override
	public boolean isGranted()
	{
		int status = ActivityCompat.checkSelfPermission(activity, manifestName);
		
		if(status == PackageManager.PERMISSION_GRANTED)
		{
			return true;
		}
		
		return false;
	}
	
	@Override
	public String manifestName()
	{
		return manifestName;
	}
}
