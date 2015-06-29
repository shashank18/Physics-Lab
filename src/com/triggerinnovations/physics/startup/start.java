package com.triggerinnovations.physics.startup;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.triggerinnovations.physics.R;
import com.triggerinnovations.physics.pdfloader.instruction;

public class start extends LoginActivity {
	public void onCreate(Bundle savedInstanceState) 
	{
        super.onCreate(savedInstanceState);
       // requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.start_screen);
        Button inst=(Button) findViewById(R.id.button1);
        inst.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent open=new Intent();
				open.setClass(getApplicationContext(),instruction.class);
				startActivity(open);
			}
		});
        
        Button s1=(Button)findViewById(R.id.button2);
        s1.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent open=new Intent();
				open.setClass(getApplicationContext(), set1.class);
				startActivity(open);
			}
		});
        
        Button s2=(Button)findViewById(R.id.button3);
        s2.setOnClickListener(new OnClickListener() {
        	
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent open=new Intent();
				open.setClass(getApplicationContext(),set2.class);
				startActivity(open);
			}
		});
	}
}
