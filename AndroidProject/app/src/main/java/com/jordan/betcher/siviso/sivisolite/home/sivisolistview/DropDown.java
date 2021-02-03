package com.jordan.betcher.siviso.sivisolite.home.sivisolistview;

import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

class DropDown
{
	public DropDown(
	Spinner spinner, ArrayAdapter adapter,
	int initialSelection,
	AdapterView.OnItemSelectedListener onClick)
	{
		spinner.setAdapter(adapter);
		spinner.setSelection(initialSelection);
		spinner.setOnItemSelectedListener(onClick);
	}
}
