package com.jordan.betcher.siviso.sivisolite.home;

import android.content.res.Resources;
import android.location.LocationManager;
import android.widget.Button;
import android.widget.FrameLayout;

import com.google.android.gms.maps.SupportMapFragment;
import com.jordan.betcher.siviso.sivisolite.home.Database.Database;
import com.jordan.betcher.siviso.sivisolite.home.mapview.lock.Lock$Map;
import com.jordan.betcher.siviso.sivisolite.home.mapview.map.SetupMap;
import com.jordan.betcher.siviso.sivisolite.thirdparty.permissions.Permission$AccessFineLocation;


class MapView
{
	Lock$Map lock;
	SetupMap setupMap;
	
	public MapView(
	SupportMapFragment supportMapFragment, LocationManager locationManager,
	FrameLayout mapVisibility, Button viewLock,
	Permission$AccessFineLocation permission, Database database, Resources resources)
	{
		lock = new Lock$Map(mapVisibility, viewLock, permission);
		setupMap = new SetupMap(supportMapFragment, locationManager, database.homee(), resources, permission);
	}
}
