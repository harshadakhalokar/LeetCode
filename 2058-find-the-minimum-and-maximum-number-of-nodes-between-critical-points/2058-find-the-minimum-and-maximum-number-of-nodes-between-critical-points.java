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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int firstCritical=-1;
        int previousCritical=-1;
        int minDistance=Integer.MAX_VALUE;
        int  index=0;

        ListNode current=head;
        ListNode next=null;
        ListNode prev=null;

        while(current!=null){
            next=current.next;
            if(prev!=null && next!=null){
                if((current.val < prev.val && current.val < next.val) || (current.val > prev.val && current.val > next.val)){
                    if(firstCritical==-1){
                        firstCritical=index;
                        previousCritical=index;
                    }
                    else{
                        minDistance=Math.min(minDistance,index-previousCritical);
                        previousCritical=index;
                    }
                }
            }
            prev=current;
            current=next;
            index++;
        }
        if(firstCritical==previousCritical){
            return new int[]{-1,-1};
        }
        int maxDistance = previousCritical - firstCritical;
        return new int[]{minDistance,maxDistance};
        
    }
}