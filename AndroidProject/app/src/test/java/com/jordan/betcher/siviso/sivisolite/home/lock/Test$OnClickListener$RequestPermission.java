package com.jordan.betcher.siviso.sivisolite.home.lock;

import android.view.View;

import com.jordan.betcher.siviso.sivisolite.thirdparty.permissions.Permission;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class Test$OnClickListener$RequestPermission
{
	@Test
	public void onClick__1CallPermissionRequest()
	{
		View fakeView = mock(View.class);
		Permission fakePermission = mock(Permission.class);
		OnClickListener$RequestPermission onClickListener = new OnClickListener$RequestPermission(fakePermission);
		
		onClickListener.onClick(fakeView);
		
		verify(fakePermission, times(1)).request();
	}
	
	@Test
	public void __0CallPermissionRequest()
	{
		View fakeView = mock(View.class);
		Permission fakePermission = mock(Permission.class);
		OnClickListener$RequestPermission onClickListener = new OnClickListener$RequestPermission(fakePermission);
		
		verify(fakePermission, times(0)).request();
	}
}