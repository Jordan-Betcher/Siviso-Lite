package com.jordan.betcher.siviso.sivisolite.thirdparty.permissions;


import android.app.Activity;
import android.content.pm.PackageManager;

import java.util.ArrayList;

public class Permission
{
	private final Activity activity;
	private Wrapper_ActivityCompat activityCompat;
	private String permissionName;
	private ArrayList<OnPermissionGranted> onPermissionGranteds = new ArrayList<>();
	
	public Permission(
	Activity activity,
	Wrapper_ActivityCompat activityCompat,
	String permissionName)
	{
		this.activity = activity;
		this.activityCompat = activityCompat;
		this.permissionName = permissionName;
	}
	
	public void request()
	{
		activityCompat
		.requestPermissions(activity, new String[]{permissionName}, 0);
	}
	
	public boolean isGranted()
	{
		int permissionCode = activityCompat.checkSelfPermission(activity, permissionName);
		return permissionCode == PackageManager.PERMISSION_GRANTED;
	}
	
	public void grant()
	{
		if(isGranted())
		{
			for(OnPermissionGranted onPermissionGranted : onPermissionGranteds)
			{
				onPermissionGranted.permissionGranted();
			}
			onPermissionGranteds.clear();
		}
	}
	
	public void addOnPermissionGranted(OnPermissionGranted onPermissionGranted)
	{
		this.onPermissionGranteds.add(onPermissionGranted);
		grant();
	}
}
