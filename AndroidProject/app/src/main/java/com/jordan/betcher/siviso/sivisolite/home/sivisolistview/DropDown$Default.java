package com.jordan.betcher.siviso.sivisolite.home.sivisolistview;

import android.widget.Spinner;

import com.jordan.betcher.siviso.sivisolite.home.Database.StoreSiviso$Default;

class DropDown$Default extends DropDown
{
	public DropDown$Default(
	Spinner spinner, ArrayAdapter$Siviso adapter,
	StoreSiviso$Default store,
	OnClick$Save onClick)
	{
		super(spinner, adapter, store.index(), onClick);
	}
}
