package com.jordan.betcher.siviso.sivisolite.home.sivisolistview;

import android.content.Context;
import android.widget.Spinner;

import com.jordan.betcher.siviso.sivisolite.home.Database.Database;
import com.jordan.betcher.siviso.sivisolite.home.Siviso;

public class SivisoListView
{
	DropDown$Default defaultDropDown;
	DropDown$Home homeDropDown = new DropDown$Home();
	
	public SivisoListView(Context context, Spinner defaultSpinner, Database database, Siviso siviso)
	{
		defaultDropDown = new DropDown$Default(defaultSpinner, new ArrayAdapter$Siviso(context, siviso),
		                                       database, new OnClick$SaveDefault(database), siviso);
	}
}
