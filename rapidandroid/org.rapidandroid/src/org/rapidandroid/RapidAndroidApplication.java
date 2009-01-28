package org.rapidandroid;

import org.rapidandroid.content.translation.startup.ModelBootstrap;

import android.app.Application;

/**
 * @author Daniel Myung dmyung@dimagi.com
 * @created Jan 27, 2009
 * Summary:
 */
public class RapidAndroidApplication extends Application {

	/* (non-Javadoc)
	 * @see android.app.Application#onCreate()
	 */
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		
		ModelBootstrap.InitApplicationDatabase(this.getApplicationContext());
		
	}

}