package com.jordan.betcher.siviso.sivisolite.permissions;

import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.content.res.Resources;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.jordan.betcher.siviso.sivisolite.R;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;
import static org.powermock.api.mockito.PowerMockito.verifyStatic;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ActivityCompat.class, ContextCompat.class})
public class Test$Permission$AccessFineLocation
{
	@Test
	public void name_context_fake1()
	{
		String fakeName = "fake1";
		Activity fakeActivity = mock(Activity.class);
		Resources fakeResources = mock(Resources.class);
		when(fakeActivity.getResources()).thenReturn(fakeResources);
		when(fakeResources.getString(R.string.permission_access_fine_location_name)).thenReturn(fakeName);
		
		Permission accessFineLocation = new Permission$AccessFineLocation(fakeActivity);
		String name = accessFineLocation.guiName();
		assertEquals(fakeName, name);
	}
	
	@Test
	public void name_context_fake2()
	{
		String fakeName = "fake2";
		Activity fakeActivity = mock(Activity.class);
		Resources fakeResources = mock(Resources.class);
		when(fakeActivity.getResources()).thenReturn(fakeResources);
		when(fakeResources.getString(R.string.permission_access_fine_location_name)).thenReturn(fakeName);
		
		Permission accessFineLocation = new Permission$AccessFineLocation(fakeActivity);
		String name = accessFineLocation.guiName();
		assertEquals(fakeName, name);
	}
	
	@Test
	public void details_context_fake1()
	{
		String fakeDetails = "fake1";
		Activity fakeActivity = mock(Activity.class);
		Resources fakeResources = mock(Resources.class);
		when(fakeActivity.getResources()).thenReturn(fakeResources);
		when(fakeResources.getString(R.string.permission_access_fine_location_details)).thenReturn(fakeDetails);
		
		Permission accessFineLocation = new Permission$AccessFineLocation(fakeActivity);
		String details = accessFineLocation.details();
		assertEquals(fakeDetails, details);
	}
	
	@Test
	public void details_context_fake2()
	{
		String fakeDetails = "fake2";
		Activity fakeActivity = mock(Activity.class);
		Resources fakeResources = mock(Resources.class);
		when(fakeActivity.getResources()).thenReturn(fakeResources);
		when(fakeResources.getString(R.string.permission_access_fine_location_details)).thenReturn(fakeDetails);
		
		Permission accessFineLocation = new Permission$AccessFineLocation(fakeActivity);
		String details = accessFineLocation.details();
		assertEquals(fakeDetails, details);
	}
	
	@Test
	public void accept_context_callRequestPermissions()
	{
		Activity fakeActivity = mock(Activity.class);
		
		PowerMockito.mockStatic(ActivityCompat.class);
		Permission accessFineLocation = new Permission$AccessFineLocation(fakeActivity);
		accessFineLocation.accept();
		
		verifyStatic(times(1));
		ActivityCompat.requestPermissions(fakeActivity, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 1);
	}
	
	@Test
	public void isGranted_permissionGranted_true()
	{
		
		Activity fakeActivity = mock(Activity.class);
		PowerMockito.mockStatic(ContextCompat.class);
		String name = Manifest.permission.ACCESS_FINE_LOCATION;
		int status = PackageManager.PERMISSION_GRANTED;
		// actually calling ContextCompat.checkSelfPermissions even though it's using ActivityCompat
		PowerMockito.when(ActivityCompat.checkSelfPermission(fakeActivity, name)).thenReturn(status);
		Permission accessFineLocation = new Permission$AccessFineLocation(fakeActivity);
		boolean actual = accessFineLocation.isGranted();
		
		assertTrue(actual);
	}
	
	
	
	@Test
	public void isGranted_permissionNotGranted_false()
	{
		Activity fakeActivity = mock(Activity.class);
		PowerMockito.mockStatic(ContextCompat.class);
		String name = Manifest.permission.ACCESS_FINE_LOCATION;
		int status = PackageManager.PERMISSION_DENIED;
		// actually calling ContextCompat.checkSelfPermissions even though it's using ActivityCompat
		PowerMockito.when(ActivityCompat.checkSelfPermission(fakeActivity, name)).thenReturn(status);
		Permission accessFineLocation = new Permission$AccessFineLocation(fakeActivity);
		
		boolean actual = accessFineLocation.isGranted();
		
		assertFalse(actual);
	}
	
	@Test
	public void manifestName__ManifestName()
	{
		Activity fakeActivity = mock(Activity.class);
		Permission accessFineLocation = new Permission$AccessFineLocation(fakeActivity);
		
		String manifestName = accessFineLocation.manifestName();
		String expected = Manifest.permission.ACCESS_FINE_LOCATION;
		
		assertEquals(expected, manifestName);
	}
}