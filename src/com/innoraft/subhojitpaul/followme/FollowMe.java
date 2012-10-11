package com.innoraft.subhojitpaul.followme;

import android.os.Bundle;
import android.app.Activity;
import android.content.res.Configuration;

public class FollowMe extends Activity {
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new DrawView(this));
    }
    
    public void onConfigurationChanged(Configuration newConfig) {
    	super.onConfigurationChanged(newConfig);
    	
    	// Checks the orientation of screen.
    	switch (newConfig.orientation) {
    	case Configuration.ORIENTATION_LANDSCAPE:
    	case Configuration.ORIENTATION_PORTRAIT:
    		setContentView(new DrawView(this));
    		break;
    	}
    }
}
