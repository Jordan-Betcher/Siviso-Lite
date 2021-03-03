package com.jordan.betcher.siviso.sivisolite.service;

class FusedLocationClientSiviso
{
	FusedLocationClient$Siviso client;
	
	public FusedLocationClientSiviso(Service_Siviso serviceSiviso)
	{
		client = new FusedLocationClient$Siviso();
	}
	
	public void start()
	{
		client.start();
	}
	
	public void stop()
	{
		client.stop();
	}
}
