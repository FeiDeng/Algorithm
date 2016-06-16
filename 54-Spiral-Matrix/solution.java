public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result=new ArrayList<>();
        if(matrix.length==0||matrix[0].length==0) return result;
        int top=0,left=0;
        int bot=matrix.length-1,right=matrix[0].length-1;
        while(true){
            if(left>right) break;
            for(int i=left;i<=right;i++){
                result.add(matrix[top][i]);
            }
            top++;
            
            if(top>bot) break;
            for(int j=top;j<=bot;j++){
                result.add(matrix[j][right]);
            }
            right--;
            
            if(left>right) break;
            for(int m=right;m>=left;m--){
                result.add(matrix[bot][m]);
            }
            bot--;
            
            if(top>bot) break;
            for(int n=bot;n>=top;n--){
                result.add(matrix[n][left]);
            }
            left++;
        }
        return result;
    }
}