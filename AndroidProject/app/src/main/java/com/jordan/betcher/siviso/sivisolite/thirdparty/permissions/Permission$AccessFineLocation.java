package com.jordan.betcher.siviso.sivisolite.thirdparty.permissions;

import android.Manifest;
import android.content.Context;

import androidx.core.content.ContextCompat;

public class Permission$AccessFineLocation implements Permission
{
	private Context context;
	int numberOfCalls = 0;
	
	public Permission$AccessFineLocation(Context context)
	{
		this.context = context;
	}
	
	public int numberOfCalls()
	{
		return numberOfCalls;
	}
	
	public void check()
	{
		numberOfCalls++;
		ContextCompat.checkSelfPermission(context, Manifest.permission.ACCESS_FINE_LOCATION);
	}
}
