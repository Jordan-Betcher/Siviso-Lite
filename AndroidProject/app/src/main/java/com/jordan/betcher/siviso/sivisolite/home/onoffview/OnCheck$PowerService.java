package com.jordan.betcher.siviso.sivisolite.home.onoffview;

import android.widget.CompoundButton;

import com.jordan.betcher.siviso.sivisolite.service.ServiceSiviso;

class OnCheck$PowerService implements CompoundButton.OnCheckedChangeListener
{
	private ServiceSiviso service;
	
	public OnCheck$PowerService(ServiceSiviso service)
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
