package bertcmiller.main;

import java.util.ArrayList;

import bertcmiller.data.TemporalCorrelation;

public class main {
	public static void main(String[] args) throws Exception {
		dataTest();
	}
	
	public static void dataTest() throws Exception {
		ArrayList<Double> series1 = new ArrayList<Double>(); //Two sets of arbitrary data to demonstrate how to use the function
		ArrayList<Double> series2 = new ArrayList<Double>();
		
		series1.add(1.0);
		series1.add(7.0);
		series1.add(-1.0);
		series1.add(3.0);
		series1.add(9.0);
		
		series2.add(-1.0);
		series2.add(4.0);
		series2.add(5.0);
		series2.add(3.0);
		series2.add(8.0);
		
		System.out.println("The temporal correlation between series 1 and series 2 is: " + TemporalCorrelation.temporalCorrelation(series1, series2));
	}
}
