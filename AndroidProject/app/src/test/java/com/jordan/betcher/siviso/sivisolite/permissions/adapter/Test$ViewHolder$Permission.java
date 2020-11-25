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

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
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
		when(fakePermission.name()).thenReturn(fakePermissionName);
		
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
		when(fakePermission.name()).thenReturn(fakePermissionName);
		
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
	public void create_null_ToggleButtonTextMatchesResource()
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
	public void create_null_AcceptButtonTextMatchesResource()
	{
		Context context = activity;
		LayoutInflater layoutInflater = LayoutInflater.from(context);
		ViewHolder$Permission viewHolder = ViewHolder$Permission.create(layoutInflater, null);
		
		Button toggleDetailsButton = viewHolder.itemView.findViewById(R.id.permissionAccept);
		String actual = toggleDetailsButton.getText().toString();
		String expected = context.getResources().getString(R.string.permission_accept);
		
		assertEquals(expected, actual);
	}
	
	
}