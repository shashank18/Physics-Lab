package com.triggerinnovations.physics.opticalfiber;

import java.io.File;

import com.triggerinnovations.physics.R;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Optical_work extends Activity {
	
	
	
	
	 
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.work_optical);
        
        Bundle bundle = this.getIntent().getExtras();
    	double[] tan = bundle.getDoubleArray("work");
    	double[] D = bundle.getDoubleArray("diame");
    	double[] L = bundle.getDoubleArray("dista");
    	double[] na = bundle.getDoubleArray("numAper");
    	
    TextView NA1=(TextView) findViewById(R.id.work);
    	 NA1.setText(Html.fromHtml("NA=sin[tan<sup>-1</sup>(D/2L)"));
      for(int i=0;i<4;i++)
      {
    	  NA1.append("\n\n"+Html.fromHtml("NA"+(i+1)+"=sin[tan<sup>-1</sup>("+D[i]+"/2*"+L[i]+")] = "+na[i]));
      }
            
      NA1.append("\n\n Mean NA=(NA1+NA2+NA3+NA4)/4 = "+((na[0]+na[1]+na[2]+na[3])/4));
       
}
}