import java.util.*;

public class DistributeCandies {
    public int distributeCandies(int[] candyType) {
    	int result = 0;
    	
    	ArrayList<Integer> uniqueType = new ArrayList<Integer>();
    	for(int i=0; i<candyType.length; i++) {
    		if(!uniqueType.contains(candyType[i])) {
    			uniqueType.add(candyType[i]);
    		    System.out.println(uniqueType);
    		}    			
    	}
    	
    	result = Math.min(candyType.length/2, uniqueType.size());
    	System.out.println(result);
    	
    	return result;
        
    }

}
