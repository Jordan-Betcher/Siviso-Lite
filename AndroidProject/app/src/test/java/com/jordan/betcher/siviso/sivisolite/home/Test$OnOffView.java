package com.jordan.betcher.siviso.sivisolite.home;

import com.jordan.betcher.siviso.sivisolite.home.onoffview.lock.Lock$OnOff;
import com.jordan.betcher.siviso.sivisolite.home.onoffview.onoff.OnOff;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class Test$OnOffView
{
	@Test
	public void __hasOnOff()
	{
		OnOffView onOffView = new OnOffView();
		OnOff onOff = onOffView.onOff;
		assertNotNull(onOff);
	}
	
	@Test
	public void __hasLockOnOff()
	{
		OnOffView onOffView = new OnOffView();
		Lock$OnOff lock = onOffView.lock;
		assertNotNull(lock);
	}
}