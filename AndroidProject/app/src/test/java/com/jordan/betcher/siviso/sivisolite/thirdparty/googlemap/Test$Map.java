package com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap;

import android.location.Location;
import android.os.IBinder;
import android.os.RemoteException;

import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.maps.zzh;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.robolectric.annotation.Config;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(PowerMockRunner.class)
@Config(manifest = Config.NONE)
@PrepareForTest({GoogleMap.class, CameraUpdate.class, Circle.class})
@PowerMockIgnore({ "org.mockito.*", "org.robolectric.*", "android.*", "androidx.*" })
public class Test$Map
{
	@Test
	public void setOnMapClickListener_called_setOnMapClickListener()
	{
		GoogleMap fakeGoogleMap = PowerMockito.mock(GoogleMap.class);
		OnMapClick fakeOnMapClick = PowerMockito.mock(OnMapClick.class);
		Map map = new Map(fakeGoogleMap);
		
		map.setOnMapClick(fakeOnMapClick);
		
		verify(fakeGoogleMap).setOnMapClickListener(isA(GoogleMap.OnMapClickListener.class));
	}
	
	@Test
	public void goToLocation_fakeLocation_CalledCameraWithLocation()
	{
		GoogleMap fakeGoogleMap = PowerMockito.mock(GoogleMap.class);
		Map map = new Map$CameraUpdate(fakeGoogleMap);
		
		Location fakeLocation = PowerMockito.mock(Location.class);
		map.goToLocation(fakeLocation);
		
		verify(fakeGoogleMap).moveCamera(isA(CameraUpdate.class));
	}
	
	@Test
	public void goToLocation_fakeLocation00_CalledLocationCameraUpdateWithLatLng00()
	{
		GoogleMap fakeGoogleMap = PowerMockito.mock(GoogleMap.class);
		Map$CameraUpdate map = new Map$CameraUpdate(fakeGoogleMap);
		
		Location fakeLocation = PowerMockito.mock(Location.class);
		when(fakeLocation.getLatitude()).thenReturn(0.0);
		when(fakeLocation.getLongitude()).thenReturn(0.0);
		map.goToLocation(fakeLocation);
		
		assertEquals(map.latLng, new LatLng(0.0, 0.0));
	}
	
	@Test
	public void goToLocation_fakeLocation11_CalledLocationCameraUpdateWithLatLng11()
	{
		GoogleMap fakeGoogleMap = PowerMockito.mock(GoogleMap.class);
		Map$CameraUpdate map = new Map$CameraUpdate(fakeGoogleMap);
		
		Location fakeLocation = PowerMockito.mock(Location.class);
		when(fakeLocation.getLatitude()).thenReturn(1.0);
		when(fakeLocation.getLongitude()).thenReturn(1.0);
		map.goToLocation(fakeLocation);
		
		assertEquals(map.latLng, new LatLng(1.0, 1.0));
	}
	
	private class Map$CameraUpdate extends Map
	{
		public LatLng latLng;
		public Map$CameraUpdate(GoogleMap googleMap)
		{
			super(googleMap);
		}
		
		@Override
		protected CameraUpdate locationCameraUpdate(LatLng latLng)
		{
			this.latLng = latLng;
			return PowerMockito.mock(CameraUpdate.class);
		}
	}
	
	@Test
	public void createCircle_circleOptions_circle()
	{
		Circle circle = new Circle(new zzh(){
			@Override
			public void remove() throws RemoteException
			{
			
			}
			
			@Override
			public String getId() throws RemoteException
			{
				return null;
			}
			
			@Override
			public void setCenter(LatLng latLng) throws RemoteException
			{
			
			}
			
			@Override
			public LatLng getCenter() throws RemoteException
			{
				return null;
			}
			
			@Override
			public void setRadius(double v) throws RemoteException
			{
			
			}
			
			@Override
			public double getRadius() throws RemoteException
			{
				return 0;
			}
			
			@Override
			public void setStrokeWidth(float v) throws RemoteException
			{
			
			}
			
			@Override
			public float getStrokeWidth() throws RemoteException
			{
				return 0;
			}
			
			@Override
			public void setStrokeColor(int i) throws RemoteException
			{
			
			}
			
			@Override
			public int getStrokeColor() throws RemoteException
			{
				return 0;
			}
			
			@Override
			public void setFillColor(int i) throws RemoteException
			{
			
			}
			
			@Override
			public int getFillColor() throws RemoteException
			{
				return 0;
			}
			
			@Override
			public void setZIndex(float v) throws RemoteException
			{
			
			}
			
			@Override
			public float getZIndex() throws RemoteException
			{
				return 0;
			}
			
			@Override
			public void setVisible(boolean b) throws RemoteException
			{
			
			}
			
			@Override
			public boolean isVisible() throws RemoteException
			{
				return false;
			}
			
			@Override
			public boolean zzb(zzh zzh) throws RemoteException
			{
				return false;
			}
			
			@Override
			public int zzj() throws RemoteException
			{
				return 0;
			}
			
			@Override
			public void setClickable(boolean b) throws RemoteException
			{
			
			}
			
			@Override
			public boolean isClickable() throws RemoteException
			{
				return false;
			}
			
			@Override
			public void setStrokePattern(List<PatternItem> list) throws RemoteException
			{
			
			}
			
			@Override
			public List<PatternItem> getStrokePattern() throws RemoteException
			{
				return null;
			}
			
			@Override
			public void zze(IObjectWrapper iObjectWrapper) throws RemoteException
			{
			
			}
			
			@Override
			public IObjectWrapper zzk() throws RemoteException
			{
				return null;
			}
			
			@Override
			public IBinder asBinder()
			{
				return null;
			}
		});
		CircleOptions circleOptions = new CircleOptions();
		GoogleMap fakeGoogleMap = PowerMockito.mock(GoogleMap.class);
		PowerMockito.when(fakeGoogleMap.addCircle(circleOptions)).thenReturn(circle);
		Map$CameraUpdate map = new Map$CameraUpdate(fakeGoogleMap);
		
		Circle actualCircle = map.createCircle(circleOptions);
		
		assertEquals(circle.toString(), actualCircle.toString());
	}
}