package com.jordan.betcher.siviso.sivisolite.home;

import android.content.Context;
import android.widget.Switch;

import com.jordan.betcher.siviso.sivisolite.home.Database.Database;
import com.jordan.betcher.siviso.sivisolite.home.onoffview.lock.Lock$OnOff;
import com.jordan.betcher.siviso.sivisolite.home.onoffview.onoff.OnOff;
import com.jordan.betcher.siviso.sivisolite.home.Database.StoreBoolean$ServiceRunning;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Test$OnOffView
{
	@Test
	public void __hasOnOff()
	{
		Database database = mock(Database.class);
		when(database.isOnn()).thenReturn(mock(StoreBoolean$ServiceRunning.class));
		OnOffView onOffView = new OnOffView(mock(Context.class), mock(Switch.class), database);
		OnOff onOff = onOffView.onOff;
		assertNotNull(onOff);
	}
	
	@Test
	public void __hasLockOnOff()
	{
		Database database = mock(Database.class);
		when(database.isOnn()).thenReturn(mock(StoreBoolean$ServiceRunning.class));
		OnOffView onOffView = new OnOffView(mock(Context.class), mock(Switch.class), database);
		Lock$OnOff lock = onOffView.lock;
		assertNotNull(lock);
	}
}