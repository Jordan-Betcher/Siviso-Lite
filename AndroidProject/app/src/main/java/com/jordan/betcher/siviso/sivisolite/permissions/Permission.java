package com.jordan.betcher.siviso.sivisolite.permissions;

import android.app.Activity;
import android.content.Context;

import java.util.ArrayList;

class Permission
{
	private PermissionData permissionData;
	
	ArrayList<Listener$PermissionAccepted> listeners = new ArrayList<>();
	
	public Permission(PermissionData permissionData)
	{
		this.permissionData = permissionData;
	}
	
	public void addListener(Listener$PermissionAccepted listener)
	{
		listeners.add(listener);
	}
	
	void callListeners(Context context)
	{
		if(permissionData.isPermissionAccepted(context))
		{
			for(Listener$PermissionAccepted listener : listeners)
			{
				listener.callWhenReady(permissionData);
			}
		}
	}
	
	public boolean isManifestName(String manifestName)
	{
		return permissionData.manifestName().equals(manifestName);
	}
	
	public boolean isPermissionAccepted(Context context)
	{
		return permissionData.isPermissionAccepted(context);
	}
	
	public String name()
	{
		return permissionData.name();
	}
	
	public String details()
	{
		return permissionData.details();
	}
	
	public void acceptPermission(Activity activity)
	{
		permissionData.acceptPermission(activity);
	}
}
