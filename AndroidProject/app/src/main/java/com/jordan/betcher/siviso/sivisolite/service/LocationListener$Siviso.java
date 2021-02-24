package com.jordan.betcher.siviso.sivisolite.service;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

class LocationListener$Siviso implements LocationListener
{
	/**
	 * Called when the location has changed.
	 *
	 * <p> There are no restrictions on the use of the supplied Location object.
	 *
	 * @param location The new location, as a Location object.
	 */
	@Override
	public void onLocationChanged(Location location)
	{
	
	}
	
	/**
	 * This callback will never be invoked and providers can be considers as always in the
	 * {@link LocationProvider#AVAILABLE} state.
	 *
	 * @param provider
	 * @param status
	 * @param extras
	 * @deprecated This callback will never be invoked.
	 */
	@Override
	public void onStatusChanged(String provider, int status, Bundle extras)
	{
	
	}
	
	/**
	 * Called when the provider is enabled by the user.
	 *
	 * @param provider the name of the location provider associated with this
	 *                 update.
	 */
	@Override
	public void onProviderEnabled(String provider)
	{
	
	}
	
	/**
	 * Called when the provider is disabled by the user. If requestLocationUpdates
	 * is called on an already disabled provider, this method is called
	 * immediately.
	 *
	 * @param provider the name of the location provider associated with this
	 *                 update.
	 */
	@Override
	public void onProviderDisabled(String provider)
	{
	
	}
}
