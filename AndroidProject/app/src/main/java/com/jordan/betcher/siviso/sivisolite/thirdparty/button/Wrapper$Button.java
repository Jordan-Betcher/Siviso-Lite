package com.jordan.betcher.siviso.sivisolite.thirdparty.button;

import android.view.View;
import android.widget.Button;

public class Wrapper$Button
{
	private Button button;
	
	public Wrapper$Button(Button button)
	{
		this.button = button;
	}
	
	public void addOnClickListener(View.OnClickListener onClickListener)
	{
		button.setOnClickListener(onClickListener);
	}
	
	public void disable()
	{
		button.setEnabled(false);
	}
}
