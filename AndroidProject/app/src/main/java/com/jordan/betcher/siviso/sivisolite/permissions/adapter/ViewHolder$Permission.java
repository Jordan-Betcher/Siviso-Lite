package com.jordan.betcher.siviso.sivisolite.permissions.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jordan.betcher.siviso.sivisolite.R;
import com.jordan.betcher.siviso.sivisolite.permissions.Permission;

class ViewHolder$Permission extends RecyclerView.ViewHolder
{
	private TextView permissionName;
	private TextView permissionDetails;
	private Button toggleAcceptButton;
	private Button acceptButton;
	
	ViewHolder$Permission(@NonNull View itemView)
	{
		super(itemView);
		permissionName = itemView.findViewById(R.id.permissionName);
		permissionDetails = itemView.findViewById(R.id.permissionDetails);
		toggleAcceptButton = itemView.findViewById(R.id.permissionToggleDetails);
		acceptButton = itemView.findViewById(R.id.permissionAccept);
	}
	
	static ViewHolder$Permission create(LayoutInflater layoutInflater, ViewGroup parent)
	{
		View view = layoutInflater.inflate(R.layout.list_item_permission, parent, false);
		return new ViewHolder$Permission(view);
	}
	
	public void populateView(Permission permission)
	{
		Context context = itemView.getContext();
		String name = permission.name();
		String details = permission.details();
		
		setNameText(name);
		setDetailsText(details);
		setDetailsInitialyGone();
		setToggleAcceptOnClickListener();
		setAcceptOnClickListener(permission);
	}
	
	private void setAcceptOnClickListener(Permission permission)
	{
		acceptButton.setOnClickListener(new OnClickListener$PermissionAccept(permission));
	}
	
	private void setToggleAcceptOnClickListener()
	{
		toggleAcceptButton.setOnClickListener(new OnClickListener$PermissionShowDetails(permissionDetails));
	}
	
	private void setDetailsInitialyGone()
	{
		permissionDetails.setVisibility(View.GONE);
	}
	
	private void setDetailsText(String details)
	{
		permissionDetails.setText(details);
	}
	
	private void setNameText(String name)
	{
		permissionName.setText(name);
	}
	
}
