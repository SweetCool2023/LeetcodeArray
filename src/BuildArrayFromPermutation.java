
public class BuildArrayFromPermutation {
	public int[] buildArray(int[] nums) {
	    final int n = nums.length;

	    for (int i = 0; i < n; ++i)
	      nums[i] += n * (nums[nums[i]] % n);

	    for (int i = 0; i < n; ++i)
	      nums[i] /= n;
	    
	    for(int i=0; i<nums.length; i++) {
	    	System.out.println(nums[i]);
	    }

	    return nums;
	  }

}
