package com.jordan.betcher.siviso.sivisolite.permissions;

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
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_permissions);
		
		Permission accessFineLocation = new Permission$AccessFineLocation(this);
		
		LinearLayoutManager layoutManager = new LinearLayoutManager(this);
		Adapter$Permissions permissionArrayAdapter = new Adapter$Permissions(accessFineLocation);
		RecyclerView permissionsView = findViewById(R.id.permissionsList);
		permissionsView.setLayoutManager(layoutManager);
		permissionsView.setAdapter(permissionArrayAdapter);
		
		Button continueButton = findViewById(R.id.permissionsContinue);
		continueButton.setEnabled(false);
	}
	
	@Override
	public void onRequestPermissionsResult(int requestCode, String[] permissionNames, int[] grantResults)
	{
	
	}
}