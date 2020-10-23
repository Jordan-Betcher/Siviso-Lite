package com.jordan.betcher.siviso.sivisolite.permissions;

import android.content.Context;

import java.util.ArrayList;

class Permission
{
	public PermissionData permissionData;
	
	ArrayList<Listener$PermissionAccepted> listeners = new ArrayList<>();
	
	public Permission(PermissionData permissionData)
	{
		this.permissionData = permissionData;
	}
	
	public void callWhenAccepted(Listener$PermissionAccepted listener)
	{
		listeners.add(listener);
	}
	
	void permissionAccepted(Context context)
	{
		if(permissionData.isPermissionAccepted(context))
		{
			for(Listener$PermissionAccepted listener : listeners)
			{
				listener.callWhenReady(permissionData);
			}
		}
	}
}
