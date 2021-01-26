package com.jordan.betcher.siviso.sivisolite.home.mapview.map;

import android.content.res.Resources;

import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.sivisolite.R;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Test$CircleOptionsCreator$Highlight
{
	@Test
	public void circleOptions_LatLng00_circleOptionsHasLatLng00()
	{
		LatLng latLng = new LatLng(0, 0);
		Resources resources = mock(Resources.class);
		CircleOptionsCreator$Highlight highlight = new CircleOptionsCreator$Highlight(resources, latLng);
		
		CircleOptions circleOptions = highlight.circleOptions();
		
		LatLng actualLatLng = circleOptions.getCenter();
		assertEquals(latLng, actualLatLng);
	}
	
	@Test
	public void circleOptions_ResourcesRadius0_circleOptionsHasHighlightRadius0()
	{
		int radius = 0;
		LatLng latLng = new LatLng(0, 0);
		Resources resources = mock(Resources.class);
		when(resources.getInteger(R.integer.highlightRadius)).thenReturn(radius);
		CircleOptionsCreator$Highlight highlight = new CircleOptionsCreator$Highlight(resources, latLng);
		
		CircleOptions circleOptions = highlight.circleOptions();
		
		double actualradius = circleOptions.getRadius();
		assertEquals(radius, actualradius, 0.001);
	}
	
	@Test
	public void circleOptions_ResourcesRadius1_circleOptionsHasHighlightRadius1()
	{
		int radius = 1;
		LatLng latLng = new LatLng(0, 0);
		Resources resources = mock(Resources.class);
		when(resources.getInteger(R.integer.highlightRadius)).thenReturn(radius);
		CircleOptionsCreator$Highlight highlight = new CircleOptionsCreator$Highlight(resources, latLng);
		
		CircleOptions circleOptions = highlight.circleOptions();
		
		double actualradius = circleOptions.getRadius();
		assertEquals(radius, actualradius, 0.001);
	}
	
	@Test
	public void circleOptions_ResourcesColor0_circleOptionsHasHighlightFillColor0()
	{
		int color = 0;
		LatLng latLng = new LatLng(0, 0);
		Resources resources = mock(Resources.class);
		when(resources.getColor(R.color.highlight)).thenReturn(color);
		CircleOptionsCreator$Highlight highlight = new CircleOptionsCreator$Highlight(resources, latLng);
		
		CircleOptions circleOptions = highlight.circleOptions();
		
		int actualFillColor = circleOptions.getFillColor();
		assertEquals(color, actualFillColor);
	}
	
	@Test
	public void circleOptions_ResourcesColor1_circleOptionsHasHighlightFillColor1()
	{
		int color = 1;
		LatLng latLng = new LatLng(0, 0);
		Resources resources = mock(Resources.class);
		when(resources.getColor(R.color.highlight)).thenReturn(color);
		CircleOptionsCreator$Highlight highlight = new CircleOptionsCreator$Highlight(resources, latLng);
		
		CircleOptions circleOptions = highlight.circleOptions();
		
		int actualFillColor = circleOptions.getFillColor();
		assertEquals(color, actualFillColor);
	}
}