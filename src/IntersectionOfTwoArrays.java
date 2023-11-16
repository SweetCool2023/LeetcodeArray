//import java.util.ArrayList;
import java.util.*;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
    	ArrayList<Integer> result = new ArrayList<Integer>();
    	
    	ArrayList<Integer> intersections = new ArrayList<Integer>();
    	
    	for (int i=0; i<nums1.length; i++) {
    		for(int j=0; j<nums2.length; j++) {
    			if(nums1[i] == nums2[j] && !intersections.contains( nums1[i])) {
    				result.add(nums1[i]);
    				intersections.add(nums1[i]);
    			}
    		}
    	}
    	
    	for(int i=0; i<result.size(); i++) 
    		System.out.println(result.get(i));    	
    	
    	return result.stream().mapToInt(Integer::intValue).toArray();
        
    }

}
