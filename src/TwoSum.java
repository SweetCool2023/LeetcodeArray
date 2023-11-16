import java.util.HashMap;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
        int sum = 0;
        int result[] = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                sum = nums[i] + nums[j];

            if (sum == target) {
                result[0] = i;
                result[1] = j;

            }
            }

        }

      return result;
	}
	
	public int[] twoSumSingleLoop(int[] nums, int target) {
		int[] result = new int[2];
		HashMap<Integer, Integer> myMap = new HashMap<Integer, Integer>();
		
		for(int i=0; i< nums.length; i++) {
			if(myMap.containsKey(nums[i])) {
				result[0] = i;
				result[1] = myMap.get(nums[i]);
			}
			else
				myMap.put(target-nums[i], i);
		}
		
		return result;
				
	}

}
