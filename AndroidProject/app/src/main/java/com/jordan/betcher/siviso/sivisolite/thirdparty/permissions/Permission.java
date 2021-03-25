package com.jordan.betcher.siviso.sivisolite.thirdparty.permissions;


import android.app.Activity;
import android.content.pm.PackageManager;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class Permission
{
	private final Activity activity;
	private String permissionName;
	private ArrayList<OnPermissionGranted> onPermissionGranteds = new ArrayList<>();
	
	public Permission(Activity activity, String permissionName)
	{
		this.activity = activity;
		this.permissionName = permissionName;
	}
	
	public void request()
	{
		ActivityCompat
		.requestPermissions(activity, new String[]{permissionName}, 0);
	}
	
	public boolean isGranted()
	{
		int permissionCode = ContextCompat.checkSelfPermission(activity, permissionName);
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
