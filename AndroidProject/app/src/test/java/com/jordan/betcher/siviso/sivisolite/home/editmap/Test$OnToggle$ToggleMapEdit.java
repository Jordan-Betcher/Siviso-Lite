package com.jordan.betcher.siviso.sivisolite.home.editmap;

import static org.mockito.Mockito.*;

import android.widget.ToggleButton;

import com.jordan.betcher.siviso.sivisolite.home.Database.StoreSiviso$Home;
import com.jordan.betcher.siviso.sivisolite.home.mapview.map.Map;

import org.junit.Test;

public class Test$OnToggle$ToggleMapEdit
{
	@Test
	public void _homeIsLocationTrue_toggleIsCheckedFalse()
	{
		boolean isLocation = true;
		StoreSiviso$Home home = mock(StoreSiviso$Home.class);
		Map map = mock(Map.class);
		ToggleButton toggleButton = mock(ToggleButton.class);
		when(home.isLocation()).thenReturn(isLocation);
		
		new OnToggle$ToggleMapEdit(toggleButton, map, home);
		
		verify(toggleButton, times(1)).setChecked(!isLocation);
	}
	
	@Test
	public void __0mapEditable()
	{
		Map map = mock(Map.class);
		ToggleButton toggleButton = mock(ToggleButton.class);
		
		new OnToggle$ToggleMapEdit(toggleButton, map, mock(StoreSiviso$Home.class));
		
		verify(map, times(0)).setEditable(anyBoolean());
	}
	
	@Test
	public void onClick_mapButtonNotToggled_mapEditableFalse()
	{
		boolean buttonToggled = false;
		Map map = mock(Map.class);
		ToggleButton toggleButton = mock(ToggleButton.class);
		when(toggleButton.isChecked()).thenReturn(buttonToggled);
		
		OnToggle$ToggleMapEdit toggleMapEdit = new OnToggle$ToggleMapEdit(toggleButton, map, mock(
		StoreSiviso$Home.class));
		toggleMapEdit.onClick(null);
		
		verify(map, times(1)).setEditable(buttonToggled);
	}
	
	@Test
	public void onClick_mapButtonToggled_mapEditableTrue()
	{
		boolean buttonToggled = true;
		Map map = mock(Map.class);
		ToggleButton toggleButton = mock(ToggleButton.class);
		when(toggleButton.isChecked()).thenReturn(buttonToggled);
		
		OnToggle$ToggleMapEdit toggleMapEdit = new OnToggle$ToggleMapEdit(toggleButton, map, mock(
		StoreSiviso$Home.class));
		toggleMapEdit.onClick(null);
		
		verify(map, times(1)).setEditable(buttonToggled);
	}
}