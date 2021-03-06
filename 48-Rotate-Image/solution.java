public class Solution {
    public void rotate(int[][] matrix) {
        if(matrix==null||matrix.length<2||matrix[0].length<2) return;
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n/2;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-j-1];
                matrix[i][n-j-1]=temp;
            }
        }
    }
}