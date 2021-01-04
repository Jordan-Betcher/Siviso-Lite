package com.jordan.betcher.siviso.sivisolite.home;

import com.jordan.betcher.siviso.sivisolite.thirdparty.permissions.Permission;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class Test$OnClickListener$CheckPermission
{
	/*
	Tests
	__PermissionCheckCalled0
	onClick__PermissionCheckCalled1
	 */
	
	@Test
	public void __PermissionCheckCalled0()
	{
		Permission permission = mock(Permission.class);
		OnClickListener$CheckPermission onClickListener = new OnClickListener$CheckPermission(permission);
		
		verify(permission, times(0)).check();
	}
	
	@Test
	public void onClick__PermissionCheckCalled1()
	{
		Permission permission = mock(Permission.class);
		OnClickListener$CheckPermission onClickListener = new OnClickListener$CheckPermission(permission);
		
		onClickListener.onClick(null);
		
		verify(permission, times(1)).check();
	}
}