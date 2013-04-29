package com.socket9.ninenaliga.android.controller;

import com.socket9.ninenaliga.android.R;
import com.socket9.ninenaliga.android.models.ActivityAbout;
import com.socket9.ninenaliga.android.models.ActivityHome;
import com.socket9.ninenaliga.android.models.ActivityProduct;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class MainTabHostActivity extends TabActivity {
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab_host);
        
        TabHost tabHost = getTabHost();
        
        // the first Account
        TabSpec accountTab = tabHost.newTabSpec("Account");
        // setting Title and Icon for the Tab
        accountTab.setIndicator("HOME");
        Intent accountIntent = new Intent(this, ActivityHome.class);
        accountTab.setContent(accountIntent);
        
        // Tab for Slide
        TabSpec slideTab = tabHost.newTabSpec("Slide");
        slideTab.setIndicator("PRODUCT");
        Intent slideIntent = new Intent(this, ActivityProduct.class);
        slideTab.setContent(slideIntent);
        
        // Tab for Device
        TabSpec deviceTab = tabHost.newTabSpec("Device");
        deviceTab.setIndicator("ABOUT");
        Intent deviceIntent = new Intent(this, ActivityAbout.class);
        deviceTab.setContent(deviceIntent);
        
        // Adding all Tab to TabHost
        
        tabHost.addTab(accountTab); 
        tabHost.addTab(slideTab); 
        tabHost.addTab(deviceTab); 
    }

}