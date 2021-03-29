package com.jordan.betcher.siviso.sivisolite.home;

import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Switch;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.SupportMapFragment;
import com.jordan.betcher.siviso.sivisolite.R;
import com.jordan.betcher.siviso.sivisolite.home.Database.Database;
import com.jordan.betcher.siviso.sivisolite.home.sivisolistview.SivisoListView;
import com.jordan.betcher.siviso.sivisolite.thirdparty.permissions.Permission$AccessFineLocation;
import com.jordan.betcher.siviso.sivisolite.thirdparty.permissions.Permission$AccessNotificationPolicy;

public class Activity_Home extends AppCompatActivity
{
    
    public MapView mapView;
    public OnOffView onOffView;
    public SivisoListView sivisoListView;
    Permission$AccessNotificationPolicy permissionNotificationPolicy;
    Permission$AccessFineLocation permissionFineLocation;
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        permissionNotificationPolicy = new Permission$AccessNotificationPolicy(this);
        permissionFineLocation = new Permission$AccessFineLocation(this);
        Database database = new Database(this);
        mapView = createMapView(database);
        onOffView = createOnOffView(database);
        sivisoListView = createSivisoListView(database);
    }
    
    private OnOffView createOnOffView(Database database)
    {
        Switch onOffSwitch = findViewById(R.id.switchOnOff);
        Button onOffLock = findViewById(R.id.onOffLock);
        return new OnOffView(this, onOffSwitch, onOffLock, permissionNotificationPolicy, database);
    }
    
    private SivisoListView createSivisoListView(Database database)
    {
        Spinner defaultSpinner = findViewById(R.id.spinnerDefault);
        Spinner homeSpinner = findViewById(R.id.spinnerHome);
        Siviso siviso = new Siviso();
        return new SivisoListView(this, defaultSpinner, homeSpinner, database, siviso);
    }
    
    private MapView createMapView(Database database)
    {
        SupportMapFragment mapFragment = (SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.homeMap);
        LocationManager locationManager = (LocationManager)getSystemService(Context.LOCATION_SERVICE);
        Button mapLock = findViewById(R.id.mapLock);
        
        MapView mapView = new MapView(mapFragment, locationManager, mapLock, permissionFineLocation,
                                      database, getResources());
        return mapView;
    }
    
    //Called after a permission is asked for
    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults)
    {
        permissionFineLocation.grant();
    }
    
    //Called after permissionNotificationPolicy intent finished
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);
        permissionNotificationPolicy.grant();
    }
}