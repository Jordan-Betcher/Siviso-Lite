package com.jordan.betcher.siviso.sivisolite.home;

import android.content.Context;
import android.widget.Switch;

import com.jordan.betcher.siviso.sivisolite.home.Database.Database;
import com.jordan.betcher.siviso.sivisolite.home.onoffview.lock.Lock$OnOff;
import com.jordan.betcher.siviso.sivisolite.home.onoffview.onoff.OnOff;

class OnOffView
{
	OnOff onOff;
	Lock$OnOff lock;
	
	public OnOffView(Context context, Switch onOffSwitch, Database database)
	{
		onOff = new OnOff(context, onOffSwitch, database.isOnn());
		lock = new Lock$OnOff();
	}
}
