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
       
        //List<Integer> temp=new ArrayList<Integer>();
           
        dfs(root,res);
        
        return res;
    }
        //return depth
    public int dfs(TreeNode root, List<List<Integer>> res){
        //if null return 0
        if(root==null) return -1;
        //dfs left and right
        int left=dfs(root.left, res);
        int right=dfs(root.right,res);
        
        int depth=Math.max(left,right)+1;
        if(res.size()<=depth){
            res.add(new ArrayList<Integer>());
        }
        res.get(depth).add(root.val);
        //calculate current depth, update res
        return depth;
    }
}