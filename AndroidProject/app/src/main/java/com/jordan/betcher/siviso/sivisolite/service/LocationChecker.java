package com.jordan.betcher.siviso.sivisolite.service;

import android.content.res.Resources;
import android.location.Location;

import com.jordan.betcher.siviso.sivisolite.R;
import com.jordan.betcher.siviso.sivisolite.home.Database.StoreSiviso$Home;

class LocationChecker
{
	private StoreSiviso$Home home;
	private int radius;
	
	public LocationChecker(StoreSiviso$Home home, Resources resources)
	{
		this.home = home;
		radius = resources.getInteger(R.integer.highlightRadius);
	}
	
	public boolean isInHome(Location currentLocation)
	{
		if(currentLocation == null)
		{
			return false;
		}
		
		if(home.isLocation())
		{
			Location homeLocation = new Location(currentLocation);
			float distance = currentLocation.distanceTo(homeLocation);
			if(radius >= distance)
			{
				return true;
			}
		}
		
		return false;
	}
}
