package com.triggerinnovations.physics.diffraction;



import com.triggerinnovations.physics.R;
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

public class Diffraction extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_diffraction);
        
        
        final EditText d_val1=(EditText) findViewById(R.id.d_val1);
        final EditText d_val2=(EditText) findViewById(R.id.d_val2);
        final EditText d_val3=(EditText) findViewById(R.id.d_val3);
    
        final EditText x1_order1=(EditText) findViewById(R.id.x1_order1);
        final EditText x1_order2=(EditText) findViewById(R.id.x1_order2);
       
        final EditText x2_order1=(EditText) findViewById(R.id.x2_order1);
        final EditText x2_order2=(EditText) findViewById(R.id.x2_order2);
        
        final EditText x3_order1=(EditText) findViewById(R.id.x3_order1);
        final EditText x3_order2=(EditText) findViewById(R.id.x3_order2);
        
        final TextView tan1_order1=(TextView) findViewById(R.id.tan1_order1);
        final TextView tan1_order2=(TextView) findViewById(R.id.tan1_order2);
        
        final TextView tan2_order1=(TextView) findViewById(R.id.tan2_order1);
        final TextView tan2_order2=(TextView) findViewById(R.id.tan2_order2);
        
        final TextView tan3_order1=(TextView) findViewById(R.id.tan3_order1);
        final TextView tan3_order2=(TextView) findViewById(R.id.tan3_order2);
        
        final TextView ang1_order1=(TextView) findViewById(R.id.ang1_order1);
        final TextView ang1_order2=(TextView) findViewById(R.id.ang1_order2);
        final TextView ang2_order1=(TextView) findViewById(R.id.ang2_order1);
        final TextView ang2_order2=(TextView) findViewById(R.id.ang2_order2);
        final TextView ang3_order1=(TextView) findViewById(R.id.ang3_order1);
        final TextView ang3_order2=(TextView) findViewById(R.id.ang3_order2);
        
        final TextView tr1_z1=(TextView) findViewById(R.id.tr1_z1);
        final TextView tr1_z2=(TextView) findViewById(R.id.tr1_z2);
        final TextView tr1_zm=(TextView) findViewById(R.id.tr1_zm);

        final TextView tr2_z1=(TextView) findViewById(R.id.tr2_z1);
        final TextView tr2_z2=(TextView) findViewById(R.id.tr2_z2);
        final TextView tr2_zm=(TextView) findViewById(R.id.tr2_zm);
        
        final TextView tr3_z1=(TextView) findViewById(R.id.tr1_z1);
        final TextView tr3_z2=(TextView) findViewById(R.id.tr1_z2);
        final TextView tr3_zm=(TextView) findViewById(R.id.tr1_zm);
        
        
        final TextView mean_lamb=(TextView)findViewById(R.id.mean_lamb);
      
        final TextView res_final=(TextView)findViewById(R.id.res_final);
       
        final TextView per_error=(TextView) findViewById(R.id.per_error);
        
         Button calci=(Button) findViewById(R.id.calci);
         Button work=(Button) findViewById(R.id.work);
         Button clear=(Button) findViewById(R.id.clear);
        final Button submit=(Button) findViewById(R.id.submit);
        
        final double order1_x1[]=new double[3];
        final double order2_x2[]=new double[3];
        
        final double order1_tan1[]=new double[3];
        final  double order2_tan2[]=new double[3];
        
        final double order1_ang1[]=new double[3];
        final double order2_ang2[]=new double[3];
        
        final double D_val[]=new double[3];
        
        final double  trial1[]=new double[3];
        final double  trial2[]=new double[3];
        final double  trial3[]=new double[3];
        
        final double d=1/5906;
        
       
        submit.setOnClickListener(new OnClickListener() {
        	
        	
        	public void onClick(View v) {
        		// TODO Auto-generated method stub
        		
        		 // prepare the alert box
                AlertDialog.Builder alertbox = new AlertDialog.Builder(Diffraction.this);

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
                 
                    	
                    	
                    	AlertDialog.Builder alert1 = new AlertDialog.Builder(Diffraction.this);

                    	alert1.setTitle("Faculty Authentication");
                    	alert1.setMessage("Passcode");

                    	// Set an EditText view to get user input 
                    	final EditText input = new EditText(Diffraction.this);
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
        			
        			
        			final Dialog dialog = new Dialog(Diffraction.this);
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
                       
                   // getIntent();
                    	
                       //finish();
                    	//removeDialog(1);
                        Toast.makeText(getApplicationContext(), "Conclusion Written!!", Toast.LENGTH_LONG).show();
                    	//finish();
                        dialog.cancel();
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
        			
        			
        			final Dialog dialog = new Dialog(Diffraction.this);
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
        
        
        calci.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			
		
				
				
				D_val[0]=Double.parseDouble(d_val1.getText().toString());
				D_val[1]=Double.parseDouble(d_val2.getText().toString());
				D_val[2]=Double.parseDouble(d_val3.getText().toString());
				
				order1_x1[0]=Double.parseDouble(x1_order1.getText().toString());
				order1_x1[1]=Double.parseDouble(x2_order1.getText().toString());
				order1_x1[2]=Double.parseDouble(x3_order1.getText().toString());
				
				order2_x2[0]=Double.parseDouble(x1_order2.getText().toString());
				order2_x2[1]=Double.parseDouble(x2_order2.getText().toString());
				order2_x2[2]=Double.parseDouble(x3_order2.getText().toString());
				
				
				for(int i=0;i<3;i++)
				{
					order1_tan1[i]=order1_x1[i]/(2* D_val[i]);
					order2_tan2[i]=order2_x2[i]/(2*D_val[i]);
					
					order1_ang1[i]=Math.toDegrees(Math.atan(order1_tan1[i]));
					order2_ang2[i]=Math.toDegrees(Math.atan(order2_tan2[i]));
			
				trial1[i]=d*Math.sin(Math.toRadians(order1_ang1[i]))*Math.pow(10,10);
				trial2[i]=d*Math.sin(Math.toRadians(order2_ang2[i]))*Math.pow(10,10);
				
				trial3[i]=(trial1[i]+trial2[i])/2;
				
				}
				
				
				tan1_order1.setText(""+order1_tan1[0]);
				tan1_order2.setText(""+order2_tan2[0]);
				
				tan2_order1.setText(""+order1_tan1[1]);
				tan2_order2.setText(""+order2_tan2[1]);
				
				tan3_order1.setText(""+order1_tan1[2]);
				tan3_order2.setText(""+order2_tan2[2]);
				
				
				ang1_order1.setText(""+order1_ang1[0]);
				ang1_order2.setText(""+order2_ang2[0]);
				
				ang2_order1.setText(""+order1_ang1[1]);
				ang2_order2.setText(""+order2_ang2[1]);
				
				ang3_order1.setText(""+order1_ang1[2]);
				ang3_order2.setText(""+order2_ang2[2]);
				
				tr1_z1.setText(""+trial1[0]);
				tr1_z2.setText(""+trial2[0]);
				tr1_zm.setText(""+trial3[0]);
				
				tr2_z1.setText(""+trial1[0]);
				tr2_z2.setText(""+trial2[1]);
				tr2_zm.setText(""+trial3[2]);

				tr3_z1.setText(""+trial1[0]);
				tr3_z2.setText(""+trial2[1]);
				tr3_zm.setText(""+trial3[2]);
				
				
				 double trial=0;; 
				for(int i=0;i<3;i++)
				{
					trial=trial+trial3[i];
				}
				trial=trial/3;
				
				
				mean_lamb.setText(""+trial);
				res_final.setText(""+trial);
				
				double std_val=6500*Math.pow(10, -10);
				
				double per_err=(((std_val-trial)/std_val)*100);
				
				per_error.setText(""+per_err);
				
			}
		});
        
        clear.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent myintent = new Intent();
				myintent.setClass(getApplicationContext(), Diffraction.class);
				
				startActivityForResult(myintent, 0);
				setResult(RESULT_OK, myintent);
				finish();				
			}
		});

work.setOnClickListener(new OnClickListener() {
			
    		
			public void onClick(View v) {
				// TODO Auto-generated method stub
               
				Bundle bundle2 = new Bundle();
				
				bundle2.putDoubleArray("X1",order1_x1);
				bundle2.putDoubleArray("X2",order2_x2);
				bundle2.putDoubleArray("tan1",order1_tan1);
				bundle2.putDoubleArray("tan2",order2_tan2);
				bundle2.putDoubleArray("Angle1",order1_ang1);
				bundle2.putDoubleArray("Angle2",order2_ang2);
						
				
				
				Intent myintent12= new Intent();
				myintent12.setClass(getApplicationContext(), Diffraction_work.class);				
				myintent12.putExtras(bundle2);
				startActivity(myintent12);
			
				//	setResult(RESULT_OK, myintent);
				//finish();
			}
		});
        

        
    }
}