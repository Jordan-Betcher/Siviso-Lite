package com.jordan.betcher.siviso.sivisolite.home.onoffview;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import android.widget.CompoundButton;

import com.jordan.betcher.siviso.sivisolite.service.ServiceSiviso;

import org.junit.Test;

public class Test$OnCheck$PowerService
{
	@Test
	public void onCheckedChanged_false_startNotCalled()
	{
		ServiceSiviso service = mock(ServiceSiviso.class);
		OnCheck$PowerService powerService = new OnCheck$PowerService(service);
		
		powerService.onCheckedChanged(mock(CompoundButton.class), false);
		
		verify(service, times(0)).start();
	}
	
	@Test
	public void onCheckedChanged_true_stopNotCalled()
	{
		ServiceSiviso service = mock(ServiceSiviso.class);
		OnCheck$PowerService powerService = new OnCheck$PowerService(service);
		
		powerService.onCheckedChanged(mock(CompoundButton.class), true);
		
		verify(service, times(0)).stop();
	}
	
	@Test
	public void onCheckedChanged_false_serviceStop()
	{
		ServiceSiviso service = mock(ServiceSiviso.class);
		OnCheck$PowerService powerService = new OnCheck$PowerService(service);
		
		powerService.onCheckedChanged(mock(CompoundButton.class), false);
		
		verify(service, times(1)).stop();
	}
	
	@Test
	public void onCheckedChanged_true_serviceStart()
	{
		ServiceSiviso service = mock(ServiceSiviso.class);
		OnCheck$PowerService powerService = new OnCheck$PowerService(service);
		
		powerService.onCheckedChanged(mock(CompoundButton.class), true);
		
		verify(service, times(1)).start();
	}
}