package com.jordan.betcher.siviso.sivisolite.home.mapview.map;

import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.sivisolite.R;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.Wrapper$Map;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.Wrapper$Circle;

class Highlight
{
	Wrapper$Circle createCircle(Wrapper$Map wrapper$map, LatLng latLng)
	{
		CircleOptions circleOptions = new CircleOptions();
		circleOptions.fillColor(R.color.highlight);
		circleOptions.radius(R.integer.highlightRadius);
		circleOptions.center(latLng);
		
		return wrapper$map.createCircle(circleOptions);
	}
}
