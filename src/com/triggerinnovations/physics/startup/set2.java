package com.triggerinnovations.physics.startup;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import com.triggerinnovations.physics.R;
import com.triggerinnovations.physics.pdfloader.explodr2;

public class set2 extends start {
	public static int flag1=0;
	public void onCreate(Bundle savedInstanceState) 
	{
        super.onCreate(savedInstanceState);
       // requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.set2);
        Button the1=(Button)findViewById(R.id.b6);
        the1.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent open=new Intent();
				flag1=1;
				open.setClass(getApplicationContext(), explodr2.class);
				startActivity(open);
			}
		});
        
        Button the2=(Button)findViewById(R.id.b7);
        the2.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent open=new Intent();
				flag1=2;
				open.setClass(getApplicationContext(), explodr2.class);
				startActivity(open);
			}
		});
    
        Button the3=(Button)findViewById(R.id.b8);
        the3.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent open=new Intent();
				flag1=3;
				open.setClass(getApplicationContext(), explodr2.class);
				startActivity(open);
			}
		});
    
        Button the4=(Button)findViewById(R.id.b9);
        the4.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent open=new Intent();
				flag1=4;
				open.setClass(getApplicationContext(), explodr2.class);
				startActivity(open);
			}
		});
    
        Button the5=(Button)findViewById(R.id.b10);
        the5.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent open=new Intent();
				flag1=5;
				open.setClass(getApplicationContext(), explodr2.class);
				startActivity(open);
			}
		});
    
        Button the6=(Button)findViewById(R.id.e);
        the6.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent open=new Intent();
				flag1=6;
				open.setClass(getApplicationContext(), explodr2.class);
				startActivity(open);
			}
		});
    
    
	}
}

