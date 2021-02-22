package com.jordan.betcher.siviso.sivisolite.service;

import android.app.PendingIntent;
import android.content.Context;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

@RunWith(PowerMockRunner.class)
@Config(manifest = Config.NONE)
@PrepareForTest({PendingIntent.class})
@PowerMockIgnore({ "org.mockito.*", "org.robolectric.*", "android.*", "androidx.*" })
public class Test$Factory$PendingIntent
{
	@Test
	public void create__pendingIntent()
	{
		Context context = mock(Context.class);
		Intent$Activity$Home intent = mock(Intent$Activity$Home.class);
		PendingIntent pendingIntent = PowerMockito.mock(PendingIntent.class);
		PowerMockito.mockStatic(PendingIntent.class);
		PowerMockito.when(PendingIntent.getActivity(context, 0, intent, 0))
		            .thenReturn(pendingIntent);
		
		Factory$PendingIntent factory = new Factory$PendingIntent(context, intent);
		PendingIntent pendingIntentActual = factory.create();
		
		assertEquals(pendingIntent, pendingIntentActual);
		
	}
}