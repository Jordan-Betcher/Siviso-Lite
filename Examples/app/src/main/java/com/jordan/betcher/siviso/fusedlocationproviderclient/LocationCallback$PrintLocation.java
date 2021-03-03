package com.jordan.betcher.siviso.fusedlocationproviderclient;

import android.widget.TextView;

import androidx.annotation.NonNull;

import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;

class LocationCallback$PrintLocation extends LocationCallback
{
	private TextView txtLocation;
	
	public LocationCallback$PrintLocation(TextView txtLocation)
	{
		super();
		this.txtLocation = txtLocation;
	}
	
	@Override
	public void onLocationResult(
	@NonNull LocationResult locationResult)
	{
		super.onLocationResult(locationResult);
		String lastLocation = locationResult.getLastLocation().toString();
		txtLocation.setText(txtLocation.getText() + "\n" + lastLocation);
	}
	
	@Override
	public void onLocationAvailability(
	@NonNull LocationAvailability locationAvailability)
	{
		super.onLocationAvailability(locationAvailability);
		txtLocation.setText(txtLocation.getText() + "\n" + "Location Available");
	}
}
