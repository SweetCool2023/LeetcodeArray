import java.util.Arrays;

public class ArrayPartition {
    public int arrayPairSum(int[] nums) {
    	int result = 0;
    	
    	Arrays.sort(nums);    	
    	for(int i=0; i<nums.length; i=i+2) {
    		result = result + Math.min(nums[i], nums[i+1]);
    	}
    	
    	System.out.println(result);
    	
    	return result;
        
    }

}
