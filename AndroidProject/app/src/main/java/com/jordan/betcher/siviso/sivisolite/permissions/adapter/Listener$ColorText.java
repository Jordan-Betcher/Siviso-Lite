package com.jordan.betcher.siviso.sivisolite.permissions.adapter;

import android.widget.TextView;

import com.jordan.betcher.siviso.sivisolite.permissions.Listener;

class Listener$ColorText implements Listener
{
	public int color;
	public TextView textView;
	
	public Listener$ColorText(TextView textView, int color)
	{
		this.textView = textView;
		this.color = color;
	}
	
	@Override
	public void call()
	{
		textView.setTextColor(color);
	}
}
