import java.util.*;

public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
    	int result = 0;
    	ArrayList<Integer> numbersList = new ArrayList<Integer>();
    	
    	Arrays.sort(nums);
    	for(int i=0; i<nums.length; i++) 
    		System.out.println(nums[i]);
    	
    	for(int i=nums.length-1; i>=0; i--) {
    		if(!numbersList.contains(nums[i])) {
    			numbersList.add(nums[i]);
    		}
    		
    	}
    	
    	for(int i=0; i<numbersList.size(); i++) 
    		System.out.println("result array: " + numbersList.get(i));
    	
    	if(numbersList.size() >= 3) {
    		result = numbersList.get(2);
    	}
    	else 
    		result = numbersList.get(0);    	

    	System.out.println(result);
    	
    	return result;
        
    }

}
