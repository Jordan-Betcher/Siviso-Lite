package com.jordan.betcher.siviso.sivisolite.thirdparty.locationManager;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class Test$Event
{
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