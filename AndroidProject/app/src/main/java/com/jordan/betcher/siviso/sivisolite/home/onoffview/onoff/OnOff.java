package com.jordan.betcher.siviso.sivisolite.home.onoffview.onoff;

import android.widget.Switch;

public class OnOff
{
	public OnOff(Switch onOffSwitch, StoreBoolean isOnOff)
	{
		onOffSwitch.setChecked(isOnOff.isOn());
		onOffSwitch.setOnCheckedChangeListener(new OnCheck$PowerService());
	}
}
