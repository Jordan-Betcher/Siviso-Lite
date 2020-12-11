package com.jordan.betcher.siviso.sivisolite.permissions;

import android.content.Context;
import android.content.res.Resources;

import androidx.test.core.app.ActivityScenario;
import androidx.test.core.app.ApplicationProvider;
import androidx.test.espresso.intent.Intents;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;

import com.jordan.betcher.siviso.sivisolite.R;
import com.jordan.betcher.siviso.sivisolite.home.Activity_Home;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.function.Consumer;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.intent.Intents.intended;
import static androidx.test.espresso.intent.Intents.times;
import static androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.isEnabled;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.not;

@RunWith(AndroidJUnit4ClassRunner.class)
public class Test$Activity_Permissions
{
	
	@Rule
	public ActivityScenarioRule<Activity_Permissions> activityRule = new ActivityScenarioRule<>(Activity_Permissions.class);
	
	@Test
	public void onCreate__TitleDisplayed()
	{
		onView(withId(R.id.permissionsTitle)).check(matches(isDisplayed()));
	}
	
	@Test
	public void onCreate__TitleTextMatchesResource()
	{
		Context context = ApplicationProvider.getApplicationContext();
		Resources resources = context.getResources();
		
		String resource = resources.getString(R.string.permissions_title);
		
		onView(withId(R.id.permissionsTitle)).check(matches(withText(resource)));
	}
	
	@Test
	public void onCreate__ContinueButtonNotEnabled()
	{
		onView(withId(R.id.permissionsContinue)).check(matches(not(isEnabled())));
	}
	
	@Test
	public void onCreate__ContinueButtonTextMatchesResource()
	{
		Context context = ApplicationProvider.getApplicationContext();
		Resources resources = context.getResources();
		
		String resource = resources.getString(R.string.permissions_continue);
		
		onView(withId(R.id.permissionsContinue)).check(matches(withText(resource)));
	}
	
	@Test
	public void onCreate__PermissionsListDisplayed()
	{
		onView(withId(R.id.permissionsList)).check(matches(isDisplayed()));
	}
	
	@Test
	public void onCreate_AllPermissionsAccepted_EnableContinueButton()
	{
		activityRule.getScenario().onActivity(
		new ActivityScenario.ActivityAction<Activity_Permissions>(){
			@Override
			public void perform(Activity_Permissions activity)
			{
				activity.permissions.listeners.forEach(new Consumer<Listener>(){
					@Override
					public void accept(Listener listener)
					{
						listener.call();
					}
				});
			}
		});
		onView(withId(R.id.permissionsContinue)).check(matches(isEnabled()));
	}
	
	@Test
	public void onCreate__ActivityHomeNotCreated()
	{
		Intents.init();
		intended(hasComponent(Activity_Home.class.getName()), times(0));
		Intents.release();
	}
	
	@Test
	public void onCreate__ActivityHomeCreated()
	{
		Intents.init();
		
		activityRule.getScenario().onActivity(
		new ActivityScenario.ActivityAction<Activity_Permissions>(){
			@Override
			public void perform(Activity_Permissions activity)
			{
				activity.findViewById(R.id.permissionsContinue).setEnabled(true);
			}
		});
		
		onView(withId(R.id.permissionsContinue)).perform(click());
		
		intended(hasComponent(Activity_Home.class.getName()), times(1));
		Intents.release();
	}
}