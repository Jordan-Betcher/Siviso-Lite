package com.jordan.betcher.siviso.sivisolite.home.mapview.map;

import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.MapCreator;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.OnMapReady;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.Wrapper$Map;
import com.jordan.betcher.siviso.sivisolite.thirdparty.permissions.OnPermissionGranted;
import com.jordan.betcher.siviso.sivisolite.thirdparty.permissions.Permission$AccessFineLocation;

class OnMapReady$OnPermissionGranted$EnableCurrentLocation
implements OnMapReady, OnPermissionGranted
{
	private Wrapper$Map map;
	private boolean permissionGranted = false;
	
	public OnMapReady$OnPermissionGranted$EnableCurrentLocation(
	MapCreator mapCreator,
	Permission$AccessFineLocation permission)
	{
		mapCreator.callWhenReady(this);
		permission.addOnPermissionGranted(this);
	}
	
	@Override
	public void mapReady(Wrapper$Map map)
	{
		this.map = map;
		tryToEnableCurrentLocationIcon();
	}
	
	@Override
	public void permissionGranted()
	{
		permissionGranted = true;
		tryToEnableCurrentLocationIcon();
	}
	
	private void tryToEnableCurrentLocationIcon()
	{
		if(map != null && permissionGranted == true)
		{
			map.enableCurrentLocationIcon();
		}
	}
}
