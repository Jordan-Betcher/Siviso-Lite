package com.jordan.betcher.siviso.sivisolite.home.lock;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class Test$Listener$PermissionGranted$Unlock
{
	@Test
	public void __0CallLockStateUnlock()
	{
		LockState lockState = mock(LockState.class);
		OnPermissionGranted$Unlock listener = new OnPermissionGranted$Unlock(lockState);
		
		verify(lockState, times(0)).unlocked();
	}
	
	@Test
	public void act__1CallLockStateUnlock()
	{
		LockState lockState = mock(LockState.class);
		OnPermissionGranted$Unlock listener = new OnPermissionGranted$Unlock(lockState);
		
		listener.permissionGranted();
		
		verify(lockState, times(1)).unlocked();
	}
}