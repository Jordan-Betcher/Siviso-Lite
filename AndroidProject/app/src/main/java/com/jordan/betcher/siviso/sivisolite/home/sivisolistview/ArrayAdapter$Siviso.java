package com.jordan.betcher.siviso.sivisolite.home.sivisolistview;

import android.content.Context;
import android.widget.ArrayAdapter;

import com.jordan.betcher.siviso.sivisolite.home.Siviso;

class ArrayAdapter$Siviso extends ArrayAdapter<String>
{
	public ArrayAdapter$Siviso(Context context, Siviso siviso)
	{
		super(context, android.R.layout.simple_list_item_1, siviso.sivisos());
	}
}
