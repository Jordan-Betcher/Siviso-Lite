package com.jordan.betcher.siviso.sivisolite.home.editmap;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import android.widget.ToggleButton;

import com.jordan.betcher.siviso.sivisolite.home.mapview.map.Map;

import org.junit.Test;

public class Test$OnToggle$ToggleMapEdit
{
	@Test
	public void onClick_mapButtonToggled_mapEnableEdit()
	{
		boolean buttonToggled = true;
		Map map = mock(Map.class);
		ToggleButton toggleButton = mock(ToggleButton.class);
		when(toggleButton.isChecked()).thenReturn(buttonToggled);
		
		OnToggle$ToggleMapEdit toggleMapEdit = new OnToggle$ToggleMapEdit(toggleButton, map);
		
		verify(map, times(1)).setEditable(buttonToggled);
	}
}