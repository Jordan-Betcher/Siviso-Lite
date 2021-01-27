package com.jordan.betcher.siviso.sivisolite.thirdparty.permissions;

public interface Permission
{
	void request();
	
	boolean isGranted();
	
	void grant();
	
	void addListener(OnPermissionGranted listener);
}
