import java.util.*;

public class TeemoAttacking {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
    	int result = 0;
    	Set<Integer> attaches = new HashSet<Integer>();
    	
    	for(int i=0; i<timeSeries.length-1; i++) {
    		if(timeSeries[i]+duration-1 <= timeSeries[i+1]) {
    			for(int j=i; j<i+duration; j++) {
    				attaches.add(j+1);
    			}
    		}
    		
    	}
    	
    	// add the last value in timeSeries
		int count = 0;
		while(count<duration) {
			attaches.add(timeSeries[timeSeries.length-1]+count);
			count++;
		}
    	
    	for(int i=0; i<attaches.size(); i++) {
    		System.out.println(attaches);
    	}

    	result = attaches.size();
    	System.out.println(result);    	
    	
    	return result;
        
    }

}
