package com.jordan.betcher.siviso.sivisolite.service;

import android.app.Service;

class NotificationSiviso
{
	private Service service;
	private Factory$Notification factory;
	
	public NotificationSiviso(Service service, Factory$Notification factory)
	{
		this.service = service;
		this.factory = factory;
	}
	
	public void startForeground()
	{
		service.startForeground(1, factory.create());
	}
}
