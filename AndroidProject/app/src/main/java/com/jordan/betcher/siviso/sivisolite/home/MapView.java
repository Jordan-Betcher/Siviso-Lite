package com.jordan.betcher.siviso.sivisolite.home;

import android.content.res.Resources;
import android.location.LocationManager;
import android.widget.Button;

import com.google.android.gms.maps.SupportMapFragment;
import com.jordan.betcher.siviso.sivisolite.home.Database.Database;
import com.jordan.betcher.siviso.sivisolite.home.mapview.lock.Lock$Map;
import com.jordan.betcher.siviso.sivisolite.home.mapview.map.Map;
import com.jordan.betcher.siviso.sivisolite.thirdparty.permissions.Permission$AccessFineLocation;


class MapView
{
	Lock$Map lock;
	Map map;
	
	public MapView(SupportMapFragment supportMapFragment, LocationManager locationManager, Button viewLock, Permission$AccessFineLocation permission, Database database, Resources resources)
	{
		lock = new Lock$Map(supportMapFragment, viewLock, permission);
		map = new Map(supportMapFragment, locationManager, database, resources, permission);
	}
}
