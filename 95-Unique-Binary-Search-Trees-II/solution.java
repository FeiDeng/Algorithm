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
    public List<TreeNode> generateTrees(int n) {
        if(n==0) return new ArrayList<TreeNode>();
        return dfs(1,n);
    }
    
    public List<TreeNode> dfs(int start, int end){
        List<TreeNode> result=new ArrayList<TreeNode>();
        if(start>end){
            result.add(null);
            return result;
        }
        
        for(int i=start;i<=end;i++){
            List<TreeNode> lefts=dfs(start,i-1);
            List<TreeNode> rights=dfs(i+1,end);
            for(TreeNode left:lefts){
                for(TreeNode right:rights){
                    TreeNode root=new TreeNode(i);
                    root.left=left;
                    root.right=right;
                    result.add(root);
                }
            }
        }
        return result;
    }
}