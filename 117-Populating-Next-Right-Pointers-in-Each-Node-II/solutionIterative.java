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
       TreeLinkNode temp=new TreeLinkNode(0);
       while(root!=null){
           TreeLinkNode cur=temp;
           while(root!=null){
               if(root.left!=null){
                   cur.next=root.left;
                   cur=cur.next;
               }
               if(root.right!=null){
                   cur.next=root.right;
                   cur=cur.next;
               }
               root=root.next;
           }
           root=temp.next;
           temp.next=null;
       }
    }
}