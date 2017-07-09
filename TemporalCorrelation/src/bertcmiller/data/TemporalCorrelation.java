package bertcmiller.data;

import java.util.ArrayList;


public class TemporalCorrelation {
	public static double temporalCorrelation(ArrayList<Double> series1, ArrayList<Double> series2){ //A calculation of temporal correlation, which is different than correlation.  
		ArrayList<Double> numeratorfact1 = new ArrayList<>();
		ArrayList<Double> denominatorfactor1 = new ArrayList<>();
		ArrayList<Double> numeratorfact2 = new ArrayList<>();
		ArrayList<Double> denominatorfactor2 = new ArrayList<>();
		ArrayList<Double> nfactor = new ArrayList<>();
				
		for (int i = 0; i < series1.size() - 1; i++){
			double change = series1.get(i + 1) - series1.get(i);
			numeratorfact1.add(change);
			denominatorfactor1.add(Math.pow(change, 2));
		}
		
		for (int j = 0; j < series2.size() - 1; j++){
			double change = series2.get(j + 1) - series2.get(j);
			numeratorfact2.add(change);
			denominatorfactor2.add(Math.pow(change, 2));
		}
		
		for (int i = 0; i < numeratorfact1.size(); i++){
			nfactor.add(numeratorfact1.get(i) * numeratorfact2.get(i));
		}
		
		double numerator = sumfunc(nfactor);
		double denominator = Math.sqrt(sumfunc(denominatorfactor1)*sumfunc(denominatorfactor2));
						
		double tempcorr = numerator/denominator;
		return tempcorr;
	}
	
	public static double sumfunc(ArrayList<Double> a1){ //sums up an array. 
		double sumreturn = (0.0);
    	for (int i = 0; i < a1.size(); i++){
    		sumreturn += a1.get(i);
    	}
    	return sumreturn;
    }
		
}