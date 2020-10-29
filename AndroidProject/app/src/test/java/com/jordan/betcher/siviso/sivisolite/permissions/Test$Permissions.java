package com.jordan.betcher.siviso.sivisolite.permissions;

import android.content.Context;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class Test$Permissions
{
	@Test
	public void permissions_OnePermission_ReturnPermission()
	{
		Permissions permissions = new Permissions();
		Permission fakePermission = mock(Permission.class);
		
		permissions.add(fakePermission);
		
		List<Permission> result = permissions.get();
		assertThat(result, hasItem(fakePermission));
	}
	
	
	@Test
	public void permissions_TwoPermission_ReturnTwoPermission()
	{
		Permissions permissions = new Permissions();
		Permission fakePermission1 = mock(Permission.class);
		Permission fakePermission2 = mock(Permission.class);
		
		permissions.add(fakePermission1);
		permissions.add(fakePermission2);
		
		List<Permission> result = permissions.get();
		assertThat(result, hasItems(fakePermission1, fakePermission2));
	}
	
	@Test
	public void accept_OnePermissionAndPermissionAccepted_CallPermissionCallListeners()
	{
		Context fakeContext = mock(Context.class);
		Permissions permissions = new Permissions();
		Permission fakePermission = mock(Permission.class);
		
		String fakeManifestName = "fakeManifestName";
		when(fakePermission.isManifestName(fakeManifestName)).thenReturn(true);
		
		permissions.add(fakePermission);
		permissions.acceptPermissions(fakeContext, new String[]{fakeManifestName});
		
		verify(fakePermission).callListeners(fakeContext);
	}
	
	@Test
	public void accept_2PermissionAndBothAccepted_Call2PermissionCallListeners()
	{
		Context fakeContext = mock(Context.class);
		Permissions permissions = new Permissions();
		Permission fakePermission1 = mock(Permission.class);
		Permission fakePermission2 = mock(Permission.class);
		
		String fakeManifestName1 = "fakeManifestName1";
		when(fakePermission1.isManifestName(fakeManifestName1)).thenReturn(true);
		
		String fakeManifestName2 = "fakeManifestName2";
		when(fakePermission2.isManifestName(fakeManifestName2)).thenReturn(true);
		
		permissions.add(fakePermission1);
		permissions.add(fakePermission2);
		permissions.acceptPermissions(fakeContext, new String[]{fakeManifestName1, fakeManifestName2});
		
		verify(fakePermission1).callListeners(fakeContext);
		verify(fakePermission2).callListeners(fakeContext);
	}
	
	
	
	@Test
	public void accept_2PermissionAndOnlyOneAccepted_Call1PermissionCallListeners()
	{
		Context fakeContext = mock(Context.class);
		Permissions permissions = new Permissions();
		Permission fakePermission1 = mock(Permission.class);
		Permission fakePermission2 = mock(Permission.class);
		
		String fakeManifestName1 = "fakeManifestName1";
		when(fakePermission1.isManifestName(fakeManifestName1)).thenReturn(true);
		
		String fakeManifestName2 = "fakeManifestName2";
		when(fakePermission2.isManifestName(fakeManifestName2)).thenReturn(false);
		
		permissions.add(fakePermission1);
		permissions.add(fakePermission2);
		permissions.acceptPermissions(fakeContext, new String[]{fakeManifestName1, fakeManifestName2});
		
		verify(fakePermission1).callListeners(fakeContext);
		verify(fakePermission2, times(0)).callListeners(fakeContext);
	}
}