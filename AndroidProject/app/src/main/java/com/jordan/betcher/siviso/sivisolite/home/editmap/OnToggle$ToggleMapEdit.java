package com.jordan.betcher.siviso.sivisolite.home.editmap;

import android.view.View;
import android.widget.ToggleButton;

import com.jordan.betcher.siviso.sivisolite.home.mapview.map.Map;

class OnToggle$ToggleMapEdit implements View.OnClickListener
{
	private ToggleButton toggleButton;
	private Map map;
	
	public OnToggle$ToggleMapEdit(ToggleButton toggleButton, Map map)
	{
		//TODO set toggleButton to be the inverse of database.storehomee.islocation
		this.toggleButton = toggleButton;
		this.map = map;
	}
	
	@Override
	public void onClick(View view)
	{
		map.setEditable(toggleButton.isChecked());
	}
}
