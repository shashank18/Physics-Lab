package com.triggerinnovations.physics.stefans;



import com.triggerinnovations.physics.R;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

public class tab_stefans extends TabActivity {
	/** Called when the activity is first created. */

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.stefan_error);
		SetupTabs();
	}

	void SetupTabs() {

		TabHost host = getTabHost();

		TabHost.TabSpec spec1 = host.newTabSpec("Stefan's Law");
		Intent in1 = new Intent(this, StefansLaw.class);
		spec1.setIndicator("Stefan's Law");
		
		spec1.setContent(in1);

		TabHost.TabSpec spec2 = host.newTabSpec("Error Estimation");
		Intent in2 = new Intent(this, estimate_error.class);

		spec2.setIndicator("Error Estimation");
		spec2.setContent(in2);

		

		host.addTab(spec1);
		host.addTab(spec2);
		
	}

}