package com.jordan.betcher.siviso.sivisolite.permissions.adapter;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.test.core.app.ActivityScenario;

import com.jordan.betcher.siviso.sivisolite.R;
import com.jordan.betcher.siviso.sivisolite.permissions.Activity_Permissions;
import com.jordan.betcher.siviso.sivisolite.permissions.Permission;

import org.hamcrest.Description;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatcher;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.argThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@Config(sdk = Build.VERSION_CODES.JELLY_BEAN)
@RunWith(RobolectricTestRunner.class)
public class Test$ViewHolder$Permission
{
	Activity activity;
	
	@Before
	public void setup()
	{
		try(ActivityScenario<Activity_Permissions> scenario = ActivityScenario
		.launch(Activity_Permissions.class))
		{
			scenario.onActivity
			(
				new ActivityScenario.ActivityAction<Activity_Permissions>()
				{
					@Override
					public void perform(Activity_Permissions a)
					{
						activity = a;
					}
				}
			);
		}
	}
	
	@Test
	public void create_layoutInflater_permissionNameFoundInView()
	{
		Context context = activity;
		LayoutInflater layoutInflater = LayoutInflater.from(context);
		
		ViewHolder$Permission viewHolder = ViewHolder$Permission.create(layoutInflater, null);
		
		assertNotNull(viewHolder.itemView.findViewById(R.id.permissionName));
	}
	
	@Test
	public void populateView_permissionNameTest1_NameHasTextTest1()
	{
		Context context = activity;
		LayoutInflater layoutInflater = LayoutInflater.from(context);
		Permission fakePermission = mock(Permission.class);
		String fakePermissionName = "Test1";
		when(fakePermission.guiName()).thenReturn(fakePermissionName);
		
		ViewHolder$Permission viewHolder = ViewHolder$Permission.create(layoutInflater, null);
		viewHolder.populateView(fakePermission);
		
		TextView textView = viewHolder.itemView.findViewById(R.id.permissionName);
		String actual = (String) textView.getText();
		assertEquals(fakePermissionName, actual);
	}
	
	@Test
	public void populateView_permissionNameTest2_NameHasTextTest2()
	{
		Context context = activity;
		LayoutInflater layoutInflater = LayoutInflater.from(context);
		Permission fakePermission = mock(Permission.class);
		String fakePermissionName = "Test2";
		when(fakePermission.guiName()).thenReturn(fakePermissionName);
		
		ViewHolder$Permission viewHolder = ViewHolder$Permission.create(layoutInflater, null);
		viewHolder.populateView(fakePermission);
		
		TextView textView = viewHolder.itemView.findViewById(R.id.permissionName);
		String actual = (String) textView.getText();
		assertEquals(fakePermissionName, actual);
	}
	
	@Test
	public void create_layoutInflater_permissionDetailsFoundInView()
	{
		Context context = activity;
		LayoutInflater layoutInflater = LayoutInflater.from(context);
		
		ViewHolder$Permission viewHolder = ViewHolder$Permission.create(layoutInflater, null);
		
		assertNotNull(viewHolder.itemView.findViewById(R.id.permissionDetails));
	}
	
	@Test
	public void populateView_permissionDetailsTest1_DetailsHasTextTest1()
	{
		Context context = activity;
		LayoutInflater layoutInflater = LayoutInflater.from(context);
		Permission fakePermission = mock(Permission.class);
		String fakePermissionDetails = "Test1";
		when(fakePermission.details()).thenReturn(fakePermissionDetails);
		
		ViewHolder$Permission viewHolder = ViewHolder$Permission.create(layoutInflater, null);
		viewHolder.populateView(fakePermission);
		
		TextView textView = viewHolder.itemView.findViewById(R.id.permissionDetails);
		String actual = (String) textView.getText();
		assertEquals(fakePermissionDetails, actual);
	}
	
	@Test
	public void populateView_permissionDetailsTest2_DetailsHasTextTest2()
	{
		Context context = activity;
		LayoutInflater layoutInflater = LayoutInflater.from(context);
		Permission fakePermission = mock(Permission.class);
		String fakePermissionDetails = "Test2";
		when(fakePermission.details()).thenReturn(fakePermissionDetails);
		
		ViewHolder$Permission viewHolder = ViewHolder$Permission.create(layoutInflater, null);
		viewHolder.populateView(fakePermission);
		
		TextView textView = viewHolder.itemView.findViewById(R.id.permissionDetails);
		String actual = (String) textView.getText();
		assertEquals(fakePermissionDetails, actual);
	}
	
	@Test
	public void populateView_permission_detailGone()
	{
		Context context = activity;
		LayoutInflater layoutInflater = LayoutInflater.from(context);
		Permission fakePermission = mock(Permission.class);
		String fakePermissionDetails = "Test1";
		when(fakePermission.details()).thenReturn(fakePermissionDetails);
		
		ViewHolder$Permission viewHolder = ViewHolder$Permission.create(layoutInflater, null);
		viewHolder.populateView(fakePermission);
		
		TextView textView = viewHolder.itemView.findViewById(R.id.permissionDetails);
		int actual = textView.getVisibility();
		int expectedVisability = View.GONE;
		assertEquals(expectedVisability, actual);
	}
	
	@Test
	public void create_layoutInflater_permissionShowDetailsFoundInView()
	{
		Context context = activity;
		LayoutInflater layoutInflater = LayoutInflater.from(context);
		
		ViewHolder$Permission viewHolder = ViewHolder$Permission.create(layoutInflater, null);
		
		assertNotNull(viewHolder.itemView.findViewById(R.id.permissionToggleDetails));
	}
	
	@Test
	public void populateView_clickPermissionShowDetails_detailVisable()
	{
		Context context = activity;
		LayoutInflater layoutInflater = LayoutInflater.from(context);
		Permission fakePermission = mock(Permission.class);
		ViewHolder$Permission viewHolder = ViewHolder$Permission.create(layoutInflater, null);
		viewHolder.populateView(fakePermission);
		
		Button permissionShowDetails = viewHolder.itemView.findViewById(R.id.permissionToggleDetails);
		permissionShowDetails.callOnClick();
		
		TextView textView = viewHolder.itemView.findViewById(R.id.permissionDetails);
		int actual = textView.getVisibility();
		int expectedVisability = View.VISIBLE;
		assertEquals(expectedVisability, actual);
	}
	
	@Test
	public void populateView_clickPermissionDetailsTwice_detailGone()
	{
		Context context = activity;
		LayoutInflater layoutInflater = LayoutInflater.from(context);
		Permission fakePermission = mock(Permission.class);
		ViewHolder$Permission viewHolder = ViewHolder$Permission.create(layoutInflater, null);
		viewHolder.populateView(fakePermission);
		
		Button permissionshowDetails = viewHolder.itemView.findViewById(R.id.permissionToggleDetails);
		permissionshowDetails.callOnClick();
		permissionshowDetails.callOnClick();
		
		TextView textView = viewHolder.itemView.findViewById(R.id.permissionDetails);
		int actual = textView.getVisibility();
		int expectedVisability = View.GONE;
		assertEquals(expectedVisability, actual);
	}
	
	
	@Test
	public void create_layoutInflater_permissionAcceptFoundInView()
	{
		Context context = activity;
		LayoutInflater layoutInflater = LayoutInflater.from(context);
		
		ViewHolder$Permission viewHolder = ViewHolder$Permission.create(layoutInflater, null);
		
		assertNotNull(viewHolder.itemView.findViewById(R.id.permissionAccept));
	}
	
	@Test
	public void populateView_clickPermissionAccept_callPermissionsAccept()
	{
		Context context = activity;
		LayoutInflater layoutInflater = LayoutInflater.from(context);
		Permission fakePermission = mock(Permission.class);
		ViewHolder$Permission viewHolder = ViewHolder$Permission.create(layoutInflater, null);
		
		viewHolder.populateView(fakePermission);
		
		Button permissionAccept = viewHolder.itemView.findViewById(R.id.permissionAccept);
		permissionAccept.callOnClick();
		
		verify(fakePermission, times(1)).accept();
	}
	
	@Test
	public void create__ToggleButtonTextMatchesResource()
	{
		Context context = activity;
		LayoutInflater layoutInflater = LayoutInflater.from(context);
		ViewHolder$Permission viewHolder = ViewHolder$Permission.create(layoutInflater, null);
		
		Button toggleDetailsButton = viewHolder.itemView.findViewById(R.id.permissionToggleDetails);
		String actual = toggleDetailsButton.getText().toString();
		String expected = context.getResources().getString(R.string.permission_toggle_details);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void create__AcceptButtonTextMatchesResource()
	{
		Context context = activity;
		LayoutInflater layoutInflater = LayoutInflater.from(context);
		ViewHolder$Permission viewHolder = ViewHolder$Permission.create(layoutInflater, null);
		
		Button toggleDetailsButton = viewHolder.itemView.findViewById(R.id.permissionAccept);
		String actual = toggleDetailsButton.getText().toString();
		String expected = context.getResources().getString(R.string.permission_accept);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void populateView_PermissionGranted_acceptButtonDisabled()
	{
		Context context = activity;
		LayoutInflater layoutInflater = LayoutInflater.from(context);
		Permission fakePermission = mock(Permission.class);
		ViewHolder$Permission viewHolder = ViewHolder$Permission.create(layoutInflater, null);
		when(fakePermission.isGranted()).thenReturn(true);
		
		viewHolder.populateView(fakePermission);
		
		boolean disabled = ! viewHolder.acceptButton.isEnabled();
		
		assertTrue(disabled);
	}
	
	@Test
	public void populateView_PermissionNotGranted_acceptButtonEnabled()
	{
		Context context = activity;
		LayoutInflater layoutInflater = LayoutInflater.from(context);
		Permission fakePermission = mock(Permission.class);
		ViewHolder$Permission viewHolder = ViewHolder$Permission.create(layoutInflater, null);
		when(fakePermission.isGranted()).thenReturn(false);
		
		viewHolder.populateView(fakePermission);
		
		boolean enabled = viewHolder.acceptButton.isEnabled();
		
		assertTrue(enabled);
	}
	
	
	static class Eq$Listener$EnableButton extends ArgumentMatcher<Listener$DisableButton>
	{
		
		private final Listener$DisableButton expected;
		
		public Eq$Listener$EnableButton(Listener$DisableButton expected) {
			this.expected = expected;
		}
		
		@Override
		public boolean matches(Object actual)
		{
			if(actual == null || !(actual instanceof Listener$DisableButton))
			{
				return false;
			}
			else
			{
				Listener$DisableButton other = (Listener$DisableButton)actual;
				return other.button.equals(expected.button);
			}
		}
		
		@Override
		public void describeTo(Description description)
		{
			description.appendText(expected == null ? null : expected.toString());
		}
	}
	
	static Listener$DisableButton listener$EnableButton$eq(Listener$DisableButton expected)
	{
		return argThat(new Eq$Listener$EnableButton(expected));
	}
	
	@Test
	public void populateView_PermissionNotGranted_addPermissionGrantedListenerDisableButtonForAcceptButton()
	{
		
		Context context = activity;
		LayoutInflater layoutInflater = LayoutInflater.from(context);
		Permission fakePermission = mock(Permission.class);
		ViewHolder$Permission viewHolder = ViewHolder$Permission.create(layoutInflater, null);
		when(fakePermission.isGranted()).thenReturn(false);
		
		viewHolder.populateView(fakePermission);
		
		Button acceptButton = viewHolder.acceptButton;
		Listener$DisableButton expected = new Listener$DisableButton(acceptButton);
		
		verify(fakePermission).addListener_PermissionGranted(
		listener$EnableButton$eq(expected));
	}
	
	@Test
	public void populateView_PermissionGranted_PermissionNameGrantedColor()
	{
		Context context = activity;
		LayoutInflater layoutInflater = LayoutInflater.from(context);
		Permission fakePermission = mock(Permission.class);
		when(fakePermission.isGranted()).thenReturn(true);
		
		ViewHolder$Permission viewHolder = ViewHolder$Permission.create(layoutInflater, null);
		viewHolder.populateView(fakePermission);
		
		TextView title = viewHolder.permissionName;
		
		int actualColor = title.getCurrentTextColor();
		int grantedColor = activity.getResources().getColor(R.color.permissionGranted);
		assertEquals(grantedColor, actualColor);
	}
	
	@Test
	public void populateView_PermissionNotGranted_PermissionNameGrantedColor()
	{
		Context context = activity;
		LayoutInflater layoutInflater = LayoutInflater.from(context);
		Permission fakePermission = mock(Permission.class);
		when(fakePermission.isGranted()).thenReturn(false);
		
		ViewHolder$Permission viewHolder = ViewHolder$Permission.create(layoutInflater, null);
		viewHolder.populateView(fakePermission);
		
		TextView title = viewHolder.permissionName;
		
		int actualColor = title.getCurrentTextColor();
		int grantedColor = activity.getResources().getColor(R.color.permissionGranted);
		assertNotEquals(grantedColor, actualColor);
	}
	
	static class Eq$Listener$ColorText extends ArgumentMatcher<Listener$ColorText>
	{
		
		private final Listener$ColorText expected;
		
		public Eq$Listener$ColorText(Listener$ColorText expected) {
			this.expected = expected;
		}
		
		@Override
		public boolean matches(Object actual)
		{
			if(actual == null || !(actual instanceof Listener$ColorText))
			{
				return false;
			}
			else
			{
				Listener$ColorText other = (Listener$ColorText)actual;
				
				return (other.textView.equals(expected.textView)) && (other.color == expected.color);
			}
		}
		
		@Override
		public void describeTo(Description description)
		{
			description.appendText(expected == null ? null : expected.toString());
		}
	}
	
	static Listener$ColorText listener$ColorText$eq(Listener$ColorText expected)
	{
		return argThat(new Eq$Listener$ColorText(expected));
	}
	
	@Test
	public void populateView_PermissionNotGranted_addPermissionGrantedListenerColorTextForPermissionName()
	{
		
		Context context = activity;
		LayoutInflater layoutInflater = LayoutInflater.from(context);
		Permission fakePermission = mock(Permission.class);
		ViewHolder$Permission viewHolder = ViewHolder$Permission.create(layoutInflater, null);
		when(fakePermission.isGranted()).thenReturn(false);
		
		viewHolder.populateView(fakePermission);
		
		TextView permissionName = viewHolder.permissionName;
		int grantedColor = activity.getResources().getColor(R.color.permissionGranted);
		Listener$ColorText expected = new Listener$ColorText(permissionName, grantedColor);
		
		verify(fakePermission).addListener_PermissionGranted(
		listener$ColorText$eq(expected));
	}
}

