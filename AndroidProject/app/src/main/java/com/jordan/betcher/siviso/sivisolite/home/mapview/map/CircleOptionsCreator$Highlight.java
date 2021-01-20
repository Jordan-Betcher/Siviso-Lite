package com.jordan.betcher.siviso.sivisolite.home.mapview.map;

import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.sivisolite.R;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.CircleOptionsCreator;

class CircleOptionsCreator$Highlight implements CircleOptionsCreator
{
	public LatLng latLng;
	
	public CircleOptionsCreator$Highlight(LatLng latLng)
	{
		this.latLng = latLng;
	}
	
	@Override
	public CircleOptions circleOptions()
	{
		CircleOptions circleOptions = new CircleOptions();
		circleOptions.center(latLng);
		circleOptions.radius(R.integer.highlightRadius);
		circleOptions.fillColor(R.color.highlight);
		
		return circleOptions;
	}
}
