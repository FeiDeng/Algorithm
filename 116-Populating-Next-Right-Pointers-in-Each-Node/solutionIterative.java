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
        while(root!=null&&root.left!=null){
            TreeLinkNode level=root;
            while(level!=null){
                level.left.next=level.right;
                level.right.next=level.next==null?null:level.next.left;
                level=level.next;
            }
            root=root.left;
        }
    }
}