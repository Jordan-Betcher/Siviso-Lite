package com.jordan.betcher.siviso.sivisolite.home.sivisolistview;

import android.widget.AdapterView;
import android.widget.Spinner;

import com.jordan.betcher.siviso.sivisolite.home.Database.Store;
import com.jordan.betcher.siviso.sivisolite.home.Siviso;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class Test$DropDown
{
	@Test
	public void _OnClickSaveDefault_setSpinnerOnClick()
	{
		Spinner spinner = mock(Spinner.class);
		ArrayAdapter$Siviso adapter = mock(ArrayAdapter$Siviso.class);
		Store store = mock(Store.class);
		AdapterView.OnItemSelectedListener onClick = mock(AdapterView.OnItemSelectedListener.class);
		
		new DropDown(spinner, adapter, 0, onClick);
		
		verify(spinner).setOnItemSelectedListener(onClick);
	}
	
	@Test
	public void _DatabaseWithSilentAndAdapterSilentTo1_setSpinnerSelectionTo1()
	{
		int sivisoPosition = 1;
		Spinner spinner = mock(Spinner.class);
		ArrayAdapter$Siviso adapter = mock(ArrayAdapter$Siviso.class);
		Store store = mock(Store.class);
		AdapterView.OnItemSelectedListener onClick = mock(AdapterView.OnItemSelectedListener.class);
		when(store.index()).thenReturn(sivisoPosition);
		
		
		new DropDown(spinner, adapter, sivisoPosition, onClick);
		
		verify(spinner).setSelection(sivisoPosition);
	}
	
	@Test
	public void _DatabaseWithNoneAndAdapterNoneTo0_setSpinnerSelectionTo0()
	{
		int sivisoPosition = 0;
		Spinner spinner = mock(Spinner.class);
		ArrayAdapter$Siviso adapter = mock(ArrayAdapter$Siviso.class);
		Store store = mock(Store.class);
		AdapterView.OnItemSelectedListener onClick = mock(AdapterView.OnItemSelectedListener.class);
		Siviso siviso = mock(Siviso.class);
		when(store.index()).thenReturn(sivisoPosition);
		
		
		new DropDown(spinner, adapter, sivisoPosition, onClick);
		
		verify(spinner).setSelection(sivisoPosition);
	}
	
	@Test
	public void _SpinnerAndAdapter_setSpinnerAdapterToAdapter()
	{
		Spinner spinner = mock(Spinner.class);
		ArrayAdapter$Siviso adapter = mock(ArrayAdapter$Siviso.class);
		Store store = mock(Store.class);
		AdapterView.OnItemSelectedListener onClick = mock(AdapterView.OnItemSelectedListener.class);
		
		new DropDown(spinner, adapter, 0, onClick);
		
		verify(spinner).setAdapter(adapter);
	}
}