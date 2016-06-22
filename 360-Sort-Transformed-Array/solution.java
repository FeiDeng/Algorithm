public class Solution {
    public int[] sortTransformedArray(int[] nums, int a, int b, int c) {
        int n=nums.length;
        int[] sorted=new int[n];
        int i=0, j=n-1;
        int index=a>=0?n-1:0;
        while(i<=j){
            if(a>=0){
                sorted[index--]=solve(a,b,c,nums[i])>solve(a,b,c,nums[j])?solve(a,b,c,nums[i++]):solve(a,b,c,nums[j--]);
            }else{
                sorted[index++]=solve(a,b,c,nums[i])>solve(a,b,c,nums[j])?solve(a,b,c,nums[j--]):solve(a,b,c,nums[i++]);
            }
        }
        return sorted;
    }
    
    public int solve(int a, int b, int c, int x){
        return a*x*x+b*x+c;
    }
}