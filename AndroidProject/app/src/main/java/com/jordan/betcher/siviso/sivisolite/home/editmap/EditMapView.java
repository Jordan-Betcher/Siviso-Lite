package com.jordan.betcher.siviso.sivisolite.home.editmap;

import android.widget.ToggleButton;

import com.jordan.betcher.siviso.sivisolite.R;
import com.jordan.betcher.siviso.sivisolite.home.Activity_Home;
import com.jordan.betcher.siviso.sivisolite.home.mapview.map.Map;

public class EditMapView
{
	public EditMapView(Activity_Home activity_home, Map map)
	{
		ToggleButton toggleButton = activity_home.findViewById(R.id.buttonEditMap);
		OnToggle$ToggleMapEdit toggleMapEdit = new OnToggle$ToggleMapEdit(toggleButton, map);
		EditMap editMap = new EditMap(toggleButton, toggleMapEdit);
	}
}
