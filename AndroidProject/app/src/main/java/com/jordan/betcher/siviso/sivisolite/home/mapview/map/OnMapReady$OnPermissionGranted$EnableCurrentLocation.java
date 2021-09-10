package com.jordan.betcher.siviso.sivisolite.home.mapview.map;

import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.MultipleOnMapReady;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.OnMapReady;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.Wrapper_GoogleMap;
import com.jordan.betcher.siviso.sivisolite.thirdparty.permissions.OnPermissionGranted;
import com.jordan.betcher.siviso.sivisolite.thirdparty.permissions.Permission$AccessFineLocation;

class OnMapReady$OnPermissionGranted$EnableCurrentLocation
implements OnMapReady, OnPermissionGranted
{
	private Wrapper_GoogleMap map;
	private boolean permissionGranted = false;
	
	public OnMapReady$OnPermissionGranted$EnableCurrentLocation(
	MultipleOnMapReady multipleOnMapReady,
	Permission$AccessFineLocation permission)
	{
		multipleOnMapReady.addOnMapReady(this);
		permission.addOnPermissionGranted(this);
	}
	
	@Override
	public void mapReady(Wrapper_GoogleMap map)
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
