package com.jordan.betcher.siviso.sivisolite.permissions;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class Test$Permission
{
	@Test
	public void callListenersPermissionGranted_addListener_listenerCalled()
	{
		Permission permission = mock(Permission.class, Mockito.CALLS_REAL_METHODS);
		permission.listeners = new ArrayList<>();
		Listener fakeListener = mock(Listener.class);
		when(permission.isGranted()).thenReturn(true);
		
		permission.addListener_PermissionGranted(fakeListener);
		permission.callListeners_PermissionGranted();
		
		verify(fakeListener, times(1)).call();
	}
	
	@Test
	public void callListenersPermissionGranted_add2Listeners_allListenersCalled()
	{
		Permission permission = mock(Permission.class, Mockito.CALLS_REAL_METHODS);
		permission.listeners = new ArrayList<>();
		Listener fakeListener1 = mock(Listener.class);
		Listener fakeListener2 = mock(Listener.class);
		when(permission.isGranted()).thenReturn(true);
		
		permission.addListener_PermissionGranted(fakeListener1);
		permission.addListener_PermissionGranted(fakeListener2);
		permission.callListeners_PermissionGranted();
		
		verify(fakeListener1, times(1)).call();
		verify(fakeListener2, times(1)).call();
	}
	
	@Test
	public void callListenersPermissionGranted_permissionNotGranted_listenerNotCalled()
	{
		Permission permission = mock(Permission.class, Mockito.CALLS_REAL_METHODS);
		permission.listeners = new ArrayList<>();
		Listener fakeListener = mock(Listener.class);
		when(permission.isGranted()).thenReturn(false);
		
		permission.addListener_PermissionGranted(fakeListener);
		permission.callListeners_PermissionGranted();
		
		verify(fakeListener, times(0)).call();
	}
}