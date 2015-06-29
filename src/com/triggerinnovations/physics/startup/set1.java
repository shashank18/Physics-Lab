package com.triggerinnovations.physics.startup;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import com.triggerinnovations.physics.R;
import com.triggerinnovations.physics.pdfloader.explodr1;

public class set1 extends start {
	public static int flag=0;
	public void onCreate(Bundle savedInstanceState) 
	{
        super.onCreate(savedInstanceState);
       // requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.set1);
        Button the1=(Button)findViewById(R.id.b1);
        the1.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent open=new Intent();
				flag=1;
				open.setClass(getApplicationContext(), explodr1.class);
				startActivity(open);
			}
		});
        
        Button the2=(Button)findViewById(R.id.b2);
        the2.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent open=new Intent();
				flag=2;
				open.setClass(getApplicationContext(), explodr1.class);
				startActivity(open);
			}
		});
    
        Button the3=(Button)findViewById(R.id.b3);
        the3.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent open=new Intent();
				flag=3;
				open.setClass(getApplicationContext(), explodr1.class);
				startActivity(open);
			}
		});
    
        Button the4=(Button)findViewById(R.id.b4);
        the4.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent open=new Intent();
				flag=4;
				open.setClass(getApplicationContext(), explodr1.class);
				startActivity(open);
			}
		});
    
        Button the5=(Button)findViewById(R.id.b5);
        the5.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent open=new Intent();
				flag=5;
				open.setClass(getApplicationContext(), explodr1.class);
				startActivity(open);
			}
		});
    
        Button the6=(Button)findViewById(R.id.e);
        the6.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent open=new Intent();
				flag=6;
				open.setClass(getApplicationContext(), explodr1.class);
				startActivity(open);
			}
		});
    
    
	}
}

