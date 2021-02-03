package com.jordan.betcher.siviso.sivisolite.home.sivisolistview;

import android.content.Context;
import android.widget.Spinner;

import com.jordan.betcher.siviso.sivisolite.home.Database.Database;
import com.jordan.betcher.siviso.sivisolite.home.Database.Store$Default;
import com.jordan.betcher.siviso.sivisolite.home.Database.Store$Home;
import com.jordan.betcher.siviso.sivisolite.home.Siviso;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Test$SivisoListView
{
	@Test
	public void __defaultDropDown()
	{
		Store$Home store$Home = mock(Store$Home.class);
		Store$Default store$Default = mock(Store$Default.class);
		Spinner defaultSpinner = mock(Spinner.class);
		Spinner homeSpinner = mock(Spinner.class);
		Context context = mock(Context.class);
		Database database = mock(Database.class);
		Siviso siviso = mock(Siviso.class);
		when(database.defaultt()).thenReturn(store$Default);
		when(database.homee()).thenReturn(store$Home);
		
		SivisoListView sivisoListView = new SivisoListView(context, defaultSpinner, homeSpinner, database, siviso);
		DropDown$Default defaultDropDown = sivisoListView.defaultDropDown;
		
		assertNotNull(defaultDropDown);
	}
	
	@Test public void __homeDropDown()
	{
		Store$Home store$Home = mock(Store$Home.class);
		Store$Default store$Default = mock(Store$Default.class);
		Spinner defaultSpinner = mock(Spinner.class);
		Spinner homeSpinner = mock(Spinner.class);
		Context context = mock(Context.class);
		Database database = mock(Database.class);
		when(database.defaultt()).thenReturn(store$Default);
		when(database.homee()).thenReturn(store$Home);
		
		SivisoListView sivisoListView = new SivisoListView(context, defaultSpinner, homeSpinner, database, mock(Siviso.class));
		DropDown$Home homeDropDown = sivisoListView.homeDropDown;
		
		assertNotNull(homeDropDown);
	}
}