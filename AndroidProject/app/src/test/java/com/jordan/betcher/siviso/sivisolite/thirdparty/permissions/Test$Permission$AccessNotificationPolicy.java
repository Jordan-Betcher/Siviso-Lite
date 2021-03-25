package com.jordan.betcher.siviso.sivisolite.thirdparty.permissions;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.eq;
import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

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
		
		Permission$AccessNotificationPolicy permission = new Permission$AccessNotificationPolicy(activity);
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
		
		Permission$AccessNotificationPolicy permission = new Permission$AccessNotificationPolicy(activity);
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
		
		Permission$AccessNotificationPolicy permission = new Permission$AccessNotificationPolicy(activity);
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
		
		Permission$AccessNotificationPolicy permission = new Permission$AccessNotificationPolicy(activity);
		permission.buildVersion = version;
		boolean actualIsGranted = permission.isGranted();
		assertEquals(true, actualIsGranted);
	}
	
	@Test
	public void request__callStartActivityForResult()
	{
		Activity activity = mock(Activity.class);
		
		Permission$AccessNotificationPolicy permission = new Permission$AccessNotificationPolicy(activity);
		permission.request();
		
		verify(activity, times(1)).startActivityForResult(isA(Intent$PermissionSettingNotification.class), eq(1));
	}
}