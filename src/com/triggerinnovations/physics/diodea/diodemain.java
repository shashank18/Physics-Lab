package com.triggerinnovations.physics.diodea;



import java.io.*;

import com.triggerinnovations.physics.R;
import com.triggerinnovations.physics.diffraction.Diffraction;


import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class diodemain extends Activity {
	
	byte[] buffer;
    
	/** Called when the activity is first created. */
    
	@Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Physics Lab BVBCET, Hubli");
        
        final Button draw=(Button) findViewById(R.id.graph);
       
        final Button submit=(Button)findViewById(R.id.submit);
         
        final EditText cur1=(EditText) findViewById(R.id.i2);
        final EditText cur2=(EditText) findViewById(R.id.i3);
        final EditText cur3=(EditText) findViewById(R.id.i4);
        final EditText cur4=(EditText) findViewById(R.id.i5);
        final EditText cur5=(EditText) findViewById(R.id.i6);
        final EditText cur6=(EditText) findViewById(R.id.i7);
        final EditText cur7=(EditText) findViewById(R.id.i8);
        final EditText cur8=(EditText) findViewById(R.id.i9);
        final EditText cur9=(EditText) findViewById(R.id.i10);
        
        final EditText volt1=(EditText) findViewById(R.id.v2);
        final EditText volt2=(EditText) findViewById(R.id.v3);
        final EditText volt3=(EditText) findViewById(R.id.v4);
        final EditText volt4=(EditText) findViewById(R.id.v5);
        final EditText volt5=(EditText) findViewById(R.id.v6);
        final EditText volt6=(EditText) findViewById(R.id.v7);
        final EditText volt7=(EditText) findViewById(R.id.v8);
        final EditText volt8=(EditText) findViewById(R.id.v9);
        final EditText volt9=(EditText) findViewById(R.id.v10);
        
        
        final double res[]=new double[9];
        final double pow[]=new double[9];
        final double LogR[]=new double[9];
        final double LogP[]=new double[9];
        
        
        final double volt[]=new double[9];
        final double curr[]=new double[9];
        final int flag;
   
        
        
        draw.setOnClickListener(new OnClickListener() {
	
	
	          public void onClick(View v) 
	          {
		
		
		             volt[0]=Double.parseDouble(volt1.getText().toString());
		             volt[1]=Double.parseDouble(volt2.getText().toString());
		             volt[2]=Double.parseDouble(volt3.getText().toString());
            		 volt[3]=Double.parseDouble(volt4.getText().toString());
		             volt[4]=Double.parseDouble(volt5.getText().toString());
		             volt[5]=Double.parseDouble(volt6.getText().toString());
		             volt[6]=Double.parseDouble(volt7.getText().toString());
		             volt[7]=Double.parseDouble(volt8.getText().toString());
		             volt[8]=Double.parseDouble(volt9.getText().toString());
		   
		             curr[0]=Double.parseDouble(cur1.getText().toString());     
		             curr[1]=Double.parseDouble(cur2.getText().toString());
		             curr[2]=Double.parseDouble(cur3.getText().toString());
		             curr[3]=Double.parseDouble(cur4.getText().toString());
		             curr[4]=Double.parseDouble(cur5.getText().toString());
		             curr[5]=Double.parseDouble(cur6.getText().toString());
		             curr[6]=Double.parseDouble(cur7.getText().toString());
		             curr[7]=Double.parseDouble(cur8.getText().toString());
		             curr[8]=Double.parseDouble(cur9.getText().toString());
		   
	
    
		            Bundle bundle1 = new Bundle();
		
	             	bundle1.putDoubleArray("logP",volt );
		            bundle1.putDoubleArray("logR",curr );
		

            		Intent myintent = new Intent();
		            myintent.setClass(getApplicationContext(), Graph_diode_caller.class);
		            myintent.putExtras(bundle1);
		            startActivityForResult(myintent, 0);
		            setResult(RESULT_OK, myintent);
		
		
	        }
    });

        submit.setOnClickListener(new OnClickListener() {
        	
        	
        	public void onClick(View v) {
        		// TODO Auto-generated method stub
        		
        		 // prepare the alert box
                AlertDialog.Builder alertbox = new AlertDialog.Builder(diodemain.this);

                // set the message to display
                alertbox.setMessage("Are you sure to SUBMIT ?");

                // add a neutral button to the alert box and assign a click listener
                alertbox.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {

                    // click listener on the alert box
                    public void onClick(DialogInterface arg0, int arg1) {
                        // the button was clicked
                        Toast.makeText(getApplicationContext(), "Submit Cancelled!!", Toast.LENGTH_LONG).show();
                        
                    }
                });
                
                alertbox.setPositiveButton("Submit", new DialogInterface.OnClickListener() {

                    // click listener on the alert box
                    public void onClick(DialogInterface arg0, int arg1) {
                        // the button was clicked
                 
                    	
                    	
                    	AlertDialog.Builder alert1 = new AlertDialog.Builder(diodemain.this);

                    	alert1.setTitle("Faculty Authentication");
                    	alert1.setMessage("Passcode");

                    	// Set an EditText view to get user input 
                    	final EditText input = new EditText(diodemain.this);
                    	input.setTransformationMethod(PasswordTransformationMethod.getInstance());

                    	alert1.setView(input);

                    	alert1.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    	public void onClick(DialogInterface dialog, int whichButton) {
                    	  String value = input.getText().toString();
                    	  // Do something with value!
                    	  }
                    	});

                    	alert1.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    	  public void onClick(DialogInterface dialog, int whichButton) {
                    	  
                    		  Toast.makeText(getApplicationContext(), "Submit Cancelled!!", Toast.LENGTH_LONG).show();
                    		  // Canceled.
                    	  }
                    	});

                    	alert1.show();
                    	// see http://androidsnippets.com/prompt-user-input-with-an-alertdialog
                    	
                    	
                    	
                    	
                    	
                    	
                    	
                    	
                    	
                    	
                    	
                    	Toast.makeText(getApplicationContext(), "Submit Success!!", Toast.LENGTH_LONG).show();
                    //disable submit button
                        submit.setEnabled(false);
                    }
                });

                // show it
                alertbox.show();
        		//finish();
        		
        	}
        });




        Button conclusion=(Button) findViewById(R.id.con);
        conclusion.setOnClickListener(new OnClickListener() {
    		
    		public void onClick(View v) {
    			
    			
    			final Dialog dialog = new Dialog(diodemain.this);
                dialog.setContentView(R.layout.conclusion);
                dialog.setTitle("Enter the Conclusion of the experiment below");
                dialog.setCancelable(true);
                //there are a lot of settings, for dialog, check them all out!

                //set up text
                EditText text = (EditText) dialog.findViewById(R.id.editText1);
                text.setGravity(Gravity.TOP);
               
                
                text.setWidth(500);
                text.setHeight(391);
                //set up image view
            //    ImageView img = (ImageView) dialog.findViewById(R.id.ImageView01);
              //  img.setImageResource(R.drawable.nista_logo);
                 
                //set up button
                Button button = (Button) dialog.findViewById(R.id.Button01);
                button.setOnClickListener(new OnClickListener() {
                public void onClick(View v) {
                   
                   
                    Toast.makeText(getApplicationContext(), "Conclusion Written!!", Toast.LENGTH_LONG).show();
                	dialog.cancel();
                    //finish();
                    }
                });
                //now that the dialog is set up, it's time to show it    
                dialog.show();
            }	
    			// TODO Auto-generated method stub
    			
    		
    	});

        Button clear=(Button) findViewById(R.id.clear);
        clear.setOnClickListener(new OnClickListener() {
    		
    		
    		public void onClick(View v) {
    			// TODO Auto-generated method stub
    			Intent myintent = new Intent();
    			myintent.setClass(getApplicationContext(), diodemain.class);
    			
    			startActivityForResult(myintent, 0);
    			setResult(RESULT_OK, myintent);
    			finish();
    		}
    	});
        
        
        
        Button com=(Button) findViewById(R.id.comm);
        com.setOnClickListener(new OnClickListener() {
    		
    		public void onClick(View v) {
    			
    			
    			final Dialog dialog = new Dialog(diodemain.this);
                dialog.setContentView(R.layout.comment);
                dialog.setTitle("Enter the Comment of the experiment below");
                dialog.setCancelable(true);
                //there are a lot of settings, for dialog, check them all out!

                //set up text
                EditText text = (EditText) dialog.findViewById(R.id.editText1);
                text.setGravity(Gravity.TOP);
               
                
                text.setWidth(500);
                text.setHeight(391);
                //set up image view
            //    ImageView img = (ImageView) dialog.findViewById(R.id.ImageView01);
              //  img.setImageResource(R.drawable.nista_logo);

                //set up button
                Button button = (Button) dialog.findViewById(R.id.Button01);
                button.setOnClickListener(new OnClickListener() {
                public void onClick(View v) {
                   
               // getIntent();
                	
                   //finish();
                	//removeDialog(1);
                    Toast.makeText(getApplicationContext(), "Comment Written!!", Toast.LENGTH_LONG).show();
                	dialog.cancel();
                    //finish();
                    }
                });
                //now that the dialog is set up, it's time to show it    
                dialog.show();
            }	
    			// TODO Auto-generated method stub
    			
    		
    	});
        

   }
}
