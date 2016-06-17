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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result= new ArrayList<>();
        if(root==null) return result;
        ArrayList<Integer> temp=new ArrayList<>();
        dfs(root,sum,0,temp,result);
        
        return result;
    }
    
    public void dfs(TreeNode root, int sum,int count, List<Integer> temp, List<List<Integer>> result){
        count=count+root.val;
        temp.add(root.val);
        if(root.left==null&&root.right==null&&count==sum){
            result.add(new ArrayList<Integer> (temp));
            return;
        }
        
        if(root.left!=null){
             dfs(root.left,sum,count,temp,result);
             temp.remove(temp.size()-1);
        }
        
        if(root.right!=null){
            dfs(root.right,sum,count,temp,result);
            temp.remove(temp.size()-1);
        }
            
    }
}