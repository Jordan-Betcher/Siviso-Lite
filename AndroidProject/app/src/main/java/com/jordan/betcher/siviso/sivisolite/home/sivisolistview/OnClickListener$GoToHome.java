package com.jordan.betcher.siviso.sivisolite.home.sivisolistview;

import android.view.View;

import com.jordan.betcher.siviso.sivisolite.home.mapview.map.Map;

class OnClickListener$GoToHome implements View.OnClickListener
{
	private Map map;
	
	public OnClickListener$GoToHome(Map map)
	{
		this.map = map;
	}
	
	@Override
	public void onClick(View view)
	{
		map.goToHome();
	}
}
