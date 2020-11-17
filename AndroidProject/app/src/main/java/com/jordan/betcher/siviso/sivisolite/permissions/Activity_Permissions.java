package com.jordan.betcher.siviso.sivisolite.permissions;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.jordan.betcher.siviso.sivisolite.R;

public class Activity_Permissions extends AppCompatActivity
{
	MVVM$Permissions.View view;
	MVVM$Permissions.Logic logic;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_permissions);
	}
}