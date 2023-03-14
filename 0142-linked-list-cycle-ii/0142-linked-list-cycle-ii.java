/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head,fast=head,ans=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow= slow.next;
            if(slow==fast){
                while(slow!=ans){
                    slow=slow.next;
                    ans=ans.next;
                }
                return ans;
            }
        }
        return null;
    }
}