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
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> res=new LinkedList<>();
        if(root==null) return res;
        Stack<TreeNode> stack=new Stack<>();
        //stack.push(root);
        //TreeNode pre=null;
        TreeNode cur=root;
        while(cur!=null||!stack.isEmpty()){
           if(cur!=null){
               res.addFirst(cur.val);
               stack.push(cur);
               cur=cur.right;
           }else{
               cur=stack.pop().left;
           }
            
        }
        //Collections.reverse(res);
        return res;
    }
}