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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null){
			return true;
		}
		
	
		if(p==null || q==null){
			return false;
		}
		
		Stack<TreeNode> sp=new Stack<>();
		Stack<TreeNode> sq=new Stack<>();
		
		sp.push(p);
		sq.push(q);
		while(!sp.isEmpty()&&!sq.isEmpty()){
		    TreeNode cp=sp.pop();
		    TreeNode cq=sq.pop();
		    if(cp.val!=cq.val) return false;
		    if(cp.left!=null&&cq.left!=null){
		        sp.push(cp.left);
		        sq.push(cq.left);
		    }else if(cp.left==null&&cq.left==null){
		        
		    }else return false;
		    if(cp.right!=null&&cq.right!=null){
		        sp.push(cp.right);
		        sq.push(cq.right);
		    }else if(cp.right==null&&cq.right==null){
		        
		    }else return false;
		}
        if(!sp.isEmpty()||!sq.isEmpty()) return false;
        return true;
    }
}