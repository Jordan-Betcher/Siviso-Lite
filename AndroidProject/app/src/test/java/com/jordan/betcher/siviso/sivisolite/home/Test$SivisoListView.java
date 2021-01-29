package com.jordan.betcher.siviso.sivisolite.home;

import com.jordan.betcher.siviso.sivisolite.home.sivisolistview.DropDown$Default;
import com.jordan.betcher.siviso.sivisolite.home.sivisolistview.DropDown$Home;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test$SivisoListView
{
	@Test
	public void __defaultDropDown()
	{
		SivisoListView sivisoListView = new SivisoListView();
		DropDown$Default defaultDropDown = sivisoListView.defaultDropDown;
		assertNotNull(defaultDropDown);
	}
	
	@Test public void __homeDropDown()
	{
		SivisoListView sivisoListView = new SivisoListView();
		DropDown$Home homeDropDown = sivisoListView.homeDropDown;
		assertNotNull(homeDropDown);
	}
}