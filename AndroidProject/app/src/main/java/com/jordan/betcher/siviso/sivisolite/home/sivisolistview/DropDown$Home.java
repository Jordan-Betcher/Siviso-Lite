package com.jordan.betcher.siviso.sivisolite.home.sivisolistview;

import android.widget.Spinner;

import com.jordan.betcher.siviso.sivisolite.home.Database.Store$Home;
import com.jordan.betcher.siviso.sivisolite.home.Siviso;

class DropDown$Home extends DropDown
{
	public DropDown$Home(
	Spinner spinner, ArrayAdapter$Siviso adapter,
	Store$Home store,
	OnClick$Save onClick, Siviso siviso)
	{
		super(spinner, adapter, store, onClick, siviso);
	}
}
