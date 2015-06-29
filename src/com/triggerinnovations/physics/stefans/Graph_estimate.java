package com.triggerinnovations.physics.stefans;

import org.afree.chart.ChartFactory;
import org.afree.chart.AFreeChart;
import org.afree.chart.annotations.XYTextAnnotation;
import org.afree.chart.axis.NumberAxis;
import org.afree.chart.plot.PlotOrientation;
import org.afree.chart.plot.XYPlot;
import org.afree.data.xy.XYDataset;
import org.afree.data.xy.XYSeries;
import org.afree.data.xy.XYSeriesCollection;
import org.afree.graphics.geom.Font;
import org.afree.ui.TextAnchor;


import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.Toast;

/**
 * AnnotationDemo01View
 */
public class Graph_estimate extends Graph_stefan_settings {
 	
	
	
	 final  float []x1=new float[10];
	final float []y1=new float[10];
	
	 final  float []x2=new float[10];
		final float []y2=new float[10];
		
	
    public Graph_estimate(Context context) {
        super(context);
        
     	
        final AFreeChart chart = createChart();
        setChart(chart);
    }
    
    public Graph_estimate(Context context,float []a,float []b,float []c,float []d) {
        super(context);
      
        setval(a,b,c,d);
        final AFreeChart chart = createChart();
        setChart(chart);
    }
    
    
    void setval(float []a,float []b,float []c,float []d)
    {
    	

    
    	
    	for(int k=0;k<a.length;k++)
        {
        	x1[k]=a[k];
        	y1[k]=b[k];
        	
        	x2[k]=c[k];
        	y2[k]=d[k];
        	
        	
        }
    	

    	
     	
    }
    
    
    
    
    
    private XYSeriesCollection createDataset() {
    	
    	XYSeries xyS1 = new XYSeries("xyS1", true, false);
    	XYSeries xyS2 = new XYSeries("xyS2", true, false);
        
    
    	for(int k = 1,i=0; k < 10; i++,k++) {
    		
    		xyS1.add(x1[i], y1[i]);
    		xyS2.add(x2[i], y2[i]);    		
    		
    	}
    	

    	
    	
    	XYSeriesCollection xySC = new XYSeriesCollection();
    	xySC.addSeries(xyS1);
    	xySC.addSeries(xyS2);
    	
    	return xySC;
    }

    /**
     * Creates a sample chart.
     * @param dataset the dataset.
     * @return A sample chart.
     */
    private AFreeChart createChart() {
        XYDataset dataset = createDataset();
        AFreeChart chart = ChartFactory.createXYLineChart(
        		"Physics Lab",
                "X Value",
                "Y Value",
                dataset,
                PlotOrientation.VERTICAL,
                false,
                true,
                false);
        XYPlot plot = (XYPlot) chart.getPlot();
        NumberAxis domainAxis = (NumberAxis) plot.getDomainAxis();
        domainAxis.setUpperMargin(0.2);

        // add some annotations...
        XYTextAnnotation annotation = null;
        Font font = new Font("SansSerif", Typeface.NORMAL, 12);
        annotation = new XYTextAnnotation("Z1", 50, 57);
        annotation.setFont(font);
        annotation.setTextAnchor(TextAnchor.HALF_ASCENT_LEFT);
        plot.addAnnotation(annotation);

        annotation = new XYTextAnnotation("Z2", 50, 52);
        annotation.setFont(font);
        annotation.setTextAnchor(TextAnchor.HALF_ASCENT_LEFT);
        plot.addAnnotation(annotation);

        annotation = new XYTextAnnotation("Z3", 50, 47);
        annotation.setFont(font);
        annotation.setTextAnchor(TextAnchor.HALF_ASCENT_LEFT);
        plot.addAnnotation(annotation);

        return chart;
    }

}
