package com.jordan.betcher.siviso.sivisolite.home.onoffview.lock;

import android.widget.Button;
import android.widget.Switch;

import com.jordan.betcher.siviso.sivisolite.home.lock.Lock;
import com.jordan.betcher.siviso.sivisolite.thirdparty.permissions.Permission$AccessNotificationPolicy;

public class Lock$OnOff extends Lock
{
	public Lock$OnOff(Switch viewOnOff, Button viewLock, Permission$AccessNotificationPolicy permission)
	{
		super(viewOnOff, viewLock, permission);
	}
}
