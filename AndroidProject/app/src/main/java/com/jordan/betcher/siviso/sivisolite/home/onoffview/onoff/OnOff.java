package com.jordan.betcher.siviso.sivisolite.home.onoffview.onoff;

import android.content.Context;
import android.widget.Switch;

import com.jordan.betcher.siviso.sivisolite.home.Database.StoreBoolean;
import com.jordan.betcher.siviso.sivisolite.service.Intent$Service$Siviso;
import com.jordan.betcher.siviso.sivisolite.service.ServiceSiviso;

public class OnOff
{
	public OnOff(Context context, Switch onOffSwitch, StoreBoolean isOnOff)
	{
		onOffSwitch.setChecked(isOnOff.isTrue());
		
		Intent$Service$Siviso intent = new Intent$Service$Siviso(context);
		ServiceSiviso service = new ServiceSiviso(context, isOnOff, intent);
		OnCheck$PowerService powerService = new OnCheck$PowerService(service);
		onOffSwitch.setOnCheckedChangeListener(powerService);
	}
}
