package com.jordan.betcher.siviso.sivisolite.permissions.adapter;

import android.widget.Button;

import com.jordan.betcher.siviso.sivisolite.permissions.Listener;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class Test$Listener$DisableButton
{
	@Test
	public void call__disableButton()
	{
		Button fakeButton = mock(Button.class);
		Listener listener = new Listener$DisableButton(fakeButton);
		
		listener.call();
		
		verify(fakeButton).setEnabled(false);
	}
}