package com.jordan.betcher.siviso.sivisolite.home;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;

import com.jordan.betcher.siviso.sivisolite.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4ClassRunner.class)
public class TestActivityOnMapClick$Home
{
	@Rule
	public ActivityScenarioRule<Activity_Home> activityRule = new ActivityScenarioRule<>(Activity_Home.class);
	
	@Test
	public void ActivityHome_JustCreated_TitleExists()
	{
		onView(withId(R.id.homeTitle)).check(matches(isDisplayed()));
	}
	
	@Test
	public void ActivityHome_JustCreated_GoogleMap()
	{
		onView(withId(R.id.homeMap)).check(matches(isDisplayed()));
	}
}