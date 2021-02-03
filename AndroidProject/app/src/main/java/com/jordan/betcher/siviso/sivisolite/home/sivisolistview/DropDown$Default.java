package com.jordan.betcher.siviso.sivisolite.home.sivisolistview;

import android.widget.Spinner;

import com.jordan.betcher.siviso.sivisolite.home.Database.Store$Default;

class DropDown$Default extends DropDown
{
	public DropDown$Default(
	Spinner spinner, ArrayAdapter$Siviso adapter,
	Store$Default store,
	OnClick$Save onClick)
	{
		super(spinner, adapter, store.index(), onClick);
	}
}
