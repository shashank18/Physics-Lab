package com.triggerinnovations.physics.stefans;



import java.io.*;

import com.triggerinnovations.physics.R;


import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.text.method.PasswordTransformationMethod;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class StefansLaw extends Activity {
	byte[] buffer;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stefans_main);
        setTitle("Physics Lab BVBCET, Hubli           Name: Anand J Kumbar");
        final Button draw=(Button) findViewById(R.id.graph);
     
        draw.setEnabled(false);
        Button calci=(Button) findViewById(R.id.button);
        Button clear=(Button) findViewById(R.id.clear);
        
        clear.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myintent = new Intent();
				myintent.setClass(getApplicationContext(), StefansLaw.class);
				 
				startActivityForResult(myintent, 0);
				setResult(RESULT_OK, myintent);
				finish();
			}
		});
        
        final EditText cur1=(EditText) findViewById(R.id.current1);
        final EditText cur2=(EditText) findViewById(R.id.current2);
        final EditText cur3=(EditText) findViewById(R.id.current3);
        final EditText cur4=(EditText) findViewById(R.id.current4);
        final EditText cur5=(EditText) findViewById(R.id.current5);
        final EditText cur6=(EditText) findViewById(R.id.current6);
        final EditText cur7=(EditText) findViewById(R.id.current7);
        final EditText cur8=(EditText) findViewById(R.id.current8);
        final EditText cur9=(EditText) findViewById(R.id.current9);
        
        final EditText volt1=(EditText) findViewById(R.id.volt1);
        final EditText volt2=(EditText) findViewById(R.id.volt2);
        final EditText volt3=(EditText) findViewById(R.id.volt3);
        final EditText volt4=(EditText) findViewById(R.id.volt4);
        final EditText volt5=(EditText) findViewById(R.id.volt5);
        final EditText volt6=(EditText) findViewById(R.id.volt6);
        final EditText volt7=(EditText) findViewById(R.id.volt7);
        final EditText volt8=(EditText) findViewById(R.id.volt8);
        final EditText volt9=(EditText) findViewById(R.id.volt9);
        
        final TextView resi1=(TextView) findViewById(R.id.r1);
        final TextView resi2=(TextView) findViewById(R.id.r2);
        final TextView resi3=(TextView) findViewById(R.id.r3);
        final TextView resi4=(TextView) findViewById(R.id.r4);
        final TextView resi5=(TextView) findViewById(R.id.r5);
        final TextView resi6=(TextView) findViewById(R.id.r6);
        final TextView resi7=(TextView) findViewById(R.id.r7);
        final TextView resi8=(TextView) findViewById(R.id.r8);
        final TextView resi9=(TextView) findViewById(R.id.r9);
        
        final TextView powe1=(TextView) findViewById(R.id.p1);
        final TextView powe2=(TextView) findViewById(R.id.p2);
        final TextView powe3=(TextView) findViewById(R.id.p3);
        final TextView powe4=(TextView) findViewById(R.id.p4);
        final TextView powe5=(TextView) findViewById(R.id.p5);
        final TextView powe6=(TextView) findViewById(R.id.p6);
        final TextView powe7=(TextView) findViewById(R.id.p7);
        final TextView powe8=(TextView) findViewById(R.id.p8);
        final TextView powe9=(TextView) findViewById(R.id.p9);
        
        final TextView logRes1=(TextView) findViewById(R.id.lr1);
        final TextView logRes2=(TextView) findViewById(R.id.lr2);
        final TextView logRes3=(TextView) findViewById(R.id.lr3);
        final TextView logRes4=(TextView) findViewById(R.id.lr4);
        final TextView logRes5=(TextView) findViewById(R.id.lr5);
        final TextView logRes6=(TextView) findViewById(R.id.lr6);
        final TextView logRes7=(TextView) findViewById(R.id.lr7);
        final TextView logRes8=(TextView) findViewById(R.id.lr8);
        final TextView logRes9=(TextView) findViewById(R.id.lr9);
        
        final TextView logPow1=(TextView) findViewById(R.id.lp1);
        final TextView logPow2=(TextView) findViewById(R.id.lp2);
        final TextView logPow3=(TextView) findViewById(R.id.lp3);
        final TextView logPow4=(TextView) findViewById(R.id.lp4);
        final TextView logPow5=(TextView) findViewById(R.id.lp5);
        final TextView logPow6=(TextView) findViewById(R.id.lp6);
        final TextView logPow7=(TextView) findViewById(R.id.lp7);
        final TextView logPow8=(TextView) findViewById(R.id.lp8);
        final TextView logPow9=(TextView) findViewById(R.id.lp9);
        
        
        
        final double res[]=new double[9];
        final double pow[]=new double[9];
        final double LogR[]=new double[9];
        final double LogP[]=new double[9];
        
        
   final double volt[]=new double[9];
   final double curr[]=new double[9];
   final int flag;
   
   calci.setOnClickListener(new OnClickListener() {
	
	public void onClick(View v) {
		
		
	
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
		   
		   	
		   
		   
		   
        for(int i=0;i<9;i++)
        {        	      
        		
        	
        	try
        	{
        	res[i]=volt[i]/curr[i];
        	pow[i]=volt[i]*curr[i];
        	
        	       	
        	LogR[i]=Math.log10(res[i]);
        	LogP[i]=Math.log10(pow[i]);
        	}catch (Exception e) {
				// TODO: handle exception
			}   	
        }
		
        
   
     resi1.setText(""+res[0]);
     resi2.setText(""+res[1]);
     resi3.setText(""+res[2]);
     resi4.setText(""+res[3]);
     resi5.setText(""+res[4]);
     resi6.setText(""+res[5]);
     resi7.setText(""+res[6]);
     resi8.setText(""+res[7]);
     resi9.setText(""+res[8]);
    
   
     powe1.setText(""+pow[0]);
     powe2.setText(""+pow[1]);
     powe3.setText(""+pow[2]);
     powe4.setText(""+pow[3]);
     powe5.setText(""+pow[4]);
     powe6.setText(""+pow[5]);
     powe7.setText(""+pow[6]);
     powe8.setText(""+pow[7]);
     powe9.setText(""+pow[8]);
     
     
		
        logRes1.setText(""+LogR[0]);
        logRes2.setText(""+LogR[1]);
        logRes3.setText(""+LogR[2]);
        logRes4.setText(""+LogR[3]);
        logRes5.setText(""+LogR[4]);
        logRes6.setText(""+LogR[5]);
        logRes7.setText(""+LogR[6]);
        logRes8.setText(""+LogR[7]);
        logRes9.setText(""+LogR[8]);
        
        logPow1.setText(""+LogP[0]);
        logPow2.setText(""+LogP[1]);
        logPow3.setText(""+LogP[2]);
        logPow4.setText(""+LogP[3]);
        logPow5.setText(""+LogP[4]);
        logPow6.setText(""+LogP[5]);
        logPow7.setText(""+LogP[6]);
        logPow8.setText(""+LogP[7]);
        logPow9.setText(""+LogP[8]);
        draw.setEnabled(true);
       
        
        
        try{   // open myfilename.txt for writing   
  		//   OutputStreamWriter out = new OutputStreamWriter(openFileOutput("/LocalDisk/myfilename.txt",0));   
  		   // write the contents on mySettings to the file  
  		  
        	 
        	
        	File mediaDir = new File("/LocalDisk/Physics_Lab"); 
        	if (!mediaDir.exists())
        	{     mediaDir.mkdir(); }
        	
        	File mediaDir1 = new File("/LocalDisk/Physics_Lab/Stefans_Law/"); 
        	if (!mediaDir1.exists())
        	{     mediaDir1.mkdir(); }
        	File resolveMeSDCard = new File("/LocalDisk/Physics_Lab/Stefans_Law/stefan_law.txt"); 
        	resolveMeSDCard.createNewFile();
        	FileOutputStream fos = new FileOutputStream(resolveMeSDCard);
        	//fos.write(string.getBytes());   
        	System.out.println("Your file has been written");    
        	
        	
        	
        	String heading="volt      curr      res        pow           logp        logr\n"
		          +"-------------------------------------------------------------\n";
        	
        	  
        	//String heading="volt\tcurr\tres\tpow\tlogp\tlogr\n";
  		  // out.write("volt\tcurr\tres\tpow\tlogp\tlogr\n"); 
        	fos.write(heading.getBytes());
        	
        	String[] res1=new String[9];
        	String[] res2=new String[9];
        	String[] res3=new String[9];
        	String[] res4=new String[9];
        	
        	
        	
        	for(int i=0;i<9;i++){
  		

        		res1[i]=String.format("%.4f", res[i]);
        		res2[i]=String.format("%.4f", pow[i]);

        		res3[i]=String.format("%.4f", LogP[i]);
        		res4[i]=String.format("%.4f", LogR[i]);
        	
        		String values=new String(volt[i] +"      " +curr[i]+ "      "+ (res1[i])+ "      "+ (res2[i])+ "      "+( res3[i])+ "      "+ (res4[i])+"\n"
                		+"-------------------------------------------------------------\n");
        		
        //String values=new String(volt[i] +"\t\t" +curr[i]+ "\t\t"+ (res1[i])+ "\t\t"+ (res2[i])+ "\t\t"+( res3[i])+ "\t\t"+ (res4[i])+"\n");
  		fos.write(values.getBytes());
  		  //out.write(volt[i] +"\t" +curr[i]+ "\t"+ res[i]+ "\t"+ pow[i]+ "\t"+ LogP[i]+ "\t"+ LogR[i]+"\n");
        	}
  		  fos.close();
        	//out.close(); } 
        } catch (java.io.IOException e) {   //do something if an IOException occurs. }
  	   }
	}
});
   
        
       
        
draw.setOnClickListener(new OnClickListener() {
	
	
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Bundle bundle1 = new Bundle();
		
		bundle1.putDoubleArray("logP",LogP );
		bundle1.putDoubleArray("logR",LogR );
		

		Intent myintent = new Intent();
		myintent.setClass(getApplicationContext(), Graph_stefan_caller.class);
		myintent.putExtras(bundle1);
		startActivityForResult(myintent, 0);
		setResult(RESULT_OK, myintent);
		//finish();
		
	}
});
        
final Button submit=(Button) findViewById(R.id.submit);
submit.setOnClickListener(new OnClickListener() {
	
	
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		 // prepare the alert box
        AlertDialog.Builder alertbox = new AlertDialog.Builder(StefansLaw.this);

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
         
            	
            	
            	AlertDialog.Builder alert1 = new AlertDialog.Builder(StefansLaw.this);

            	alert1.setTitle("Faculty Authentication");
            	alert1.setMessage("Passcode");

            	// Set an EditText view to get user input 
            	final EditText input = new EditText(StefansLaw.this);
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
			
			
			final Dialog dialog = new Dialog(StefansLaw.this);
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

    
    
    
    
    Button com=(Button) findViewById(R.id.comm);
    com.setOnClickListener(new OnClickListener() {
		
		public void onClick(View v) {
			
			
			final Dialog dialog = new Dialog(StefansLaw.this);
            dialog.setContentView(R.layout.comment);
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
               
           // getIntent();
            	
               //finish();
            	//removeDialog(1);
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
    Button work=(Button) findViewById(R.id.work);
    work.setOnClickListener(new OnClickListener() {
		
		
		public void onClick(View v) {
			// TODO Auto-generated method stub
           
			Bundle bundle1 = new Bundle();
			
			bundle1.putDoubleArray("voltage",volt);
			bundle1.putDoubleArray("current",curr);
			bundle1.putDoubleArray("LOGR",LogR);
			bundle1.putDoubleArray("LOGP",LogP);
			bundle1.putDoubleArray("Resistance",res);
			bundle1.putDoubleArray("Power",pow);		
			
			
			Intent myintent11= new Intent();
			myintent11.setClass(getApplicationContext(), Stefans_work.class);				
			myintent11.putExtras(bundle1);
			startActivity(myintent11);
		
			//	setResult(RESULT_OK, myintent);
			//finish();
		}
	});

    }
    }
