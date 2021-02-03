package com.jordan.betcher.siviso.sivisolite.home.sivisolistview;

import android.content.Context;
import android.widget.Spinner;

import com.jordan.betcher.siviso.sivisolite.home.Database.Store$Default;
import com.jordan.betcher.siviso.sivisolite.home.Siviso;

public class SivisoListView
{
	DropDown defaultDropDown;
	DropDown$Home homeDropDown = new DropDown$Home();
	
	public SivisoListView(Context context, Spinner defaultSpinner, Store$Default defaultt, Siviso siviso)
	{
		defaultDropDown = new DropDown(defaultSpinner, new ArrayAdapter$Siviso(context, siviso),
		                               defaultt, new OnClick$SaveDefault(defaultt), siviso);
	}
}
