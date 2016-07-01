/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
       //boundary cases
       if(nums==null||nums.length==0) return null;
       return helper(nums,0,nums.length-1);
    }
    
    public TreeNode helper(int[] nums, int start, int end){
        //termination condition
        if(start>end){
            return null; 
        }
        
        //create node using mid of the range
        int mid=start+(end-start)/2;
        TreeNode cur=new TreeNode(nums[mid]);
        cur.left=helper(nums,start,mid-1);
        cur.right=helper(nums,mid+1,end);
        return cur;
    }
}