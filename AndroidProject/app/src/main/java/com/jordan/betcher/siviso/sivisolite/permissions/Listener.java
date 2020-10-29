package com.jordan.betcher.siviso.sivisolite.permissions;

interface Listener<T>
{
	void callWhenReady(T eventObject);
}
