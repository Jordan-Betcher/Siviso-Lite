package com.jordan.betcher.siviso.sivisolite.home.editmap;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import android.widget.ToggleButton;

import org.junit.Test;

public class Test$EditMap
{
	@Test
	public void _toggleButtonClickListener_setClickListener()
	{
		ToggleButton toggleButton = mock(ToggleButton.class);
		OnToggle$ToggleMapEdit toggleMapEdit = mock(OnToggle$ToggleMapEdit.class);
		
		EditMap editMap = new EditMap(toggleButton, toggleMapEdit);
		
		verify(toggleButton, times(1)).setOnClickListener(toggleMapEdit);
	}
}