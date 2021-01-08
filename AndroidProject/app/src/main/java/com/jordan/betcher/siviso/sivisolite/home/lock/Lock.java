package com.jordan.betcher.siviso.sivisolite.home.lock;

import android.view.View;
import android.view.View.OnClickListener;

import com.jordan.betcher.siviso.sivisolite.thirdparty.permissions.Listener$PermissionGranted;
import com.jordan.betcher.siviso.sivisolite.thirdparty.permissions.Permission;

public class Lock
{
	private View view;
	private View lock;
	private Permission permission;
	LockState lockState;
	
	public Lock(View view, View lock, Permission permission)
	{
		this.view = view;
		this.lock = lock;
		this.permission = permission;
		this.lockState = new LockState(view, lock);
		
		setInitialState();
		onClickLockRequestPermission();
		onPermissionGrantedUnlock(permission);
	}
	
	private void onPermissionGrantedUnlock(Permission permission)
	{
		Listener$PermissionGranted unlock = new Listener$PermissionGranted$Unlock(lockState);
		permission.addListener(unlock);
	}
	
	private void onClickLockRequestPermission()
	{
		OnClickListener requestPermission = new OnClickListener$RequestPermission(permission);
		lock.setOnClickListener(requestPermission);
	}
	
	private void setInitialState()
	{
		if(true == permission.isGranted())
		{
			lockState.unlocked();
		}
		else
		{
			lockState.lock();
		}
	}
}
