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
       Queue<TreeLinkNode> queue=new LinkedList<>();
       queue.offer(root);
       while(!queue.isEmpty()){
          
           Queue<TreeLinkNode> temp=new LinkedList<>();
           while(queue.size()>0){
                TreeLinkNode cur=queue.poll();
                 cur.next=queue.peek();
                if(cur.left!=null)temp.offer(cur.left);
                if(cur.right!=null) temp.offer(cur.right);
           }
           queue=temp;
       }
    }
}