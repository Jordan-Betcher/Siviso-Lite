package com.jordan.betcher.siviso.sivisolite.home.sivisolistview;

import com.jordan.betcher.siviso.sivisolite.home.Database.StoreSiviso$Default;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class Test$OnClick$Save
{
	@Test
	public void onItemSelected_1_SaveSiviso1()
	{
		int sivisoPosition = 1;
		StoreSiviso$Default storage$Default = mock(StoreSiviso$Default.class);
		OnClick$Save onClick = new OnClick$Save(storage$Default);
		onClick.onItemSelected(null, null, sivisoPosition, 0);
		
		verify(storage$Default).saveSiviso(sivisoPosition);
	}
	
	@Test
	public void onItemSelected_0_SaveSiviso0()
	{
		int sivisoPosition = 0;
		StoreSiviso$Default storage$Default = mock(StoreSiviso$Default.class);
		OnClick$Save onClick = new OnClick$Save(storage$Default);
		onClick.onItemSelected(null, null, sivisoPosition, 0);
		
		verify(storage$Default).saveSiviso(sivisoPosition);
	}
}