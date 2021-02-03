package com.jordan.betcher.siviso.sivisolite.home.sivisolistview;

import android.content.Context;
import android.widget.Spinner;

import com.jordan.betcher.siviso.sivisolite.home.Database.Store$Default;
import com.jordan.betcher.siviso.sivisolite.home.Siviso;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

public class Test$SivisoListView
{
	@Test
	public void __defaultDropDown()
	{
		Spinner defaultSpinner = mock(Spinner.class);
		Context context = mock(Context.class);
		Store$Default storage = mock(Store$Default.class);
		Siviso siviso = mock(Siviso.class);
		SivisoListView sivisoListView = new SivisoListView(context, defaultSpinner, storage, siviso);
		DropDown defaultDropDown = sivisoListView.defaultDropDown;
		
		assertNotNull(defaultDropDown);
	}
	
	@Test public void __homeDropDown()
	{
		Spinner defaultSpinner = mock(Spinner.class);
		Context context = mock(Context.class);
		Store$Default storage = mock(Store$Default.class);
		SivisoListView sivisoListView = new SivisoListView(context, defaultSpinner, storage, mock(Siviso.class));
		DropDown$Home homeDropDown = sivisoListView.homeDropDown;
		
		assertNotNull(homeDropDown);
	}
}