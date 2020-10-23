package com.jordan.betcher.siviso.sivisolite.permissions;

import android.content.Context;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class Test$Permission
{
	@Test
	public void Permission_PermissionData_StorePermissionData()
	{
		PermissionData fakePermissionData = mock(PermissionData.class);
		Permission permission = new Permission(fakePermissionData);
		
		PermissionData actual = permission.permissionData;
		
		assertEquals(fakePermissionData, actual);
	}
	
	@Test
	public void PermissionAccepted_GivenListenerAndisPermissionAcceptedTrue_CallWhenReady()
	{
		PermissionData fakePermissionData = mock(PermissionData.class);
		Permission permission = new Permission(fakePermissionData);
		
		Listener$PermissionAccepted fakeListener = mock(Listener$PermissionAccepted.class);
		permission.callWhenAccepted(fakeListener);
		
		Context fakeContext = mock(Context.class);
		when(fakePermissionData.isPermissionAccepted(fakeContext)).thenReturn(true);
		permission.permissionAccepted(fakeContext);
		
		verify(fakeListener).callWhenReady(fakePermissionData);
	}
	
	@Test
	public void PermissionAccepted_GivenListenerAcceptedAndisPermissionAcceptedFalse_DontCall()
	{
		PermissionData fakePermissionData = mock(PermissionData.class);
		Permission permission = new Permission(fakePermissionData);
		
		Listener$PermissionAccepted fakeListener = mock(Listener$PermissionAccepted.class);
		permission.callWhenAccepted(fakeListener);
		
		Context fakeContext = mock(Context.class);
		when(fakePermissionData.isPermissionAccepted(fakeContext)).thenReturn(false);
		permission.permissionAccepted(fakeContext);
		
		verify(fakeListener, times(0)).callWhenReady(fakePermissionData);
	}
	
	@Test
	public void PermissionAccepted_Given2ListenersAndBothAccepted_BothCalled()
	{
		PermissionData fakePermissionData = mock(PermissionData.class);
		Permission permission = new Permission(fakePermissionData);
		
		Listener$PermissionAccepted fakeListener1 = mock(Listener$PermissionAccepted.class);
		permission.callWhenAccepted(fakeListener1);
		
		Listener$PermissionAccepted fakeListener2 = mock(Listener$PermissionAccepted.class);
		permission.callWhenAccepted(fakeListener2);
		
		Context fakeContext = mock(Context.class);
		when(fakePermissionData.isPermissionAccepted(fakeContext)).thenReturn(true);
		permission.permissionAccepted(fakeContext);
		
		verify(fakeListener1).callWhenReady(fakePermissionData);
		verify(fakeListener2).callWhenReady(fakePermissionData);
	}
}