package com.jordan.betcher.siviso.sivisolite.home.sivisolistview;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class ArrayAdapter$Siviso extends ArrayAdapter<String>
{
	public ArrayAdapter$Siviso(Context context)
	{
		super(context, android.R.layout.simple_list_item_1, new ArrayList<String>(){});
	}
	
	public int sivisoPosition(String selectedSiviso)
	{
		return -1;
	}
}
