package com.jordan.betcher.siviso.sivisolite.home.sivisolistview;

import android.widget.Spinner;

import com.jordan.betcher.siviso.sivisolite.R;
import com.jordan.betcher.siviso.sivisolite.home.Activity_Home;
import com.jordan.betcher.siviso.sivisolite.home.Database.Database;
import com.jordan.betcher.siviso.sivisolite.home.Siviso;
import com.jordan.betcher.siviso.sivisolite.home.mapview.map.Map;

public class SivisoListView
{
	
	public SivisoListView(Activity_Home activity, Database database, Map map)
	{
		Spinner defaultSpinner = activity.findViewById(R.id.spinnerDefault);
		Spinner homeSpinner = activity.findViewById(R.id.spinnerHome);
		Siviso siviso = new Siviso();
		
		new DropDown$Default(defaultSpinner, new ArrayAdapter$Siviso(activity, siviso),
		                                       database.defaultt(), new OnClick$Save$Default(database.defaultt()));
		new DropDown$Home(homeSpinner, new ArrayAdapter$Siviso(activity, siviso),
		                                 database.homee(), new OnClick$Save$Home(database.homee()));
	}
}
