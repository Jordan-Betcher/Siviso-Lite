package com.jordan.betcher.siviso.sivisolite.home.sivisolistview;

import android.view.View;
import android.widget.AdapterView;

import com.jordan.betcher.siviso.sivisolite.home.Database.StoreSiviso;

class OnClick$Save implements AdapterView.OnItemSelectedListener
{
	private StoreSiviso storeSiviso;
	
	public OnClick$Save(StoreSiviso storeSiviso)
	{
		this.storeSiviso = storeSiviso;
	}
	
	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
	{
		storeSiviso.saveSivisoIndex(position);
	}
	
	@Override
	public void onNothingSelected(AdapterView<?> parent)
	{
	
	}
}
