package com.jordan.betcher.siviso.sivisolite.home.mapview.lock;

import android.view.View;
import android.widget.FrameLayout;

import com.jordan.betcher.siviso.sivisolite.home.lock.Lock;
import com.jordan.betcher.siviso.sivisolite.thirdparty.permissions.Permission$AccessFineLocation;

public class Lock$Map extends Lock
{
	public Lock$Map(FrameLayout mapVisibility, View lock, Permission$AccessFineLocation permission)
	{
		super(mapVisibility, lock, permission);
	}
}
