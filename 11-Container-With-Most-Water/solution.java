public class Solution {
    public int maxArea(int[] height) {
        //bondaru case
        if(height.length<1) return 0;
        //two pointer, start/end; every time find possible solution larger than current one; 
        int start=0, end=height.length-1;
        int max=0;
        while(start<end){
            max=Math.max(max,(end-start)*Math.min(height[start],height[end]));
            if(height[start]<=height[end]){
                start++;
            }else{
                end--;
            }
        }
        return max;
    }
}