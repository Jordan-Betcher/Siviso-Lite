package com.jordan.betcher.siviso.sivisolite.permissions;

import androidx.lifecycle.LiveData;

public interface MVVM$Permissions
{
	interface View
	{
		void enableContinueButton();
		//https://medium.com/@JoseAlcerreca/keeping-the-view-dumb-is-certainly-a-advantage-but-i-dont-think-it-s-worth-it-in-this-case-e20f215fdec8
		//says that you can't use livedata and have to use something else instead
		LiveData<Boolean> continueButtonPressed();
		void goToActivityHome();
	}
	
	interface Logic
	{
		LiveData<Boolean> allPermissionsAccepted();
		void notifyPermissionChange(String... permissionNames);
	}
}
