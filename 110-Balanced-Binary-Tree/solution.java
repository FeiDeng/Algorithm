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
        if(root==null) return true;
        if(Math.abs(getDepth(root.left)-getDepth(root.right))>1) return false;
        return isBalanced(root.left)&&isBalanced(root.right);
    }
    
    public int getDepth(TreeNode root){
        if(root==null) return 0;
        int left=getDepth(root.left);
        int right=getDepth(root.right);
        return Math.max(left,right)+1;
    }
}