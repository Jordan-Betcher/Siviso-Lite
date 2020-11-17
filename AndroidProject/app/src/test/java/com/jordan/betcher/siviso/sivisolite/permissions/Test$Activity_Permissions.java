package com.jordan.betcher.siviso.sivisolite.permissions;

import android.os.Build;

import androidx.test.core.app.ActivityScenario;

import com.jordan.betcher.siviso.sivisolite.R;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertNotNull;

@Config(sdk = Build.VERSION_CODES.JELLY_BEAN)
@RunWith(RobolectricTestRunner.class)
public class Test$Activity_Permissions
{
	@Test
	public void onCreate_null_permissionsContinueExists()
	{
		try(ActivityScenario<Activity_Permissions> scenario = ActivityScenario.launch(Activity_Permissions.class))
		{
			scenario.onActivity(new ActivityScenario.ActivityAction<Activity_Permissions>()
			{
				@Override
				public void perform(Activity_Permissions activity)
				{
					assertNotNull(activity.findViewById(R.id.permissionsContinue));
				}
			});
		}
	}
}