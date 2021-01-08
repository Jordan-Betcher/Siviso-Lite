package com.jordan.betcher.siviso.sivisolite.home.lock;

import android.view.View;

import com.jordan.betcher.siviso.sivisolite.thirdparty.permissions.Permission;

import org.junit.Test;
import org.mockito.ArgumentMatcher;

import static org.mockito.Matchers.argThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class Test$Lock
{
	@Test
	public void _permissionNotGranted_mapLockVisible()
	{
		Permission permissionNotGranted = mock(Permission.class);
		when(permissionNotGranted.isGranted()).thenReturn(false);
		View viewLock = mock(View.class);
		View view = mock(View.class);
		Lock lock = new Lock(view, viewLock, permissionNotGranted);
		
		verify(viewLock).setVisibility(View.VISIBLE);
	}
	
	@Test
	public void _permissionGranted_mapLockGone()
	{
		Permission permissionNotGranted = mock(Permission.class);
		when(permissionNotGranted.isGranted()).thenReturn(true);
		View viewLock = mock(View.class);
		View view = mock(View.class);
		Lock lock = new Lock(view, viewLock, permissionNotGranted);
		
		verify(viewLock).setVisibility(View.GONE);
	}
	
	@Test
	public void _permissionNotGranted_mapGone()
	{
		Permission permissionNotGranted = mock(Permission.class);
		when(permissionNotGranted.isGranted()).thenReturn(false);
		View viewLock = mock(View.class);
		View view = mock(View.class);
		Lock lock = new Lock(view, viewLock, permissionNotGranted);
		
		verify(view).setVisibility(View.GONE);
	}
	
	@Test
	public void _permissionGranted_mapVisible()
	{
		Permission permissionNotGranted = mock(Permission.class);
		when(permissionNotGranted.isGranted()).thenReturn(true);
		View viewLock = mock(View.class);
		View view = mock(View.class);
		Lock lock = new Lock(view, viewLock, permissionNotGranted);
		
		verify(view).setVisibility(View.VISIBLE);
	}
	
	@Test
	public void _permissionNotGranted_addOnClickListenerRequestPermission()
	{
		Permission permissionNotGranted = mock(Permission.class);
		when(permissionNotGranted.isGranted()).thenReturn(false);
		View viewLock = mock(View.class);
		View view = mock(View.class);
		Lock lock = new Lock(view, viewLock, permissionNotGranted);
		
		//https://www.baeldung.com/mockito-argument-matchers
		OnClickListener$RequestPermission requestPermission = new OnClickListener$RequestPermission(permissionNotGranted);
		verify(viewLock).setOnClickListener(argThat(new ArgumentMatcher$OnClickListener$RequestPermission(requestPermission)));
		
	}
	
	private class ArgumentMatcher$OnClickListener$RequestPermission
	extends ArgumentMatcher<OnClickListener$RequestPermission>
	{
		private OnClickListener$RequestPermission requestPermission;
		
		public ArgumentMatcher$OnClickListener$RequestPermission(OnClickListener$RequestPermission requestPermission)
		{
			
			this.requestPermission = requestPermission;
		}
		
		@Override
		public boolean matches(Object argument)
		{
			if(argument instanceof OnClickListener$RequestPermission)
			{
				OnClickListener$RequestPermission other = (OnClickListener$RequestPermission) argument;
				return requestPermission.permission == other.permission;
			}
			else
			{
				return false;
			}
		}
	}
	
	@Test
	public void _permissionNotGranted_addListener$PermissionGranted$Unlock()
	{
		Permission permissionNotGranted = mock(Permission.class);
		when(permissionNotGranted.isGranted()).thenReturn(false);
		View viewLock = mock(View.class);
		View view = mock(View.class);
		Lock lock = new Lock(view, viewLock, permissionNotGranted);
		
		Listener$PermissionGranted$Unlock listener = new Listener$PermissionGranted$Unlock(lock.lockState);
		verify(permissionNotGranted).addListener(argThat(new ArgumentMatcher$Listener$PermissionGranted$Unlock(listener)));
	}
	
	private class ArgumentMatcher$Listener$PermissionGranted$Unlock
	extends ArgumentMatcher<com.jordan.betcher.siviso.sivisolite.home.lock.Listener$PermissionGranted$Unlock>
	{
		private Listener$PermissionGranted$Unlock requestPermission;
		
		public ArgumentMatcher$Listener$PermissionGranted$Unlock(Listener$PermissionGranted$Unlock requestPermission)
		{
			
			this.requestPermission = requestPermission;
		}
		
		@Override
		public boolean matches(Object argument)
		{
			if(argument instanceof Listener$PermissionGranted$Unlock)
			{
				Listener$PermissionGranted$Unlock other = (Listener$PermissionGranted$Unlock) argument;
				return requestPermission.lockState == other.lockState;
			}
			else
			{
				return false;
			}
		}
	}
	
}