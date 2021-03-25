package com.jordan.betcher.siviso.sivisolite.home;

import android.content.Context;
import android.widget.Button;
import android.widget.Switch;

import com.jordan.betcher.siviso.sivisolite.home.Database.Database;
import com.jordan.betcher.siviso.sivisolite.home.onoffview.lock.Lock$OnOff;
import com.jordan.betcher.siviso.sivisolite.home.onoffview.onoff.OnOff;
import com.jordan.betcher.siviso.sivisolite.thirdparty.permissions.Permission$AccessNotificationPolicy;

class OnOffView
{
	OnOff onOff;
	Lock$OnOff lock;
	
	public OnOffView(Context context, Switch onOffSwitch, Button onOffLock, Permission$AccessNotificationPolicy permission, Database database)
	{
		onOff = new OnOff(context, onOffSwitch, database.isOnn());
		lock = new Lock$OnOff(onOffSwitch, onOffLock, permission);
	}
}
