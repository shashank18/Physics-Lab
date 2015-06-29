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

package com.triggerinnovations.physics.passive;


import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

/**
 * AnnotationDemo01Activity
 */
public class Graph_caller extends Activity {

    /**
     * Called when the activity is starting.
     * @param savedInstanceState
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        
        Bundle bundle = this.getIntent().getExtras();
    	double[] z11 = bundle.getDoubleArray("x");
    	double[] z22 = bundle.getDoubleArray("y");
    	double[] z33 = bundle.getDoubleArray("z");
        
        
        float []z1=new float[z11.length];
        float []z2=new float[z11.length];
        float []z3=new float[z11.length];
        
        for(int i=0;i<z11.length;i++)
        {
        	z1[i]=(float) z11[i];
        	z2[i]=(float) z22[i];
        	z3[i]=(float) z33[i];
        }
        


        Graph mView = new Graph(this,z1,z2,z3);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(mView);
    }
}
