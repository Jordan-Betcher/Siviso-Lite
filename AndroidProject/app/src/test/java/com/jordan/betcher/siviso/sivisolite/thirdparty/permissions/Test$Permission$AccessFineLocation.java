package com.jordan.betcher.siviso.sivisolite.thirdparty.permissions;

import android.Manifest;
import android.content.Context;

import androidx.core.content.ContextCompat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

@RunWith(PowerMockRunner.class)
@PrepareForTest(ContextCompat.class)
public class Test$Permission$AccessFineLocation
{
	
	@Test
	public void check__callContextCompatSelfCheckAccessFineLocation()
	{
		PowerMockito.mockStatic(ContextCompat.class);
		Context context = mock(Context.class);
		Permission$AccessFineLocation permission = new Permission$AccessFineLocation(context);
		
		permission.check();
		
		PowerMockito.verifyStatic();
		ContextCompat.checkSelfPermission(context, Manifest.permission.ACCESS_FINE_LOCATION);
	}
	
	@Test
	public void numberOfCalls_0CallsToCheck_0()
	{
		PowerMockito.mockStatic(ContextCompat.class);
		Context context = mock(Context.class);
		Permission$AccessFineLocation permission = new Permission$AccessFineLocation(context);
		
		int actualNumberOfCalls = permission.numberOfCalls();
		int expectedNumberOfCalls = 0;
		assertEquals(expectedNumberOfCalls, actualNumberOfCalls);
	}
	
	@Test
	public void numberOfCalls_1CallsToCheck_1()
	{
		PowerMockito.mockStatic(ContextCompat.class);
		Context context = mock(Context.class);
		Permission$AccessFineLocation permission = new Permission$AccessFineLocation(context);
		
		permission.check();
		
		int actualNumberOfCalls = permission.numberOfCalls();
		int expectedNumberOfCalls = 1;
		assertEquals(expectedNumberOfCalls, actualNumberOfCalls);
	}
}