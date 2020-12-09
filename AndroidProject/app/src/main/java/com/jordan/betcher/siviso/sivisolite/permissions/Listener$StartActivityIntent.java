package com.jordan.betcher.siviso.sivisolite.permissions;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

class Listener$StartActivityIntent implements View.OnClickListener
{
	private final Activity activity;
	private Intent startActivityIntent;
	
	public Listener$StartActivityIntent(Activity activity, Intent startActivityIntent)
	{
		this.activity = activity;
		this.startActivityIntent = startActivityIntent;
	}
	
	@Override
	public void onClick(View v)
	{
		activity.startActivity(startActivityIntent);
	}
}
