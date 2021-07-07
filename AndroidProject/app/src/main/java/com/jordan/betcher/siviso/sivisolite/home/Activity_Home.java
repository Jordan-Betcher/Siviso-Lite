package com.jordan.betcher.siviso.sivisolite.home;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.jordan.betcher.siviso.sivisolite.R;
import com.jordan.betcher.siviso.sivisolite.home.Database.Database;
import com.jordan.betcher.siviso.sivisolite.home.mapview.map.Map;
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
    Map map;
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        
        map = new Map(){};
        
        permissionNotificationPolicy = new Permission$AccessNotificationPolicy(this);
        permissionFineLocation = new Permission$AccessFineLocation(this);
        Database database = new Database(this);
        mapView = createMapView(database, map);
        onOffView = createOnOffView(database);
        sivisoListView = createSivisoListView(database, map);
    }
    
    private OnOffView createOnOffView(Database database)
    {
        return new OnOffView(this, permissionNotificationPolicy, database);
    }
    
    private SivisoListView createSivisoListView(
    Database database, Map map)
    {
        return new SivisoListView(this, database, map);
    }
    
    private MapView createMapView(
    Database database, Map map)
    {
        MapView mapView = new MapView(this, permissionFineLocation, database, map);
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