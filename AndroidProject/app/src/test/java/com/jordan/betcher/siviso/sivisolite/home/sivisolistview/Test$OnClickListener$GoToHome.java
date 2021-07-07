package com.jordan.betcher.siviso.sivisolite.home.sivisolistview;

import com.jordan.betcher.siviso.sivisolite.home.mapview.map.Map;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class Test$OnClickListener$GoToHome
{
	
	@Test
	public void __0MapGoToHome()
	{
		Map map = mock(Map.class);
		
		OnClickListener$GoToHome onClick = new OnClickListener$GoToHome(map);
		
		verify(map, times(0)).goToHome();
	}
	
	@Test
	public void onClick__mapGoToHome()
	{
		Map map = mock(Map.class);
		
		OnClickListener$GoToHome onClick = new OnClickListener$GoToHome(map);
		onClick.onClick(null);
		
		verify(map, times(1)).goToHome();
	}
}