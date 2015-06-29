package com.triggerinnovations.physics.passive;



import java.io.File;
import java.io.FileOutputStream;

import org.afree.R;

import com.triggerinnovations.physics.diodea.diodemain;
import com.triggerinnovations.physics.stefans.StefansLaw;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Passive extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.passive_main);
        
        
        
        
        
    final EditText v1_z1= (EditText) findViewById(R.id.v1_z1);
    final EditText v1_z2= (EditText) findViewById(R.id.v1_z2);
    final EditText v1_z3= (EditText) findViewById(R.id.v1_z3);
    final EditText v1_z4= (EditText) findViewById(R.id.v1_z4);
    final EditText v1_z5= (EditText) findViewById(R.id.v1_z5);
    final EditText v1_z6= (EditText) findViewById(R.id.v1_z6);
    final EditText v1_z7= (EditText) findViewById(R.id.v1_z7);
    final EditText v1_z8= (EditText) findViewById(R.id.v1_z8);
    final EditText v1_z9= (EditText) findViewById(R.id.v1_z9);
    final EditText v1_z10= (EditText) findViewById(R.id.v1_z10);
        
        
    final EditText v2_z1= (EditText) findViewById(R.id.v2_z1);
    final EditText v2_z2= (EditText) findViewById(R.id.v2_z2);
    final EditText v2_z3= (EditText) findViewById(R.id.v2_z3);
    final  EditText v2_z4= (EditText) findViewById(R.id.v2_z4);
    final EditText v2_z5= (EditText) findViewById(R.id.v2_z5);
    final EditText v2_z6= (EditText) findViewById(R.id.v2_z6);
    final EditText v2_z7= (EditText) findViewById(R.id.v2_z7);
    final EditText v2_z8= (EditText) findViewById(R.id.v2_z8);
    final EditText v2_z9= (EditText) findViewById(R.id.v2_z9);
    final  EditText v2_z10= (EditText) findViewById(R.id.v2_z10);
        
        
    final  EditText v3_z1= (EditText) findViewById(R.id.v3_z1); 
    final EditText v3_z2= (EditText) findViewById(R.id.v3_z2);    
    final EditText v3_z3= (EditText) findViewById(R.id.v3_z3);    
    final EditText v3_z4= (EditText) findViewById(R.id.v3_z4);   
    final EditText v3_z5= (EditText) findViewById(R.id.v3_z5);   
    final EditText v3_z6= (EditText) findViewById(R.id.v3_z6);   
    final EditText v3_z7= (EditText) findViewById(R.id.v3_z7);   
    final EditText v3_z8= (EditText) findViewById(R.id.v3_z8);    
    final EditText v3_z9= (EditText) findViewById(R.id.v3_z9);    
    
    final EditText v3_z10= (EditText) findViewById(R.id.v3_z10);  

final TextView g1_z1=(TextView) findViewById(R.id.g1_z1);
final TextView g1_z2=(TextView) findViewById(R.id.g1_z2);
final TextView g1_z3=(TextView) findViewById(R.id.g1_z3);
final TextView g1_z4=(TextView) findViewById(R.id.g1_z4);
final TextView g1_z5=(TextView) findViewById(R.id.g1_z5);
final TextView g1_z6=(TextView) findViewById(R.id.g1_z6);
final TextView g1_z7=(TextView) findViewById(R.id.g1_z7);
final TextView g1_z8=(TextView) findViewById(R.id.g1_z8);
final TextView g1_z9=(TextView) findViewById(R.id.g1_z9);
final TextView g1_z10=(TextView) findViewById(R.id.g1_z10);


final TextView g2_z1=(TextView) findViewById(R.id.g2_z1);
final TextView g2_z2=(TextView) findViewById(R.id.g2_z2);
final TextView g2_z3=(TextView) findViewById(R.id.g2_z3);
final TextView g2_z4=(TextView) findViewById(R.id.g2_z4);
final TextView g2_z5=(TextView) findViewById(R.id.g2_z5);
final TextView g2_z6=(TextView) findViewById(R.id.g2_z6);
final TextView g2_z7=(TextView) findViewById(R.id.g2_z7);
final TextView g2_z8=(TextView) findViewById(R.id.g2_z8);
final TextView g2_z9=(TextView) findViewById(R.id.g2_z9);
final TextView g2_z10=(TextView) findViewById(R.id.g2_z10);

final TextView g3_z1=(TextView) findViewById(R.id.g3_z1);
final TextView g3_z2=(TextView) findViewById(R.id.g3_z2);
final TextView g3_z3=(TextView) findViewById(R.id.g3_z3);
final TextView g3_z4=(TextView) findViewById(R.id.g3_z4);
final TextView g3_z5=(TextView) findViewById(R.id.g3_z5);
final TextView g3_z6=(TextView) findViewById(R.id.g3_z6);
final TextView g3_z7=(TextView) findViewById(R.id.g3_z7);
final TextView g3_z8=(TextView) findViewById(R.id.g3_z8);
final TextView g3_z9=(TextView) findViewById(R.id.g3_z9);
final TextView g3_z10=(TextView) findViewById(R.id.g3_z10);

final TextView i1_z1=(TextView) findViewById(R.id.i1_z1);
final TextView i1_z2=(TextView) findViewById(R.id.i1_z2);
final TextView i1_z3=(TextView) findViewById(R.id.i1_z3);
final TextView i1_z4=(TextView) findViewById(R.id.i1_z4);
final TextView i1_z5=(TextView) findViewById(R.id.i1_z5);
final TextView i1_z6=(TextView) findViewById(R.id.i1_z6);
final TextView i1_z7=(TextView) findViewById(R.id.i1_z7);
final TextView i1_z8=(TextView) findViewById(R.id.i1_z8);
final TextView i1_z9=(TextView) findViewById(R.id.i1_z9);
final TextView i1_z10=(TextView) findViewById(R.id.i1_z10);

final TextView i2_z1=(TextView) findViewById(R.id.i2_z1);
final TextView i2_z2=(TextView) findViewById(R.id.i2_z2);
final TextView i2_z3=(TextView) findViewById(R.id.i2_z3);
final TextView i2_z4=(TextView) findViewById(R.id.i2_z4);
final TextView i2_z5=(TextView) findViewById(R.id.i2_z5);
final TextView i2_z6=(TextView) findViewById(R.id.i2_z6);
final TextView i2_z7=(TextView) findViewById(R.id.i2_z7);
final TextView i2_z8=(TextView) findViewById(R.id.i2_z8);
final TextView i2_z9=(TextView) findViewById(R.id.i2_z9);
final TextView i2_z10=(TextView) findViewById(R.id.i2_z10);

final TextView i3_z1=(TextView) findViewById(R.id.i3_z1);
final TextView i3_z2=(TextView) findViewById(R.id.i3_z2);
final TextView i3_z3=(TextView) findViewById(R.id.i3_z3);
final TextView i3_z4=(TextView) findViewById(R.id.i3_z4);
final TextView i3_z5=(TextView) findViewById(R.id.i3_z5);
final TextView i3_z6=(TextView) findViewById(R.id.i3_z6);
final TextView i3_z7=(TextView) findViewById(R.id.i3_z7);
final TextView i3_z8=(TextView) findViewById(R.id.i3_z8);
final TextView i3_z9=(TextView) findViewById(R.id.i3_z9);
final TextView i3_z10=(TextView) findViewById(R.id.i3_z10);

final double v_z1[]=new double[10];
final double g_z1[]=new double[10];
final double i_z1[]=new double[10];


final double v_z2[]=new double[10];
final double g_z2[]=new double[10];
final double i_z2[]=new double[10];

final double v_z3[]=new double[10];
final double g_z3[]=new double[10];
final double i_z3[]=new double[10];

final double Res_load=1000;
final double Volt_in=1;

final double frequency[]=new double[10];

Button calci=(Button) findViewById(R.id.calci);
Button clear=(Button) findViewById(R.id.clear);
Button graph=(Button)findViewById(R.id.graph);
final Button submit=(Button) findViewById(R.id.submit);

calci.setOnClickListener(new OnClickListener() {
	
	public void onClick(View v) {
	
	
		
		v_z1[0]=Double.parseDouble(v1_z1.getText().toString());
		v_z1[1]=Double.parseDouble(v1_z2.getText().toString());
		v_z1[2]=Double.parseDouble(v1_z3.getText().toString());
		v_z1[3]=Double.parseDouble(v1_z4.getText().toString());
		v_z1[4]=Double.parseDouble(v1_z5.getText().toString());
		v_z1[5]=Double.parseDouble(v1_z6.getText().toString());
		v_z1[6]=Double.parseDouble(v1_z7.getText().toString());
		v_z1[7]=Double.parseDouble(v1_z8.getText().toString());
		v_z1[8]=Double.parseDouble(v1_z9.getText().toString());
		v_z1[9]=Double.parseDouble(v1_z10.getText().toString());
		
		v_z2[0]=Double.parseDouble(v2_z1.getText().toString());
		v_z2[1]=Double.parseDouble(v2_z2.getText().toString());
		v_z2[2]=Double.parseDouble(v2_z3.getText().toString());
		v_z2[3]=Double.parseDouble(v2_z4.getText().toString());
		v_z2[4]=Double.parseDouble(v2_z5.getText().toString());
		v_z2[5]=Double.parseDouble(v2_z6.getText().toString());
		v_z2[6]=Double.parseDouble(v2_z7.getText().toString());
		v_z2[7]=Double.parseDouble(v2_z8.getText().toString());
		v_z2[8]=Double.parseDouble(v2_z9.getText().toString());
		v_z2[9]=Double.parseDouble(v2_z10.getText().toString());
		
		v_z3[0]=Double.parseDouble(v3_z1.getText().toString());
		v_z3[1]=Double.parseDouble(v3_z2.getText().toString());
		v_z3[2]=Double.parseDouble(v3_z3.getText().toString());
		v_z3[3]=Double.parseDouble(v3_z4.getText().toString());
		v_z3[4]=Double.parseDouble(v3_z5.getText().toString());
		v_z3[5]=Double.parseDouble(v3_z6.getText().toString());
		v_z3[6]=Double.parseDouble(v3_z7.getText().toString());
		v_z3[7]=Double.parseDouble(v3_z8.getText().toString());
		v_z3[8]=Double.parseDouble(v3_z9.getText().toString());
		v_z3[9]=Double.parseDouble(v3_z10.getText().toString());
		
		for(int i=0,k=1;i<10;i++,k++)
		{
			try{
			frequency[i]=k;
			g_z1[i]=v_z1[i];
			g_z2[i]=v_z2[i];
			g_z3[i]=v_z3[i];
			
			i_z1[i]=((Res_load*(1-g_z1[i]))/(g_z1[i]));
			i_z2[i]=((Res_load*(1-g_z2[i]))/(g_z2[i]));
			i_z3[i]=((Res_load*(1-g_z3[i]))/(g_z3[i]));
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		g1_z1.setText(""+g_z1[0]);
		g1_z2.setText(""+g_z1[1]);
		g1_z3.setText(""+g_z1[2]);
		g1_z4.setText(""+g_z1[3]);
		g1_z5.setText(""+g_z1[4]);
		g1_z6.setText(""+g_z1[5]);
		g1_z7.setText(""+g_z1[6]);
		g1_z8.setText(""+g_z1[7]);
		g1_z9.setText(""+g_z1[8]);
		g1_z10.setText(""+g_z1[9]);
		
		g2_z1.setText(""+g_z2[0]);
		g2_z2.setText(""+g_z2[1]);
		g2_z3.setText(""+g_z2[2]);
		g2_z4.setText(""+g_z2[3]);
		g2_z5.setText(""+g_z2[4]);
		g2_z6.setText(""+g_z2[5]);
		g2_z7.setText(""+g_z2[6]);
		g2_z8.setText(""+g_z2[7]);
		g2_z9.setText(""+g_z2[8]);
		g2_z10.setText(""+g_z2[9]);
	
		g3_z1.setText(""+g_z3[0]);
		g3_z2.setText(""+g_z3[1]);
		g3_z3.setText(""+g_z3[2]);
		g3_z4.setText(""+g_z3[3]);
		g3_z5.setText(""+g_z3[4]);
		g3_z6.setText(""+g_z3[5]);
		g3_z7.setText(""+g_z3[6]);
		g3_z8.setText(""+g_z3[7]);
		g3_z9.setText(""+g_z3[8]);
		g3_z10.setText(""+g_z3[9]);
		
		i1_z1.setText(""+i_z1[0]);
		i1_z2.setText(""+i_z1[1]);
		i1_z3.setText(""+i_z1[2]);
		i1_z4.setText(""+i_z1[3]);
		i1_z5.setText(""+i_z1[4]);
		i1_z6.setText(""+i_z1[5]);
		i1_z7.setText(""+i_z1[6]);
		i1_z8.setText(""+i_z1[7]);
		i1_z9.setText(""+i_z1[8]);
		i1_z10.setText(""+i_z1[9]);
		
		i2_z1.setText(""+i_z2[0]);
		i2_z2.setText(""+i_z2[1]);
		i2_z3.setText(""+i_z2[2]);
		i2_z4.setText(""+i_z2[3]);
		i2_z5.setText(""+i_z2[4]);
		i2_z6.setText(""+i_z2[5]);
		i2_z7.setText(""+i_z2[6]);
		i2_z8.setText(""+i_z2[7]);
		i2_z9.setText(""+i_z2[8]);
		i2_z10.setText(""+i_z2[9]);
	
		i3_z1.setText(""+i_z3[0]);
		i3_z2.setText(""+i_z3[1]);
		i3_z3.setText(""+i_z3[2]);
		i3_z4.setText(""+i_z3[3]);
		i3_z5.setText(""+i_z3[4]);
		i3_z6.setText(""+i_z3[5]);
		i3_z7.setText(""+i_z3[6]);
		i3_z8.setText(""+i_z3[7]);
		i3_z9.setText(""+i_z3[8]);
		i3_z10.setText(""+i_z3[9]);
		
		
		 try{ 
		File mediaDir = new File("/LocalDisk/Physics_Lab"); 
    	if (!mediaDir.exists())
    	{     mediaDir.mkdir(); }
        	
        	File mediaDir1 = new File("/LocalDisk/Physics_Lab/Passive_Element/"); 
        	if (!mediaDir1.exists())
        	{     mediaDir1.mkdir(); }
        	
        	File resolveMeSDCard = new File("/LocalDisk/Physics_Lab/Passive_Element/passive_element.txt"); 
        	resolveMeSDCard.createNewFile();
        	FileOutputStream fos = new FileOutputStream(resolveMeSDCard);
        	//fos.write(string.getBytes());   
        	System.out.println("Your file has been written");    
        	
        	
        	String heading="Freq            Z1           "+"           Z2                        Z3\n"
	              +"-------------------------------------------------------------------------------\n"
			      +"(khz)    Gain    Impedance(Z1)   Gain     Impedance(Z2)   Gain      Impedance(Z3)\n"
			      +"-------------------------------------------------------------------------------\n";

        	
        	
//           	String heading="Freq\t\tZ1\t\t \t" +"\t\t\t\tZ2\t\t \t\t\t\tZ3\t\t \t\n"
           			  //      +"(khz)  Gain\tImpedance(Z1)\t\tGain\tImpedance(Z2)\t\tGain\tImpedance(Z3)\n";
  		  // out.write("volt\tcurr\tres\tpow\tlogp\tlogr\n"); 
        	fos.write(heading.getBytes());
        	String[] res1=new String[9];
        	String[] res2=new String[9];
        	String[] res3=new String[9];
        	for(int i=0;i<4;i++){
        		res1[i]=String.format("%.4f", i_z1[i]);
        		res2[i]=String.format("%.4f", i_z2[i]);
        		res3[i]=String.format("%.4f", i_z3[i]);
        		
        		String values=new String(i+1+"        "+v_z1[i]+"      " +(res1[i])+"        " + v_z2[i]+"      "+(res2[i])+ "        "+ v_z3[i]+ "      "+(res3[i])+"\n"
		                  +"-------------------------------------------------------------------------------\n");
	
  		//  String values=new String(i+1+"\t"+v_z1[i]+"\t\t\t" +(res1[i])+"\t" + v_z2[i]+"\t\t\t"+(res2[i])+ "\t\t"+ v_z3[i]+ "\t"+(res3[i])+"\n");
  		fos.write(values.getBytes());
  		  //out.write(volt[i] +"\t" +curr[i]+ "\t"+ res[i]+ "\t"+ pow[i]+ "\t"+ LogP[i]+ "\t"+ LogR[i]+"\n");
        	}
  		  fos.close();
        	//out.close(); } 
        } 

	catch (java.io.IOException e) {   //do something if an IOException occurs. }
  	   }
		
		

		
		
	}
});
graph.setOnClickListener(new OnClickListener() {
	
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	    
		Bundle b1=new Bundle();
		b1.putDoubleArray("x",i_z1);
		b1.putDoubleArray("y", i_z2);
		b1.putDoubleArray("z", i_z3);
		
	
		Intent myintent = new Intent();
		myintent.setClass(getApplicationContext(), Graph_caller.class);
		
		myintent.putExtras(b1);

		startActivity(myintent);
	
		//finish();
	}
});

Button work=(Button) findViewById(R.id.work);
work.setOnClickListener(new OnClickListener() {
	
	
	public void onClick(View v) {
		// TODO Auto-generated method stub
       
		Bundle bundle1 = new Bundle();
		
		bundle1.putDoubleArray("ga",g_z1);
		bundle1.putDoubleArray("imp",i_z1);
		//bundle1.putDoubleArray("dista",dista);
		//bundle1.putDoubleArray("numAper",numAper);
		
				
		
		
		Intent myintent11= new Intent();
		myintent11.setClass(getApplicationContext(), Passive_work.class);				
		myintent11.putExtras(bundle1);
		startActivity(myintent11);
	
		//	setResult(RESULT_OK, myintent);
		//finish();
	}
});

    }
}
