package com.jordan.betcher.siviso.sivisolite.home.onoffview.onoff;

import android.widget.CompoundButton;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class Test$OnCheck$PowerService
{
	@Test
	public void onCheckedChanged_false_startNotCalled()
	{
		Service$Siviso service = mock(Service$Siviso.class);
		OnCheck$PowerService powerService = new OnCheck$PowerService(service);
		
		powerService.onCheckedChanged(mock(CompoundButton.class), false);
		
		verify(service, times(0)).start();
	}
	
	@Test
	public void onCheckedChanged_true_stopNotCalled()
	{
		Service$Siviso service = mock(Service$Siviso.class);
		OnCheck$PowerService powerService = new OnCheck$PowerService(service);
		
		powerService.onCheckedChanged(mock(CompoundButton.class), true);
		
		verify(service, times(0)).stop();
	}
	
	@Test
	public void onCheckedChanged_false_serviceStop()
	{
		Service$Siviso service = mock(Service$Siviso.class);
		OnCheck$PowerService powerService = new OnCheck$PowerService(service);
		
		powerService.onCheckedChanged(mock(CompoundButton.class), false);
		
		verify(service, times(1)).stop();
	}
	
	@Test
	public void onCheckedChanged_true_serviceStart()
	{
		Service$Siviso service = mock(Service$Siviso.class);
		OnCheck$PowerService powerService = new OnCheck$PowerService(service);
		
		powerService.onCheckedChanged(mock(CompoundButton.class), true);
		
		verify(service, times(1)).start();
	}
}