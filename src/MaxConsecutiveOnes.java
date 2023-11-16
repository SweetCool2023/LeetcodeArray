
public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
    	int result = 1;
    	int count = 0;
    	
    	for(int i=0; i<nums.length; i++) {
    		if(nums[i] == 1) {
    			count++;
    			if(count>result)
    	    		result = count;
    		}
    		else 
    			count = 0;
    	}
    	
    	System.out.println(result);
    	
    	return result;
        
    }

}
