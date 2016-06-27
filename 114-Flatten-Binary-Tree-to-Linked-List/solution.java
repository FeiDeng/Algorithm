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
    public void flatten(TreeNode root) {
        if(root==null) return;
        Stack<TreeNode> stack=new Stack<>();
        TreeNode cur=root;
        while(cur!=null||!stack.isEmpty()){
           if(cur.right!=null){
               stack.push(cur.right);
           }
           if(cur.left!=null){
               cur.right=cur.left;
               cur.left=null;
           }else if(!stack.isEmpty()){
               cur.right=stack.pop();
           }
           cur=cur.right;
            
        }
       
    }
}