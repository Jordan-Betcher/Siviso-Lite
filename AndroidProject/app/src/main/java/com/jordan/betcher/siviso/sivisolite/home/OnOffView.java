package com.jordan.betcher.siviso.sivisolite.home;

import com.jordan.betcher.siviso.sivisolite.home.onoffview.lock.Lock$OnOff;
import com.jordan.betcher.siviso.sivisolite.home.onoffview.onoff.OnOff;

class OnOffView
{
	public OnOff onOff;
	Lock$OnOff lock;
	
	public OnOffView()
	{
		lock = new Lock$OnOff();
		onOff = new OnOff();
	}
}
