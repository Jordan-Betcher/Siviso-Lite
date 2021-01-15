package com.jordan.betcher.siviso.sivisolite.home.onMapReady;

import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.sivisolite.R;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.Map;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.OnMapClick;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.Wrapper$Circle;

class OnMapClick$HighlightLocation
implements OnMapClick
{
	Wrapper$Circle circle;
	CircleOptions highlight;
	private Map map;
	
	public OnMapClick$HighlightLocation(Map map)
	{
		this.map = map;
		this.highlight = createHighlight();
	}
	
	@Override
	public void onMapClick(LatLng latLng)
	{
		highlight.center(latLng);
		
		circle = map.createCircle(highlight);
	}
	
	private CircleOptions createHighlight()
	{
		CircleOptions highlight = new CircleOptions();
		
		highlight.fillColor(R.color.highlight);
		highlight.radius(R.integer.highlightRadius);
		highlight.visible(true);
		
		return highlight;
	}
}
