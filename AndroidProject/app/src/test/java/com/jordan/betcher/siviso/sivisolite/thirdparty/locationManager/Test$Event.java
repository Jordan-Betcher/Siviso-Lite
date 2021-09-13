package com.jordan.betcher.siviso.sivisolite.thirdparty.locationManager;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class Test$Event
{
	@Test
	public void call_0On1On2_on10()
	{
		int number = 0;
		On<Integer> on1 = mock(On.class);
		On<Integer> on2 = mock(On.class);
		
		Event<Integer> event = new Event<>();
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
		
		Event<Integer> event = new Event<>();
		event.add(on);
		event.call(number);
		
		verify(on, times(1)).call(number);
	}
}