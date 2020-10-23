package com.jordan.betcher.siviso.sivisolite.permissions;

import android.app.Activity;
import android.content.Context;

interface PermissionData
{
	String name();
	String manifestName();
	String details();
	boolean isPermissionAccepted(Context context);
	void acceptPermission(Activity activity);
}
