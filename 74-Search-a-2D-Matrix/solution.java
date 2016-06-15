public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int length=matrix.length;
        if(length==0) return false;
        int width=matrix[0].length;
        int start=0;
        int end=length*width-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            int x=mid/width;
            int y=mid%width;
            if(target==matrix[x][y]) return true;
            if(matrix[x][y]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return false;
        
    }
}