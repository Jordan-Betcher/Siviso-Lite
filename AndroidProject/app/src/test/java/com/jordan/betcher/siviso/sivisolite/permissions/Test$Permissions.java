package com.jordan.betcher.siviso.sivisolite.permissions;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class Test$Permissions
{
	@Test
	public void array_permission_arrayWithPermission()
	{
		Permission fakePermission = mock(Permission.class);
		
		Permissions permissions = new Permissions(fakePermission);
		Permission[] permissionsArray = permissions.array();
		
		Permission[] expectedArray = new Permission[]{fakePermission};
		assertArrayEquals(expectedArray, permissionsArray);
	}
	
	@Test
	public void array_2permission_arrayWithBothPermissions()
	{
		String fakeManifestName1 = "1";
		String fakeManifestName2 = "2";
		Permission fakePermission1 = mock(Permission.class);
		Permission fakePermission2 = mock(Permission.class);
		when(fakePermission1.manifestName()).thenReturn(fakeManifestName1);
		when(fakePermission2.manifestName()).thenReturn(fakeManifestName2);
		
		Permissions permissions = new Permissions(fakePermission1, fakePermission2);
		Permission[] permissionsArray = permissions.array();
		
		Permission[] expectedArray = new Permission[]{fakePermission1, fakePermission2};
		assertArrayEquals(expectedArray, permissionsArray);
	}
	
	@Test
	public void permissionGranted_manifestName_callPermissionWithSameManifestName()
	{
		String fakeManifestName = "";
		Permission fakePermission = mock(Permission.class);
		when(fakePermission.manifestName()).thenReturn(fakeManifestName);
		
		Permissions permissions = new Permissions(fakePermission);
		permissions.permissionGranted(fakeManifestName);
		
		verify(fakePermission, times(1)).callListeners_PermissionGranted();
	}
	
	@Test
	public void permissionGranted_wrongManifestName_throwPermissionNotFoundException()
	{
		String fakeManifestName = "";
		String wrongManifestName = "wrong name";
		Permission fakePermission = mock(Permission.class);
		when(fakePermission.manifestName()).thenReturn(fakeManifestName);
		
		Permissions permissions = new Permissions(fakePermission);
		permissions.permissionGranted(wrongManifestName);
		
		verify(fakePermission, times(0)).callListeners_PermissionGranted();
	}
	
	@Test
	public void permissionGranted_2ndManifestName_call2ndPermissionGranted()
	{
		String fakeManifestName1 = "1";
		String fakeManifestName2 = "2";
		
		Permission fakePermission1 = mock(Permission.class);
		Permission fakePermission2 = mock(Permission.class);
		when(fakePermission1.manifestName()).thenReturn(fakeManifestName1);
		when(fakePermission2.manifestName()).thenReturn(fakeManifestName2);
		
		Permissions permissions = new Permissions(fakePermission1, fakePermission2);
		permissions.permissionGranted(fakeManifestName2);
		
		verify(fakePermission2, times(1)).callListeners_PermissionGranted();
	}
	
	@Test
	public void permissionGranted_PermissionGranted_callAllPermissionsGrantedListener()
	{
		String fakeManifestName = "";
		Permission fakePermission = mock(Permission.class);
		when(fakePermission.manifestName()).thenReturn(fakeManifestName);
		when(fakePermission.isGranted()).thenReturn(true);
		
		Listener fakeListener = mock(Listener.class);
		
		Permissions permissions = new Permissions(fakePermission);
		permissions.addListener_AllPermissionsAccepted(fakeListener);
		permissions.permissionGranted(fakeManifestName);
		
		verify(fakeListener,times(1)).call();
	}
	
	@Test
	public void permissionGranted_PermissionGranted_callAllPermissionsGrantedListeners()
	{
		String fakeManifestName = "";
		Permission fakePermission = mock(Permission.class);
		when(fakePermission.manifestName()).thenReturn(fakeManifestName);
		when(fakePermission.isGranted()).thenReturn(true);
		
		Listener fakeListener1 = mock(Listener.class);
		Listener fakeListener2 = mock(Listener.class);
		
		Permissions permissions = new Permissions(fakePermission);
		permissions.addListener_AllPermissionsAccepted(fakeListener1);
		permissions.addListener_AllPermissionsAccepted(fakeListener2);
		permissions.permissionGranted(fakeManifestName);
		
		verify(fakeListener1,times(1)).call();
		verify(fakeListener2,times(1)).call();
	}
	
	@Test
	public void permissionGranted_PermissionNotGranted_noCallAllPermissionGrantedListener()
	{
		
		String fakeManifestName = "";
		Permission fakePermission = mock(Permission.class);
		when(fakePermission.manifestName()).thenReturn(fakeManifestName);
		when(fakePermission.isGranted()).thenReturn(false);
		
		Listener fakeListener = mock(Listener.class);
		
		Permissions permissions = new Permissions(fakePermission);
		permissions.addListener_AllPermissionsAccepted(fakeListener);
		permissions.permissionGranted(fakeManifestName);
		
		verify(fakeListener, times(0)).call();
	}
	
	@Test
	public void permissionGranted_2Permissions1PermissionNotGranted_noCallAllPermissionGrantedListener()
	{
		
		String fakeManifestName1 = "1";
		String fakeManifestName2 = "2";
		Permission fakePermission1 = mock(Permission.class);
		Permission fakePermission2 = mock(Permission.class);
		when(fakePermission1.manifestName()).thenReturn(fakeManifestName1);
		when(fakePermission2.manifestName()).thenReturn(fakeManifestName2);
		when(fakePermission1.isGranted()).thenReturn(true);
		when(fakePermission2.isGranted()).thenReturn(false);
		
		Listener fakeListener = mock(Listener.class);
		
		Permissions permissions = new Permissions(fakePermission1, fakePermission2);
		permissions.addListener_AllPermissionsAccepted(fakeListener);
		permissions.permissionGranted(fakeManifestName1);
		
		verify(fakeListener, times(0)).call();
	}
}