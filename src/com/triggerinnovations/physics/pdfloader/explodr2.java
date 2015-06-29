package com.triggerinnovations.physics.pdfloader;

import java.io.File;

import com.triggerinnovations.physics.R;
import com.triggerinnovations.physics.opticalfiber.Optical;
import com.triggerinnovations.physics.passive.Passive;
import com.triggerinnovations.physics.startup.set2;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class explodr2 extends set2 {
	final int expts=0;
	static String filname;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.explodr2);
       
Button theory=(Button)findViewById(R.id.a1);
       
theory.setOnClickListener(new OnClickListener() {
	
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
		/*File targetFile=new File("android.resource://com.triggerinnovations.physics/assets/s.pdf");
		Uri targeturi=Uri.fromFile(targetFile);
		Intent intent=new Intent(Intent.ACTION_VIEW);
		intent.setDataAndType(targeturi, "application/pdf");
		startActivity(intent);*/
		final int expts;
		if(flag1==1)
		{
			expts=1;
		filname="exp6.pdf";
		}
		else if(flag1==2)
		{
			expts=1;
			filname="exp7.pdf";
		}
		else if(flag1==3)
		{
			expts=1;
			filname="exp8.pdf";
		}
		else if(flag1==4)
		{
			expts=1;
			filname="exp9.pdf";
		}
		else if(flag1==5)
		{
			expts=1;
			filname="exp10.pdf";
		}
		else if(flag1==6)
		{
			//filname="exp2.pdf";
		}
		
		Intent open=new Intent();
		open.setClass(getApplicationContext(), pdfloader2.class);
		startActivity(open);
	}
});

Button bs3=(Button)findViewById(R.id.a2);

bs3.setOnClickListener(new View.OnClickListener() {
			
			 
			public void onClick(View v)
			{
				Intent me=new Intent();
	//			me.setClass(getApplicationContext(),tab_stefans.class);
				if(flag1==1)
				{
					Toast.makeText(getBaseContext(), "transistor", Toast.LENGTH_SHORT).show();
					
				//	me.setClass(getApplicationContext(),Optical.class);
									
				}else if(flag1==2)
				{
					Toast.makeText(getBaseContext(), "LCR ", Toast.LENGTH_SHORT).show();
			//		me.setClass(getApplicationContext(),tab_stefans.class);
					
					
				}else if(flag1==3)
				{
					
					Toast.makeText(getBaseContext(), "stefans", Toast.LENGTH_SHORT).show();
					me.setClass(getApplicationContext(),com.triggerinnovations.physics.stefans.tab_stefans.class);
					
				}else if(flag1==4)
				{
					Toast.makeText(getBaseContext(), "passive", Toast.LENGTH_SHORT).show();
					me.setClass(getApplicationContext(),com.triggerinnovations.physics.passive.Passive.class);
					
				}else if(flag1==5)
				{
					Toast.makeText(getBaseContext(), "hsyterisis", Toast.LENGTH_SHORT).show();
					//me.setClass(getApplicationContext(),tab_stefans.class);
					
				}

				
				startActivity(me);
			}
       
});

}
}