
public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
    	int result = g[0];
    	boolean isBreak = false;
    	
    	for(int i=0; i<g.length; i++) {
    		for(int j=i; j<s.length; j++) {
    			if(g[i]>s[j]) {
    				isBreak = true;
    				break;
    			}
    		}
    		
    		if(isBreak)
    			break;
    		else result = s[i];
    	}
    	
    	System.out.println(result);
    	
    	return result;
        
    }
}
