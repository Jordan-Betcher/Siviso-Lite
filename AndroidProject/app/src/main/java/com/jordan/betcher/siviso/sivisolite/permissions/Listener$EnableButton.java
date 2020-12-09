package com.jordan.betcher.siviso.sivisolite.permissions;

import android.widget.Button;

class Listener$EnableButton implements Listener
{
	private Button button;
	
	public Listener$EnableButton(Button button){this.button = button;}
	
	@Override
	public void call()
	{
		button.setEnabled(true);
	}
}
