package com.triggerinnovations.physics.pdfloader;

import java.io.File;

import com.triggerinnovations.physics.R;
import com.triggerinnovations.physics.opticalfiber.Optical;
import com.triggerinnovations.physics.startup.set1;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class explodr1 extends set1 {
	 static String filname;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.explodr1);
        final int expts=0;
        
Button theory=(Button)findViewById(R.id.a1);
       
theory.setOnClickListener(new OnClickListener() {
	
	public void onClick(View arg0) {
			final int expts;
		
		if(flag==1)
		{
			expts=1;
		filname="exp1.pdf";
		}
		else if(flag==2)
		{
			expts=2;
			filname="exp2.pdf";
		}
		else if(flag==3)
		{
			expts=3;
			
			filname="exp3.pdf";
		}
		else if(flag==4)
		{
			expts=4;
			filname="exp4.pdf";
		}
		else if(flag==5)
		{
			expts=5;
			filname="exp5.pdf";
		}
		else if(flag==6)
		{
			//filname="exp2.pdf";
		}
		
		Intent open=new Intent();
		open.setClass(getApplicationContext(), pdfloader1.class);
		startActivity(open);
	}
});

Button bs3=(Button)findViewById(R.id.a2);

bs3.setOnClickListener(new View.OnClickListener() {
			
			 
			public void onClick(View v)
			{
				Intent me=new Intent();
				int val=flag;
				
				
				if(flag==1)
				{
					Toast.makeText(getBaseContext(), "Optical fibre experiment selected", Toast.LENGTH_SHORT).show();
					me.setClass(getApplicationContext(),com.triggerinnovations.physics.opticalfiber.Optical.class);
									
				}else if(flag==2)
				{
					Toast.makeText(getBaseContext(), "Diffraction grating experiment selected", Toast.LENGTH_SHORT).show();
			me.setClass(getApplicationContext(),com.triggerinnovations.physics.diffraction.Diffraction.class);
					
					
				}else if(flag==3)
				{
					Toast.makeText(getBaseContext(), "Four probe experiment selected", Toast.LENGTH_SHORT).show();
				//	me.setClass(getApplicationContext(),tab_stefans.class);
					
				}else if(flag==4)
				{
					Toast.makeText(getBaseContext(), "Fermi Energy experiment selected", Toast.LENGTH_SHORT).show();
					me.setClass(getApplicationContext(),com.triggerinnovations.physics.fermi.Fermi.class);
					
				}else if(flag==5)
				{
					Toast.makeText(getBaseContext(), "Diode charecteristics experiment selected", Toast.LENGTH_SHORT).show();
				me.setClass(getApplicationContext(),com.triggerinnovations.physics.diodea.diodemain.class);
					
				}
				
				startActivity(me);
			}
       
});

}
}