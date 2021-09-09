package com.jordan.betcher.siviso.sivisolite.home.Database;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class Test$SivisoChangeEvent
{
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