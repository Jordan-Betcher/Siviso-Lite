package com.jordan.betcher.siviso.sivisolite.home.onoffview.onoff;

import android.widget.CompoundButton;

class OnCheck$PowerService implements CompoundButton.OnCheckedChangeListener
{
	private Service$Siviso service;
	
	public OnCheck$PowerService(Service$Siviso service)
	{
		this.service = service;
	}
	
	@Override
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
	{
		if(isChecked)
		{
			service.start();
		}
		else
		{
			service.stop();
		}
	}
}
