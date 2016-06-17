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
        List<List<Integer>> result=new ArrayList<>();
        if(root==null) return result;
        helper(root,sum,new ArrayList<Integer>(), result);
        return result;
    }
    
    public void helper(TreeNode root, int sum, List<Integer> temp, List<List<Integer>> result){
        int remain=sum-root.val;
        //if(remain>=0){
            temp.add(root.val);
            if(root.left==null&&root.right==null&&remain==0){
                result.add(new ArrayList<Integer> (temp));
                return;
            }
        
           
                if(root.left!=null) {
                    helper(root.left,remain,temp,result);
                     temp.remove(temp.size()-1);
                    
                }
                if(root.right!=null) {
                    helper(root.right,remain,temp,result);
                     temp.remove(temp.size()-1);
                }
            
           
       // }
        
    }
}