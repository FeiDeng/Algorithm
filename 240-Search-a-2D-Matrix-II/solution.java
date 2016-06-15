public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length < 1 || matrix[0].length <1) {
            return false;
        }
        
        int row=0, col=matrix[0].length-1;
        while(col>=0&&row<matrix.length){
            if(target==matrix[row][col]) return true;
            if(target<matrix[row][col]){
                col--;
            }else{
                row++;
            }
        }
        return false;
    }
}