package com.jordan.betcher.siviso.sivisolite.permissions.adapter;

import android.widget.Button;

import com.jordan.betcher.siviso.sivisolite.permissions.Listener;

class Listener$DisableButton implements Listener
{
	Button button;
	
	public Listener$DisableButton(Button button){this.button = button;}
	
	@Override
	public void call()
	{
		button.setEnabled(false);
	}
}
