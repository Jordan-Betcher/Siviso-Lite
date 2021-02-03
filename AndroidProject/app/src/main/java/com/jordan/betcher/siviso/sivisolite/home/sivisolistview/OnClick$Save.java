package com.jordan.betcher.siviso.sivisolite.home.sivisolistview;

import android.view.View;
import android.widget.AdapterView;

import com.jordan.betcher.siviso.sivisolite.home.Database.Store;

public class OnClick$Save implements AdapterView.OnItemSelectedListener
{
	private Store store;
	
	public OnClick$Save(Store store)
	{
		this.store = store;
	}
	
	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
	{
		store.saveSiviso(position);
	}
	
	@Override
	public void onNothingSelected(AdapterView<?> parent)
	{
	
	}
}
