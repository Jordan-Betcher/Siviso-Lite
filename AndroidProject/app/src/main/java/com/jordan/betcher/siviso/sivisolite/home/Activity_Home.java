package com.jordan.betcher.siviso.sivisolite.home;

import android.content.Context;
import android.location.LocationManager;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.sivisolite.R;
import com.jordan.betcher.siviso.sivisolite.thirdparty.permissions.Permission$AccessFineLocation;

public class Activity_Home extends AppCompatActivity
{
    
    public MapView mapView;
    public OffOnView offOnView;
    public SivisoListView sivisoListView;
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    
        mapView = createMapView();
        offOnView = new OffOnView();
        sivisoListView = new SivisoListView();
        this.getResources().getInteger(R.integer.start_zoom);
    }
    
    private MapView createMapView()
    {
        SupportMapFragment mapFragment = (SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.homeMap);
        LocationManager locationManager = (LocationManager)getSystemService(Context.LOCATION_SERVICE);
        Button mapLock = findViewById(R.id.mapLock);
        Permission$AccessFineLocation permission$AccessFineLocation = new Permission$AccessFineLocation(this);
        Database database = new Database(){
            @Override
            public void saveLocation(LatLng latLng)
            {
                Toast.makeText(Activity_Home.this, "Location Saved",
                               Toast.LENGTH_SHORT).show();
            }
    
            @Override
            public boolean hasHome()
            {
                return false;
            }
    
            @Override
            public LatLng home()
            {
                
                return null;
            }
        };
        MapView mapView = new MapView(mapFragment, locationManager, mapLock, permission$AccessFineLocation, database, getResources());
        return mapView;
    }
    
    //Called after a permission is asked for
    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults)
    {
    
    }
}