package com.triggerinnovations.physics.diffraction;

import java.io.File;

import com.triggerinnovations.physics.R;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;


public class Diffraction_work extends Activity{
	
	

	  public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.work_optical);
	        
	        Bundle bundle3 = this.getIntent().getExtras();
	    	double[] ord1 = bundle3.getDoubleArray("X1");
	    	double[] ord2 = bundle3.getDoubleArray("X2");
	    	double[] tan1 = bundle3.getDoubleArray("tan1");
	    	double[] tan2 = bundle3.getDoubleArray("tan2");
	    	double[] ang1 = bundle3.getDoubleArray("Angle1");
	    	double[] ang2 = bundle3.getDoubleArray("Angle2");
	        TextView NA1=(TextView) findViewById(R.id.work);
	    	 NA1.setText(Html.fromHtml("Tan(01)="+"X1/D"+"="+tan1[1]));
	    	 NA1.append(Html.fromHtml("Tan(02)="+"X2/D"+"="+tan2[1]));
	    	 NA1.append(Html.fromHtml("Angle of Diffraction 01 ="+"tan<sup>-1</sup>(X1/D"));
	    	 NA1.append(Html.fromHtml("Angle of Diffraction 02 ="+"tan<sup>-1</sup>(X2/D"));
	    	 //NA1.append(Html.fromHtml("Log P value="+Logp[1]));
	
	  }

}
