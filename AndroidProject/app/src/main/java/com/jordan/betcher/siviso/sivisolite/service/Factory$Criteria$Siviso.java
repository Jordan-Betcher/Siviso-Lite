package com.jordan.betcher.siviso.sivisolite.service;

import android.location.Criteria;

class Factory$Criteria$Siviso
{
	Criteria criteria;
	
	public Factory$Criteria$Siviso()
	{
		criteria = new Criteria();
	}
	
	public Criteria create()
	{
		criteria.setPowerRequirement(Criteria.POWER_LOW);
		criteria.setAccuracy(Criteria.ACCURACY_COARSE);
		criteria.setBearingRequired(false);
		criteria.setAltitudeRequired(false);
		criteria.setSpeedRequired(false);
		return criteria;
	}
}
