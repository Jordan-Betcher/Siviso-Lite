package com.jordan.betcher.siviso.sivisolite.home;

import android.content.Context;
import android.location.LocationManager;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.SupportMapFragment;
import com.jordan.betcher.siviso.sivisolite.R;
import com.jordan.betcher.siviso.sivisolite.home.Database.Database;
import com.jordan.betcher.siviso.sivisolite.home.sivisolistview.Siviso;
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
        
        Database database = new Database();
        mapView = createMapView(database);
        offOnView = new OffOnView();
        sivisoListView = createSivisoListView(database);
    }
    
    private SivisoListView createSivisoListView(Database database)
    {
        Spinner defaultSpinner = findViewById(R.id.spinnerDefault);
        Siviso siviso = new Siviso();
        return new SivisoListView(this, defaultSpinner, database, siviso);
    }
    
    private MapView createMapView(Database database)
    {
        SupportMapFragment mapFragment = (SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.homeMap);
        LocationManager locationManager = (LocationManager)getSystemService(Context.LOCATION_SERVICE);
        Button mapLock = findViewById(R.id.mapLock);
        Permission$AccessFineLocation permission$AccessFineLocation = new Permission$AccessFineLocation(this);
        
        MapView mapView = new MapView(mapFragment, locationManager, mapLock, permission$AccessFineLocation,
                                      database, getResources());
        return mapView;
    }
    
    //Called after a permission is asked for
    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults)
    {
    
    }
}