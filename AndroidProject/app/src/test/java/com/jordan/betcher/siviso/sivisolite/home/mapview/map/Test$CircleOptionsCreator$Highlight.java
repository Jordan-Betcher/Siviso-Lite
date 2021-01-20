package com.jordan.betcher.siviso.sivisolite.home.mapview.map;

import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.sivisolite.R;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test$CircleOptionsCreator$Highlight
{
	@Test
	public void circleOptions_LatLng00_circleOptionsHasLatLng00()
	{
		LatLng latLng = new LatLng(0, 0);
		CircleOptionsCreator$Highlight highlight = new CircleOptionsCreator$Highlight(latLng);
		
		CircleOptions circleOptions = highlight.circleOptions();
		
		LatLng actualLatLng = circleOptions.getCenter();
		assertEquals(latLng, actualLatLng);
	}
	
	@Test
	public void circleOptions__circleOptionsHasHighlightRadius()
	{
		LatLng latLng = new LatLng(0, 0);
		CircleOptionsCreator$Highlight highlight = new CircleOptionsCreator$Highlight(latLng);
		
		CircleOptions circleOptions = highlight.circleOptions();
		
		double actualradius = circleOptions.getRadius();
		double radius = R.integer.highlightRadius;
		assertEquals(radius, actualradius, 0.001);
	}
	
	@Test
	public void circleOptions__circleOptionsHasHighlightFillColor()
	{
		LatLng latLng = new LatLng(0, 0);
		CircleOptionsCreator$Highlight highlight = new CircleOptionsCreator$Highlight(latLng);
		
		CircleOptions circleOptions = highlight.circleOptions();
		
		int actualFillColor = circleOptions.getFillColor();
		int fillColor = R.color.highlight;
		assertEquals(fillColor, actualFillColor);
	}
}