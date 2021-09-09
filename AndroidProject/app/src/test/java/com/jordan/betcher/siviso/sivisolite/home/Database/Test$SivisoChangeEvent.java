package com.jordan.betcher.siviso.sivisolite.home.Database;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class Test$SivisoChangeEvent
{
	
	@Test
	public void callOnSivisoChanges_onSivisoChange1onSivisoChange2_callOnSivisoChange1()
	{
		OnSivisoChange onSivisoChange1 = mock(OnSivisoChange.class);
		OnSivisoChange onSivisoChange2 = mock(OnSivisoChange.class);
		
		SivisoChangeEvent sivisoChangeEvent = new SivisoChangeEvent();
		sivisoChangeEvent.addOnSivisoChange(onSivisoChange1);
		sivisoChangeEvent.addOnSivisoChange(onSivisoChange2);
		sivisoChangeEvent.callOnSivisoChanges();
		
		verify(onSivisoChange1, times(1)).sivisoChanged();
	}
	
	@Test
	public void _onSivisoChange_0callOnSivisoChange()
	{
		OnSivisoChange onSivisoChange = mock(OnSivisoChange.class);
		
		SivisoChangeEvent sivisoChangeEvent = new SivisoChangeEvent();
		sivisoChangeEvent.addOnSivisoChange(onSivisoChange);
		
		verify(onSivisoChange, times(0)).sivisoChanged();
	}
	
	@Test
	public void callOnSivisoChanges_onSivisoChange_callOnSivisoChange()
	{
		OnSivisoChange onSivisoChange = mock(OnSivisoChange.class);
		
		SivisoChangeEvent sivisoChangeEvent = new SivisoChangeEvent();
		sivisoChangeEvent.addOnSivisoChange(onSivisoChange);
		sivisoChangeEvent.callOnSivisoChanges();
		
		verify(onSivisoChange, times(1)).sivisoChanged();
	}
}