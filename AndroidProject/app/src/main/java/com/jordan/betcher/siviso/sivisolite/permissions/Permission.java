package com.jordan.betcher.siviso.sivisolite.permissions;

import java.util.ArrayList;

public abstract class Permission
{
	public abstract String guiName();
	
	public abstract String details();
	
	public abstract void accept();
	
	public abstract boolean isGranted();
	
	public abstract String manifestName();
	
	ArrayList<Listener> listeners = new ArrayList<>();
	
	public void callListeners_PermissionGranted()
	{
		if(isGranted())
		{
			for(Listener listener : listeners)
			{
				listener.call();
			}
		}
	}
	
	public void addListener_PermissionGranted(Listener listener)
	{
		listeners.add(listener);
	}
}
