package com.jordan.betcher.siviso.sivisolite.service;

import android.content.Context;

import com.jordan.betcher.siviso.sivisolite.home.Database.Preferences$ServiceRunning;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class Test$ServiceSiviso
{
	/**
	 * Stop
	 *  Stop Self
	 *
	 * onBind
	 *  Return null
	 * onStartCommand
	 *  add listener to location manager
	 * destroy
	 *  remove listener from location manager
	 */
	
	@Test
	public void __noStopService()
	{
		Context context = mock(Context.class);
		Intent$Service$Siviso serviceSiviso = mock(Intent$Service$Siviso.class);
		Preferences$ServiceRunning serviceRunning = mock(Preferences$ServiceRunning.class);
		
		ServiceSiviso service = new ServiceSiviso(context, serviceRunning, serviceSiviso);
		
		verify(context, times(0)).stopService(serviceSiviso);
	}
	
	@Test
	public void stop__stopService()
	{
		Context context = mock(Context.class);
		Intent$Service$Siviso serviceSiviso = mock(Intent$Service$Siviso.class);
		Preferences$ServiceRunning serviceRunning = mock(Preferences$ServiceRunning.class);
		
		ServiceSiviso service = new ServiceSiviso(context, serviceRunning, serviceSiviso);
		service.stop();
		
		verify(context, times(1)).stopService(serviceSiviso);
	}
	
	@Test
	public void start_serviceRunningTrue_notStartService()
	{
		Context context = mock(Context.class);
		Intent$Service$Siviso serviceSiviso = mock(Intent$Service$Siviso.class);
		Preferences$ServiceRunning serviceRunning = mock(Preferences$ServiceRunning.class);
		when(serviceRunning.isTrue()).thenReturn(true);
		
		ServiceSiviso service = new ServiceSiviso(context, serviceRunning, serviceSiviso);
		service.start();
		
		verify(context, times(0)).startService(serviceSiviso);
	}
	
	@Test
	public void __notStartService()
	{
		Context context = mock(Context.class);
		Intent$Service$Siviso serviceSiviso = mock(Intent$Service$Siviso.class);
		Preferences$ServiceRunning serviceRunning = mock(Preferences$ServiceRunning.class);
		
		ServiceSiviso service = new ServiceSiviso(context, serviceRunning, serviceSiviso);
		
		verify(context, times(0)).startService(serviceSiviso);
	}
	
	@Test
	public void start_serviceRunningFalse_startService()
	{
		Context context = mock(Context.class);
		Intent$Service$Siviso serviceSiviso = mock(Intent$Service$Siviso.class);
		Preferences$ServiceRunning serviceRunning = mock(Preferences$ServiceRunning.class);
		when(serviceRunning.isTrue()).thenReturn(false);
		
		ServiceSiviso service = new ServiceSiviso(context, serviceRunning, serviceSiviso);
		service.start();
		
		verify(context, times(1)).startService(serviceSiviso);
	}
	
	@Test
	public void __noCallSetFalse()
	{
		Context context = mock(Context.class);
		Preferences$ServiceRunning serviceRunning = mock(Preferences$ServiceRunning.class);
		Intent$Service$Siviso serviceSiviso = mock(Intent$Service$Siviso.class);
		
		ServiceSiviso service = new ServiceSiviso(context, serviceRunning, serviceSiviso);
		
		verify(serviceRunning, times(0)).setFalse();
	}
	
	@Test
	public void stop__CallSetFalse()
	{
		Context context = mock(Context.class);
		Preferences$ServiceRunning serviceRunning = mock(Preferences$ServiceRunning.class);
		Intent$Service$Siviso serviceSiviso = mock(Intent$Service$Siviso.class);
		
		ServiceSiviso service = new ServiceSiviso(context, serviceRunning, serviceSiviso);
		service.stop();
		
		verify(serviceRunning, times(1)).setFalse();
	}
	
	@Test
	public void _serviceRunningFalse_noCallSetTrue()
	{
		Context context = mock(Context.class);
		Preferences$ServiceRunning serviceRunning = mock(Preferences$ServiceRunning.class);
		Intent$Service$Siviso serviceSiviso = mock(Intent$Service$Siviso.class);
		when(serviceRunning.isTrue()).thenReturn(false);
		
		ServiceSiviso service = new ServiceSiviso(context, serviceRunning, serviceSiviso);
		
		verify(serviceRunning, times(0)).setTrue();
	}
	
	@Test
	public void start_serviceRunningTrue_noCallSetTrue()
	{
		Context context = mock(Context.class);
		Preferences$ServiceRunning serviceRunning = mock(Preferences$ServiceRunning.class);
		Intent$Service$Siviso serviceSiviso = mock(Intent$Service$Siviso.class);
		when(serviceRunning.isTrue()).thenReturn(true);
		
		ServiceSiviso service = new ServiceSiviso(context, serviceRunning, serviceSiviso);
		service.start();
		
		verify(serviceRunning, times(0)).setTrue();
	}
	
	@Test
	public void start_serviceRunningFalse_CallSetTrue()
	{
		Context context = mock(Context.class);
		Preferences$ServiceRunning serviceRunning = mock(Preferences$ServiceRunning.class);
		Intent$Service$Siviso serviceSiviso = mock(Intent$Service$Siviso.class);
		when(serviceRunning.isTrue()).thenReturn(false);
		
		ServiceSiviso service = new ServiceSiviso(context, serviceRunning, serviceSiviso);
		service.start();
		
		verify(serviceRunning, times(1)).setTrue();
	}
}