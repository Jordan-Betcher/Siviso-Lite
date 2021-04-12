package com.jordan.betcher.siviso.sivisolite.service;

import com.google.android.gms.location.LocationRequest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test$Factory$LocationRequestSingleUpdate
{
	@Test
	public void create__setSmallestDisplacement0()
	{
		int smallestDisplacement = 0;
		
		Factory$LocationRequestSingleUpdate factory = new Factory$LocationRequestSingleUpdate();
		
		LocationRequest locationRequest = factory.create();
		float actualSmallestDisplacement = locationRequest.getSmallestDisplacement();
		assertEquals(smallestDisplacement, actualSmallestDisplacement, 0.01);
	}
	
	@Test
	public void create__setNumUpdates1()
	{
		int numUpdates = 1;
		
		Factory$LocationRequestSingleUpdate factory = new Factory$LocationRequestSingleUpdate();
		
		LocationRequest locationRequest = factory.create();
		int actualNumUpdates = locationRequest.getNumUpdates();
		assertEquals(numUpdates, actualNumUpdates);
	}
}