package com.jordan.betcher.siviso.sivisolite.home;

import com.jordan.betcher.siviso.sivisolite.thirdparty.permissions.Permission;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class Test$OnClickListener$RequestPermission
{
	
	@Test
	public void __PermissionCheckCalled0()
	{
		Permission permission = mock(Permission.class);
		OnClickListener$RequestPermission onClickListener = new OnClickListener$RequestPermission(permission);
		
		verify(permission, times(0)).request();
	}
	
	@Test
	public void onClick__PermissionCheckCalled1()
	{
		Permission permission = mock(Permission.class);
		OnClickListener$RequestPermission onClickListener = new OnClickListener$RequestPermission(permission);
		
		onClickListener.onClick(null);
		
		verify(permission, times(1)).request();
	}
}