package com.jordan.betcher.siviso.sivisolite.home.sivisolistview;

import com.jordan.betcher.siviso.sivisolite.home.mapview.map.Map;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class Test$OnClickListener$GoToCurrentLocation
{
	
	@Test
	public void __0MapGoToCurrentLocation()
	{
		Map map = mock(Map.class);
		
		OnClickListener$GoToCurrentLocation onClick = new OnClickListener$GoToCurrentLocation(map);
		
		verify(map, times(0)).goToCurrentLocation();
	}
	
	@Test
	public void onClick__mapGoToCurrentLocation()
	{
		Map map = mock(Map.class);
		
		OnClickListener$GoToCurrentLocation onClick = new OnClickListener$GoToCurrentLocation(map);
		onClick.onClick(null);
		
		verify(map, times(1)).goToCurrentLocation();
	}
}