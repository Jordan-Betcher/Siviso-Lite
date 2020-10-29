package com.jordan.betcher.siviso.sivisolite.thirdparty.button;

import android.view.View;
import android.widget.Button;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class Test$Wrapper$Button
{
	@Test
	public void addButtonClick_OnClickListener_AddOnClickListenerToButton()
	{
		Button fakeButton = mock(Button.class);
		Wrapper$Button wrapper$Button = new Wrapper$Button(fakeButton);
		View.OnClickListener fakeOnClickListener = mock(View.OnClickListener.class);
		
		wrapper$Button.addOnClickListener(fakeOnClickListener);
		
		verify(fakeButton).setOnClickListener(fakeOnClickListener);
	}
	
	@Test
	public void disable_called_ButtonSetEnabledFalse()
	{
		Button fakeButton = mock(Button.class);
		Wrapper$Button wrapper$Button = new Wrapper$Button(fakeButton);
		
		wrapper$Button.disable();
		
		verify(fakeButton).setEnabled(false);
	}
}