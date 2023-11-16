import java.util.*;

public class KeyboardRow {
    public String[] findWords(String[] words) {
    	ArrayList<String> resultList = new ArrayList<String>();
    	String row1 = "qwertyuiop";
    	String row2 = "asdfghjkl";
    	String row3 = "zxcvbnm";    	
    	
    	for(int i=0; i<words.length; i++) {
    		boolean found = false;
    		for(int j=0; j<words[i].length(); j++) {
    			System.out.println(words[i].substring(j, j+1));

    			if(row1.contains((words[i].substring(j, j+1)).toLowerCase())) {
    				found = true;
    				continue;
    			}
    			else {
   				found = false; 
    				break;
    			} 
    			}
    		
			// add word into result list
			if(found) {
				resultList.add(words[i]);    				
    		}
    	}
    	
    	for(int i=0; i<words.length; i++) {
    		boolean found = false;
    		for(int j=0; j<words[i].length(); j++) {
    			System.out.println(words[i].substring(j, j+1));

    			if(row2.contains((words[i].substring(j, j+1)).toLowerCase())) {
    				found = true;
    				continue;
    			}
    			else {
   				found = false; 
    				break;
    			} 
    			}
    		
			// add word into result list
			if(found) {
				resultList.add(words[i]);    				
    		}
    	}   
    	
    	for(int i=0; i<words.length; i++) {
    		boolean found = false;
    		for(int j=0; j<words[i].length(); j++) {
    			System.out.println(words[i].substring(j, j+1));

    			if(row3.contains((words[i].substring(j, j+1)).toLowerCase())) {
    				found = true;
    				continue;
    			}
    			else {
   				found = false; 
    				break;
    			} 
    			}
    		
			// add word into result list
			if(found) {
				resultList.add(words[i]);    				
    		}
    	}    	
    	
    	// Convert result list to array to return
    	String result[] = new String[resultList.size()];    	
    	for(int i=0; i<resultList.size(); i++)
    		result[i] = resultList.get(i);
    	
    	for(int i=0; i<result.length; i++)
    		System.out.println(result[i]);	
    	
    	return result;
    	
        
    }
    
    public boolean containWord() {
    	String row1 = "qwertyuiop";
    	String word = "Hello";
    	
    	System.out.println("Char: " + (word.substring(0, 1)).toLowerCase());
        return row1.contains((word.substring(0, 1)).toLowerCase());
    }

}
