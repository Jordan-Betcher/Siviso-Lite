package com.jordan.betcher.siviso.sivisolite.thirdparty.permissions;

import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ContextCompat.class, ActivityCompat.class})
public class Test$Permission$AccessFineLocation
{
	@Test
	public void addListener_permissionGranted_callListenerPermissionGranted()
	{
		OnPermissionGranted listener = mock(OnPermissionGranted.class);
		PowerMockito.mockStatic(ContextCompat.class);
		Activity activity = mock(Activity.class);
		Permission$AccessFineLocation permission = new Permission$AccessFineLocation(activity);
		
		PowerMockito.when(ContextCompat.checkSelfPermission(activity, Manifest.permission.ACCESS_FINE_LOCATION))
		            .thenReturn(PackageManager.PERMISSION_GRANTED);
		
		permission.addListener(listener);
		
		verify(listener, times(1)).permissionGranted();
	}
	
	@Test
	public void __noCallActivityCompatRequestPermissionsAccessFineLocation()
	{
		PowerMockito.mockStatic(ActivityCompat.class);
		Activity activity = mock(Activity.class);
		Permission$AccessFineLocation permission = new Permission$AccessFineLocation(activity);
		
		PowerMockito.verifyStatic(times(0));
		ActivityCompat
		.requestPermissions(activity, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 0);
	}
	
	@Test
	public void request__callActivityCompatRequestPermissionsAccessFineLocation()
	{
		PowerMockito.mockStatic(ActivityCompat.class);
		Activity activity = mock(Activity.class);
		Permission$AccessFineLocation permission = new Permission$AccessFineLocation(activity);
		
		permission.request();
		
		PowerMockito.verifyStatic(times(1));
		ActivityCompat
		.requestPermissions(activity, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 0);
	}
	
	@Test
	public void isGranted_permissionGranted_true()
	{
		PowerMockito.mockStatic(ContextCompat.class);
		Activity activity = mock(Activity.class);
		PowerMockito.when(ContextCompat.checkSelfPermission(activity, Manifest.permission.ACCESS_FINE_LOCATION))
		            .thenReturn(PackageManager.PERMISSION_GRANTED);
		
		Permission$AccessFineLocation permission = new Permission$AccessFineLocation(activity);
		boolean actualIsGranted = permission.isGranted();
		
		assertTrue(actualIsGranted);
	}
	
	@Test
	public void isGranted_permissionDenied_false()
	{
		PowerMockito.mockStatic(ContextCompat.class);
		Activity activity = mock(Activity.class);
		PowerMockito.when(ContextCompat.checkSelfPermission(activity, Manifest.permission.ACCESS_FINE_LOCATION))
		            .thenReturn(PackageManager.PERMISSION_DENIED);
		
		Permission$AccessFineLocation permission = new Permission$AccessFineLocation(activity);
		boolean actualIsGranted = permission.isGranted();
		
		assertFalse(actualIsGranted);
	}
	
	@Test
	public void grant_permissionGrantedPermissionListener_1CallPermissionListener()
	{
		PowerMockito.mockStatic(ContextCompat.class);
		Activity activity = mock(Activity.class);
		PowerMockito.when(ContextCompat.checkSelfPermission(activity, Manifest.permission.ACCESS_FINE_LOCATION))
		            .thenReturn(PackageManager.PERMISSION_GRANTED);
		OnPermissionGranted listener = mock(OnPermissionGranted.class);
		
		Permission$AccessFineLocation permission = new Permission$AccessFineLocation(activity);
		permission.addListener(listener);
		permission.grant();
		
		verify(listener, times(1)).permissionGranted();
	}
	
	@Test
	public void grant_permissionGranted2PermissionListeners_1CallPermissionListener1()
	{
		PowerMockito.mockStatic(ContextCompat.class);
		Activity activity = mock(Activity.class);
		PowerMockito.when(ContextCompat.checkSelfPermission(activity, Manifest.permission.ACCESS_FINE_LOCATION))
		            .thenReturn(PackageManager.PERMISSION_GRANTED);
		OnPermissionGranted listener1 = mock(OnPermissionGranted.class);
		OnPermissionGranted listener2 = mock(OnPermissionGranted.class);
		
		Permission$AccessFineLocation permission = new Permission$AccessFineLocation(activity);
		permission.addListener(listener1);
		permission.addListener(listener2);
		permission.grant();
		
		verify(listener1, times(1)).permissionGranted();
	}
	
	@Test
	public void grant_permissionGranted2PermissionListeners_1CallPermissionListener2()
	{
		PowerMockito.mockStatic(ContextCompat.class);
		Activity activity = mock(Activity.class);
		PowerMockito.when(ContextCompat.checkSelfPermission(activity, Manifest.permission.ACCESS_FINE_LOCATION))
		            .thenReturn(PackageManager.PERMISSION_GRANTED);
		OnPermissionGranted listener1 = mock(OnPermissionGranted.class);
		OnPermissionGranted listener2 = mock(OnPermissionGranted.class);
		
		Permission$AccessFineLocation permission = new Permission$AccessFineLocation(activity);
		permission.addListener(listener1);
		permission.addListener(listener2);
		permission.grant();
		
		verify(listener2, times(1)).permissionGranted();
	}
	
	@Test
	public void grant_permissionDeniedPermissionListener_0CallPermissionListener()
	{
		PowerMockito.mockStatic(ContextCompat.class);
		Activity activity = mock(Activity.class);
		PowerMockito.when(ContextCompat.checkSelfPermission(activity, Manifest.permission.ACCESS_FINE_LOCATION))
		            .thenReturn(PackageManager.PERMISSION_DENIED);
		OnPermissionGranted listener = mock(OnPermissionGranted.class);
		
		Permission$AccessFineLocation permission = new Permission$AccessFineLocation(activity);
		permission.addListener(listener);
		permission.grant();
		
		verify(listener, times(0)).permissionGranted();
	}
}