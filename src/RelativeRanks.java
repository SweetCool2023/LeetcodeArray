import java.util.*;


public class RelativeRanks {
    public String[] findRelativeRanks(int[] score) {
    	int arraySize = score.length;
    	String result[] = new String[arraySize];
    	int tmp[] = score.clone();
    	HashMap<Integer, Integer> indexMap = new HashMap<Integer, Integer>();
    	
    	// Sort score and save index into map
    	Arrays.sort(tmp); 
    	for(int i=0; i<arraySize; i++) {
    		indexMap.put(tmp[i], arraySize-i);
    	}
    	
    	for(int i=0; i<score.length; i++) {
    		if(score[i] == tmp[arraySize-1])
    			result[i] = "Gold Medal";
    		else if(score[i] == tmp[arraySize-2])
    			result[i] = "Silver Medal";
    		else if(score[i] == tmp[arraySize-3])
    			result[i] = "Bronze Medal";
    		else 
    			result[i] = indexMap.get(score[i]).toString();
    	}
    	
    	for(int i=0; i<result.length; i++)
    		System.out.println(result[i]);  	
    	
    	return result;
        
    }

}
