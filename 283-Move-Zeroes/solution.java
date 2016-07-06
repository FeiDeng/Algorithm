public class Solution {
    public void moveZeroes(int[] nums) {
       //boundary case
       if(nums==null||nums.length==0) return;
       
       //two index, left, tracking zeros, right will move; 
       //fill with zero;
       int left=0;
       for(int right=0;right<nums.length;right++){
           if(nums[right]!=0){
               nums[left]=nums[right];
               left++;
           }
       }
       while(left<nums.length){
           nums[left]=0;
           left++;
       }
       
    }
    
    
}