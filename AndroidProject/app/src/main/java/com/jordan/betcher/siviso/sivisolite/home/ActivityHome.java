package com.jordan.betcher.siviso.sivisolite.home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;

import com.google.android.gms.maps.SupportMapFragment;
import com.jordan.betcher.siviso.sivisolite.R;

public class ActivityHome extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    
        setupMap();
    }
    
    private void setupMap()
    {
        SupportMapFragment mapFragment =
        (SupportMapFragment)
        this
        .getSupportFragmentManager()
        .findFragmentById(R.id.homeMap);
    
        Context context = this;
        SivisoGoogleMap map = new SivisoGoogleMap(this, mapFragment);
    }
}