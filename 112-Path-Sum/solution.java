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
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null){
            return false;
        }
        return helper(root,sum);
    }
    public boolean helper(TreeNode root,int sum){
        int remain=sum-root.val;
        if(root.left==null&&root.right==null&&remain==0){
            return true;
        }
        if(hasPathSum(root.left,remain)) return true;
        if(hasPathSum(root.right,remain)) return true;
        return false;
    }
    
    
}