
/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */

public class NumArray {
	int nums[];
	
    public NumArray(int[] nums) {
    	this.nums = nums;  	
    }
    
    public int sumRange(int left, int right) {
    	int result = 0;
    	
    	for(int i = left; i<=right; i++) {
    		result+=nums[i];
    	}
    	
    	System.out.println(result);
    	
    	return result;
        
    }

}
