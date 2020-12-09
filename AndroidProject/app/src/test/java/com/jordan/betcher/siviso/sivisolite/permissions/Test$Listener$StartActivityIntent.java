package com.jordan.betcher.siviso.sivisolite.permissions;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class Test$Listener$StartActivityIntent
{
	@Test
	public void onClick__startActivityIntent()
	{
		Activity fakeActivity = mock(Activity.class);
		Intent fakeIntent = mock(Intent.class);
		View fakeView = mock(View.class);
		
		Listener$StartActivityIntent listener = new Listener$StartActivityIntent(fakeActivity, fakeIntent);
		listener.onClick(fakeView);
		
		verify(fakeActivity, times(1)).startActivity(fakeIntent);
	}
	
	@Test
	public void __startActivityIntent()
	{
		Activity fakeActivity = mock(Activity.class);
		Intent fakeIntent = mock(Intent.class);
		
		new Listener$StartActivityIntent(fakeActivity, fakeIntent);
		
		verify(fakeActivity, times(0)).startActivity(fakeIntent);
	}
}