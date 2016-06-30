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
    public List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
       
          List<Integer> temp=new ArrayList<Integer>();
           
        while(root!=null){
            if(dfs(root,temp)) root=null;
           
            res.add(temp);
            temp=new ArrayList<Integer>();
        }
        
        
        return res;
    }
    
    public boolean dfs(TreeNode root, List<Integer> temp){
        //if leaf add to temp 
        if(root.left==null&&root.right==null) {
            temp.add(root.val);
            return true;
        }
        //check left or right children,cut if child is leaf;
        if(root.left!=null){
            if(dfs(root.left,temp)){
                root.left=null;
            }
        }
        if(root.right!=null){
            if(dfs(root.right,temp)){
                root.right=null;
            }
        }
        return false;
    }
}