package com.jordan.betcher.siviso.sivisolite.home;

import android.os.Build;

import androidx.test.core.app.ActivityScenario;

import com.jordan.betcher.siviso.sivisolite.home.sivisolistview.SivisoListView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertNotNull;

@RunWith(RobolectricTestRunner.class)
@Config(sdk = Build.VERSION_CODES.JELLY_BEAN)
public class Test$Activity_Home
{
	Activity_Home activity;
	
	@Before
	public void setup()
	{
		try(ActivityScenario<Activity_Home> scenario = ActivityScenario
		.launch(Activity_Home.class))
		{
			scenario.onActivity
			(
				new ActivityScenario.ActivityAction<Activity_Home>()
				{
					@Override
					public void perform(Activity_Home activity)
					{
						Test$Activity_Home.this.activity = activity;
					}
				}
			);
		}
	}
	
	@Test
	public void __mapView()
	{
		MapView mapView = activity.mapView;
		assertNotNull(mapView);
	}
	
	@Test
	public void __offOnView()
	{
		OffOnView offOnView = activity.offOnView;
		assertNotNull(offOnView);
	}
	
	@Test
	public void __sivisoListView()
	{
		SivisoListView sivisoListView = activity.sivisoListView;
		assertNotNull(sivisoListView);
	}
}