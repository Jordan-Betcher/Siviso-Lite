package com.jordan.betcher.siviso.sivisolite.home;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.SupportMapFragment;
import com.jordan.betcher.siviso.sivisolite.R;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.MapCreator;
import com.jordan.betcher.siviso.sivisolite.thirdparty.locationManager.CurrentLocation;

public class ActivityHome extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    
        SupportMapFragment mapFragment =
        (SupportMapFragment)
        getSupportFragmentManager()
        .findFragmentById(R.id.homeMap);
        
        MapCreator mapCreator = new MapCreator(mapFragment);
        CurrentLocation currentLocation = new CurrentLocation(this);
        new GoToCurrentLocation(mapCreator, currentLocation);
    }
}