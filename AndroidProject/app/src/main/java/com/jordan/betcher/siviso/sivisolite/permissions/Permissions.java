package com.jordan.betcher.siviso.sivisolite.permissions;

import java.util.ArrayList;
import java.util.HashMap;

class Permissions
{
	HashMap<String, Permission> manifestNamePermissions = new HashMap<>();
	
	public Permissions(Permission... permissions)
	{
		for(Permission permission : permissions)
		{
			String manifestName = permission.manifestName();
			manifestNamePermissions.put(manifestName, permission);
		}
	}
	
	public Permission[] array()
	{
		Permission[] array = new Permission[manifestNamePermissions.size()];
		return manifestNamePermissions.values().toArray(array);
	}
	
	public void permissionGranted(String manifestName)
	{
		if(manifestNamePermissions.containsKey(manifestName))
		{
			callPermission(manifestName);
			if(allPermissionsGranted())
			{
				callAllPermissionGrantedListeners();
			}
		}
	}
	
	private void callAllPermissionGrantedListeners()
	{
		for(Listener listener : listeners)
		{
			listener.call();
		}
	}
	
	private void callPermission(String manifestName)
	{
		Permission permission = manifestNamePermissions.get(manifestName);
		permission.call();
	}
	
	private boolean allPermissionsGranted()
	{
		for(Permission permission : manifestNamePermissions.values())
		{
			if(permission.isGranted() == false)
			{
				return false;
			}
		}
		
		return true;
	}
	
	ArrayList<Listener> listeners = new ArrayList<>();
	
	public void addListener_AllPermissionsAccepted(Listener listener)
	{
		listeners.add(listener);
	}
}
