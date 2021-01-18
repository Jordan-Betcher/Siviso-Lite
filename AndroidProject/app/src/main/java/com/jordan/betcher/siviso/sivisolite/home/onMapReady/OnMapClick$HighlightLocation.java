package com.jordan.betcher.siviso.sivisolite.home.onMapReady;

import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.Map;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.OnMapClick;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.Wrapper$Circle;

class OnMapClick$HighlightLocation
implements OnMapClick
{
	Highlight highlight = new Highlight();
	Wrapper$Circle circle = null;
	private Map map;
	
	public OnMapClick$HighlightLocation(Map map)
	{
		this.map = map;
	}
	
	@Override
	public void onMapClick(LatLng latLng)
	{
		if(circle != null)
		{
			circle.remove();
		}
		
		circle = highlight.createCircle(map, latLng);
	}
}
