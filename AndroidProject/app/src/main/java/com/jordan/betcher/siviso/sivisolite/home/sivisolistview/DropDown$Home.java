package com.jordan.betcher.siviso.sivisolite.home.sivisolistview;

import android.widget.Spinner;

import com.jordan.betcher.siviso.sivisolite.home.Database.Store$Home;

class DropDown$Home extends DropDown
{
	public DropDown$Home(
	Spinner spinner, ArrayAdapter$Siviso adapter,
	Store$Home store,
	OnClick$Save onClick)
	{
		super(spinner, adapter, store.index(), onClick);
	}
}
