package com.jordan.betcher.siviso.sivisolite.home.mapview.map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.sivisolite.home.Database.StoreSiviso$Home;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.MapCreator;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.Wrapper$Map;

import org.junit.Test;

public class Test$OnMapReady$OnMapClick$SaveLatLng
{
	@Test
	public void _storeHomeLocationFalse_editableTrue()
	{
		boolean isLocation = false;
		StoreSiviso$Home store$Home = mock(StoreSiviso$Home.class);
		when(store$Home.isLocation()).thenReturn(isLocation);
		
		MapCreator mapCreator = mock(MapCreator.class);
		
		OnMapReady$OnMapClick$SaveLatLng saveLatLng = new OnMapReady$OnMapClick$SaveLatLng(mapCreator, store$Home);
		
		boolean actualEditable = saveLatLng.editable;
		assertNotEquals(isLocation, actualEditable);
	}
	
	@Test
	public void _storeHomeLocationTrue_editableFalse()
	{
		boolean isLocation = true;
		StoreSiviso$Home store$Home = mock(StoreSiviso$Home.class);
		when(store$Home.isLocation()).thenReturn(isLocation);
		
		MapCreator mapCreator = mock(MapCreator.class);
		
		OnMapReady$OnMapClick$SaveLatLng saveLatLng = new OnMapReady$OnMapClick$SaveLatLng(mapCreator, store$Home);
		
		boolean actualEditable = saveLatLng.editable;
		assertNotEquals(isLocation, actualEditable);
	}
	
	@Test
	public void editable_false_setEditableFalse()
	{
		boolean editable = false;
		MapCreator mapCreator = mock(MapCreator.class);
		StoreSiviso$Home store$Home = mock(StoreSiviso$Home.class);
		
		OnMapReady$OnMapClick$SaveLatLng saveLatLng = new OnMapReady$OnMapClick$SaveLatLng(mapCreator, store$Home);
		saveLatLng.setEditable(editable);
		
		boolean actualEditable = saveLatLng.editable;
		assertEquals(editable, actualEditable);
	}
	
	@Test
	public void editable_true_setEditableTrue()
	{
		boolean editable = true;
		MapCreator mapCreator = mock(MapCreator.class);
		StoreSiviso$Home store$Home = mock(StoreSiviso$Home.class);
		
		OnMapReady$OnMapClick$SaveLatLng saveLatLng = new OnMapReady$OnMapClick$SaveLatLng(mapCreator, store$Home);
		saveLatLng.setEditable(editable);
		
		boolean actualEditable = saveLatLng.editable;
		assertEquals(editable, actualEditable);
	}
	
	@Test
	public void onMapClick_latLng00EditableFalse_0SaveLatLng()
	{
		boolean editable = false;
		StoreSiviso$Home store$Home = mock(StoreSiviso$Home.class);
		MapCreator mapCreator = mock(MapCreator.class);
		OnMapReady$OnMapClick$SaveLatLng saveLatLng =
		new OnMapReady$OnMapClick$SaveLatLng(mapCreator, store$Home);
		LatLng latLng = new LatLng(0, 0);
		saveLatLng.editable = editable;
		saveLatLng.onMapClick(latLng);
		verify(store$Home, times(0)).saveLocation(any());
	}
	
	@Test
	public void _mapCreator_addThisToMapCreatorCallWhenReady()
	{
		
		Wrapper$Map map = mock(Wrapper$Map.class);
		StoreSiviso$Home store$Home = mock(StoreSiviso$Home.class);
		MapCreator mapCreator = mock(MapCreator.class);
		
		OnMapReady$OnMapClick$SaveLatLng saveLatLng =
		new OnMapReady$OnMapClick$SaveLatLng(mapCreator, store$Home);
		
		verify(mapCreator, times(1)).callWhenReady(saveLatLng);
	}
	
	@Test
	public void mapReady__addThis()
	{
		Wrapper$Map map = mock(Wrapper$Map.class);
		StoreSiviso$Home store$Home = mock(StoreSiviso$Home.class);
		MapCreator mapCreator = mock(MapCreator.class);
		OnMapReady$OnMapClick$SaveLatLng saveLatLng =
		new OnMapReady$OnMapClick$SaveLatLng(mapCreator, store$Home);
		
		saveLatLng.mapReady(map);
		
		verify(map, times(1)).addOnMapClick(saveLatLng);
	}
	
	@Test
	public void onMapClick_latLng00EditableTrue_SaveLatLng00()
	{
		boolean editable = true;
		StoreSiviso$Home store$Home = mock(StoreSiviso$Home.class);
		MapCreator mapCreator = mock(MapCreator.class);
		OnMapReady$OnMapClick$SaveLatLng saveLatLng =
		new OnMapReady$OnMapClick$SaveLatLng(mapCreator, store$Home);
		LatLng latLng = new LatLng(0, 0);
		saveLatLng.editable = editable;
		saveLatLng.onMapClick(latLng);
		verify(store$Home, times(1)).saveLocation(latLng);
	}
	
	@Test
	public void onMapClick_latLng11EditableTrue_SaveLatLng11()
	{
		boolean editable = true;
		StoreSiviso$Home store$Home = mock(StoreSiviso$Home.class);
		MapCreator mapCreator = mock(MapCreator.class);
		OnMapReady$OnMapClick$SaveLatLng saveLatLng =
		new OnMapReady$OnMapClick$SaveLatLng(mapCreator, store$Home);
		LatLng latLng = new LatLng(1, 1);
		saveLatLng.editable = editable;
		saveLatLng.onMapClick(latLng);
		verify(store$Home, times(1)).saveLocation(latLng);
	}
}