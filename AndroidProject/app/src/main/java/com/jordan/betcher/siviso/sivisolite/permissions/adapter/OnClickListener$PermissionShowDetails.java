package com.jordan.betcher.siviso.sivisolite.permissions.adapter;

import android.view.View;
import android.widget.TextView;

class OnClickListener$PermissionShowDetails implements View.OnClickListener
{
	private TextView permissionDetails;
	
	public OnClickListener$PermissionShowDetails(TextView permissionDetails)
	{
		this.permissionDetails = permissionDetails;
	}
	
	@Override
	public void onClick(View v)
	{
		if(permissionDetails.getVisibility() == View.VISIBLE)
		{
			permissionDetails.setVisibility(View.GONE);
		}
		else
		{
			permissionDetails.setVisibility(View.VISIBLE);
		}
	}
}
