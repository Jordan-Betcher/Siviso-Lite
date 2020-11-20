package com.jordan.betcher.siviso.sivisolite.permissions.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.jordan.betcher.siviso.sivisolite.permissions.Permission;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.powermock.api.mockito.PowerMockito.when;


@RunWith(PowerMockRunner.class)
@PrepareForTest({LayoutInflater.class, ViewHolder$Permission.class})
public class Test$Adapter$Permissions
{
	@Test
	public void getItemCount_null_0()
	{
		RecyclerView.Adapter adapter = new Adapter$Permissions();
		
		int actual = adapter.getItemCount();
		
		assertEquals(0, actual);
	}
	
	@Test
	public void getItemCount_onePermission_1()
	{
		Permission fakePermission = mock(Permission.class);
		RecyclerView.Adapter adapter = new Adapter$Permissions(fakePermission);
		
		int actual = adapter.getItemCount();
		
		assertEquals(1, actual);
	}
	
	@Test
	public void onCreateViewHolder_viewGroup_returnsViewHolder()
	{
		PowerMockito.mockStatic(LayoutInflater.class);
		PowerMockito.mockStatic(ViewHolder$Permission.class);
		ViewGroup fakeViewGroup = mock(ViewGroup.class);
		ViewHolder$Permission fakeViewHolder = mock(ViewHolder$Permission.class);
		Context fakeContext = mock(Context.class);
		LayoutInflater fakeLayoutInflator = mock(LayoutInflater.class);
		
		when(fakeViewGroup.getContext()).thenReturn(fakeContext);
		when(LayoutInflater.from(fakeContext)).thenReturn(fakeLayoutInflator);
		when(ViewHolder$Permission.create(fakeLayoutInflator, fakeViewGroup)).thenReturn(fakeViewHolder);
		
		Adapter$Permissions adapter = new Adapter$Permissions();
		RecyclerView.ViewHolder actual = adapter.onCreateViewHolder(fakeViewGroup, 0);
		
		assertEquals(fakeViewHolder, actual);
	}
	
	@Test
	public void onBindViewHolder_viewHolderPermissions0_callPopulateViewWithPermission0()
	{
		Permission fakePermission0 = mock(Permission.class);
		ViewHolder$Permission fakeViewHolder = mock(ViewHolder$Permission.class);
		
		Adapter$Permissions adapter = new Adapter$Permissions(fakePermission0);
		adapter.onBindViewHolder(fakeViewHolder, 0);
		
		verify(fakeViewHolder, times(1)).populateView(fakePermission0);
	}
	
	@Test
	public void onBindViewHolder_viewHolderPermissions1_callPopulateViewWithPermission1()
	{
		Permission fakePermission0 = mock(Permission.class);
		Permission fakePermission1 = mock(Permission.class);
		ViewHolder$Permission fakeViewHolder = mock(ViewHolder$Permission.class);
		
		Adapter$Permissions adapter = new Adapter$Permissions(fakePermission0, fakePermission1);
		adapter.onBindViewHolder(fakeViewHolder, 1);
		
		verify(fakeViewHolder, times(1)).populateView(fakePermission1);
	}
	
	
}