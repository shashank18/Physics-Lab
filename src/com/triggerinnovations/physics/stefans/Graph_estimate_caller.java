/* ===========================================================
 * AFreeChart : a free chart library for Android(tm) platform.
 *              (based on JFreeChart and JCommon)
 * ===========================================================
 *
 * (C) Copyright 2010, by ICOMSYSTECH Co.,Ltd.
 * (C) Copyright 2000-2008, by Object Refinery Limited and Contributors.
 *
 * Project Info:
 *    AFreeChart: http://code.google.com/p/afreechart/
 *    JFreeChart: http://www.jfree.org/jfreechart/index.html
 *    JCommon   : http://www.jfree.org/jcommon/index.html
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * [Android is a trademark of Google Inc.]
 *
 * -----------------
 * AnnotationDemo01Activity.java
 * -----------------
 * (C) Copyright 2011, by ICOMSYSTECH Co.,Ltd.
 *
 * Original Author:  Yamakami Souichirou (for ICOMSYSTECH Co.,Ltd);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 18-Oct-2011 : Added new sample code (SY);
 */

package com.triggerinnovations.physics.stefans;


import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

/**
 * AnnotationDemo01Activity
 */
public class Graph_estimate_caller extends Activity {

    /**
     * Called when the activity is starting.
     * @param savedInstanceState
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        
        Bundle bundle = this.getIntent().getExtras();
        
        
    	double[] fit_x = bundle.getDoubleArray("xval");
    	double[] fit_y = bundle.getDoubleArray("yval");
    
    	double[] per_x = bundle.getDoubleArray("x_val");
    	double[] per_y = bundle.getDoubleArray("y_val");
    
        
        float []fit_X=new float[fit_x.length];
        float []fit_Y=new float[fit_y.length];
        
       
        float []per_X=new float[per_x.length];
        float []per_Y=new float[per_y.length];
       
        
        
        for(int i=0;i<fit_x.length;i++)
        {
        	fit_X[i]=(float) fit_x[i];
        	fit_Y[i]=(float) fit_y[i];
        
        	per_X[i]=(float) per_x[i];
        	per_Y[i]=(float) per_y[i];
        
        	
        	
        }
        


        Graph_estimate mView = new Graph_estimate(this,fit_X,fit_Y,per_X,per_Y);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(mView);
    }
}
