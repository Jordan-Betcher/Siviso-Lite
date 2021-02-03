package com.jordan.betcher.siviso.sivisolite.home.sivisolistview;

import com.jordan.betcher.siviso.sivisolite.home.Database.Store$Default;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class Test$OnClick$Save
{
	@Test
	public void onItemSelected_1_SaveSiviso1()
	{
		int sivisoPosition = 1;
		Store$Default storage$Default = mock(Store$Default.class);
		OnClick$Save onClick = new OnClick$Save(storage$Default);
		onClick.onItemSelected(null, null, sivisoPosition, 0);
		
		verify(storage$Default).saveSivisoIndex(sivisoPosition);
	}
	
	@Test
	public void onItemSelected_0_SaveSiviso0()
	{
		int sivisoPosition = 0;
		Store$Default storage$Default = mock(Store$Default.class);
		OnClick$Save onClick = new OnClick$Save(storage$Default);
		onClick.onItemSelected(null, null, sivisoPosition, 0);
		
		verify(storage$Default).saveSivisoIndex(sivisoPosition);
	}
}