/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode cur = head;
        if(cur == null || cur.next == null){ return head;}
        else if( cur.next.next == null){ cur = cur.next; cur.next = head; head.next = null; head = cur;}
        else{
            int temp = 0;
            while(cur != null && cur.next != null  ) {
                temp = cur.val;
                cur.val = cur.next.val;
                cur = cur.next; 
                cur.val = temp;
                cur = cur.next; 
            }
        }
        return head;
    }
}