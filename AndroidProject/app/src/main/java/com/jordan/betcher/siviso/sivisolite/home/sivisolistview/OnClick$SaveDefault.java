package com.jordan.betcher.siviso.sivisolite.home.sivisolistview;

import android.view.View;
import android.widget.AdapterView;

import com.jordan.betcher.siviso.sivisolite.home.Database.Storage$Default;

public class OnClick$SaveDefault implements AdapterView.OnItemSelectedListener
{
	private Storage$Default storage$Default;
	
	public OnClick$SaveDefault(Storage$Default storage$Default)
	{
		this.storage$Default = storage$Default;
	}
	
	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
	{
		storage$Default.saveDefaultSiviso(position);
	}
	
	@Override
	public void onNothingSelected(AdapterView<?> parent)
	{
	
	}
}
