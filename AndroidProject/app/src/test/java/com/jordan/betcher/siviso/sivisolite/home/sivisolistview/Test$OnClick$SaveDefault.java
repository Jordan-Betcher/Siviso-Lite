package com.jordan.betcher.siviso.sivisolite.home.sivisolistview;

import com.jordan.betcher.siviso.sivisolite.home.Database.Store$Default;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class Test$OnClick$SaveDefault
{
	@Test
	public void onItemSelected_1_SaveDefaultSiviso1()
	{
		int sivisoPosition = 1;
		Store$Default storage$Default = mock(Store$Default.class);
		OnClick$SaveDefault onClick = new OnClick$SaveDefault(storage$Default);
		onClick.onItemSelected(null, null, sivisoPosition, 0);
		
		verify(storage$Default).saveSiviso(sivisoPosition);
	}
	
	@Test
	public void onItemSelected_0_SaveDefaultSiviso0()
	{
		int sivisoPosition = 0;
		Store$Default storage$Default = mock(Store$Default.class);
		OnClick$SaveDefault onClick = new OnClick$SaveDefault(storage$Default);
		onClick.onItemSelected(null, null, sivisoPosition, 0);
		
		verify(storage$Default).saveSiviso(sivisoPosition);
	}
}