package com.jordan.betcher.siviso.sivisolite.home.sivisolistview;

import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.jordan.betcher.siviso.sivisolite.home.Database.Store;
import com.jordan.betcher.siviso.sivisolite.home.Siviso;

class DropDown
{
	public DropDown(
	Spinner spinner, ArrayAdapter adapter,
	Store store,
	OnClick$SaveDefault onClick,
	Siviso siviso)
	{
		spinner.setAdapter(adapter);
		spinner.setSelection(siviso.indexOf(store.siviso()));
		spinner.setOnItemSelectedListener(onClick);
	}
}
