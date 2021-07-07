package com.jordan.betcher.siviso.sivisolite.home;

import android.content.Context;
import android.content.res.Resources;
import android.location.LocationManager;
import android.widget.Button;
import android.widget.FrameLayout;

import com.google.android.gms.maps.SupportMapFragment;
import com.jordan.betcher.siviso.sivisolite.R;
import com.jordan.betcher.siviso.sivisolite.home.Database.Database;
import com.jordan.betcher.siviso.sivisolite.home.mapview.lock.Lock$Map;
import com.jordan.betcher.siviso.sivisolite.home.mapview.map.Map;
import com.jordan.betcher.siviso.sivisolite.home.mapview.map.SetupMap;
import com.jordan.betcher.siviso.sivisolite.thirdparty.permissions.Permission$AccessFineLocation;


class MapView
{
	public MapView(Activity_Home activity, Permission$AccessFineLocation permission, Database database, Map map)
	{
		SupportMapFragment supportMapFragment = (SupportMapFragment)activity.getSupportFragmentManager().findFragmentById(R.id.map);
		LocationManager locationManager = (LocationManager)activity.getSystemService(
		Context.LOCATION_SERVICE);
		Button mapLock = activity.findViewById(R.id.mapLock);
		FrameLayout mapVisibility = activity.findViewById(R.id.mapFrameLayout);
		Resources resources = activity.getResources();
		
		new Lock$Map(mapVisibility, mapLock, permission);
		new SetupMap(supportMapFragment, locationManager, database.homee(), resources, permission);
	}
}
