/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        //boundary cases
        if(root==null) return;
        if(root.left!=null) root.left.next=root.right!=null?root.right:next(root.next);
        if(root.right!=null) root.right.next=next(root.next);
        connect(root.right);
        connect(root.left);
    }
    
    public TreeLinkNode next(TreeLinkNode root){
        TreeLinkNode cur=root;
        while(cur!=null){
            if(cur.left!=null) return cur.left;
            if(cur.right!=null) return cur.right;
            cur=cur.next;
        }
        return null;
    }
}