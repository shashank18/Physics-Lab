package com.triggerinnovations.physics.startup;






import com.triggerinnovations.physics.R;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.net.wifi.WifiConfiguration.Status;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class LoginActivity extends Activity
{
	
	
    Button login;
    
	public void onCreate(Bundle savedInstanceState) 
	{
        super.onCreate(savedInstanceState);
       // requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.login_fin1);
    
        login=(Button) findViewById(R.id.button1);
        login.setOnClickListener(new View.OnClickListener() {
			
		
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myintent = new Intent();
				myintent.setClass(getApplicationContext(),start.class);
				startActivity(myintent);
			}
		});
        
        
       Button exit=(Button) findViewById(R.id.button2);
        exit.setOnClickListener(new View.OnClickListener() {
			
		
			public void onClick(View v) {
				// TODO Auto-generated method stub
			System.exit(0);
			finish();
			}
		});
        
    
      
        }}
