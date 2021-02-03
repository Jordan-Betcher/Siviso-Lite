package com.jordan.betcher.siviso.sivisolite.home.sivisolistview;

import com.jordan.betcher.siviso.sivisolite.home.Database.Storage$Default;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class Test$OnClick$SaveDefault
{
	//on click save to database default siviso
	
	@Test
	public void onItemSelected_1_SaveDefaultSiviso1()
	{
		int sivisoPosition = 1;
		Storage$Default storage$Default = mock(Storage$Default.class);
		OnClick$SaveDefault onClick = new OnClick$SaveDefault(storage$Default);
		onClick.onItemSelected(null, null, sivisoPosition, 0);
		
		verify(storage$Default).saveDefaultSiviso(sivisoPosition);
	}
	
	@Test
	public void onItemSelected_0_SaveDefaultSiviso0()
	{
		int sivisoPosition = 0;
		Storage$Default storage$Default = mock(Storage$Default.class);
		OnClick$SaveDefault onClick = new OnClick$SaveDefault(storage$Default);
		onClick.onItemSelected(null, null, sivisoPosition, 0);
		
		verify(storage$Default).saveDefaultSiviso(sivisoPosition);
	}
}