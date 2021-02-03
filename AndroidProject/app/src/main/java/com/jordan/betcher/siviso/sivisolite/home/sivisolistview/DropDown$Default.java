package com.jordan.betcher.siviso.sivisolite.home.sivisolistview;

import android.widget.Spinner;

import com.jordan.betcher.siviso.sivisolite.home.Database.Storage$Default;

public class DropDown$Default
{
	public DropDown$Default(
	Spinner spinner, ArrayAdapter$Siviso adapter,
	Storage$Default storage$Default,
	OnClick$SaveDefault onClick,
	Siviso siviso)
	{
		spinner.setAdapter(adapter);
		spinner.setSelection(siviso.indexOf(storage$Default.defaultSiviso()));
		spinner.setOnItemClickListener(onClick);
	}
}
