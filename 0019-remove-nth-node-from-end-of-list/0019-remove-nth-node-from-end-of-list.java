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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start= new ListNode(0);
        start.next=head;
        ListNode slow=start;
         ListNode fast=start;
        for(int i=1;i<=n+1;i++){
            fast=fast.next;
            
        }
        //if(fast.next==null)return head.next;
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
            
        }
        slow.next=slow.next.next;
        return start.next;
        
    }
}