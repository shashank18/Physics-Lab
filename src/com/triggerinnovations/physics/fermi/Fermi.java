package com.triggerinnovations.physics.fermi;


import com.triggerinnovations.physics.R;
import com.triggerinnovations.physics.fermi.*;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Fermi extends Activity {
    /** Called when the activity is first created. */
	 double area_val;
  public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_fermi);
        
  final EditText temp1=(EditText) findViewById(R.id.temp1);
  final EditText temp2=(EditText) findViewById(R.id.temp2);
  final EditText temp3=(EditText) findViewById(R.id.temp3);
  final EditText temp4=(EditText) findViewById(R.id.temp4);
  final EditText temp5=(EditText) findViewById(R.id.temp5);
  final EditText temp6=(EditText) findViewById(R.id.temp6);
  final EditText temp7=(EditText) findViewById(R.id.temp7);
  final EditText temp8=(EditText) findViewById(R.id.temp8);
  
  final EditText current1=(EditText) findViewById(R.id.current1);
  final EditText current2=(EditText) findViewById(R.id.current2);
  final EditText current3=(EditText) findViewById(R.id.current3);
  final EditText current4=(EditText) findViewById(R.id.current4);
  final EditText current5=(EditText) findViewById(R.id.current5);
  final EditText current6=(EditText) findViewById(R.id.current6);
  final EditText current7=(EditText) findViewById(R.id.current7);
  final EditText current8=(EditText) findViewById(R.id.current8);
  
  final EditText volt1=(EditText) findViewById(R.id.volt1);
  final EditText volt2=(EditText) findViewById(R.id.volt2);
  final EditText volt3=(EditText) findViewById(R.id.volt3);
  final EditText volt4=(EditText) findViewById(R.id.volt4);
  final EditText volt5=(EditText) findViewById(R.id.volt5);
  final EditText volt6=(EditText) findViewById(R.id.volt6);
  final EditText volt7=(EditText) findViewById(R.id.volt7);
  final EditText volt8=(EditText) findViewById(R.id.volt8);
  
final  TextView resist1=(TextView) findViewById(R.id.resist1);
final  TextView resist2=(TextView) findViewById(R.id.resist2);
final  TextView resist3=(TextView) findViewById(R.id.resist3);
final TextView resist4=(TextView) findViewById(R.id.resist4);
final TextView resist5=(TextView) findViewById(R.id.resist5);
final  TextView resist6=(TextView) findViewById(R.id.resist6);
final TextView resist7=(TextView) findViewById(R.id.resist7);
final TextView resist8=(TextView) findViewById(R.id.resist8);

final TextView slope=(TextView) findViewById(R.id.slope_x);
  
final TextView Per_error=(TextView) findViewById(R.id.per_error);
final Button draw=(Button) findViewById(R.id.graph);
 draw.setEnabled(false); 
Button calci=(Button) findViewById(R.id.calci);
 // Button clear=(Button) findViewById(R.id.clear);
//  Button submit=(Button) findViewById(R.id.submit);
  
//  final Button graph=(Button) findViewById(R.id.graph);
 final EditText area=(EditText) findViewById(R.id.area);
   
  final EditText t=(EditText) findViewById(R.id.t);
  final EditText ec=(EditText) findViewById(R.id.ec);
  final EditText rt=(EditText) findViewById(R.id.rt);
  final EditText mf=(EditText) findViewById(R.id.mf);
  final EditText c=(EditText) findViewById(R.id.c);
  final EditText fe=(EditText) findViewById(R.id.fe);
 
  Button fermicalc=(Button) findViewById(R.id.fermicalc);

  final double temperature[]=new double[8];
  final double current[]=new double[8];
  final double volt[]=new double[8];
  final double resistance[]=new double[8];
  
//final TextView Fermi_energy=(TextView) findViewById(R.id.fermi_energy);
//final TextView A_const=(TextView) findViewById(R.id.a_const); 
//final TextView Mean_free=(TextView) findViewById(R.id.mean_free); 
//final TextView Rel_time=(TextView) findViewById(R.id.rel_time);; 
//final TextView Elec_cond=(TextView) findViewById(R.id.elec_cond);
  

calci.setOnClickListener(new OnClickListener() {
	
	public void onClick(View v) {
		
		area_val=2.124*Math.pow(10, -7);
		
		temperature[0]= Double.parseDouble(temp1.getText().toString());
		temperature[1]= Double.parseDouble(temp2.getText().toString());
		temperature[2]= Double.parseDouble(temp3.getText().toString());
		temperature[3]= Double.parseDouble(temp4.getText().toString());
		temperature[4]= Double.parseDouble(temp5.getText().toString());
		temperature[5]= Double.parseDouble(temp6.getText().toString());
		temperature[6]= Double.parseDouble(temp7.getText().toString());
		temperature[7]= Double.parseDouble(temp8.getText().toString());
		
		current[0]=Double.parseDouble(current1.getText().toString());
		current[1]=Double.parseDouble(current2.getText().toString());
		current[2]=Double.parseDouble(current3.getText().toString());
		current[3]=Double.parseDouble(current4.getText().toString());
		current[4]=Double.parseDouble(current5.getText().toString());
		current[5]=Double.parseDouble(current6.getText().toString());
		current[6]=Double.parseDouble(current7.getText().toString());
		current[7]=Double.parseDouble(current8.getText().toString());
		
		volt[0]=Double.parseDouble(volt1.getText().toString());
		volt[1]=Double.parseDouble(volt2.getText().toString());
		volt[2]=Double.parseDouble(volt3.getText().toString());
		volt[3]=Double.parseDouble(volt4.getText().toString());
		volt[4]=Double.parseDouble(volt5.getText().toString());
		volt[5]=Double.parseDouble(volt6.getText().toString());
		volt[6]=Double.parseDouble(volt7.getText().toString());
		volt[7]=Double.parseDouble(volt8.getText().toString());
		
		for(int i=0;i<8;i++)
		{
			
			try{
			resistance[i]=(volt[i]/current[i]);
			}catch (Exception e) {
				
			}
	
		}
		resist1.setText(""+resistance[0]);	
		resist2.setText(""+resistance[1]);
		resist3.setText(""+resistance[2]);
		resist4.setText(""+resistance[3]);
		resist5.setText(""+resistance[4]);
		resist6.setText(""+resistance[5]);
		resist7.setText(""+resistance[6]);
		resist8.setText(""+resistance[7]);
      draw.setEnabled(true); 
	  
//		

	}
}); 
    
    
fermicalc.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		 final double R_318;
		 R_318=resistance[7];
	//Log.d("aa", ""+R_318);
		 final double m_val=9.1*Math.pow(10,-31);
	
		 
		
		final  double lenght=3.6;
		 final double radius=0.26;

	 final double n_val= 8.464* Math.pow(10, 28);
//		  
		 final  double e_val=1.602*Math.pow(10, -19);
		   final double val_vf=1.57*Math.pow(10, 6);
//		  
//		 final double std_val=7.28;		
final double elec_cond=((lenght)/( R_318* area_val));
//Log.d("hii", ""+elec_cond);
final double relx_time= ((elec_cond*m_val)/(n_val*e_val*e_val));
//
final double mean_path=  val_vf*relx_time;
//
final double L_val=3.6;
final double a_const=mean_path*318;
//
final double fermi_init=((n_val * e_val * e_val * Math.E * radius * radius * a_const)/( L_val* (Math.sqrt(2 * m_val))));

ec.setText(""+elec_cond);
rt.setText(""+relx_time);
mf.setText(""+mean_path);
c.setText(""+a_const);

double sum_X=0;
double sum_Y=0;
double sum_XY=0;
double sum_X_sq=0;
//

final double X_values[]=new double[8];
final double Y_values[]=new double[8];
final double x_square[]=new double[8];
final double XY_val[]=new double[8];

int xval=(int) 353;
for(int i=0;i<8;i++)
{
	X_values[i]=xval;
	xval=xval-5;
	
	Y_values[i]=resistance[i];	
}

for(int i=0;i<8;i++)
{
	try{
	
		x_square[i]=X_values[i]*X_values[i];
		XY_val[i]=X_values[i]*Y_values[i];
				        		
		
	}catch (Exception e) {
		
	}
	
	
}

for(int i=0;i<8;i++)
{
	try{
	sum_X=sum_X+X_values[i];
	sum_Y=sum_Y+Y_values[i];
	sum_XY=sum_XY+XY_val[i];
	sum_X_sq=sum_X_sq+x_square[i];
		
		
	}catch (Exception e) {
	
	}
}

int n=8;

final  double slope_val=(( (n*sum_XY)-(sum_X*sum_Y))/(  (n*sum_X_sq)-( sum_X*sum_X)));
	
		final double fermi_val= fermi_init * fermi_init * slope_val * slope_val ;
	
	slope.setText(""+slope_val);
	
	
	final double std_error=7.28;
	final double per_error;
	per_error= ((std_error* fermi_val)/(std_error))*100;
	
	Per_error.setText("100 ="+per_error);




fe.setText(""+fermi_init);

	}
});






draw.setOnClickListener(new OnClickListener() {


public void onClick(View v) {
	// TODO Auto-generated method stub
	Bundle bundle1 = new Bundle();
	
	bundle1.putDoubleArray("logP",temperature );
	bundle1.putDoubleArray("logR",resistance );
	

	Intent myintent = new Intent();
	myintent.setClass(getApplicationContext(), Graph_fermi_caller.class);
	myintent.putExtras(bundle1);
	startActivityForResult(myintent, 0);
	setResult(RESULT_OK, myintent);
	//finish();
	
}
});

// 
   
    
    }
}
