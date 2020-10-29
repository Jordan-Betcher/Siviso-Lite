package com.jordan.betcher.siviso.sivisolite.permissions;

import android.app.Activity;
import android.content.Context;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class Test$Permission
{
	@Test
	public void PermissionAccepted_GivenListenerAndisPermissionAcceptedTrue_CallWhenReady()
	{
		PermissionData fakePermissionData = mock(PermissionData.class);
		Permission permission = new Permission(fakePermissionData);
		
		Listener$PermissionAccepted fakeListener = mock(Listener$PermissionAccepted.class);
		permission.addListener(fakeListener);
		
		Context fakeContext = mock(Context.class);
		when(fakePermissionData.isPermissionAccepted(fakeContext)).thenReturn(true);
		permission.callListeners(fakeContext);
		
		verify(fakeListener).callWhenReady(fakePermissionData);
	}
	
	@Test
	public void PermissionAccepted_GivenListenerAcceptedAndisPermissionAcceptedFalse_DontCall()
	{
		PermissionData fakePermissionData = mock(PermissionData.class);
		Permission permission = new Permission(fakePermissionData);
		
		Listener$PermissionAccepted fakeListener = mock(Listener$PermissionAccepted.class);
		permission.addListener(fakeListener);
		
		Context fakeContext = mock(Context.class);
		when(fakePermissionData.isPermissionAccepted(fakeContext)).thenReturn(false);
		permission.callListeners(fakeContext);
		
		verify(fakeListener, times(0)).callWhenReady(fakePermissionData);
	}
	
	@Test
	public void PermissionAccepted_Given2ListenersAndBothAccepted_BothCalled()
	{
		PermissionData fakePermissionData = mock(PermissionData.class);
		Permission permission = new Permission(fakePermissionData);
		
		Listener$PermissionAccepted fakeListener1 = mock(Listener$PermissionAccepted.class);
		permission.addListener(fakeListener1);
		
		Listener$PermissionAccepted fakeListener2 = mock(Listener$PermissionAccepted.class);
		permission.addListener(fakeListener2);
		
		Context fakeContext = mock(Context.class);
		when(fakePermissionData.isPermissionAccepted(fakeContext)).thenReturn(true);
		permission.callListeners(fakeContext);
		
		verify(fakeListener1).callWhenReady(fakePermissionData);
		verify(fakeListener2).callWhenReady(fakePermissionData);
	}
	
	@Test
	public void isManifestName_CorrectManifestName_True()
	{
		PermissionData fakePermissionData = mock(PermissionData.class);
		Permission  permission = new Permission(fakePermissionData);
		
		String fakeManifestName = "";
		when(fakePermissionData.manifestName()).thenReturn(fakeManifestName);
		
		boolean result = permission.isManifestName("");
		
		assertTrue(result);
	}
	
	@Test
	public void isManifestName_WrongManifestName_False()
	{
		PermissionData fakePermissionData = mock(PermissionData.class);
		Permission  permission = new Permission(fakePermissionData);
		
		String fakeManifestName = "";
		when(fakePermissionData.manifestName()).thenReturn(fakeManifestName);
		
		boolean result = permission.isManifestName("wrong Name");
		
		assertFalse(result);
	}
	
	@Test
	public void isPermissionAccepted_PermissionAccepted_True()
	{
		PermissionData fakePermissionData = mock(PermissionData.class);
		Permission  permission = new Permission(fakePermissionData);
		Context fakeContext = mock(Context.class);
		
		when(fakePermissionData.isPermissionAccepted(fakeContext)).thenReturn(true);
		
		boolean result = permission.isPermissionAccepted(fakeContext);
		
		assertTrue(result);
	}
	
	@Test
	public void isPermissionAccepted_PermissionNotAccepted_False()
	{
		PermissionData fakePermissionData = mock(PermissionData.class);
		Permission  permission = new Permission(fakePermissionData);
		Context fakeContext = mock(Context.class);
		
		when(fakePermissionData.isPermissionAccepted(fakeContext)).thenReturn(false);
		
		boolean result = permission.isPermissionAccepted(fakeContext);
		
		assertFalse(result);
	}
	
	@Test
	public void name_EmptyString_EmptyString()
	{
		PermissionData fakePermissionData = mock(PermissionData.class);
		Permission  permission = new Permission(fakePermissionData);
		
		String fakeName = "";
		when(fakePermissionData.name()).thenReturn(fakeName);
		
		String result = permission.name();
		
		assertEquals("", result);
	}
	
	@Test
	public void name_1_1()
	{
		PermissionData fakePermissionData = mock(PermissionData.class);
		Permission  permission = new Permission(fakePermissionData);
		
		String fakeName = "1";
		when(fakePermissionData.name()).thenReturn(fakeName);
		
		String result = permission.name();
		
		assertEquals("1", result);
	}
	
	@Test
	public void details_EmptyString_EmptyString()
	{
		PermissionData fakePermissionData = mock(PermissionData.class);
		Permission  permission = new Permission(fakePermissionData);
		
		String fakeDetails = "";
		when(fakePermissionData.details()).thenReturn(fakeDetails);
		
		String result = permission.details();
		
		assertEquals("", result);
	}
	
	@Test
	public void details_1_1()
	{
		PermissionData fakePermissionData = mock(PermissionData.class);
		Permission  permission = new Permission(fakePermissionData);
		
		String fakeDetails = "1";
		when(fakePermissionData.details()).thenReturn(fakeDetails);
		
		String result = permission.details();
		
		assertEquals("1", result);
	}
	
	@Test
	public void acceptPermission__callAcceptPermission()
	{
		PermissionData fakePermissionData = mock(PermissionData.class);
		Permission permission = new Permission(fakePermissionData);
		
		Activity fakeActivity = mock(Activity.class);
		permission.acceptPermission(fakeActivity);
		
		verify(fakePermissionData).acceptPermission(fakeActivity);
	}
}