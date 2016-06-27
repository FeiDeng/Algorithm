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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(q==null&&p==null) return true;
        if(q!=null&&p!=null) 
        
        return q.val==p.val&&isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
        else return false;
    }
}