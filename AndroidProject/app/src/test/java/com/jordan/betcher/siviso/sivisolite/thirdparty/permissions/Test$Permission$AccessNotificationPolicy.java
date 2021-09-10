package com.jordan.betcher.siviso.sivisolite.thirdparty.permissions;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.eq;
import static org.mockito.Mockito.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;

import org.junit.Test;

public class Test$Permission$AccessNotificationPolicy
{
	
	@Test
	public void isGranted_notGrantedVersion24_false()
	{
		int version = 24;
		boolean isGranted = false;
		NotificationManager notificationManager = mock(NotificationManager.class);
		Activity activity = mock(Activity.class);
		when(activity.getSystemService(Context.NOTIFICATION_SERVICE)).thenReturn(notificationManager);
		when(notificationManager.isNotificationPolicyAccessGranted()).thenReturn(isGranted);
		Intent$PermissionSettingNotification intent = mock(Intent$PermissionSettingNotification.class);
		
		Permission$AccessNotificationPolicy permission = new Permission$AccessNotificationPolicy(activity, intent);
		permission.buildVersion = version;
		boolean actualIsGranted = permission.isGranted();
		assertEquals(false, actualIsGranted);
	}
	
	@Test
	public void isGranted_notGrantedVersion22_true()
	{
		int version = 22;
		boolean isGranted = false;
		NotificationManager notificationManager = mock(NotificationManager.class);
		Activity activity = mock(Activity.class);
		when(activity.getSystemService(Context.NOTIFICATION_SERVICE)).thenReturn(notificationManager);
		when(notificationManager.isNotificationPolicyAccessGranted()).thenReturn(isGranted);
		Intent$PermissionSettingNotification intent = mock(Intent$PermissionSettingNotification.class);
		
		Permission$AccessNotificationPolicy permission = new Permission$AccessNotificationPolicy(activity, intent);
		permission.buildVersion = version;
		boolean actualIsGranted = permission.isGranted();
		assertEquals(true, actualIsGranted);
	}
	
	@Test
	public void isGranted_notGrantedVersion23_false()
	{
		int version = 23;
		boolean isGranted = false;
		NotificationManager notificationManager = mock(NotificationManager.class);
		Activity activity = mock(Activity.class);
		when(activity.getSystemService(Context.NOTIFICATION_SERVICE)).thenReturn(notificationManager);
		when(notificationManager.isNotificationPolicyAccessGranted()).thenReturn(isGranted);
		Intent$PermissionSettingNotification intent = mock(Intent$PermissionSettingNotification.class);
		
		Permission$AccessNotificationPolicy permission = new Permission$AccessNotificationPolicy(activity, intent);
		permission.buildVersion = version;
		boolean actualIsGranted = permission.isGranted();
		assertEquals(false, actualIsGranted);
	}
	
	@Test
	public void isGranted_grantedVersion23_true()
	{
		int version = 23;
		boolean isGranted = true;
		NotificationManager notificationManager = mock(NotificationManager.class);
		Activity activity = mock(Activity.class);
		when(activity.getSystemService(Context.NOTIFICATION_SERVICE)).thenReturn(notificationManager);
		when(notificationManager.isNotificationPolicyAccessGranted()).thenReturn(isGranted);
		Intent$PermissionSettingNotification intent = mock(Intent$PermissionSettingNotification.class);
		
		Permission$AccessNotificationPolicy permission = new Permission$AccessNotificationPolicy(activity, intent);
		permission.buildVersion = version;
		boolean actualIsGranted = permission.isGranted();
		assertEquals(true, actualIsGranted);
	}
	
	@Test
	public void request__callStartActivityForResult()
	{
		Activity activity = mock(Activity.class);
		Intent$PermissionSettingNotification intent = mock(Intent$PermissionSettingNotification.class);
		
		Permission$AccessNotificationPolicy permission = new Permission$AccessNotificationPolicy(activity, intent);
		permission.request();
		
		verify(activity, times(1)).startActivityForResult(isA(Intent$PermissionSettingNotification.class), eq(1));
	}
}