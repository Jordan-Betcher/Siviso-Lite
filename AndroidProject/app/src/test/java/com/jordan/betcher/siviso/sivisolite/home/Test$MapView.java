package com.jordan.betcher.siviso.sivisolite.home;

import android.location.LocationManager;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.SupportMapFragment;
import com.jordan.betcher.siviso.sivisolite.home.mapview.lock.Lock$Map;
import com.jordan.betcher.siviso.sivisolite.home.mapview.map.Map;
import com.jordan.betcher.siviso.sivisolite.thirdparty.permissions.Permission$AccessFineLocation;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Test$MapView
{
	@Test
	public void __mapLock()
	{
		LocationManager locationManager = mock(LocationManager.class);
		SupportMapFragment supportMapFragment = mock(SupportMapFragment.class);
		View viewMap = mock(View.class);
		when(supportMapFragment.getView()).thenReturn(viewMap);
		Button viewLock = mock(Button.class);
		Permission$AccessFineLocation permission = mock(Permission$AccessFineLocation.class);
		
		MapView mapView = new MapView(locationManager, supportMapFragment, viewLock, permission);
		Lock$Map lock = mapView.lock;
		assertNotNull(lock);
	}
	
	@Test
	public void __map()
	{
		
		LocationManager locationManager = mock(LocationManager.class);
		SupportMapFragment supportMapFragment = mock(SupportMapFragment.class);
		View viewMap = mock(View.class);
		when(supportMapFragment.getView()).thenReturn(viewMap);
		Button viewLock = mock(Button.class);
		Permission$AccessFineLocation permission = mock(Permission$AccessFineLocation.class);
		
		MapView mapView = new MapView(locationManager, supportMapFragment, viewLock, permission);
		Map map = mapView.map;
		assertNotNull(map);
	}
}