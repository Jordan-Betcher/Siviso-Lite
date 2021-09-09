package com.jordan.betcher.siviso.sivisolite.home.editmap;

import android.view.View;
import android.widget.ToggleButton;

import com.jordan.betcher.siviso.sivisolite.home.mapview.map.Map;

class OnToggle$ToggleMapEdit implements View.OnClickListener
{
	public OnToggle$ToggleMapEdit(ToggleButton toggleButton, Map map)
	{
		map.setEditable(toggleButton.isChecked());
	}
	
	@Override
	public void onClick(View view)
	{
	
	}
	//TODO
}
