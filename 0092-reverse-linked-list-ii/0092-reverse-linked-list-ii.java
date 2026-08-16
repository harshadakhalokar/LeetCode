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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy=new ListNode();
        dummy.next=head;
        ListNode prev=dummy;
        
        int i=0;
        while(i<left-1){
            prev=prev.next;
            i++;
        }

        ListNode current = prev.next;
        i=0;
        while(i<right-left){
            ListNode next=current.next;

            current.next=next.next;
            next.next=prev.next;
            prev.next=next;
            i++;
        }
        return dummy.next;
    }
}