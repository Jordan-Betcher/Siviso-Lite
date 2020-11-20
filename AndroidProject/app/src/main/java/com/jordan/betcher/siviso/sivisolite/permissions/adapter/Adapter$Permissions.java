package com.jordan.betcher.siviso.sivisolite.permissions.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jordan.betcher.siviso.sivisolite.permissions.Permission;

class Adapter$Permissions extends RecyclerView.Adapter<ViewHolder$Permission>
{
	Permission[] permissions;
	
	public Adapter$Permissions(Permission... permissions)
	{
		this.permissions = permissions;
	}
	
	@Override
	public int getItemCount()
	{
		return permissions.length;
	}
	
	@NonNull
	@Override
	public ViewHolder$Permission onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
	{
		Context context = parent.getContext();
		LayoutInflater layoutInflater = LayoutInflater.from(context);
		return ViewHolder$Permission.create(layoutInflater, parent);
	}
	
	@Override
	public void onBindViewHolder(@NonNull ViewHolder$Permission viewHolder, int position)
	{
		viewHolder.populateView(permissions[position]);
	}
}

