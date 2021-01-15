package com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap;

import com.google.android.gms.internal.maps.zzh;
import com.google.android.gms.maps.model.Circle;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.mock;

public class Test$Wrapper$Circle
{
	@Test
	public void remove__callCircleRemove()
	{
		zzh zzh = mock(zzh.class);
		Circle circle = new Circle(zzh);
		Wrapper$Circle wrapper$Circle = new Wrapper$Circle(circle);
		
		assertEquals(circle.toString(), wrapper$Circle.circle.toString());
	}
}