package com.jordan.betcher.siviso.sivisolite.home.lock;

import com.jordan.betcher.siviso.sivisolite.thirdparty.permissions.OnPermissionGranted;

class OnPermissionGranted$Unlock implements OnPermissionGranted
{
	LockState lockState;
	
	public OnPermissionGranted$Unlock(LockState lockState){this.lockState = lockState;}
	
	@Override
	public void permissionGranted()
	{
		lockState.unlocked();
	}
}
