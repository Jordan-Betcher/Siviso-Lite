package com.jordan.betcher.siviso.sivisolite.permissions;

import android.content.pm.PackageManager;
import android.os.Build;

import androidx.test.core.app.ActivityScenario;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@Config(sdk = Build.VERSION_CODES.JELLY_BEAN)
@RunWith(RobolectricTestRunner.class)
public class Test$Activity_Permissions
{
	
	@Test
	public void onRequestPermissionsResult_PermissionGranted_callPermissionGranted()
	{
		Permissions fakePermissions = mock(Permissions.class);
		Activity_Permissions activity_permissions = new Activity_Permissions();
		activity_permissions.permissions = fakePermissions;
		
		String name = "";
		String[] names = new String[]{name};
		int[] results = new int[]{PackageManager.PERMISSION_GRANTED};
		activity_permissions.onRequestPermissionsResult(0, names, results);
		
		verify(fakePermissions, times(1)).permissionGranted(name);
	}
	
	@Test
	public void onRequestPermissionsResult_PermissionNotGranted_notCallPermissionGranted()
	{
		Permissions fakePermissions = mock(Permissions.class);
		Activity_Permissions activity_permissions = new Activity_Permissions();
		activity_permissions.permissions = fakePermissions;
		
		String name = "";
		String[] names = new String[]{name};
		int[] results = new int[]{PackageManager.PERMISSION_DENIED};
		activity_permissions.onRequestPermissionsResult(0, names, results);
		
		verify(fakePermissions, times(0)).permissionGranted(name);
	}
	
	@Test
	public void onRequestPermissionsResult_2PermissionGranted_call2PermissionGranted()
	{
		Permissions fakePermissions = mock(Permissions.class);
		Activity_Permissions activity_permissions = new Activity_Permissions();
		activity_permissions.permissions = fakePermissions;
		
		String name1 = "1";
		String name2 = "2";
		String[] names = new String[]{name1, name2};
		int[] results = new int[]{PackageManager.PERMISSION_GRANTED, PackageManager.PERMISSION_GRANTED};
		activity_permissions.onRequestPermissionsResult(0, names, results);
		
		verify(fakePermissions).permissionGranted(name1);
		verify(fakePermissions).permissionGranted(name2);
	}
	
	@Test
	public void onCreate__PermissionsNotNull()
	{
		try(ActivityScenario<Activity_Permissions> scenario = ActivityScenario
		.launch(Activity_Permissions.class))
		{
			scenario.onActivity
			(
			new ActivityScenario.ActivityAction<Activity_Permissions>()
			{
				@Override
				public void perform(Activity_Permissions activityPermissions)
				{
					assertNotNull(activityPermissions.permissions);
				}
			}
			);
		}
	}
	
}
