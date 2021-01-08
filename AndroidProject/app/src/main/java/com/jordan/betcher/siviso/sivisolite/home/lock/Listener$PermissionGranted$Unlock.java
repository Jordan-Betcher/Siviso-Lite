package com.jordan.betcher.siviso.sivisolite.home.lock;

import com.jordan.betcher.siviso.sivisolite.thirdparty.permissions.Listener$PermissionGranted;

class Listener$PermissionGranted$Unlock implements Listener$PermissionGranted
{
	LockState lockState;
	
	public Listener$PermissionGranted$Unlock(LockState lockState){this.lockState = lockState;}
	
	@Override
	public void act()
	{
		lockState.unlocked();
	}
}
