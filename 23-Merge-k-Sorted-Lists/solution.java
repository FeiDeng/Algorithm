/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> heap=new PriorityQueue<>(new Comparator<ListNode>(){
            @Override 
            public int compare(ListNode l1,ListNode l2){
                return l1.val-l2.val;
            }
        });
        
        ListNode start=new ListNode(0);
        ListNode cur=start;
        for(ListNode node:lists){
            if(node!=null)
            heap.offer(node);
        }
        
        while(!heap.isEmpty()){
            cur.next=heap.poll();
            cur=cur.next;
            if(cur.next!=null) heap.offer(cur.next);
        }
        return start.next;
    }
}