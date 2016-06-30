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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        //boundary case
        if(inorder==null||inorder.length==0||postorder==null||postorder.length==0||inorder.length!=postorder.length) return null;
        //use hashmap <inorder node.value, index> for quick index find
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        //dfs
        
        
        
        return dfs(inorder,postorder,0,inorder.length-1,0,postorder.length-1,map);
    }
    
    public TreeNode dfs(int[] inorder, int[] postorder,int inStart,int inEnd,int poStart,int poEnd,HashMap<Integer,Integer> map){
        // termination condition
        if(inStart>inEnd||poStart>poEnd) return null;
        //creat current root
        TreeNode root=new TreeNode(postorder[poEnd]);
        //find root.val index in inorder;
        int k=map.get(root.val);
        
        
        
        //dfs: create root's left and right chlidren
        root.left=dfs(inorder,postorder,inStart,k-1,poStart,poStart+k-1-inStart,map);
        root.right=dfs(inorder,postorder,k+1,inEnd,poStart+k-inStart,poEnd-1,map);
        return root;
    }
}