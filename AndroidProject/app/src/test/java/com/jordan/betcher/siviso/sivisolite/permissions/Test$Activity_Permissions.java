package com.jordan.betcher.siviso.sivisolite.permissions;

import android.os.Build;
import android.widget.Button;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;
import androidx.test.core.app.ActivityScenario;

import com.jordan.betcher.siviso.sivisolite.R;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.hamcrest.CoreMatchers.isA;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@Config(sdk = Build.VERSION_CODES.JELLY_BEAN)
@RunWith(RobolectricTestRunner.class)
public class Test$Activity_Permissions
{
	@Test
	public void onCreate_null_continueIdExists()
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
	
	@Test
	public void onCreate_null_continueIsButton()
	{
		try(ActivityScenario<Activity_Permissions> scenario = ActivityScenario.launch(Activity_Permissions.class))
		{
			scenario.onActivity(new ActivityScenario.ActivityAction<Activity_Permissions>()
			{
				@Override
				public void perform(Activity_Permissions activity)
				{
					Button button = activity.findViewById(R.id.permissionsContinue);
					assertThat(button, isA(Button.class));
				}
			});
		}
	}
	
	@Test
	public void onCreate_null_continueString()
	{
		try(ActivityScenario<Activity_Permissions> scenario = ActivityScenario.launch(Activity_Permissions.class))
		{
			scenario.onActivity(new ActivityScenario.ActivityAction<Activity_Permissions>()
			{
				@Override
				public void perform(Activity_Permissions activity)
				{
					Button button = activity.findViewById(R.id.permissionsContinue);
					String actualText = String.valueOf(button.getText());
					String expectedText = activity.getResources().getString((R.string.permissions_continue));
					assertEquals(expectedText, actualText);
				}
			});
		}
	}
	
	@Test
	public void onCreate_null_titleIdExists()
	{
		try(ActivityScenario<Activity_Permissions> scenario = ActivityScenario.launch(Activity_Permissions.class))
		{
			scenario.onActivity(new ActivityScenario.ActivityAction<Activity_Permissions>()
			{
				@Override
				public void perform(Activity_Permissions activity)
				{
					assertNotNull(activity.findViewById(R.id.permissionsTitle));
				}
			});
		}
	}
	
	@Test
	public void onCreate_null_titleIsTextView()
	{
		try(ActivityScenario<Activity_Permissions> scenario = ActivityScenario.launch(Activity_Permissions.class))
		{
			scenario.onActivity(new ActivityScenario.ActivityAction<Activity_Permissions>()
			{
				@Override
				public void perform(Activity_Permissions activity)
				{
					TextView textView = activity.findViewById(R.id.permissionsContinue);
					assertThat(textView, isA(TextView.class));
				}
			});
		}
	}
	
	@Test
	public void onCreate_null_titleString()
	{
		try(ActivityScenario<Activity_Permissions> scenario = ActivityScenario.launch(Activity_Permissions.class))
		{
			scenario.onActivity(new ActivityScenario.ActivityAction<Activity_Permissions>()
			{
				@Override
				public void perform(Activity_Permissions activity)
				{
					TextView title = activity.findViewById(R.id.permissionsTitle);
					String actualText = String.valueOf(title.getText());
					String expectedText = activity.getResources().getString((R.string.permissions_title));
					assertEquals(expectedText, actualText);
				}
			});
		}
	}
	
	@Test
	public void onCreate_null_recyclerViewIdExists()
	{
		try(ActivityScenario<Activity_Permissions> scenario = ActivityScenario.launch(Activity_Permissions.class))
		{
			scenario.onActivity(new ActivityScenario.ActivityAction<Activity_Permissions>()
			{
				@Override
				public void perform(Activity_Permissions activity)
				{
					assertNotNull(activity.findViewById(R.id.permissionsList));
				}
			});
		}
	}
	
	@Test
	public void onCreate_null_recyclerViewIsTextView()
	{
		try(ActivityScenario<Activity_Permissions> scenario = ActivityScenario.launch(Activity_Permissions.class))
		{
			scenario.onActivity(new ActivityScenario.ActivityAction<Activity_Permissions>()
			{
				@Override
				public void perform(Activity_Permissions activity)
				{
					RecyclerView isRecyclerView = activity.findViewById(R.id.permissionsList);
					assertThat(isRecyclerView, isA(RecyclerView.class));
				}
			});
		}
	}
}