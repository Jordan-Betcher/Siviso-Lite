package com.jordan.betcher.siviso.sivisolite.home.mapview.map;

import com.google.android.gms.maps.model.CircleOptions;
import com.jordan.betcher.siviso.sivisolite.home.Database.StoreSiviso$Home;

public class Factory$CircleOptions
{
	public CircleOptions create(StoreSiviso$Home sivisoHome)
	{
		
		CircleOptions circleOptions = new CircleOptions();
		circleOptions.center(sivisoHome.latLng());
		circleOptions.radius(sivisoHome.radius());
		circleOptions.strokeWidth(0f);
		circleOptions.fillColor(sivisoHome.color());
		
		return circleOptions;
	}
}
