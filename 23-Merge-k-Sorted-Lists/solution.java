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
        if( lists == null || lists.length == 0){
            return null;
        }
        return divide(lists, 0, lists.length - 1);
    }
    
    public ListNode divide(ListNode[] lists, int start, int end){
        if(start == end){
            return lists[start];
        }
        int mid = start + (end - start)/2;
        ListNode left = divide(lists,start,mid);
        ListNode right = divide(lists,mid + 1, end);
        return merge(left,right);
    }
    
    public ListNode merge(ListNode n1,ListNode n2){
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while(n1 != null && n2 != null){
            if(n1.val < n2.val){
                cur.next = n1;
                n1 = n1.next;
            }else{
                cur.next = n2;
                n2 = n2.next;
            }
            cur = cur.next;
        }
        if(n1 != null){
            cur.next = n1;
        }
        if(n2 != null){
            cur.next = n2;
        }
        return dummy.next;
    }
}