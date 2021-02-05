package com.jordan.betcher.siviso.sivisolite.home;

import android.widget.Switch;

import com.jordan.betcher.siviso.sivisolite.home.Database.Database;
import com.jordan.betcher.siviso.sivisolite.home.onoffview.lock.Lock$OnOff;
import com.jordan.betcher.siviso.sivisolite.home.onoffview.onoff.OnOff;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

public class Test$OnOffView
{
	@Test
	public void __hasOnOff()
	{
		OnOffView onOffView = new OnOffView(mock(Switch.class), mock(Database.class));
		OnOff onOff = onOffView.onOff;
		assertNotNull(onOff);
	}
	
	@Test
	public void __hasLockOnOff()
	{
		OnOffView onOffView = new OnOffView(mock(Switch.class), mock(Database.class));
		Lock$OnOff lock = onOffView.lock;
		assertNotNull(lock);
	}
}