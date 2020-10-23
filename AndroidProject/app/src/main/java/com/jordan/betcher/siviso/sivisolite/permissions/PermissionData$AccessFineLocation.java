package com.jordan.betcher.siviso.sivisolite.permissions;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;

import androidx.core.app.ActivityCompat;

import com.jordan.betcher.siviso.sivisolite.R;

class PermissionData$AccessFineLocation implements PermissionData
{
	static final int REQUEST_LOCATION_PERMISSION = 0;
	
	String name;
	String details;
	
	public PermissionData$AccessFineLocation(Context context)
	{
		name = context.getString(R.string.permission_access_fine_location_name);
		details = context.getString(R.string.permission_access_fine_location_details);
	}
	
	@Override
	public String name()
	{
		return name;
	}
	
	@Override
	public String manifestName()
	{
		return Manifest.permission.ACCESS_FINE_LOCATION;
	}
	
	@Override
	public String details()
	{
		return details;
	}
	
	@Override
	public boolean isPermissionAccepted(Context context)
	{
		return ActivityCompat.checkSelfPermission(context, manifestName()) != PackageManager.PERMISSION_GRANTED;
	}
	
	@Override
	public void acceptPermission(Activity activity)
	{
		ActivityCompat.requestPermissions(activity, new String[]{manifestName()}, REQUEST_LOCATION_PERMISSION);
	}
}
