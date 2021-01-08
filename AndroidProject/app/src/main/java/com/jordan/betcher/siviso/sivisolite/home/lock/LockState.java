package com.jordan.betcher.siviso.sivisolite.home.lock;

import android.view.View;

class LockState
{
	private View view;
	private View viewLock;
	
	public LockState(View view, View viewLock){this.view = view;
		this.viewLock = viewLock;
	}
	
	void lock()
	{
		setGone(view);
		setVisible(viewLock);
	}
	
	void unlocked()
	{
		setVisible(view);
		setGone(viewLock);
	}
	
	private void setVisible(View view)
	{
		view.setVisibility(View.VISIBLE);
	}
	
	private void setGone(View view)
	{
		view.setVisibility(View.GONE);
	}
}
