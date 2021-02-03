package com.jordan.betcher.siviso.sivisolite.home.sivisolistview;

import android.view.View;
import android.widget.AdapterView;

import com.jordan.betcher.siviso.sivisolite.home.Database.Store$Default;

public class OnClick$SaveDefault implements AdapterView.OnItemSelectedListener
{
	private Store$Default storage$Default;
	
	public OnClick$SaveDefault(Store$Default storage$Default)
	{
		this.storage$Default = storage$Default;
	}
	
	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
	{
		storage$Default.saveSiviso(position);
	}
	
	@Override
	public void onNothingSelected(AdapterView<?> parent)
	{
	
	}
}
