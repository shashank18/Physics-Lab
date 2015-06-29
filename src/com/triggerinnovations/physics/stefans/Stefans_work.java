package com.triggerinnovations.physics.stefans;

import com.triggerinnovations.physics.R;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class Stefans_work extends Activity {
	
	 
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.work_optical);
        
        Bundle bundle = this.getIntent().getExtras();
    	double[] voltage = bundle.getDoubleArray("voltage");
    	double[] Cur = bundle.getDoubleArray("current");
    	double[] Logr = bundle.getDoubleArray("LOGR");
    	double[] Logp = bundle.getDoubleArray("LOGP");
    	double[] res = bundle.getDoubleArray("Resistance");
    	double[] pow = bundle.getDoubleArray("Power");
    TextView NA1=(TextView) findViewById(R.id.work);
    	 NA1.setText(Html.fromHtml("Resistance="+"("+"V"+"/"+"I"+")"+"="+res[1]+"ohms"));
    	 NA1.append(Html.fromHtml("Power="+"("+"V"+"*"+"I"+")"+"="+pow[1]+"Joules/Seconds"));
    	 NA1.append(Html.fromHtml("Log R value="+Logr[1]));
    	 NA1.append(Html.fromHtml("Log P value="+Logp[1]));
       
}

}
