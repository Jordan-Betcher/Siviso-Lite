package com.jordan.betcher.siviso.sivisolite.service;

import androidx.annotation.NonNull;

import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;

class LocationCallback$Siviso extends LocationCallback
{
	private LocationChecker locationChecker;
	private RingmodeControl ringmodeControl;
	
	public LocationCallback$Siviso(LocationChecker locationChecker, RingmodeControl ringmodeControl)
	{
		this.locationChecker = locationChecker;
		this.ringmodeControl = ringmodeControl;
	}
	
	@Override
	public void onLocationResult(
	@NonNull LocationResult locationResult)
	{
		if(locationChecker.isInHome(locationResult.getLastLocation()))
		{
			ringmodeControl.home();
		}
		else
		{
			ringmodeControl.defaultt();
		}
	}
}
