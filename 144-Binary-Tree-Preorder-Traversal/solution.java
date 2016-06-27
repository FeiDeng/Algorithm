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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        if(root==null) return res;
        Stack<TreeNode> stack=new Stack<>();
       //stack.push(root);
       TreeNode cur=root;
       while(cur!=null||!stack.isEmpty()){
           if(cur!=null){
               res.add(cur.val);
               stack.push(cur.right);
               cur=cur.left;
           }else{
               cur=stack.pop();
           }
           
          
           
       }
       return res;
        
    }
}