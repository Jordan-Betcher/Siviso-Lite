package com.jordan.betcher.siviso.sivisolite.home.onoffview.onoff;

import android.content.Context;
import android.widget.Switch;

import com.jordan.betcher.siviso.sivisolite.ArgumentMatcher$Same;
import com.jordan.betcher.siviso.sivisolite.home.Database.StoreBoolean$ServiceRunning;

import org.junit.Test;

import static org.mockito.Matchers.argThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class Test$OnOff
{
	@Test
	public void __setOnCheckedChangeListenerToOnCheckPowerService()
	{
		Switch onOffSwitch = mock(Switch.class);
		Context context = mock(Context.class);
		
		new OnOff(context, onOffSwitch, mock(StoreBoolean$ServiceRunning.class));
		
		OnCheck$PowerService onCheck = new OnCheck$PowerService(new ServiceSiviso(context,
		                                                                          mock(StoreBoolean$ServiceRunning.class),
		                                                                          mock(Intent$Service$Siviso.class)));
		verify(onOffSwitch).setOnCheckedChangeListener(argThat(new Same$PowerService(onCheck)));
	}
	
	class Same$PowerService extends ArgumentMatcher$Same<OnCheck$PowerService>
	{
		
		public Same$PowerService(
		OnCheck$PowerService first)
		{
			super(first);
		}
		
		@Override
		protected boolean isSameValues(
		OnCheck$PowerService other)
		{
			return true;
		}
	}
	
	
	@Test
	public void _ServiceOnFalse_setCheckedFalse()
	{
		StoreBoolean$ServiceRunning isOn = mock(StoreBoolean$ServiceRunning.class);
		Switch onOffSwitch = mock(Switch.class);
		when(isOn.isTrue()).thenReturn(false);
		
		new OnOff(mock(Context.class), onOffSwitch, isOn);
		
		verify(onOffSwitch).setChecked(false);
	}
	
	@Test
	public void _ServiceOnTrue_setCheckedTrue()
	{
		StoreBoolean$ServiceRunning isOn = mock(StoreBoolean$ServiceRunning.class);
		Switch onOffSwitch = mock(Switch.class);
		when(isOn.isTrue()).thenReturn(true);
		
		new OnOff(mock(Context.class), onOffSwitch, isOn);
		
		verify(onOffSwitch).setChecked(true);
	}
}