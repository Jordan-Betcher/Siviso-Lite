package com.jordan.betcher.siviso.sivisolite.permissions;

public interface Permission
{
	String guiName();
	
	String details();
	
	void accept();
	
	boolean isGranted();
	
	String manifestName();
	
	boolean matchesManifestName(String manifestName);
}
