package com.jordan.betcher.siviso.sivisolite.home.onoffview;

import android.widget.Button;

import androidx.appcompat.widget.SwitchCompat;

import com.jordan.betcher.siviso.sivisolite.R;
import com.jordan.betcher.siviso.sivisolite.home.Activity_Home;
import com.jordan.betcher.siviso.sivisolite.home.Database.Database;
import com.jordan.betcher.siviso.sivisolite.home.Database.Preferences$ServiceRunning;
import com.jordan.betcher.siviso.sivisolite.service.Intent$Service$Siviso;
import com.jordan.betcher.siviso.sivisolite.service.ServiceSiviso;
import com.jordan.betcher.siviso.sivisolite.thirdparty.permissions.Permission$AccessNotificationPolicy;

public class OnOffView
{
	SwitchCompat onOffSwitch;
	private Activity_Home activity;
	
	public OnOffView(
	Activity_Home activity,
	Permission$AccessNotificationPolicy permission, Database database)
	{
		onOffSwitch = activity.findViewById(R.id.switchOnOff);
		this.activity = activity;
		createOnOff(database.isOnn());
		createOnOffLock(permission);
	}
	
	private void createOnOffLock(
	Permission$AccessNotificationPolicy permission)
	{
		Button onOffLock = activity.findViewById(R.id.onOffLock);
		new Lock$OnOff(onOffSwitch, onOffLock, permission);
	}
	
	private void createOnOff(
	Preferences$ServiceRunning isOnOff)
	{
		onOffSwitch.setChecked(isOnOff.isTrue());
		
		Intent$Service$Siviso intent = new Intent$Service$Siviso(activity);
		ServiceSiviso service = new ServiceSiviso(activity, isOnOff, intent);
		OnCheck$PowerService powerService = new OnCheck$PowerService(service);
		onOffSwitch.setOnCheckedChangeListener(powerService);
	}
}
