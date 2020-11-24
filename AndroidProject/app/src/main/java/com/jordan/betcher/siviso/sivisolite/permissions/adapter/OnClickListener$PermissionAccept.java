package com.jordan.betcher.siviso.sivisolite.permissions.adapter;

import android.view.View;

import com.jordan.betcher.siviso.sivisolite.permissions.Permission;

class OnClickListener$PermissionAccept implements View.OnClickListener
{
	private Permission permission;
	
	public OnClickListener$PermissionAccept(Permission permission)
	{
		this.permission = permission;
	}
	
	@Override
	public void onClick(View view)
	{
		permission.accept(view.getContext());
	}
}
