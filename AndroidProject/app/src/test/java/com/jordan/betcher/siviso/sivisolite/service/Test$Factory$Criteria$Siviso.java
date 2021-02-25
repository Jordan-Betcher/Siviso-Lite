package com.jordan.betcher.siviso.sivisolite.service;

import android.location.Criteria;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class Test$Factory$Criteria$Siviso
{
	
	@Test
	public void create__verifyCriteriaSpeedRequiredFalse()
	{
		Criteria criteria = mock(Criteria.class);
		
		Factory$Criteria$Siviso factory = new Factory$Criteria$Siviso();
		factory.criteria = criteria;
		
		factory.create();
		
		verify(criteria, times(1)).setSpeedRequired(false);
	}
	
	@Test
	public void create__verifyCriteriaAltitudeRequiredFalse()
	{
		Criteria criteria = mock(Criteria.class);
		
		Factory$Criteria$Siviso factory = new Factory$Criteria$Siviso();
		factory.criteria = criteria;
		
		factory.create();
		
		verify(criteria, times(1)).setAltitudeRequired(false);
	}
	
	@Test
	public void create__verifyCriteriaBearingRequiredFalse()
	{
		Criteria criteria = mock(Criteria.class);
		
		Factory$Criteria$Siviso factory = new Factory$Criteria$Siviso();
		factory.criteria = criteria;
		
		factory.create();
		
		verify(criteria, times(1)).setBearingRequired(false);
	}
	
	@Test
	public void create__verifyCriteriaAccuracyCoarse()
	{
		Criteria criteria = mock(Criteria.class);
		
		Factory$Criteria$Siviso factory = new Factory$Criteria$Siviso();
		factory.criteria = criteria;
		
		factory.create();
		
		verify(criteria, times(1)).setAccuracy(Criteria.ACCURACY_COARSE);
	}
	
	@Test
	public void create__verifyCriteriaPowerLow()
	{
		
		Criteria criteria = mock(Criteria.class);
		
		Factory$Criteria$Siviso factory = new Factory$Criteria$Siviso();
		factory.criteria = criteria;
		
		factory.create();
		
		verify(criteria, times(1)).setPowerRequirement(Criteria.POWER_LOW);
	}
	
	@Test
	public void create_criteria_returnCriteria()
	{
		Criteria criteria = mock(Criteria.class);
		
		Factory$Criteria$Siviso factory = new Factory$Criteria$Siviso();
		factory.criteria = criteria;
		
		Criteria criteriaActual = factory.create();
		
		assertEquals(criteria, criteriaActual);
	}
	
	@Test
	public void __critieriaNotNull()
	{
		Factory$Criteria$Siviso factory = new Factory$Criteria$Siviso();
		
		Criteria criteria = factory.criteria;
		
		assertNotNull(criteria);
	}
}