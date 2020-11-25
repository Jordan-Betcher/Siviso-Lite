package com.jordan.betcher.siviso.sivisolite.permissions;

import android.Manifest;
import android.app.Activity;
import android.content.res.Resources;

import androidx.core.app.ActivityCompat;

import com.jordan.betcher.siviso.sivisolite.R;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;
import static org.powermock.api.mockito.PowerMockito.verifyStatic;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ActivityCompat.class})
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
		String name = accessFineLocation.name();
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
		String name = accessFineLocation.name();
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
}