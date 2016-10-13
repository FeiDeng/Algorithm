public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        if(s <= 0){
            return 0;
        }
        int n = nums.length;
        int sum = 0;
        int j = 0;
        int i = 0;
        int res = Integer.MAX_VALUE;
        while( i < n){
            while(j < n && sum < s){
                sum += nums[j];
                j++;
            }
            if(j <= n && sum >= s){
                res = Math.min(res, j - i);
                sum = sum - nums[i];
                
            }
           i++;
            
        }
        return res == Integer.MAX_VALUE? 0: res;
    }
}