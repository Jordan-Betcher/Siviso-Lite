package com.jordan.betcher.siviso.sivisolite.home.lock;

import android.view.View;

import com.jordan.betcher.siviso.sivisolite.thirdparty.permissions.Permission;

class OnClickListener$RequestPermission implements View.OnClickListener
{
	public Permission permission;
	
	public OnClickListener$RequestPermission(Permission permission){this.permission = permission;}
	
	
	@Override
	public void onClick(View v)
	{
		permission.request();
	}
}
