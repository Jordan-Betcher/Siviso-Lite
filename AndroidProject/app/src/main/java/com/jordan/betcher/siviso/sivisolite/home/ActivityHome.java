package com.jordan.betcher.siviso.sivisolite.home;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.SupportMapFragment;
import com.jordan.betcher.siviso.sivisolite.R;
import com.jordan.betcher.siviso.sivisolite.home.sivisomap.SivisoMap;

public class ActivityHome extends AppCompatActivity
{
    SivisoMap sivisoMap;
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    
        sivisoMap = createSivisoMap();
    }
    
    private SivisoMap createSivisoMap()
    {
        SupportMapFragment mapFragment =
            (SupportMapFragment)
            getSupportFragmentManager()
            .findFragmentById(R.id.homeMap);
    
        SivisoMap sivisoMap = new SivisoMap(mapFragment);
        
        return sivisoMap;
    }
}