package com.jordan.betcher.siviso.sivisolite.permissions;

import android.content.Context;

public interface Permission
{
	String name();
	
	String details();
	
	void accept(Context context);
}
