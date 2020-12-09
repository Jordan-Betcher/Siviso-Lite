package com.jordan.betcher.siviso.sivisolite.permissions;

import android.widget.Button;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class Test$Listener$EnableButton
{
	@Test
	public void call__enableButton()
	{
		Button fakeButton = mock(Button.class);
		
		Listener$EnableButton listener = new Listener$EnableButton(fakeButton);
		listener.call();
		
		verify(fakeButton, times(1)).setEnabled(true);
	}
	
	@Test
	public void __notEnableButtonYet()
	{
		Button fakeButton = mock(Button.class);
		
		new Listener$EnableButton(fakeButton);
		
		verify(fakeButton, times(0)).setEnabled(true);
	}
}