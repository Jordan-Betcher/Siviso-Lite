package com.jordan.betcher.siviso.sivisolite.home.onoffview;

import android.widget.Button;

import androidx.appcompat.widget.SwitchCompat;

import com.jordan.betcher.siviso.sivisolite.home.lock.A_Lock;
import com.jordan.betcher.siviso.sivisolite.thirdparty.permissions.Permission$AccessNotificationPolicy;

public class Lock$OnOff extends A_Lock
{
	public Lock$OnOff(SwitchCompat viewOnOff, Button viewLock, Permission$AccessNotificationPolicy permission)
	{
		super(viewOnOff, viewLock, permission);
	}
}
