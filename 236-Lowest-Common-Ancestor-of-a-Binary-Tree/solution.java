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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       Map<TreeNode,TreeNode> parent=new HashMap<>();
       Deque<TreeNode> stack=new ArrayDeque<>();
       parent.put(root,null);
       stack.push(root);
       while(!parent.containsKey(p)||!parent.containsKey(q)){
           TreeNode cur=stack.pop();
           if(cur.left!=null){
               parent.put(cur.left,cur);
               stack.push(cur.left);
           }
           if(cur.right!=null){
               parent.put(cur.right,cur);
               stack.push(cur.right);
           }
       }
       
       Set<TreeNode> ancester=new HashSet<>();
       while(p!=null){
           ancester.add(p);
           p=parent.get(p);
       }
       while(!ancester.contains(q)){
           q=parent.get(q);
       }
       return q;
    }
}