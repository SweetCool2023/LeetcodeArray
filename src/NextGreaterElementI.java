
public class NextGreaterElementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    	int result[] = new int[nums1.length];
    	
    	for(int i=0; i<nums1.length; i++) {
    		int temp = 0;
    		
    		for(int j=0; j<nums2.length; j++) {
    			if(i == nums1.length-1) {
    				temp = -1;
    				break;
    			}
    			else if(j == nums2.length-1)
    				break;
    			else if(nums1[i] == nums2[j]) {
    				temp = -1;    
    				
    				if(nums1[i] < nums2[j+1]) {
    					temp = nums2[j+1];
    				}
    			}    			

    		}
    		
    		result[i] = temp;
    		
    	}
    	
    	for(int i=0; i<result.length; i++)
    		System.out.println(result[i]);
    	
    	return result;
        
    }

}
