package com.jordan.betcher.siviso.sivisolite.home.sivisolistview;

import android.widget.Spinner;

import com.jordan.betcher.siviso.sivisolite.home.Database.Storage$Default;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class Test$DropDown$Default
{
	@Test
	public void _OnClickSaveDefault_setSpinnerOnClick()
	{
		Spinner spinner = mock(Spinner.class);
		ArrayAdapter$Siviso adapter = mock(ArrayAdapter$Siviso.class);
		Storage$Default storage$Default = mock(Storage$Default.class);
		OnClick$SaveDefault onClick = mock(OnClick$SaveDefault.class);
		new DropDown$Default(spinner, adapter, storage$Default, onClick);
		
		verify(spinner).setOnItemClickListener(onClick);
	}
	
	@Test
	public void _DatabaseWithSilentAndAdapterSilentTo1_setSpinnerSelectionTo1()
	{
		int sivisoPosition = 1;
		String siviso = "Silent";
		Spinner spinner = mock(Spinner.class);
		ArrayAdapter$Siviso adapter = mock(ArrayAdapter$Siviso.class);
		Storage$Default storage$Default = mock(Storage$Default.class);
		OnClick$SaveDefault onClick = mock(OnClick$SaveDefault.class);
		when(storage$Default.defaultSiviso()).thenReturn(siviso);
		when(adapter.sivisoPosition(siviso)).thenReturn(sivisoPosition);
		
		new DropDown$Default(spinner, adapter, storage$Default, onClick);
		
		verify(spinner).setSelection(sivisoPosition);
	}
	
	@Test
	public void _DatabaseWithNoneAndAdapterNoneTo0_setSpinnerSelectionTo0()
	{
		int sivisoPosition = 0;
		String siviso = "None";
		Spinner spinner = mock(Spinner.class);
		ArrayAdapter$Siviso adapter = mock(ArrayAdapter$Siviso.class);
		Storage$Default storage$Default = mock(Storage$Default.class);
		OnClick$SaveDefault onClick = mock(OnClick$SaveDefault.class);
		when(storage$Default.defaultSiviso()).thenReturn(siviso);
		when(adapter.sivisoPosition(siviso)).thenReturn(sivisoPosition);
		
		new DropDown$Default(spinner, adapter, storage$Default, onClick);
		
		verify(spinner).setSelection(sivisoPosition);
	}
	
	@Test
	public void _SpinnerAndAdapter_setSpinnerAdapterToAdapter()
	{
		Spinner spinner = mock(Spinner.class);
		ArrayAdapter$Siviso adapter = mock(ArrayAdapter$Siviso.class);
		Storage$Default storage$Default = mock(Storage$Default.class);
		OnClick$SaveDefault onClick = mock(OnClick$SaveDefault.class);
		
		new DropDown$Default(spinner, adapter, storage$Default, onClick);
		
		verify(spinner).setAdapter(adapter);
	}
}