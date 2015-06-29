package com.triggerinnovations.physics.opticalfiber;



import java.io.File;
import java.io.FileOutputStream;

import com.triggerinnovations.physics.R;
import com.triggerinnovations.physics.stefans.StefansLaw;

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


public class Optical extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.optical_main);
        final double DEG_ACC[]=new double[4];
        final double dista[]=new double[4];
        final double diame[]=new double[4];
        final double numAper[]=new double[4];
        
        final TextView MNUMAper=(TextView) findViewById(R.id.mnum);
        
        final EditText dist1=(EditText) findViewById(R.id.dis1);
        final EditText dist2=(EditText) findViewById(R.id.dis2);
        final EditText dist3=(EditText) findViewById(R.id.dis3);
        final EditText dist4=(EditText) findViewById(R.id.dis4);
    
    final    EditText diam1=(EditText) findViewById(R.id.dia1);
    final     EditText diam2=(EditText) findViewById(R.id.dia2);
    final EditText diam3=(EditText) findViewById(R.id.dia3);
    final EditText diam4=(EditText) findViewById(R.id.dia4);
        
        final TextView Dl1=(TextView) findViewById(R.id.dl1);
        final TextView Dl2=(TextView) findViewById(R.id.dl2);
        final TextView Dl3=(TextView) findViewById(R.id.dl3);
        final TextView Dl4=(TextView) findViewById(R.id.dl4);
        
        final TextView Acc1=(TextView) findViewById(R.id.acc1);
        final TextView Acc2=(TextView) findViewById(R.id.acc2);
        final TextView Acc3=(TextView) findViewById(R.id.acc3);
        final TextView Acc4=(TextView) findViewById(R.id.acc4);
        
        Button calci=(Button) findViewById(R.id.calci);
        Button work=(Button) findViewById(R.id.work);
        Button clear=(Button) findViewById(R.id.clear);
        
        clear.setOnClickListener(new OnClickListener() {
			
		
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myintent = new Intent();
				myintent.setClass(getApplicationContext(), Optical.class);
				
				startActivityForResult(myintent, 0);
				setResult(RESULT_OK, myintent);
				finish();
			}
		});
                
        final Button submit=(Button) findViewById(R.id.submit);
        submit.setOnClickListener(new OnClickListener() {
        	
        	
        	public void onClick(View v) {
        		// TODO Auto-generated method stub
        		
        		 // prepare the alert box
                AlertDialog.Builder alertbox = new AlertDialog.Builder(Optical.this);

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
                 
                    	
                    	
                    	AlertDialog.Builder alert1 = new AlertDialog.Builder(Optical.this);

                    	alert1.setTitle("Faculty Authentication");
                    	alert1.setMessage("Passcode");

                    	// Set an EditText view to get user input 
                    	final EditText input = new EditText(Optical.this);
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
        
        
        
        calci.setOnClickListener(new OnClickListener() {
			
		
			public void onClick(View v) {
			
				
				
				dista[0]=Double.parseDouble(dist1.getText().toString());
				dista[1]=Double.parseDouble(dist2.getText().toString());
				dista[2]=Double.parseDouble(dist3.getText().toString());
				dista[3]=Double.parseDouble(dist4.getText().toString());
			
				diame[0]=Double.parseDouble(diam1.getText().toString());
				diame[1]=Double.parseDouble(diam2.getText().toString());
				diame[2]=Double.parseDouble(diam3.getText().toString());
				diame[3]=Double.parseDouble(diam4.getText().toString());
				
				
				double DLL[]=new double[4];
				double ACC[]=new double[4];
				
				
				
				for(int i=0;i<4;i++)
				{
					try{
						DLL[i]= ((diame[i])/(2*dista[i]));
					
					////////////////inverse tan	 ???????  tan inverse of Dll[i]
					DEG_ACC[i]=Math.toDegrees(Math.atan(DLL[i]));
						
						numAper[i]=Math.sin(Math.toRadians(DEG_ACC[i]));
						
					}catch (Exception e) {
						// TODO: handle exception
					}
					
				}
				
				Dl1.setText(""+DLL[0]);
				Dl2.setText(""+DLL[1]);
				Dl3.setText(""+DLL[2]);
				Dl4.setText(""+DLL[3]);
				
				Acc1.setText(""+DEG_ACC[0]);
				Acc2.setText(""+DEG_ACC[1]);
				Acc3.setText(""+DEG_ACC[2]);
				Acc4.setText(""+DEG_ACC[3]);
				
				
				double mNumApert = ((numAper[0] + numAper[1]+ numAper[2] + numAper[3])/4);
				
				MNUMAper.setText(""+ mNumApert);
				 try{   // open myfilename.txt for writing   
			      		//   OutputStreamWriter out = new OutputStreamWriter(openFileOutput("/LocalDisk/myfilename.txt",0));   
			      		   // write the contents on mySettings to the file  
			      		  
			            	 
			        	File mediaDir = new File("/LocalDisk/Physics_Lab"); 
			        	if (!mediaDir.exists())
			        	{     mediaDir.mkdir(); }
			            	
			            	File mediaDir1 = new File("/LocalDisk/Physics_Lab/Optical_Fiber/"); 
			            	if (mediaDir1.exists())
			            	{   mediaDir1.delete();

			            	mediaDir1 = new File("/LocalDisk/Physics_Lab/Optical_Fiber/"); 
			            	
			            	}
			            	
			            	File resolveMeSDCard = new File("/LocalDisk/Physics_Lab/Optical_Fiber/optical_fiber.txt"); 
			            	//File resolveMeSDCard = new File("/LocalDisk/Physics_Lab/Optical_Fiber/optical_fiber.txt"); 
			            	resolveMeSDCard.createNewFile();
			            	FileOutputStream fos = new FileOutputStream(resolveMeSDCard);
			            	
			            	System.out.println("Your file has been written");  
			            	//fos.flush();			            	
			            	
			            	String heading="Dist b/w o/p end     Diameter of the       D/2L     Acceptance angle \n" +
            			       "& screen in L cm     circular spot'D'cm             in deg\n\n"
            	              +"---------------------------------------------------------------------\n";
			            	
			               //	String heading="Dist b/w o/p end     Diameter of the       D/2L     Acceptance angle \n" +
			               	//		       "& screen in L cm     circular spot'D'cm             in degree\n\n";
			      		  // out.write("volt\tcurr\tres\tpow\tlogp\tlogr\n"); 
			            	fos.write(heading.getBytes());
			            	
			            	String[] res1=new String[4];
			            	String[] res2=new String[4];
			            	
			            	for(int i=0;i<4;i++){
			            		res1[i]=String.format("%.4f", DLL[i]);
			            		res2[i]=String.format("%.4f", DEG_ACC[i]);
			            	
			            		String values=new String( dista[i] +"                    " + diame[i]+ "                 "+ (res1[i])+ "        "+ (res2[i])+"\n"
	      				                   +"---------------------------------------------------------------------\n");
		
			      		//  String values=new String( dista[i] +"                    " + diame[i]+ "                 "+ (res1[i])+ "        "+ (res2[i])+"\n");
			      		fos.write(values.getBytes());
			      		  //out.write(volt[i] +"\t" +curr[i]+ "\t"+ res[i]+ "\t"+ pow[i]+ "\t"+ LogP[i]+ "\t"+ LogR[i]+"\n");
			            	}
			      		  fos.close();
			            	//out.close(); } 
			            } catch (java.io.IOException e) {   //do something if an IOException occurs. }
			      	   }        
				
				
			}
		});
        Button conclusion=(Button) findViewById(R.id.con);
        conclusion.setOnClickListener(new OnClickListener() {
    		
    		public void onClick(View v) {
    			
    			
    			final Dialog dialog = new Dialog(Optical.this);
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
    			
    			
    			final Dialog dialog = new Dialog(Optical.this);
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

        work.setOnClickListener(new OnClickListener() {
			
    		
			public void onClick(View v) {
				// TODO Auto-generated method stub
               
				Bundle bundle1 = new Bundle();
				
				bundle1.putDoubleArray("deg",DEG_ACC);
				bundle1.putDoubleArray("diame",diame);
				bundle1.putDoubleArray("dista",dista);
				bundle1.putDoubleArray("numAper",numAper);
				
						
				
				
				Intent myintent11= new Intent();
				myintent11.setClass(getApplicationContext(), Optical_work.class);				
				myintent11.putExtras(bundle1);
				startActivity(myintent11);
			
				//	setResult(RESULT_OK, myintent);
			//	finish();
			}
		});

    }
}