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
	Permissions permissions;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setupView();
		
		setupPermissions();
		
		setupPermissionList(permissions);
		
		setupContinueButton();
	}
	
	void setupView()
	{
		setContentView(R.layout.activity_permissions);
	}
	
	void setupPermissions()
	{
		Permission accessFineLocation = new Permission$AccessFineLocation(this);
		permissions = new Permissions(accessFineLocation);
	}
	
	void setupPermissionList(Permissions permissions)
	{
		RecyclerView permissionsView = findViewById(R.id.permissionsList);
		
		LinearLayoutManager layoutManager = new LinearLayoutManager(this);
		permissionsView.setLayoutManager(layoutManager);
		
		Permission[] permissionsArray = permissions.array();
		Adapter$Permissions permissionArrayAdapter = new Adapter$Permissions(permissionsArray);
		permissionsView.setAdapter(permissionArrayAdapter);
	}
	
	void setupContinueButton()
	{
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