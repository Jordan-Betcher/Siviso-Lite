package com.jordan.betcher.siviso.sivisolite.home;

import android.view.View;

import com.jordan.betcher.siviso.sivisolite.thirdparty.permissions.Permission;

class OnClickListener$CheckPermission implements View.OnClickListener
{
	Permission permission;
	
	public OnClickListener$CheckPermission(Permission permission)
	{
		this.permission = permission;
	}
	
	@Override
	public void onClick(View v)
	{
		permission.check();
	}
}
