package com.jordan.betcher.siviso.sivisolite.home.editmap;

import android.widget.ToggleButton;

class EditMap
{
	public EditMap(
	ToggleButton toggleButton,
	OnToggle$ToggleMapEdit toggleMapEdit)
	{
		toggleButton.setOnClickListener(toggleMapEdit);
	}
}
