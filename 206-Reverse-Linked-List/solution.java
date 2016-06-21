/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null) return head;
        
        ListNode newHead=reverseList(head.next);
        ListNode next=head.next;
        next.next=head;
        head.next=null;
        return newHead;
    }
}