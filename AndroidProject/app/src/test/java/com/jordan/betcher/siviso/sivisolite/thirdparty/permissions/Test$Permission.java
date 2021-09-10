package com.jordan.betcher.siviso.sivisolite.thirdparty.permissions;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import android.app.Activity;
import android.content.pm.PackageManager;

import org.junit.Test;


public class Test$Permission
{
	
	@Test
	public void grant_2PermissionListenersDeniedGranted_1CallPermissionListener2()
	{
		String permissionName = "1";
		int isGranted1 = PackageManager.PERMISSION_DENIED;
		int isGranted2 = PackageManager.PERMISSION_GRANTED;
		Wrapper_ActivityCompat activityCompat = mock(Wrapper_ActivityCompat.class);
		Activity activity = mock(Activity.class);
		when(activityCompat.checkSelfPermission(activity, permissionName)).thenReturn(isGranted1);
		OnPermissionGranted listener1 = mock(OnPermissionGranted.class);
		OnPermissionGranted listener2 = mock(OnPermissionGranted.class);
		
		Permission permission = new Permission(activity, activityCompat, permissionName);
		permission.addOnPermissionGranted(listener1);
		permission.addOnPermissionGranted(listener2);
		when(activityCompat.checkSelfPermission(activity, permissionName)).thenReturn(isGranted2);
		permission.grant();
		
		verify(listener2, times(1)).permissionGranted();
	}
	
	@Test
	public void grant_permissionGranted2PermissionListeners_1CallPermissionListener1()
	{
		String permissionName = "1";
		int isGranted1 = PackageManager.PERMISSION_DENIED;
		int isGranted2 = PackageManager.PERMISSION_GRANTED;
		Wrapper_ActivityCompat activityCompat = mock(Wrapper_ActivityCompat.class);
		Activity activity = mock(Activity.class);
		when(activityCompat.checkSelfPermission(activity, permissionName)).thenReturn(isGranted1);
		OnPermissionGranted listener1 = mock(OnPermissionGranted.class);
		OnPermissionGranted listener2 = mock(OnPermissionGranted.class);
		
		Permission permission = new Permission(activity, activityCompat, permissionName);
		permission.addOnPermissionGranted(listener1);
		permission.addOnPermissionGranted(listener2);
		when(activityCompat.checkSelfPermission(activity, permissionName)).thenReturn(isGranted2);
		permission.grant();
		
		verify(listener1, times(1)).permissionGranted();
	}
	
	@Test
	public void grant_permissionDenied_noCallPermissionListener()
	{
		
		String permissionName = "1";
		int isGranted1 = PackageManager.PERMISSION_DENIED;
		int isGranted2 = PackageManager.PERMISSION_DENIED;
		Wrapper_ActivityCompat activityCompat = mock(Wrapper_ActivityCompat.class);
		Activity activity = mock(Activity.class);
		when(activityCompat.checkSelfPermission(activity, permissionName)).thenReturn(isGranted1);
		OnPermissionGranted listener = mock(OnPermissionGranted.class);
		
		Permission permission = new Permission(activity, activityCompat, permissionName);
		permission.addOnPermissionGranted(listener);
		when(activityCompat.checkSelfPermission(activity, permissionName)).thenReturn(isGranted2);
		permission.grant();
		
		verify(listener, times(0)).permissionGranted();
	}
	
	
	@Test
	public void grant_permissionGrantedGranted_1CallPermissionListener()
	{
		String permissionName = "1";
		int isGranted1 = PackageManager.PERMISSION_GRANTED;
		int isGranted2 = PackageManager.PERMISSION_GRANTED;
		Wrapper_ActivityCompat activityCompat = mock(Wrapper_ActivityCompat.class);
		Activity activity = mock(Activity.class);
		when(activityCompat.checkSelfPermission(activity, permissionName)).thenReturn(isGranted1);
		OnPermissionGranted listener = mock(OnPermissionGranted.class);
		
		Permission permission = new Permission(activity, activityCompat, permissionName);
		permission.addOnPermissionGranted(listener);
		when(activityCompat.checkSelfPermission(activity, permissionName)).thenReturn(isGranted2);
		permission.grant();
		
		verify(listener, times(1)).permissionGranted();
	}
	
	@Test
	public void grant_permissionGranted_1CallPermissionListener()
	{
		String permissionName = "1";
		int isGranted1 = PackageManager.PERMISSION_GRANTED;
		Wrapper_ActivityCompat activityCompat = mock(Wrapper_ActivityCompat.class);
		Activity activity = mock(Activity.class);
		when(activityCompat.checkSelfPermission(activity, permissionName)).thenReturn(isGranted1);
		OnPermissionGranted listener = mock(OnPermissionGranted.class);
		
		Permission permission = new Permission(activity, activityCompat, permissionName);
		permission.addOnPermissionGranted(listener);
		
		verify(listener, times(1)).permissionGranted();
	}
	
	@Test
	public void grant_permissionDeniedGranted_1CallPermissionListener()
	{
		String permissionName = "1";
		int isGranted1 = PackageManager.PERMISSION_DENIED;
		int isGranted2 = PackageManager.PERMISSION_GRANTED;
		Wrapper_ActivityCompat activityCompat = mock(Wrapper_ActivityCompat.class);
		Activity activity = mock(Activity.class);
		when(activityCompat.checkSelfPermission(activity, permissionName)).thenReturn(isGranted1);
		OnPermissionGranted listener = mock(OnPermissionGranted.class);
		
		Permission permission = new Permission(activity, activityCompat, permissionName);
		permission.addOnPermissionGranted(listener);
		when(activityCompat.checkSelfPermission(activity, permissionName)).thenReturn(isGranted2);
		permission.grant();
		
		verify(listener, times(1)).permissionGranted();
	}
	
	@Test
	public void isGranted_permissionDenied_false()
	{
		String permissionName = "1";
		int isGranted = PackageManager.PERMISSION_DENIED;
		
		Wrapper_ActivityCompat activityCompat = mock(Wrapper_ActivityCompat.class);
		Activity activity = mock(Activity.class);
		when(activityCompat.checkSelfPermission(activity, permissionName)).thenReturn(isGranted);
		
		Permission permission = new Permission(activity, activityCompat, permissionName);
		
		boolean actualGrant = permission.isGranted();
		assertFalse(actualGrant);
	}
	
	@Test
	public void isGranted_PermissionGranted_true()
	{
		String permissionName = "1";
		int isGranted = PackageManager.PERMISSION_GRANTED;
		
		Wrapper_ActivityCompat activityCompat = mock(Wrapper_ActivityCompat.class);
		Activity activity = mock(Activity.class);
		when(activityCompat.checkSelfPermission(activity, permissionName)).thenReturn(isGranted);
		
		Permission permission = new Permission(activity, activityCompat, permissionName);
		
		boolean actualGrant = permission.isGranted();
		assertTrue(actualGrant);
	}
	
	
	@Test
	public void _1_noCallRequestPermissions()
	{
		String permissionName = "1";
		Wrapper_ActivityCompat activityCompat = mock(Wrapper_ActivityCompat.class);
		Activity activity = mock(Activity.class);
		
		Permission permission = new Permission(activity, activityCompat, permissionName);
		
		verify(activityCompat, times(0)).requestPermissions(activity, new String[]{permissionName}, 0);
	}
	
	@Test
	public void request_2_callRequestPermissions2()
	{
		String permissionName = "2";
		Wrapper_ActivityCompat activityCompat = mock(Wrapper_ActivityCompat.class);
		Activity activity = mock(Activity.class);
		Permission permission = new Permission(activity, activityCompat, permissionName);
		
		permission.request();
		
		verify(activityCompat, times(1)).requestPermissions(activity, new String[]{permissionName}, 0);
	}
	
	@Test
	public void request_1_callRequestPermissions1()
	{
		String permissionName = "1";
		Wrapper_ActivityCompat activityCompat = mock(Wrapper_ActivityCompat.class);
		Activity activity = mock(Activity.class);
		Permission permission = new Permission(activity, activityCompat, permissionName);
		
		permission.request();
		
		verify(activityCompat, times(1)).requestPermissions(activity, new String[]{permissionName}, 0);
	}
	
}