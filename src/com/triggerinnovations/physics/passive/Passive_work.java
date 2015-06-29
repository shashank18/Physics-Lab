package com.triggerinnovations.physics.passive;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.triggerinnovations.physics.R;

public class Passive_work extends Activity{
		
		
		  public void onCreate(Bundle savedInstanceState) {
		        super.onCreate(savedInstanceState);
		        setContentView(R.layout.work_optical);
		        
		        Bundle bundle = this.getIntent().getExtras();
		    	double[] gain = bundle.getDoubleArray("ga");
		    	double[] impe = bundle.getDoubleArray("imp");
		    	
		    TextView NA1=(TextView) findViewById(R.id.work);
		    	 NA1.setText(Html.fromHtml("Gain=Av=V0/V1="+gain[1]));
		    	 NA1.append(Html.fromHtml("Z1=Rl*(1-Av)/Av"+impe[1]));
		    	 
		    	 //NA1.append(Html.fromHtml("Log P value="+Logp[1]));
		
		  }
}
