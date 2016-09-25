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
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        if(getDepth(root) == -1) return false;
        return true;
        
    }
    
    public int getDepth(TreeNode root){
        if(root == null) return 0;
        int left = getDepth(root.left);
        int right = getDepth(root.right);
        if(left == -1 || right == -1) return -1;
        if(Math.abs(left - right) > 1) return -1;
        return Math.max(left, right) + 1;
    }
}