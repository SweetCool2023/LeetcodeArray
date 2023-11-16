
public class MissingNumber {
	 public int missingNumber(int[] nums) {
		 int result = 0;
		 int len = nums.length;
		 
		 for(int i=0; i<len+1; i++) {
			 for(int j=0; j<len; j++) {
				 if(i==nums[j]) {
					break;
				 }
				 else {
					 result = i;
				 }
					
			 }
		 }		
		 
		 //System.out.println(result);
		 
		 return result;
	    }

}
