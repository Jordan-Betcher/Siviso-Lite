package com.jordan.betcher.siviso.sivisolite.home.onoffview;

import android.widget.Button;

import androidx.appcompat.widget.SwitchCompat;

import com.jordan.betcher.siviso.sivisolite.home.lock.Lock;
import com.jordan.betcher.siviso.sivisolite.thirdparty.permissions.Permission$AccessNotificationPolicy;

public class Lock$OnOff extends Lock
{
	public Lock$OnOff(SwitchCompat viewOnOff, Button viewLock, Permission$AccessNotificationPolicy permission)
	{
		super(viewOnOff, viewLock, permission);
	}
}
