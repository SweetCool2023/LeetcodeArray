
public class ReshapeTheMatrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
    	int result[][] = new int[r][c];
    	int arraySize = mat.length*mat[0].length;
    	int reshapedSize = r*c;
    	int k = 0;
    	
    	System.out.println("Array Size: " + arraySize);
    	
    	if(arraySize != reshapedSize)
    		return mat;
    	
    	for(int[] row : mat ) {
    		for(int num : row) {
    			result[k / c][k % c] = num;
    			k++;
    		}
    	}
    	
    	for(int i=0; i<result.length; i++) {
    		for(int j=0; j<result[0].length; j++)
    			System.out.println(result[i][j]);
    	}
    	
    	return result;
        
    }

}
