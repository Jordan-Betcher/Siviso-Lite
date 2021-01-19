package com.jordan.betcher.siviso.sivisolite.home.mapview.lock;

import android.view.View;

import com.google.android.gms.maps.SupportMapFragment;
import com.jordan.betcher.siviso.sivisolite.home.lock.Lock;
import com.jordan.betcher.siviso.sivisolite.thirdparty.permissions.Permission$AccessFineLocation;

public class Lock$Map extends Lock
{
	public Lock$Map(SupportMapFragment map, View lock, Permission$AccessFineLocation permission)
	{
		super(map.getView(), lock, permission);
	}
}
