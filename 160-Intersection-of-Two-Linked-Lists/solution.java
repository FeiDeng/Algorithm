/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int s1=findLength(headA);
        int s2=findLength(headB);
        while(s1>s2){
            headA=headA.next;
            s1--;
        }
        while(s1<s2){
            headB=headB.next;
            s2--;
        }
        while(headA!=headB){
            headA=headA.next;
            headB=headB.next;
        }
        return headA;
    }
    
    public int findLength(ListNode head){
        int size=0;
        while(head!=null){
            head=head.next;
            size++;
        }
        return size;
    }
}