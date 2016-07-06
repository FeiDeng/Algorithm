public class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length<1) return 0;
        int n = nums.length;
        int index = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
        if (nums[i] == val) {
            n--;
            if(i < index){
                nums[i] = nums[index];
            }
            index--;
        }
    }
    
    return n;
    }
}