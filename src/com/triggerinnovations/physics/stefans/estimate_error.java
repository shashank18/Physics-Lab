package com.triggerinnovations.physics.stefans;



import java.io.File;
import java.io.FileOutputStream;

import com.triggerinnovations.physics.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class estimate_error extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.estm_error);
        
        Button calci=(Button) findViewById(R.id.calci);
        Button clear=(Button) findViewById(R.id.clear);
        final Button graph=(Button) findViewById(R.id.graph);
        graph.setEnabled(false);
        
        final EditText x_val0=(EditText) findViewById(R.id.valX1);
        final EditText x_val1=(EditText) findViewById(R.id.valX2);
        final EditText x_val2=(EditText) findViewById(R.id.valX3);
        final EditText x_val3=(EditText) findViewById(R.id.valX4);
        final EditText x_val4=(EditText) findViewById(R.id.valX5);
        final EditText x_val5=(EditText) findViewById(R.id.valX6);
        final EditText x_val6=(EditText) findViewById(R.id.valX7);
        final EditText x_val7=(EditText) findViewById(R.id.valX8);
        final EditText x_val8=(EditText) findViewById(R.id.valX9);
        
        final EditText y_val0=(EditText) findViewById(R.id.valY1);
        final EditText y_val1=(EditText) findViewById(R.id.valY2);
        final EditText y_val2=(EditText) findViewById(R.id.valY3);
        final EditText y_val3=(EditText) findViewById(R.id.valY4);
        final EditText y_val4=(EditText) findViewById(R.id.valY5);
        final EditText y_val5=(EditText) findViewById(R.id.valY6);
        final EditText y_val6=(EditText) findViewById(R.id.valY7);
        final EditText y_val7=(EditText) findViewById(R.id.valY8);
        final EditText y_val8=(EditText) findViewById(R.id.valY9);
        
        final double X_values[]=new double[9];
        final double Y_values[]=new double[9];
        final double x_square[]=new double[9];
        final double XY_val[]=new double[9];
        
        
        
        final TextView SQU_x1=(TextView) findViewById(R.id.sq_x1);
        final TextView SQU_x2=(TextView) findViewById(R.id.sq_x2);
        final TextView SQU_x3=(TextView) findViewById(R.id.sq_x3);
        final TextView SQU_x4=(TextView) findViewById(R.id.sq_x4);
        final TextView SQU_x5=(TextView) findViewById(R.id.sq_x5);
        final TextView SQU_x6=(TextView) findViewById(R.id.sq_x6);
        final TextView SQU_x7=(TextView) findViewById(R.id.sq_x7);
        final TextView SQU_x8=(TextView) findViewById(R.id.sq_x8);
        final TextView SQU_x9=(TextView) findViewById(R.id.sq_x9);
        
        final TextView XY_VALE1=(TextView) findViewById(R.id.val_xy1);
        final TextView XY_VALE2=(TextView) findViewById(R.id.val_xy2);
        final TextView XY_VALE3=(TextView) findViewById(R.id.val_xy3);
        final TextView XY_VALE4=(TextView) findViewById(R.id.val_xy4);
        final TextView XY_VALE5=(TextView) findViewById(R.id.val_xy5);
        final TextView XY_VALE6=(TextView) findViewById(R.id.val_xy6);
        final TextView XY_VALE7=(TextView) findViewById(R.id.val_xy7);
        final TextView XY_VALE8=(TextView) findViewById(R.id.val_xy8);
        final TextView XY_VALE9=(TextView) findViewById(R.id.val_xy9);
        
        final TextView Y_VAl1=(TextView) findViewById(R.id.y_1);
        final TextView Y_VAl2=(TextView) findViewById(R.id.y_2);
        final TextView Y_VAl3=(TextView) findViewById(R.id.y_3);
        final TextView Y_VAl4=(TextView) findViewById(R.id.y_4);
        final TextView Y_VAl5=(TextView) findViewById(R.id.y_5);
        final TextView Y_VAl6=(TextView) findViewById(R.id.y_6);
        final TextView Y_VAl7=(TextView) findViewById(R.id.y_7);
        final TextView Y_VAl8=(TextView) findViewById(R.id.y_8);
        
        final TextView Y_VAl9=(TextView) findViewById(R.id.y_9);
        
        final TextView y_Y_val1=(TextView) findViewById(R.id.y_Y1);
        final TextView y_Y_val2=(TextView) findViewById(R.id.y_Y2);
        final TextView y_Y_val3=(TextView) findViewById(R.id.y_Y3);
        final TextView y_Y_val4=(TextView) findViewById(R.id.y_Y4);
        final TextView y_Y_val5=(TextView) findViewById(R.id.y_Y5);
        final TextView y_Y_val6=(TextView) findViewById(R.id.y_Y6);
        final TextView y_Y_val7=(TextView) findViewById(R.id.y_Y7);
        final TextView y_Y_val8=(TextView) findViewById(R.id.y_Y8);
        final TextView y_Y_val9=(TextView) findViewById(R.id.y_Y9);
        
        final TextView sq_y_Y_val1=(TextView) findViewById(R.id.sq_y_Y1);
        final TextView sq_y_Y_val2=(TextView) findViewById(R.id.sq_y_Y2);
        final TextView sq_y_Y_val3=(TextView) findViewById(R.id.sq_y_Y3);
        final TextView sq_y_Y_val4=(TextView) findViewById(R.id.sq_y_Y4);
        final TextView sq_y_Y_val5=(TextView) findViewById(R.id.sq_y_Y5);
        final TextView sq_y_Y_val6=(TextView) findViewById(R.id.sq_y_Y6);
        final TextView sq_y_Y_val7=(TextView) findViewById(R.id.sq_y_Y7);
        final TextView sq_y_Y_val8=(TextView) findViewById(R.id.sq_y_Y8);
        final TextView sq_y_Y_val9=(TextView) findViewById(R.id.sq_y_Y9);
        
        
        X_values[0]=Double.parseDouble(x_val0.getText().toString());
        X_values[1]=Double.parseDouble(x_val1.getText().toString());
        X_values[2]=Double.parseDouble(x_val2.getText().toString());
        X_values[3]=Double.parseDouble(x_val3.getText().toString());
        X_values[4]=Double.parseDouble(x_val4.getText().toString());
        X_values[5]=Double.parseDouble(x_val5.getText().toString());
        X_values[6]=Double.parseDouble(x_val6.getText().toString());
        X_values[7]=Double.parseDouble(x_val7.getText().toString());
        X_values[8]=Double.parseDouble(x_val8.getText().toString());
        
        Y_values[0]=Double.parseDouble(y_val0.getText().toString());
        Y_values[1]=Double.parseDouble(y_val1.getText().toString());
        Y_values[2]=Double.parseDouble(y_val2.getText().toString());
        Y_values[3]=Double.parseDouble(y_val3.getText().toString());
        Y_values[4]=Double.parseDouble(y_val4.getText().toString());
        Y_values[5]=Double.parseDouble(y_val5.getText().toString());
        Y_values[6]=Double.parseDouble(y_val6.getText().toString());
        Y_values[7]=Double.parseDouble(y_val7.getText().toString());
        Y_values[8]=Double.parseDouble(y_val8.getText().toString());
        
        final double VAL_Y[]=new double[9];
        calci.setOnClickListener(new OnClickListener() {
			
		
			public void onClick(View v) {
				graph.setEnabled(true);
				
				double sum_X=0;
				double sum_Y=0;
				double sum_XY=0;
				double sum_X_sq=0;
				// TODO Auto-generated method stub
				 X_values[0]=Double.parseDouble(x_val0.getText().toString());
			        X_values[1]=Double.parseDouble(x_val1.getText().toString());
			        X_values[2]=Double.parseDouble(x_val2.getText().toString());
			        X_values[3]=Double.parseDouble(x_val3.getText().toString());
			        X_values[4]=Double.parseDouble(x_val4.getText().toString());
			        X_values[5]=Double.parseDouble(x_val5.getText().toString());
			        X_values[6]=Double.parseDouble(x_val6.getText().toString());
			        X_values[7]=Double.parseDouble(x_val7.getText().toString());
			        X_values[8]=Double.parseDouble(x_val8.getText().toString());
			        
			        Y_values[0]=Double.parseDouble(y_val0.getText().toString());
			        Y_values[1]=Double.parseDouble(y_val1.getText().toString());
			        Y_values[2]=Double.parseDouble(y_val2.getText().toString());
			        Y_values[3]=Double.parseDouble(y_val3.getText().toString());
			        Y_values[4]=Double.parseDouble(y_val4.getText().toString());
			        Y_values[5]=Double.parseDouble(y_val5.getText().toString());
			        Y_values[6]=Double.parseDouble(y_val6.getText().toString());
			        Y_values[7]=Double.parseDouble(y_val7.getText().toString());
			        Y_values[8]=Double.parseDouble(y_val8.getText().toString());
			       
			        
			        for(int i=0;i<9;i++)
			        {
			        	try{
			        		
			        		x_square[i]=X_values[i]*X_values[i];
			        		XY_val[i]=X_values[i]*Y_values[i];
			        				        		
			        		
			        	}catch (Exception e) {
							
						}
			        	
			        	
			        }
			        
			        
			        
			        SQU_x1.setText(""+x_square[0]);
			        SQU_x2.setText(""+x_square[1]);
			        SQU_x3.setText(""+x_square[2]);
			        SQU_x4.setText(""+x_square[3]);
			        SQU_x5.setText(""+x_square[4]);
			        SQU_x6.setText(""+x_square[5]);
			        SQU_x7.setText(""+x_square[6]);
			        SQU_x8.setText(""+x_square[7]);
			        SQU_x9.setText(""+x_square[8]);
			        
			        
			        XY_VALE1.setText(""+XY_val[0]);
			        XY_VALE2.setText(""+XY_val[1]);
			        XY_VALE3.setText(""+XY_val[2]);
			        XY_VALE4.setText(""+XY_val[3]);
			        XY_VALE5.setText(""+XY_val[4]);
			        XY_VALE6.setText(""+XY_val[5]);
			        XY_VALE7.setText(""+XY_val[6]);
			        XY_VALE8.setText(""+XY_val[7]);
			        XY_VALE9.setText(""+XY_val[8]);
			        
			        Y_VAl1.setText(""+XY_val[8]);
			        
			        for(int i=0;i<9;i++)
			        {
			        	try{
			        	sum_X=sum_X+X_values[i];
			        	sum_Y=sum_Y+Y_values[i];
			        	sum_XY=sum_XY+XY_val[i];
			        	sum_X_sq=sum_X_sq+x_square[i];
			        		
			        		
			        	}catch (Exception e) {
						
						}
			        }
			        
			        int n=9;
			        
			        double m_val[]=new double[9];
			        double c_val[]=new double[9];
			        
			        
			        
			        
			        for(int i=0;i<9;i++)
			        {
			        	
			        	try{
			        	
			       	m_val[i]=(( (n*sum_XY)-(sum_X*sum_Y))/(  (n*sum_X_sq)-( sum_X*sum_X)));
			        		
			        c_val[i]=(( (sum_X_sq*sum_Y) -(sum_X*sum_XY )   )/( (n*sum_X_sq) -(sum_X*sum_X )  ));	
			        		
			        VAL_Y[i]= m_val[i]*X_values[i] + c_val[i] ;
			        	
			        	
			        	}catch (Exception e) {
						
						}
			        	
			        }
			        
			        
			        
			        Y_VAl1.setText(""+VAL_Y[0]);
			        Y_VAl2.setText(""+VAL_Y[1]);
			        Y_VAl3.setText(""+VAL_Y[2]);
			        Y_VAl4.setText(""+VAL_Y[3]);
			        Y_VAl5.setText(""+VAL_Y[4]);
			        Y_VAl6.setText(""+VAL_Y[5]);
			        Y_VAl7.setText(""+VAL_Y[6]);
			        Y_VAl8.setText(""+VAL_Y[7]);
			        Y_VAl9.setText(""+VAL_Y[8]);
			        
			        
			        double val_y_Y[]=new double[9];
			        double sq_val_y_Y[]=new double[9];
			        
			        
			        for(int i=0;i<9;i++)
			        {
			        	val_y_Y[i]=Y_values[i]-VAL_Y[i];
			        	
			        	sq_val_y_Y[i]= val_y_Y[i]*val_y_Y[i];
			        	
			        }
			        
			        y_Y_val1.setText(""+val_y_Y[0]);
			        y_Y_val2.setText(""+val_y_Y[1]);
			        y_Y_val3.setText(""+val_y_Y[2]);
			        y_Y_val4.setText(""+val_y_Y[3]);
			        y_Y_val5.setText(""+val_y_Y[4]);
			        y_Y_val6.setText(""+val_y_Y[5]);
			        y_Y_val7.setText(""+val_y_Y[6]);
			        y_Y_val8.setText(""+val_y_Y[7]);
			        y_Y_val9.setText(""+val_y_Y[8]);
			        
			        sq_y_Y_val1.setText(""+sq_val_y_Y[0]);
			        sq_y_Y_val2.setText(""+sq_val_y_Y[1]);
			        sq_y_Y_val3.setText(""+sq_val_y_Y[2]);
			        sq_y_Y_val4.setText(""+sq_val_y_Y[3]);
			        sq_y_Y_val5.setText(""+sq_val_y_Y[4]);
			        sq_y_Y_val6.setText(""+sq_val_y_Y[5]);
			        sq_y_Y_val7.setText(""+sq_val_y_Y[6]);
			        sq_y_Y_val8.setText(""+sq_val_y_Y[7]);
			        sq_y_Y_val9.setText(""+sq_val_y_Y[8]);
			        
			        
			        
			        
			        
			        try{   // open myfilename.txt for writing   
			      		//   OutputStreamWriter out = new OutputStreamWriter(openFileOutput("/LocalDisk/myfilename.txt",0));   
			      		   // write the contents on mySettings to the file  
			      		  
			            	 
			        	File mediaDir = new File("/LocalDisk/Physics_Lab"); 
			        	if (!mediaDir.exists())
			        	{     mediaDir.mkdir(); }
			            	
			            	File mediaDir1 = new File("/LocalDisk/Physics_Lab/Stefans_Law/"); 
			            	if (!mediaDir1.exists())
			            	{     mediaDir1.mkdir(); }
			            	
			            	File resolveMeSDCard = new File("/LocalDisk/Physics_Lab/Stefans_Law/stefan_law_error_estimation.txt"); 
			            	resolveMeSDCard.createNewFile();
			            	FileOutputStream fos = new FileOutputStream(resolveMeSDCard);
			            	//fos.write(string.getBytes());   
			            	System.out.println("Your file has been written");    
			            	
			            	
			            	
			            	
			            	
			      String heading="logR         logP        X^2          XY      Y'=mx+c        Y-y'      (Y-y')^2\n"
	          	          +"-------------------------------------------------------------------------------\n";

//			            	String heading="logR\t\tlogP\t\tX^2\t\tXY\t\tY'=mx+c\tY-y'\t\t(Y-y')^2\n";
			      		  // out.write("volt\tcurr\tres\tpow\tlogp\tlogr\n"); 
			            	fos.write(heading.getBytes());
			            	
			            	
			            	
			            	String[] res1=new String[9];
			            	String[] res2=new String[9];
			            	String[] res3=new String[9];
			            	String[] res4=new String[9];
			            	String[] res5=new String[9];
			       			            	
			            	
			            	for(int i=0;i<9;i++){
			      	

			            		res1[i]=String.format("%.4f", x_square[i]);
			            		res2[i]=String.format("%.4f", XY_val[i]);

			            		res3[i]=String.format("%.4f", VAL_Y[i]);
			            		res4[i]=String.format("%.4f", val_y_Y[i]);
			            		res5[i]=String.format("%.4f", sq_val_y_Y[i]);
			            	

			            		
			    	            String values=new String( X_values[i] +"      " + Y_values[1]+ "      "+ (res1[i])+ "      "+ (res2[i])+"      "+ (res3[i])+ "      "+(res4[i])+ "      "+ (res5[i])+"\n"
					            		+"-------------------------------------------------------------------------------\n");		
			            		
			          //  String values=new String( X_values[i] +"\t\t" + Y_values[1]+ "\t\t"+ (res1[i])+ "\t\t"+ (res2[i])+"\t\t"+ (res3[i])+ "\t\t\t\t\t"+(res4[i])+ "\t\t\t"+ (res5[i])+"\n");
			      		fos.write(values.getBytes());
			      		  //out.write(volt[i] +"\t" +curr[i]+ "\t"+ res[i]+ "\t"+ pow[i]+ "\t"+ LogP[i]+ "\t"+ LogR[i]+"\n");
			            	}
			      		  fos.close();
			            	//out.close(); } 
			            } catch (java.io.IOException e) {   //do something if an IOException occurs. }
			      	   }        
			}
		});
        
        clear.setOnClickListener(new OnClickListener() {
	
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myintent = new Intent();
				myintent.setClass(getApplicationContext(), estimate_error.class);
				
				startActivityForResult(myintent, 0);
				setResult(RESULT_OK, myintent);
				finish();
			}
		});
        
        
        graph.setOnClickListener(new OnClickListener() {
			
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
			
				Bundle bundle1 = new Bundle();
				
				bundle1.putDoubleArray("xval",X_values );
				bundle1.putDoubleArray("yval",Y_values);
				
				bundle1.putDoubleArray("x_val",X_values);
				bundle1.putDoubleArray("y_val",VAL_Y);
				
				Intent myintent = new Intent();
				myintent.setClass(getApplicationContext(), Graph_estimate_caller.class);
				myintent.putExtras(bundle1);
				startActivityForResult(myintent, 0);
				setResult(RESULT_OK, myintent);
				//finish();
			}
		});
    }
}