/*
 * 
 */
package com.socket9.ninenaliga.android.config;

import com.socket9.ninenaliga.android.config.ConfigManager;
import com.socket9.ninenaliga.android.controller.MainTabHostActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;

// TODO: Auto-generated Javadoc
/**
 * The Class ActivitySelector.
 */
public class ActivitySelector {
	
	/** The m root activity. */
	static public Activity mRootActivity;
	
	/** The m menu caller activity. */
	static public Activity mMenuCallerActivity;
	
	/** The m current menu id. */
	static public int mCurrentMenuID = -1;
	
	/** The m handler. */
	static public Handler mHandler;

	/**
	 * Inits the.
	 *
	 * @param rootActivity the root activity
	 */
	static public void Init(Activity rootActivity) {
		mCurrentMenuID = -1;
		mRootActivity = rootActivity;
		mHandler = new Handler();
		
		//mRootActivity.startActivityForResult(new Intent(mRootActivity, SlideShowActivity.class),999);
		//mRootActivity.startActivityForResult(new Intent(mRootActivity, SlideShowActivityTest.class),999);
		//mRootActivity.startActivityForResult(new Intent(mRootActivity, SlideShowActivityTest2.class),999);
//		mRootActivity.startActivityForResult(new Intent(mRootActivity, AndroidTabLayoutActivity.class),999);
		mRootActivity.startActivityForResult(new Intent(mRootActivity, MainTabHostActivity.class),999);
	}
	
	/**
	 * Clean.
	 */
	static public void Clean()
	{
		mCurrentMenuID = -1;
	}
	

}
