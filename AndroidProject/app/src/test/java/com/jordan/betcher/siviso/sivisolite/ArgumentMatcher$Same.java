package com.jordan.betcher.siviso.sivisolite;

import org.mockito.ArgumentMatcher;

public abstract class ArgumentMatcher$Same<T> extends ArgumentMatcher<T> 
{
	protected T first;
	
	public ArgumentMatcher$Same(T first)
	{
		this.first = first;
	}
	
	@Override
	public boolean matches(Object argument)
	{
		try
		{
			T other = (T) argument;
			return isSameValues(other);
		}
		catch(ClassCastException exception)
		{
			return false;
		}
	}
	
	protected abstract boolean isSameValues(T other);
}
