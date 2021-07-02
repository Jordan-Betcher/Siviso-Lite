package com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap;

import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.LatLng;

public class Wrapper$Circle
{
	Circle circle;
	
	public Wrapper$Circle(Circle circle){this.circle = circle;}
	
	public void remove()
	{
		circle.remove();
	}
	
	public void moveTo(LatLng latLng)
	{
		circle.setCenter(latLng);
	}
	
	public void setColor(int color)
	{
	
	}
}
