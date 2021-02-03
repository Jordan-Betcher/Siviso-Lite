package com.jordan.betcher.siviso.sivisolite.home;

import android.content.Context;
import android.widget.Spinner;

import com.jordan.betcher.siviso.sivisolite.home.Database.Database;
import com.jordan.betcher.siviso.sivisolite.home.sivisolistview.DropDown$Default;
import com.jordan.betcher.siviso.sivisolite.home.sivisolistview.DropDown$Home;
import com.jordan.betcher.siviso.sivisolite.home.sivisolistview.Siviso;

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
		Database database = mock(Database.class);
		Siviso siviso = mock(Siviso.class);
		SivisoListView sivisoListView = new SivisoListView(context, defaultSpinner, database, siviso);
		DropDown$Default defaultDropDown = sivisoListView.defaultDropDown;
		
		assertNotNull(defaultDropDown);
	}
	
	@Test public void __homeDropDown()
	{
		Spinner defaultSpinner = mock(Spinner.class);
		Context context = mock(Context.class);
		Database database = mock(Database.class);
		SivisoListView sivisoListView = new SivisoListView(context, defaultSpinner, database, mock(Siviso.class));
		DropDown$Home homeDropDown = sivisoListView.homeDropDown;
		
		assertNotNull(homeDropDown);
	}
}