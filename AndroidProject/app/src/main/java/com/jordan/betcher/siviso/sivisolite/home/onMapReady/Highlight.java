package com.jordan.betcher.siviso.sivisolite.home.onMapReady;

import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.sivisolite.R;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.Map;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.Wrapper$Circle;

class Highlight
{
	Wrapper$Circle createCircle(Map map, LatLng latLng)
	{
		CircleOptions circleOptions = new CircleOptions();
		circleOptions.fillColor(R.color.highlight);
		circleOptions.radius(R.integer.highlightRadius);
		circleOptions.center(latLng);
		
		return map.createCircle(circleOptions);
	}
}
