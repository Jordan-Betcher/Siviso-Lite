package com.jordan.betcher.siviso.sivisolite.home.mapview.map;

import android.content.res.Resources;
import android.graphics.Color;

import com.google.android.gms.maps.model.CircleOptions;
import com.jordan.betcher.siviso.sivisolite.R;
import com.jordan.betcher.siviso.sivisolite.home.Database.StoreSiviso$Home;

public class Factory$CircleOptions
{
	public CircleOptions create(
	Resources resources, StoreSiviso$Home sivisoHome)
	{
		int radius = resources.getInteger(R.integer.highlightRadius);
		int color;
		switch(sivisoHome.siviso())
		{
			case 0:
				color = resources.getColor(R.color.colorSilent);
				break;
			case 1:
				color = resources.getColor(R.color.colorVibrate);
				break;
			case 2:
				color = resources.getColor(R.color.colorSound);
				break;
			default:
				color = Color.GRAY;
				break;
				
		}
		
		CircleOptions circleOptions = new CircleOptions();
		circleOptions.center(sivisoHome.latLng());
		circleOptions.radius(radius);
		circleOptions.strokeWidth(0f);
		circleOptions.fillColor(color);
		
		return circleOptions;
	}
}
