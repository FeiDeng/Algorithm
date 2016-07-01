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
    public List<Integer> rightSideView(TreeNode root) {
        //boundary case
        List<Integer> res=new ArrayList<>();
        if(root==null) return res;
        dfs(root,res,0);
        return res;
    }
    
    public void dfs(TreeNode root, List<Integer> res,int depth){
        if(root==null) return;
        if(depth==res.size()){
            res.add(root.val);
        }
       dfs(root.right,res,depth+1);
       dfs(root.left,res,depth+1);
        
    }
}