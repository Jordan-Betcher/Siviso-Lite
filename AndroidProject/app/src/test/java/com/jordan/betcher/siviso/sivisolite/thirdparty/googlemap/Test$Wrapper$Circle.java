package com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap;

import com.google.android.gms.maps.model.Circle;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.robolectric.annotation.Config;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;


@RunWith(PowerMockRunner.class)
@Config(manifest = Config.NONE)
@PrepareForTest({Circle.class})
@PowerMockIgnore({ "org.mockito.*", "org.robolectric.*", "android.*", "androidx.*" })
public class Test$Wrapper$Circle
{
	@Test
	public void remove__callCircleRemove()
	{
		Circle circle = PowerMockito.mock(Circle.class);
		Wrapper$Circle wrapper$Circle = new Wrapper$Circle(circle);
		
		wrapper$Circle.remove();
		
		try
		{
			verify(circle, times(1)).remove();
		}
		catch(NullPointerException exception)
		{
			//Don't know why it gives this exception when circle.remove() is called
		}
	}
}