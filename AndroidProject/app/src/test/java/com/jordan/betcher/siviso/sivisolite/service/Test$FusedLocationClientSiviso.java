package com.jordan.betcher.siviso.sivisolite.service;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class Test$FusedLocationClientSiviso
{
	@Test
	public void __FusedLocationClientSivisoNotNull()
	{
		Service_Siviso serviceSiviso = mock(Service_Siviso.class);
		
		FusedLocationClientSiviso handler = new FusedLocationClientSiviso(serviceSiviso);
		
		FusedLocationClient$Siviso client = handler.client;
		assertNotNull(client);
	}
	
	@Test
	public void start__LocationCallbackStart()
	{
		Service_Siviso serviceSiviso = mock(Service_Siviso.class);
		FusedLocationClient$Siviso client = mock(FusedLocationClient$Siviso.class);
		
		FusedLocationClientSiviso handler = new FusedLocationClientSiviso(serviceSiviso);
		handler.client = client;
		handler.start();
		
		verify(client, times(1)).start();
	}
	
	@Test
	public void stop__LocationCallbackStop()
	{
		Service_Siviso serviceSiviso = mock(Service_Siviso.class);
		FusedLocationClient$Siviso client = mock(FusedLocationClient$Siviso.class);
		
		FusedLocationClientSiviso handler = new FusedLocationClientSiviso(serviceSiviso);
		handler.client = client;
		handler.stop();
		
		verify(client, times(1)).stop();
	}
}