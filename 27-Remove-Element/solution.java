public class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length<1) return 0;
        int res=0;
        int fast=0,slow=0;
        while(fast<nums.length){
            if(nums[fast]!=val){
                res++;
                nums[slow]=nums[fast];
                slow++;
            }
            fast++;
        }
        return res;
    }
}