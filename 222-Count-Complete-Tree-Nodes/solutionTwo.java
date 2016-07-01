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
    public int getHeight(TreeNode root){
        return root==null?-1:1+getHeight(root.left);
    }
    
    public int countNodes(TreeNode root) {
        int h=getHeight(root);
        return h<0?0:getHeight(root.right)==h-1?(1<<h)+countNodes(root.right):(1<<h-1)+countNodes(root.left);
        
    }
}