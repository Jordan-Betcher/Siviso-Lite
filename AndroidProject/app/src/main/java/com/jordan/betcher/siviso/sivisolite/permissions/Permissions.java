package com.jordan.betcher.siviso.sivisolite.permissions;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

class Permissions
{
	ArrayList<Permission> permissions = new ArrayList<>();
	
	public void add(Permission permission)
	{
		permissions.add(permission);
	}
	
	public List<Permission> get()
	{
		return permissions;
	}
	
	public void acceptPermissions(Context context, String... manifestNames)
	{
		for(Permission permission : permissions)
		{
			for(String manifestName : manifestNames)
			{
				if(permission.isManifestName(manifestName))
				{
					permission.callListeners(context);
				}
			}
		}
	}
}
