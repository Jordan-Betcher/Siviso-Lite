package com.jordan.betcher.siviso.sivisolite.thirdparty.locationManager;

import static org.mockito.Mockito.*;

import org.junit.Test;

public class Test$EventOnce
{
	@Test
	public void callCall_0On_1on0()
	{
		int number = 0;
		On<Integer> on = mock(On.class);
		
		EventOnce<Integer> event = new EventOnce<>();
		event.add(on);
		event.call(number);
		event.call(number);
		
		verify(on, times(1)).call(number);
	}
	
	@Test
	public void call_0On1On2_on20()
	{
		int number = 0;
		On<Integer> on1 = mock(On.class);
		On<Integer> on2 = mock(On.class);
		
		EventOnce<Integer> event = new EventOnce<>();
		event.add(on1);
		event.add(on2);
		event.call(number);
		
		verify(on2, times(1)).call(number);
	}

	@Test
	public void call_0On1On2_on10()
	{
		int number = 0;
		On<Integer> on1 = mock(On.class);
		On<Integer> on2 = mock(On.class);
		
		EventOnce<Integer> event = new EventOnce<>();
		event.add(on1);
		event.add(on2);
		event.call(number);
		
		verify(on1, times(1)).call(number);
	}
	
	@Test
	public void call_0On_on0()
	{
		int number = 0;
		On<Integer> on = mock(On.class);
		
		EventOnce<Integer> event = new EventOnce<>();
		event.add(on);
		event.call(number);
		
		verify(on, times(1)).call(number);
	}
}