package com.jordan.betcher.siviso.sivisolite.home.sivisolistview;

import android.widget.Spinner;

import com.jordan.betcher.siviso.sivisolite.home.Database.Store$Default;
import com.jordan.betcher.siviso.sivisolite.home.Siviso;

class DropDown$Default extends DropDown
{
	public DropDown$Default(
	Spinner spinner, ArrayAdapter$Siviso adapter,
	Store$Default store,
	OnClick$Save onClick, Siviso siviso)
	{
		super(spinner, adapter, store, onClick, siviso);
	}
}
