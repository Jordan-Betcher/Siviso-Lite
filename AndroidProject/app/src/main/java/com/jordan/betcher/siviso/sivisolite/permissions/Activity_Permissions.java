package com.jordan.betcher.siviso.sivisolite.permissions;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.jordan.betcher.siviso.sivisolite.R;
import com.jordan.betcher.siviso.sivisolite.permissions.adapter.Adapter$Permissions;

public class Activity_Permissions extends AppCompatActivity
{
	MVVM$Permissions.View view;
	MVVM$Permissions.Logic logic;
	
	Permissions permissions;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_permissions);
		
		Permissions permissions = new Permissions(this);
		Permission[] permissionsList = permissions.list();
		
		LinearLayoutManager layoutManager = new LinearLayoutManager(this);
		Adapter$Permissions permissionArrayAdapter = new Adapter$Permissions(permissionsList);
		RecyclerView permissionsView = findViewById(R.id.permissionsList);
		permissionsView.setLayoutManager(layoutManager);
		permissionsView.setAdapter(permissionArrayAdapter);
		
		Button continueButton = findViewById(R.id.permissionsContinue);
		continueButton.setEnabled(false);
	}
	
	@Override
	public void onRequestPermissionsResult(int requestCode, String[] permissionNames, int[] grantResults)
	{
		for(int index = 0; index < grantResults.length; index++)
		{
			int result = grantResults[index];
			if(result == PackageManager.PERMISSION_GRANTED)
			{
				String name = permissionNames[index];
				permissions.permissionGranted(name);
			}
		}
	}
}