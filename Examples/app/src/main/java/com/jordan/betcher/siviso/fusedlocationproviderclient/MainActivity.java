package com.jordan.betcher.siviso.fusedlocationproviderclient;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;

public class MainActivity extends AppCompatActivity
{
	private FusedLocationProviderClient fusedLocationClient;
	private TextView txtLocation;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		setContentView(R.layout.activity_main);
		this.txtLocation = (TextView) findViewById(R.id.txtLocation);
		
		fusedLocationClient = LocationServices.getFusedLocationProviderClient(this);
		
		if(ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) !=
		   PackageManager.PERMISSION_GRANTED
		   &&
		   ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) !=
		   PackageManager.PERMISSION_GRANTED)
		{
			ActivityCompat.requestPermissions(this,
			                                  new String[]{Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION},
			                                  locationRequestCode);
			
		}
		else
		{
			permissionsGranted();
		}
	}
	
	private int locationRequestCode = 1000;
	
	@Override
	public void onRequestPermissionsResult(
	int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults)
	{
		super.onRequestPermissionsResult(requestCode, permissions, grantResults);
		
		switch(requestCode)
		{
			case 1000:
			{
				// If request is cancelled, the result arrays are empty.
				if(grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED)
				{
					permissionsGranted();
				}
				else
				{
					Toast.makeText(this, "Permission denied", Toast.LENGTH_SHORT).show();
				}
				break;
			}
		}
	}
	
	@SuppressLint("MissingPermission")
	private void permissionsGranted()
	{
		LocationCallback locationCallback = new LocationCallback$PrintLocation(txtLocation);
		LocationRequest locationRequest = LocationRequest.create();
		locationRequest.setPriority(LocationRequest.PRIORITY_LOW_POWER);
		locationRequest.setInterval(3);
		locationRequest.setFastestInterval(1);
		//locationRequest.setFastestInterval(30);
		locationRequest.setSmallestDisplacement(20);
		fusedLocationClient.requestLocationUpdates(locationRequest, locationCallback, null);
		//fusedLocationClient.removeLocationUpdates(locationCallback);
		Toast.makeText(this, "permissionsGranted", Toast.LENGTH_SHORT).show();
	}
}