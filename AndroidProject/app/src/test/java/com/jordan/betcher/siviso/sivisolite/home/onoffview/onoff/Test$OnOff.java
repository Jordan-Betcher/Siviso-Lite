package com.jordan.betcher.siviso.sivisolite.home.onoffview.onoff;

import android.widget.Switch;

import com.jordan.betcher.siviso.sivisolite.ArgumentMatcher$Same;

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
		
		new OnOff(onOffSwitch, mock(StoreBoolean.class));
		
		OnCheck$PowerService onCheck = new OnCheck$PowerService();
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
		StoreBoolean isOn = mock(StoreBoolean.class);
		Switch onOffSwitch = mock(Switch.class);
		when(isOn.isOn()).thenReturn(false);
		
		new OnOff(onOffSwitch, isOn);
		
		verify(onOffSwitch).setChecked(false);
	}
	
	@Test
	public void _ServiceOnTrue_setCheckedTrue()
	{
		StoreBoolean isOn = mock(StoreBoolean.class);
		Switch onOffSwitch = mock(Switch.class);
		when(isOn.isOn()).thenReturn(true);
		
		new OnOff(onOffSwitch, isOn);
		
		verify(onOffSwitch).setChecked(true);
	}
}