package com.jordan.betcher.siviso.sivisolite.permissions.adapter;

import android.widget.TextView;

import com.jordan.betcher.siviso.sivisolite.permissions.Listener;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class Test$Listener$ColorText
{
	@Test
	public void call__setTextColorToColor()
	{
		TextView fakeTextView = mock(TextView.class);
		int fakeColor = 0;
		
		Listener listener = new Listener$ColorText(fakeTextView, fakeColor);
		listener.call();
		
		verify(fakeTextView, times(1)).setTextColor(fakeColor);
	}
	
	@Test
	public void ListenerColorText__noSetTextColorToColor()
	{
		TextView fakeTextView = mock(TextView.class);
		int fakeColor = 0;
		
		new Listener$ColorText(fakeTextView, fakeColor);
		
		verify(fakeTextView, times(0)).setTextColor(fakeColor);
	}
}